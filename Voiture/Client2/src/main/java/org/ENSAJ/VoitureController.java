package org.ENSAJ;

import java.util.List;

import org.ENSAJ.clients.ClientRest;
import org.ENSAJ.models.Voiture;
import org.ENSAJ.repositories.VoitureRepository;
import org.ENSAJ.services.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoitureController {

	
	VoitureRepository voitureRepository;
	
	VoitureService voitureService;
	
	
	ClientRest clientRest;
	
	public VoitureController(VoitureRepository voitureRepository, VoitureService voitureService, ClientRest clientRest) {
        this.voitureRepository = voitureRepository;
        this.voitureService = voitureService;
        this.clientRest = clientRest;
    }
	@GetMapping("/voitures")
	public List<Voiture> chercherClients(){
		return voitureRepository.findAll();
	}
	
	
	
	@GetMapping("/voiture/{id}")
    public Voiture chercherUneVoiture(@PathVariable Long id) throws Exception{
        Voiture voiture = voitureRepository.findById(id).get();
        Client client = clientRest.findClientByID(voiture.getClientId());
        voiture.setClient(client);
        return voiture;
     }


    @PostMapping("/voitures")
    public Voiture enregistrerUneVoiture(@RequestBody Voiture voiture){
        return voitureService.enregistrerVoiture(voiture);
    }
	
}

package com.example.voiture.Controller;

import com.example.voiture.Model.Voiture;
import com.example.voiture.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {

    @Autowired
    VoitureRepository voitureRepository;

    @GetMapping("/voitures")
    public List<Voiture> chercherVoitures(){
        return voitureRepository.findAll();
    }

    @GetMapping("/voiture/{id}")
    public Voiture chercherUneVoiture(@PathVariable Long id){
        return voitureRepository.findById(id).orElse(null);
    }
}

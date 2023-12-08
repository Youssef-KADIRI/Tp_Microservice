package org.ENSAJ.services;

import org.ENSAJ.models.Voiture;
import org.ENSAJ.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public Voiture enregistrerVoiture(Voiture voiture){
        return voitureRepository.save(voiture);
    }
}
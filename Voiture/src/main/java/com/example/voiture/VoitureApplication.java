package com.example.voiture;

import com.example.voiture.Model.Voiture;
import com.example.voiture.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VoitureApplication {

    @Autowired
    private ClientService clientService;

    public static void main(String[] args) {
        SpringApplication.run(VoitureApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseMySQL(VoitureRepository voitureRepository) {
        return args -> {
            Client c1 = clientService.findClientByID(1L);
            Client c2 = clientService.findClientByID(2L);
            Client c3 = clientService.findClientByID(3L);

            voitureRepository.save(new Voiture(1L, "AZS4R", "Dacia", "2015", c1));
            voitureRepository.save(new Voiture(2L, "TG78P", "Renault", "2010", c2));
            voitureRepository.save(new Voiture(3L, "HDTE48", "Golf", "20185", c3));
        };
    }
}

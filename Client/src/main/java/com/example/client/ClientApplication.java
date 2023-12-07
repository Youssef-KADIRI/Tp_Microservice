package com.example.client;

import com.example.client.Model.Client;
import com.example.client.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseMySQL(ClientRepository clientRepository){
        return args->{
            clientRepository.save(new Client(Long.parseLong("1"),"KADIRI","Youssef"));
            clientRepository.save(new Client(Long.parseLong("3"),"LAROUCHI","Abderahmane"));
            clientRepository.save(new Client(Long.parseLong("2"),"KAMIS","Elmehdi"));
        };
    };
}

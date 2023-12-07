package com.example.client.Controller;

import com.example.client.Model.Client;
import com.example.client.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> chercherClients(){
        return clientRepository.findAll();
    }

    @GetMapping("/client/{id}")
    public Client chercherUnClient(@PathVariable Long id){
        return clientRepository.findById(id).orElse(null);
    }
}

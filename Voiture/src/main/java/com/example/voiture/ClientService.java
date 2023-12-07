package com.example.voiture;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "SERVICE-CLIENT")
@Service
public interface ClientService {

    @GetMapping("/client/{id}")
    Client findClientByID(@PathVariable Long id);

    @GetMapping("/clients")
    List<Client> allClient();


}

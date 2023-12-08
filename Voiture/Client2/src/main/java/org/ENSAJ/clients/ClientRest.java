package org.ENSAJ.clients;

import java.util.List;

import org.ENSAJ.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "SERVICE-CLIENT", url = "http://127.0.0.1:8088") //
public interface ClientRest {

    @GetMapping("/client/{id}")
    Client findClientByID(@PathVariable Long id);

    @GetMapping("/clients")
    List<Client> allClient();

    
}

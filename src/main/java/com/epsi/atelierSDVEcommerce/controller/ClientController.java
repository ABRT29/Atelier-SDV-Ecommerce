package com.epsi.atelierSDVEcommerce.controller;

import com.epsi.atelierSDVEcommerce.model.Client;
import com.epsi.atelierSDVEcommerce.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/client")
    public Client getInformation(String email) {
        return clientService.getInformation(email);
    }
}


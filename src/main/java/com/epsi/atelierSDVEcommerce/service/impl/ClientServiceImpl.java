package com.epsi.atelierSDVEcommerce.service.impl;

import com.epsi.atelierSDVEcommerce.model.Client;
import com.epsi.atelierSDVEcommerce.repository.ClientRepository;
import com.epsi.atelierSDVEcommerce.service.ClientService;

public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Override
    public Client getInformation(String email) {
        return clientRepository.findClientByEmail(email);
    }
}

package com.epsi.atelierSDVEcommerce.service;

import com.epsi.atelierSDVEcommerce.model.Client;
import com.epsi.atelierSDVEcommerce.model.Facturation;
import com.epsi.atelierSDVEcommerce.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.stereotype.Service; import lombok.Data;

@Data
@Service
public interface FacturationService {
    @Autowired
    private ClientServiceImpl clientServiceImpl;

    public Client getInformation(String email){
        return clientServiceImpl.getInformation(email);
    }

    Facturation getFacturation(Long id);
}

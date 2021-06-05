package com.epsi.atelierSDVEcommerce.service;

import com.epsi.atelierSDVEcommerce.model.Facturation;
import com.epsi.atelierSDVEcommerce.service.impl.FacturationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.stereotype.Service; import lombok.Data;

@Data
@Service
public interface FacturationService {
    @Autowired
    private FacturationServiceImpl facturationServiceImpl;

    public Facturation getFacturation(Long id){
        return facturationServiceImpl.getFacturation(id);
    }
}

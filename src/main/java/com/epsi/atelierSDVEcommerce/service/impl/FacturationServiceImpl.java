package com.epsi.atelierSDVEcommerce.service.impl;

import com.epsi.atelierSDVEcommerce.model.Facturation;
import com.epsi.atelierSDVEcommerce.repository.FacturationRepository;
import com.epsi.atelierSDVEcommerce.service.FacturationService;

public class FacturationServiceImpl implements FacturationService {

    private FacturationRepository facturationRepository;

    @Override
    public Facturation getFacturation(Long id) {
        return facturationRepository.findFacturationById(id);
    }
}

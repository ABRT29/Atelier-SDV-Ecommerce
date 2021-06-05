package com.epsi.atelierSDVEcommerce.controller;

import com.epsi.atelierSDVEcommerce.model.Facturation;
import com.epsi.atelierSDVEcommerce.service.FacturationService;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturationController {
    @Autowired
    private FacturationService facturationService;

    @GetMapping("/facture")
    public Facturation getFacturation(Long id) {
        return facturationService.getFacturation(id);
    }
}


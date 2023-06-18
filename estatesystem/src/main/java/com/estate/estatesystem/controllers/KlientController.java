package com.estate.estatesystem.controllers;

import com.estate.estatesystem.models.people.Klient;
import com.estate.estatesystem.services.KlientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class KlientController {

    @Autowired
    private final KlientService klientService;

    public KlientController(KlientService klientService) {
        this.klientService = klientService;
    }

    @GetMapping(path = "/clients")
    public List<Klient> getAllClients() {
        return klientService.getAllClients();
    }
}

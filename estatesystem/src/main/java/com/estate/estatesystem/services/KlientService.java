package com.estate.estatesystem.services;

import com.estate.estatesystem.models.people.Klient;
import com.estate.estatesystem.repositories.KlientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlientService {

    @Autowired
    private final KlientRepository klientRepository;

    public KlientService(KlientRepository klientRepository) {
        this.klientRepository = klientRepository;
    }

    public List<Klient> getAllClients(){
        return klientRepository.findAll();
    }

}

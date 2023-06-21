package com.estate.estatesystem.services;

import com.estate.estatesystem.models.other.Ogloszenie;
import com.estate.estatesystem.repositories.OgloszenieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OgloszenieService {

    @Autowired
    private final OgloszenieRepository ogloszenieRepository;

    public OgloszenieService(OgloszenieRepository ogloszenieRepository) {
        this.ogloszenieRepository = ogloszenieRepository;
    }

    public void addOgloszenie(Ogloszenie ogloszenie){
        ogloszenieRepository.save(ogloszenie);
    }
}

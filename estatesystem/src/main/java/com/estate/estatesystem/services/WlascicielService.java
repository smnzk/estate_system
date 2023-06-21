package com.estate.estatesystem.services;

import com.estate.estatesystem.models.other.Nieruchomosc;
import com.estate.estatesystem.models.people.Osoba;
import com.estate.estatesystem.models.people.WlascicielNieruchomosci;
import com.estate.estatesystem.repositories.WlascicielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WlascicielService {

    @Autowired
    private final WlascicielRepository wlascicielRepository;

    public WlascicielService(WlascicielRepository wlascicielRepository) {
        this.wlascicielRepository = wlascicielRepository;
    }

    public List<WlascicielNieruchomosci> getOwners(){
        return wlascicielRepository.findAll();
    }
}

package com.estate.estatesystem.services;

import com.estate.estatesystem.models.other.WpisNaStronie;
import com.estate.estatesystem.repositories.WpisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WpisService {

    @Autowired
    private final WpisRepository wpisRepository;

    public WpisService(WpisRepository wpisRepository) {
        this.wpisRepository = wpisRepository;
    }

    public void saveWpis(WpisNaStronie wpisNaStronie) {
        wpisRepository.save(wpisNaStronie);
    }
}

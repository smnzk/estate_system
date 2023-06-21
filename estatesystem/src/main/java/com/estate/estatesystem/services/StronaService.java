package com.estate.estatesystem.services;

import com.estate.estatesystem.models.other.StronaInternetowa;
import com.estate.estatesystem.repositories.StronaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StronaService {

    @Autowired
    private final StronaRepository stronaRepository;


    public StronaService(StronaRepository stronaRepository) {
        this.stronaRepository = stronaRepository;
    }

    public List<StronaInternetowa> getAllWebsites() {
        return stronaRepository.findAll();
    }
    public List<StronaInternetowa> getWebsiteByAddress(String adres) {
        return stronaRepository.findByAdres(adres);
    }
}

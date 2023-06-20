package com.estate.estatesystem.services;

import com.estate.estatesystem.models.other.Nieruchomosc;
import com.estate.estatesystem.repositories.MieszkanieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NieruchomoscService {

    @Autowired
    private final MieszkanieRepository mieszkanieRepository;

    public NieruchomoscService(MieszkanieRepository mieszkanieRepository) {
        this.mieszkanieRepository = mieszkanieRepository;
    }

    public List<Nieruchomosc> getEstates(){
        return mieszkanieRepository.findAll();
    }
}

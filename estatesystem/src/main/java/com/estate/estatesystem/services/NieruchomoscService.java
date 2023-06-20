package com.estate.estatesystem.services;

import com.estate.estatesystem.models.other.Nieruchomosc;
import com.estate.estatesystem.repositories.DomRepository;
import com.estate.estatesystem.repositories.MieszkanieRepository;
import com.estate.estatesystem.repositories.NieruchomoscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NieruchomoscService {

    @Autowired
    private final NieruchomoscRepository nieruchomoscRepository;

    public NieruchomoscService(NieruchomoscRepository nieruchomoscRepository) {
        this.nieruchomoscRepository = nieruchomoscRepository;
    }

    public List<Nieruchomosc> getEstatesByOwnerId(long id){

        return nieruchomoscRepository.findByWlascicielId(id);
    }
}

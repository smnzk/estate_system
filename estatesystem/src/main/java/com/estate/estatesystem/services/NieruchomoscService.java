package com.estate.estatesystem.services;

import com.estate.estatesystem.models.other.Nieruchomosc;
import com.estate.estatesystem.repositories.NieruchomoscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Nieruchomosc> getEstateById(long id) {
        return nieruchomoscRepository.findById(id);
    }
}

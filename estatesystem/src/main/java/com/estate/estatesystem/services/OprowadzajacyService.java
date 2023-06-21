package com.estate.estatesystem.services;

import com.estate.estatesystem.models.people.Oprowadzajacy;
import com.estate.estatesystem.repositories.OprowadzajacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OprowadzajacyService {

    @Autowired
    private final OprowadzajacyRepository oprowadzajacyRepository;

    public OprowadzajacyService(OprowadzajacyRepository oprowadzajacyRepository) {
        this.oprowadzajacyRepository = oprowadzajacyRepository;
    }


    public List<Oprowadzajacy> getAllOprowadzajacy() {
        return oprowadzajacyRepository.findAll();
    }

    public Optional<Oprowadzajacy> getOprowadzajacyById(long id) {
        return oprowadzajacyRepository.findById(id);
    }
}

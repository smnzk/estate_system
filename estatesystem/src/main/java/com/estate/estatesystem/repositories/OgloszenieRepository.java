package com.estate.estatesystem.repositories;

import com.estate.estatesystem.models.other.Ogloszenie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgloszenieRepository extends JpaRepository<Ogloszenie, Long> {
}

package com.estate.estatesystem.repositories;

import com.estate.estatesystem.models.people.WlascicielNieruchomosci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WlascicielRepository extends JpaRepository<WlascicielNieruchomosci, Long> {
}

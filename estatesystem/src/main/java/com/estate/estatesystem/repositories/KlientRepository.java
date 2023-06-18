package com.estate.estatesystem.repositories;

import com.estate.estatesystem.models.people.Klient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepository extends JpaRepository<Klient, Long> {
}

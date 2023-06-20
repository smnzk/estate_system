package com.estate.estatesystem.repositories;

import com.estate.estatesystem.models.people.Osoba;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface OsobaRepository extends JpaRepository<Osoba, Long> {
}
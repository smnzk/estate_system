package com.estate.estatesystem.repositories;

import com.estate.estatesystem.models.other.WpisNaStronie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WpisRepository extends JpaRepository<WpisNaStronie, Long> {
}

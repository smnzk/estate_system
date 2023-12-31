package com.estate.estatesystem.repositories;

import com.estate.estatesystem.models.other.Nieruchomosc;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface NieruchomoscRepository extends JpaRepository<Nieruchomosc, Long> {

    List<Nieruchomosc> findByWlascicielId(Long id);

}

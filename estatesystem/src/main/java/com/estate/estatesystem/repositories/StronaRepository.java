package com.estate.estatesystem.repositories;

import com.estate.estatesystem.models.other.StronaInternetowa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StronaRepository extends JpaRepository<StronaInternetowa, Long> {

    List<StronaInternetowa> findByAdres(String adres);
}

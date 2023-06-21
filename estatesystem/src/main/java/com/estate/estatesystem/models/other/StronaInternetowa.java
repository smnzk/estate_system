package com.estate.estatesystem.models.other;

import jakarta.persistence.*;

@Entity
@Table(name = "StronaInternetowa")
public class StronaInternetowa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adres;
    private Double oplata;

    public StronaInternetowa() {
    }

    public StronaInternetowa(String adres, Double oplata) {
        this.adres = adres;
        this.oplata = oplata;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Double getOplata() {
        return oplata;
    }

    public void setOplata(Double oplata) {
        this.oplata = oplata;
    }
}

package com.estate.estatesystem.models.other;

import jakarta.persistence.*;

@Entity
@Table(name = "Nieruchomosc")
public class Nieruchomosc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double cena;
    private double powierzchnia;
    private String adres;

    public Nieruchomosc(double powierzchnia, String adres) {
        this.powierzchnia = powierzchnia;
        this.adres = adres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}

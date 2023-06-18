package com.estate.estatesystem.models.other;

import jakarta.persistence.*;

@Entity
@Table(name = "WpisNaStronie")
public class WpisNaStronie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adresStronyInternetowej;
    private double pobieranaOplata;

    public WpisNaStronie(String adresStronyInternetowej, double pobieranaOplata) {
        this.adresStronyInternetowej = adresStronyInternetowej;
        this.pobieranaOplata = pobieranaOplata;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresStronyInternetowej() {
        return adresStronyInternetowej;
    }

    public void setAdresStronyInternetowej(String adresStronyInternetowej) {
        this.adresStronyInternetowej = adresStronyInternetowej;
    }

    public double getPobieranaOplata() {
        return pobieranaOplata;
    }

    public void setPobieranaOplata(double pobieranaOplata) {
        this.pobieranaOplata = pobieranaOplata;
    }
}

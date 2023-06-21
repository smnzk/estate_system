package com.estate.estatesystem.models.other;

import jakarta.persistence.*;

@Entity
@Table(name = "WpisNaStronie")
public class WpisNaStronie {

    public static WpisNaStronie create(Ogloszenie ogloszenie, String adresStronyInternetowej, double pobieranaOplata) {
        WpisNaStronie wpisNaStronie = new WpisNaStronie(adresStronyInternetowej, pobieranaOplata);
        wpisNaStronie.setOgloszenie(ogloszenie);
        ogloszenie.getWpisNaStronieSet().add(wpisNaStronie);
        return wpisNaStronie;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adresStronyInternetowej;
    private double pobieranaOplata;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ogloszenie_id", referencedColumnName = "id")
    private Ogloszenie ogloszenie;

    private WpisNaStronie(String adresStronyInternetowej, double pobieranaOplata) {
        this.adresStronyInternetowej = adresStronyInternetowej;
        this.pobieranaOplata = pobieranaOplata;
    }

    private WpisNaStronie(){

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

    public Ogloszenie getOgloszenie() {
        return ogloszenie;
    }

    public void setOgloszenie(Ogloszenie ogloszenie) {
        this.ogloszenie = ogloszenie;
    }
}



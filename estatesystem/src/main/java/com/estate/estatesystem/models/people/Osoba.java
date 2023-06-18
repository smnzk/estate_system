package com.estate.estatesystem.models.people;

public abstract class Osoba {

    private String imie;
    private String nazwisko;
    private String adres;
    private String numberTelefonu;


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNumberTelefonu() {
        return numberTelefonu;
    }

    public void setNumberTelefonu(String numberTelefonu) {
        this.numberTelefonu = numberTelefonu;
    }
}

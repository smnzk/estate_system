package com.estate.estatesystem.models.people;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Osoba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imie;
    private String nazwisko;
    private String adres;
    private String numberTelefonu;

    public Osoba(String imie, String nazwisko, String adres, String numberTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.numberTelefonu = numberTelefonu;
    }

    public String getImie() {
        return imie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

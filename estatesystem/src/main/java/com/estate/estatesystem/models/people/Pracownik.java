package com.estate.estatesystem.models.people;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

import java.util.HashSet;

@Entity
@Table(name = "Pracownik")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pracownik extends Osoba{

    private static final HashSet<Integer> numeryPracownikow = new HashSet<>();

    private Integer numerPracownika;
    private double wynagrodzenie;
    private String hasloDoSystemu;

    public Pracownik(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerPracownika, double wynagrodzenie, String hasloDoSystemu) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu);
        if (numeryPracownikow.contains(numerPracownika)) {
            throw new Exception("Numer pracownika musi być unikalny");
        }
        this.numerPracownika = numerPracownika;
        this.wynagrodzenie = wynagrodzenie;
        this.hasloDoSystemu = hasloDoSystemu;
        numeryPracownikow.add(numerPracownika);
    }

    public Pracownik() {

    }

    public Integer getNumerPracownika() {
        return numerPracownika;
    }

    public void setNumerPracownika(Integer numerPracownika) throws Exception {
        if (numeryPracownikow.contains(numerPracownika)) {
            throw new Exception("Numer pracownika musi być unikalny");
        }
        this.numerPracownika = numerPracownika;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getHasloDoSystemu() {
        return hasloDoSystemu;
    }

    public void setHasloDoSystemu(String hasloDoSystemu) {
        this.hasloDoSystemu = hasloDoSystemu;
    }
}

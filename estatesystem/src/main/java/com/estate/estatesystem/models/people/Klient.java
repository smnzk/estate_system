package com.estate.estatesystem.models.people;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.HashSet;

@Entity
@Table(name = "Klient")
public class Klient extends Osoba{

    private static final HashSet<Integer> numeryKlientow = new HashSet<>();
    private Integer numerKlienta;
    private double budzet;

    public Klient(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerKlienta, double budzet) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu);
        if (numeryKlientow.contains(numerKlienta)) {
            throw new Exception("Numer klienta musi być unikalny");
        }
        this.numerKlienta = numerKlienta;
        this.budzet = budzet;
        numeryKlientow.add(numerKlienta);
    }

    public Integer getNumerKlienta() {
        return numerKlienta;
    }

    public void setNumerKlienta(Integer numerKlienta) throws Exception {
        if (numeryKlientow.contains(numerKlienta)) {
            throw new Exception("Numer klienta musi być unikalny");
        }
        this.numerKlienta = numerKlienta;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }
}

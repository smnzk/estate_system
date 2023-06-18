package com.estate.estatesystem.models.people;

import java.util.HashSet;

public class Klient extends Osoba{

    private static final HashSet<Integer> numeryKlientow = new HashSet<>();

    private Integer numerKlienta;
    private double budzet;

    public Klient(Integer numerKlienta, double budzet) throws Exception {
        if (numeryKlientow.contains(numerKlienta)) {
            throw new Exception("Numer klienta musi być unikalny");
        }
        this.numerKlienta = numerKlienta;
        this.budzet = budzet;
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

package com.estate.estatesystem.models.people;

import java.util.HashSet;

public class Pracownik {

    private static final HashSet<Integer> numeryPracownikow = new HashSet<>();

    private Integer numerPracownika;
    private double wynagrodzenie;
    private String hasloDoSystemu;

    public Pracownik(Integer numerPracownika, double wynagrodzenie, String hasloDoSystemu) throws Exception {
        if (numeryPracownikow.contains(numerPracownika)) {
            throw new Exception("Numer pracownika musi być unikalny");
        }
        this.numerPracownika = numerPracownika;
        this.wynagrodzenie = wynagrodzenie;
        this.hasloDoSystemu = hasloDoSystemu;
        numeryPracownikow.add(numerPracownika);
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

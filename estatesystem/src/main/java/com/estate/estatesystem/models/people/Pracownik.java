package com.estate.estatesystem.models.people;

public class Pracownik {

    private int numerPracownika;
    private double wynagrodzenie;
    private String hasloDoSystemu;

    public Pracownik(int numerPracownika, double wynagrodzenie, String hasloDoSystemu) {
        this.numerPracownika = numerPracownika;
        this.wynagrodzenie = wynagrodzenie;
        this.hasloDoSystemu = hasloDoSystemu;
    }

    public int getNumerPracownika() {
        return numerPracownika;
    }

    public void setNumerPracownika(int numerPracownika) {
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

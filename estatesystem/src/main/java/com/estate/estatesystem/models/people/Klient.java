package com.estate.estatesystem.models.people;

public class Klient extends Osoba{

    private int numerKlienta;
    private double budzet;

    public Klient(int numerKlienta, double budzet) {
        this.numerKlienta = numerKlienta;
        this.budzet = budzet;
    }

    public int getNumerKlienta() {
        return numerKlienta;
    }

    public void setNumerKlienta(int numerKlienta) {
        this.numerKlienta = numerKlienta;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }
}

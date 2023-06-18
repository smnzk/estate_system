package com.estate.estatesystem.models.people;

import java.util.List;

public class Oprowadzajacy extends Pracownik{
    private String specjalizacja;
    private List<String> jezyki;

    public Oprowadzajacy(int numerPracownika, double wynagrodzenie, String hasloDoSystemu, String specjalizacja, List<String> jezyki) {
        super(numerPracownika, wynagrodzenie, hasloDoSystemu);
        this.specjalizacja = specjalizacja;
        this.jezyki = jezyki;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public List<String> getJezyki() {
        return jezyki;
    }

    public void setJezyki(List<String> jezyki) {
        this.jezyki = jezyki;
    }
}

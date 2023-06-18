package com.estate.estatesystem.models.people;

import com.estate.estatesystem.models.utility.Specjalizacja;

import java.util.List;

public class Oprowadzajacy extends Pracownik{
    private Specjalizacja specjalizacja;
    private List<String> jezyki;

    public Oprowadzajacy(int numerPracownika, double wynagrodzenie, String hasloDoSystemu, Specjalizacja specjalizacja, List<String> jezyki) throws Exception {
        super(numerPracownika, wynagrodzenie, hasloDoSystemu);
        if (jezyki.size() == 0) {
            throw new Exception("Oprowadzający musi znać co najmniej jeden język");
        }
        this.specjalizacja = specjalizacja;
        this.jezyki = jezyki;
    }

    public Specjalizacja getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(Specjalizacja specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public List<String> getJezyki() {
        return jezyki;
    }

    public void setJezyki(List<String> jezyki) throws Exception {
        if (jezyki.size() == 0) {
            throw new Exception("Oprowadzający musi znać co najmniej jeden język");
        }
        this.jezyki = jezyki;
    }
}

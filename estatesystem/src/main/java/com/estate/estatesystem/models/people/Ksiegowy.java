package com.estate.estatesystem.models.people;

import java.util.List;

public class Ksiegowy extends Pracownik{

    private List<String> obowiazki;
    private String stazPracy;

    public Ksiegowy(int numerPracownika, double wynagrodzenie, String hasloDoSystemu, List<String> obowiazki, String stazPracy) {
        super(numerPracownika, wynagrodzenie, hasloDoSystemu);
        this.obowiazki = obowiazki;
        this.stazPracy = stazPracy;
    }

    public List<String> getObowiazki() {
        return obowiazki;
    }

    public void setObowiazki(List<String> obowiazki) {
        this.obowiazki = obowiazki;
    }

    public String getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(String stazPracy) {
        this.stazPracy = stazPracy;
    }
}

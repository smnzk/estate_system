package com.estate.estatesystem.models.people;

import java.util.List;

public class Ksiegowy extends Pracownik{

    private List<String> obowiazki;
    private String stazPracy;

    public Ksiegowy(int numerPracownika, double wynagrodzenie, String hasloDoSystemu, List<String> obowiazki, String stazPracy) throws Exception {
        super(numerPracownika, wynagrodzenie, hasloDoSystemu);
        if (obowiazki.size() == 0) {
            throw new Exception("Księgowy musi mieć co najmniej jeden obowiązek");
        }
        this.obowiazki = obowiazki;
        this.stazPracy = stazPracy;
    }

    public List<String> getObowiazki() {
        return obowiazki;
    }

    public void setObowiazki(List<String> obowiazki) throws Exception {
        if (obowiazki.size() == 0) {
            throw new Exception("Księgowy musi mieć co najmniej jeden obowiązek");
        }
        this.obowiazki = obowiazki;
    }

    public String getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(String stazPracy) {
        this.stazPracy = stazPracy;
    }
}

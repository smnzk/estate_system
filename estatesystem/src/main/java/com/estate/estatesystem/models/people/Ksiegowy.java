package com.estate.estatesystem.models.people;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Ksiegowy")
public class Ksiegowy extends Pracownik{

    private List<String> obowiazki;
    private String stazPracy;

    public Ksiegowy(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerPracownika, double wynagrodzenie, String hasloDoSystemu, List<String> obowiazki, String stazPracy) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu, numerPracownika, wynagrodzenie, hasloDoSystemu);
        if (obowiazki.size() == 0) {
            throw new Exception("Księgowy musi mieć co najmniej jeden obowiązek");
        }
        this.obowiazki = obowiazki;
        this.stazPracy = stazPracy;
    }

    public Ksiegowy() {

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

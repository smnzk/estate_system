package com.estate.estatesystem.models.people;

import java.util.List;

public class Sprzedawca extends Oprowadzajacy{

    private double bonusOdSprzedazy;

    public Sprzedawca(int numerPracownika, double wynagrodzenie, String hasloDoSystemu, String specjalizacja, List<String> jezyki, double bonusOdSprzedazy, double calkowitaPensja) {
        super(numerPracownika, wynagrodzenie, hasloDoSystemu, specjalizacja, jezyki);
        this.bonusOdSprzedazy = bonusOdSprzedazy;
        this.calkowitaPensja = calkowitaPensja;
    }

    private double calkowitaPensja;

    public double getBonusOdSprzedazy() {
        return bonusOdSprzedazy;
    }

    public void setBonusOdSprzedazy(double bonusOdSprzedazy) {
        this.bonusOdSprzedazy = bonusOdSprzedazy;
    }

    public double getCalkowitaPensja() {
        return calkowitaPensja;
    }

    public void setCalkowitaPensja(double calkowitaPensja) {
        this.calkowitaPensja = calkowitaPensja;
    }
}

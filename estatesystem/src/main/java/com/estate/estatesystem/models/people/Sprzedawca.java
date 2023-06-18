package com.estate.estatesystem.models.people;

import com.estate.estatesystem.models.utility.Specjalizacja;

import java.util.List;

public class Sprzedawca extends Oprowadzajacy{

    private double bonusOdSprzedazy;
    private double calkowitaPensja;

    public Sprzedawca(int numerPracownika, double wynagrodzenie, String hasloDoSystemu, Specjalizacja specjalizacja, List<String> jezyki, double bonusOdSprzedazy, double calkowitaPensja) throws Exception {
        super(numerPracownika, wynagrodzenie, hasloDoSystemu, specjalizacja, jezyki);
        if (bonusOdSprzedazy > 0.2) {
            throw new Exception("Bonus nie może być większy niż 5%");
        }
        this.bonusOdSprzedazy = bonusOdSprzedazy;
        this.calkowitaPensja = calkowitaPensja;
    }

    public double getBonusOdSprzedazy() {
        return bonusOdSprzedazy;
    }

    public void setBonusOdSprzedazy(double bonusOdSprzedazy) throws Exception {
        if (bonusOdSprzedazy > 0.2) {
            throw new Exception("Bonus nie może być większy niż 5%");
        }
        this.bonusOdSprzedazy = bonusOdSprzedazy;
    }

    public double getCalkowitaPensja() {
        return calkowitaPensja;
    }

    public void setCalkowitaPensja(double calkowitaPensja) {
        this.calkowitaPensja = calkowitaPensja;
    }
}

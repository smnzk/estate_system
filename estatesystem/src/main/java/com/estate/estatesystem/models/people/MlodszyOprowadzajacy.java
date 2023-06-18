package com.estate.estatesystem.models.people;

import java.util.List;

public class MlodszyOprowadzajacy extends Oprowadzajacy{

    private double bonusOdOpinii;
    private double calkowitaPensja;

    public MlodszyOprowadzajacy(int numerPracownika, double wynagrodzenie, String hasloDoSystemu, String specjalizacja, List<String> jezyki, double bonusOdOpinii, double calkowitaPensja) {
        super(numerPracownika, wynagrodzenie, hasloDoSystemu, specjalizacja, jezyki);
        this.bonusOdOpinii = bonusOdOpinii;
        this.calkowitaPensja = calkowitaPensja;
    }

    public double getBonusOdOpinii() {
        return bonusOdOpinii;
    }

    public void setBonusOdOpinii(double bonusOdOpinii) {
        this.bonusOdOpinii = bonusOdOpinii;
    }

    public double getCalkowitaPensja() {
        return calkowitaPensja;
    }

    public void setCalkowitaPensja(double calkowitaPensja) {
        this.calkowitaPensja = calkowitaPensja;
    }
}

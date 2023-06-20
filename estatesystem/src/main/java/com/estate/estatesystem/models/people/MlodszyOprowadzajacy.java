package com.estate.estatesystem.models.people;

import com.estate.estatesystem.models.utility.Specjalizacja;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "MlodszyOprowadzajacy")
public class MlodszyOprowadzajacy extends Oprowadzajacy{

    private double bonusOdOpinii;
    private double calkowitaPensja;

    public MlodszyOprowadzajacy(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerPracownika, double wynagrodzenie, String hasloDoSystemu, Specjalizacja specjalizacja, List<String> jezyki, double bonusOdOpinii, double calkowitaPensja) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu, numerPracownika, wynagrodzenie, hasloDoSystemu, specjalizacja, jezyki);
        if (bonusOdOpinii > 0.2) {
            throw new Exception("Bonus nie może być większy niż 20%");
        }
        this.bonusOdOpinii = bonusOdOpinii;
        this.calkowitaPensja = calkowitaPensja;
    }

    public MlodszyOprowadzajacy() {

    }

    public double getBonusOdOpinii() {
        return bonusOdOpinii;
    }

    public void setBonusOdOpinii(double bonusOdOpinii) throws Exception {
        if (bonusOdOpinii > 0.2) {
            throw new Exception("Bonus nie może być większy niż 20%");
        }
        this.bonusOdOpinii = bonusOdOpinii;
    }

    public double getCalkowitaPensja() {
        return calkowitaPensja;
    }

    public void setCalkowitaPensja(double calkowitaPensja) {
        this.calkowitaPensja = calkowitaPensja;
    }
}

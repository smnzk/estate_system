package com.estate.estatesystem.models.people;

import com.estate.estatesystem.models.utility.Specjalizacja;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "MlodszyOprowadzajacy")
public class MlodszyOprowadzajacy extends Oprowadzajacy{

    private double bonusOdOpinii;

    public MlodszyOprowadzajacy(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerPracownika, double wynagrodzenie, String hasloDoSystemu, Specjalizacja specjalizacja, List<String> jezyki, double bonusOdOpinii) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu, numerPracownika, wynagrodzenie, hasloDoSystemu, specjalizacja, jezyki);
        if (bonusOdOpinii > 0.2) {
            throw new Exception("Bonus nie może być większy niż 20%");
        }
        this.bonusOdOpinii = bonusOdOpinii;
    }

    public MlodszyOprowadzajacy() {

    }

    public MlodszyOprowadzajacy(Sprzedawca sprzedawca, double bonusOdOpinii) throws Exception {
        super(sprzedawca.getImie(), sprzedawca.getNazwisko(), sprzedawca.getAdres(), sprzedawca.getNumberTelefonu(), sprzedawca.getNumerPracownika(), sprzedawca.getWynagrodzenie(), sprzedawca.getHasloDoSystemu(), sprzedawca.getSpecjalizacja(), sprzedawca.getJezyki());
        this.bonusOdOpinii = bonusOdOpinii;
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
        return this.getWynagrodzenie() * (1+bonusOdOpinii);
    }

}

package com.estate.estatesystem.models.people;

import com.estate.estatesystem.models.utility.Specjalizacja;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Oprowadzajacy")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Oprowadzajacy extends Pracownik{
    private Specjalizacja specjalizacja;
    private List<String> jezyki;

    public Oprowadzajacy(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerPracownika, double wynagrodzenie, String hasloDoSystemu, Specjalizacja specjalizacja, List<String> jezyki) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu, numerPracownika, wynagrodzenie, hasloDoSystemu);
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

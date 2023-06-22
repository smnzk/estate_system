package com.estate.estatesystem.models.people;

import com.estate.estatesystem.models.other.Ogloszenie;
import com.estate.estatesystem.models.utility.Specjalizacja;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Oprowadzajacy")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Oprowadzajacy extends Pracownik{
    private Specjalizacja specjalizacja;
    private List<String> jezyki;
    private boolean zbytZajety = false;

    @JsonIgnore
    @OneToMany(mappedBy = "oprowadzajacy")
    private Set<Ogloszenie> ogloszenieSet = new HashSet<>();

    public Oprowadzajacy(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerPracownika, double wynagrodzenie, String hasloDoSystemu, Specjalizacja specjalizacja, List<String> jezyki) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu, numerPracownika, wynagrodzenie, hasloDoSystemu);
        this.specjalizacja = specjalizacja;
        this.jezyki = jezyki;
    }

    public Oprowadzajacy() {

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

    public Set<Ogloszenie> getOgloszenieSet() {
        return ogloszenieSet;
    }

    public boolean isZbytZajety() {
        return zbytZajety;
    }

    public void setZbytZajety(boolean zbytZajety) {
        this.zbytZajety = zbytZajety;
    }
}

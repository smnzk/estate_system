package com.estate.estatesystem.models.people;

import com.estate.estatesystem.models.other.Ogloszenie;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Klient")
public class Klient extends Osoba{

    private static final HashSet<Integer> numeryKlientow = new HashSet<>();
    private Integer numerKlienta;
    private double budzet;

    @ManyToMany
    @JoinTable(
            name = "klient_ogloszenie",
            joinColumns = @JoinColumn(name = "klient_id"),
            inverseJoinColumns = @JoinColumn(name = "ogloszenie_id")
    )
    private Set<Ogloszenie> ogloszenieSet = new HashSet<>();

    public Klient(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerKlienta, double budzet) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu);
        if (numeryKlientow.contains(numerKlienta)) {
            throw new Exception("Numer klienta musi być unikalny");
        }
        this.numerKlienta = numerKlienta;
        this.budzet = budzet;
        numeryKlientow.add(numerKlienta);
    }

    public Integer getNumerKlienta() {
        return numerKlienta;
    }

    public void setNumerKlienta(Integer numerKlienta) throws Exception {
        if (numeryKlientow.contains(numerKlienta)) {
            throw new Exception("Numer klienta musi być unikalny");
        }
        this.numerKlienta = numerKlienta;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }

    public Set<Ogloszenie> getOgloszenieSet() {
        return ogloszenieSet;
    }
}

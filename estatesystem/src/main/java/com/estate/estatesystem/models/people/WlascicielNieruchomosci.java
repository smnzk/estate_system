package com.estate.estatesystem.models.people;

import com.estate.estatesystem.models.other.Nieruchomosc;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "WlascicielNieruchomosci")
public class WlascicielNieruchomosci extends Osoba{

    private final static HashSet<Integer> numeryWlascicieli = new HashSet<>();

    private Integer numerWlasciciela;
    private String numerKontaktowy;

    @JsonIgnore
    @OneToMany(mappedBy = "wlasciciel")
    private Set<Nieruchomosc> nieruchomoscSet = new HashSet<>();

    public WlascicielNieruchomosci(String imie, String nazwisko, String adres, String numberTelefonu, Integer numerWlasciciela, String numerKontaktowy) throws Exception {
        super(imie, nazwisko, adres, numberTelefonu);
        if (numeryWlascicieli.contains(numerWlasciciela)) {
            throw new Exception("Numer właściciela musi być unikalny");
        }
        this.numerWlasciciela = numerWlasciciela;
        this.numerKontaktowy = numerKontaktowy;
        numeryWlascicieli.add(numerWlasciciela);
    }

    public Integer getNumerWlasciciela() {
        return numerWlasciciela;
    }

    public void setNumerWlasciciela(Integer numerWlasciciela) throws Exception {
        if (numeryWlascicieli.contains(numerWlasciciela)) {
            throw new Exception("Numer właściciela musi być unikalny");
        }
        this.numerWlasciciela = numerWlasciciela;
    }

    public String getNumerKontaktowy() {
        return numerKontaktowy;
    }

    public void setNumerKontaktowy(String numerKontaktowy) {
        this.numerKontaktowy = numerKontaktowy;
    }

    public Set<Nieruchomosc> getNieruchomoscSet() {
        return nieruchomoscSet;
    }
}

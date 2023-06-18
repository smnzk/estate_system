package com.estate.estatesystem.models.people;

import java.util.HashSet;

public class WlascicielNieruchomosci {

    private final static HashSet<Integer> numeryWlascicieli = new HashSet<>();

    private Integer numerWlasciciela;
    private String numerKontaktowy;

    public WlascicielNieruchomosci(Integer numerWlasciciela, String numerKontaktowy) throws Exception {
        if (numeryWlascicieli.contains(numerWlasciciela)) {
            throw new Exception("Numer właściciela musi być unikalny");
        }
        this.numerWlasciciela = numerWlasciciela;
        this.numerKontaktowy = numerKontaktowy;
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
}

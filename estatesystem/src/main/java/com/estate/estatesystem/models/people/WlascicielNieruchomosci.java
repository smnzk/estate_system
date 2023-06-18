package com.estate.estatesystem.models.people;

public class WlascicielNieruchomosci {

    private int numerWlasciciela;
    private String numerKontaktowy;

    public WlascicielNieruchomosci(int numerWlasciciela, String numerKontaktowy) {
        this.numerWlasciciela = numerWlasciciela;
        this.numerKontaktowy = numerKontaktowy;
    }

    public int getNumerWlasciciela() {
        return numerWlasciciela;
    }

    public void setNumerWlasciciela(int numerWlasciciela) {
        this.numerWlasciciela = numerWlasciciela;
    }

    public String getNumerKontaktowy() {
        return numerKontaktowy;
    }

    public void setNumerKontaktowy(String numerKontaktowy) {
        this.numerKontaktowy = numerKontaktowy;
    }
}

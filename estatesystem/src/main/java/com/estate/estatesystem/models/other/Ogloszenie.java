package com.estate.estatesystem.models.other;

import java.time.LocalDate;

public class Ogloszenie {

    public static int iloscOgloszen;

    private LocalDate dataWystawienia;
    private LocalDate dataZakonczenia;
    private String status;

    public Ogloszenie(LocalDate dataWystawienia, LocalDate dataZakonczenia, String status) {
        this.dataWystawienia = dataWystawienia;
        this.dataZakonczenia = dataZakonczenia;
        this.status = status;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(LocalDate dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public LocalDate getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(LocalDate dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

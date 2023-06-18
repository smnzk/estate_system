package com.estate.estatesystem.models.other;

import com.estate.estatesystem.models.utility.Status;

import java.time.LocalDate;

public class Ogloszenie {

    public static int iloscOgloszen = 0;

    private LocalDate dataWystawienia;
    private LocalDate dataZakonczenia;
    private Status status;

    public Ogloszenie(LocalDate dataWystawienia, LocalDate dataZakonczenia, Status status) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

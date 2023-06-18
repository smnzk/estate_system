package com.estate.estatesystem.models.other;

import com.estate.estatesystem.models.utility.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Ogloszenie")
public class Ogloszenie {

    public static int iloscOgloszen = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private LocalDate dataWystawienia;
    private LocalDate dataZakonczenia;
    private Status status;

    public Ogloszenie(LocalDate dataWystawienia, LocalDate dataZakonczenia, Status status) {
        this.dataWystawienia = dataWystawienia;
        this.dataZakonczenia = dataZakonczenia;
        this.status = status;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

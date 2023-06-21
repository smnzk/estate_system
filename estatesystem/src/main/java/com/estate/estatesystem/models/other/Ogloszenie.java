package com.estate.estatesystem.models.other;

import com.estate.estatesystem.models.people.Klient;
import com.estate.estatesystem.models.people.Oprowadzajacy;
import com.estate.estatesystem.models.utility.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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
    private String opis;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oprowadzajacy_id", referencedColumnName = "id")
    private Oprowadzajacy oprowadzajacy;

    @ManyToMany(mappedBy = "ogloszenieSet")
    private Set<Klient> klientSet = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nieruchomosc_id", referencedColumnName = "id")
    private Nieruchomosc nieruchomosc;

    @JsonIgnore
    @OneToMany(mappedBy = "ogloszenie")
    private Set<WpisNaStronie> wpisNaStronieSet = new HashSet<>();


    public Ogloszenie(LocalDate dataWystawienia, LocalDate dataZakonczenia, Status status) {
        this.dataWystawienia = dataWystawienia;
        this.dataZakonczenia = dataZakonczenia;
        this.status = status;
    }

    public Ogloszenie(){}

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

    public Oprowadzajacy getOprowadzajacy() {
        return oprowadzajacy;
    }

    public String getOpis() {
        return opis;
    }

    public Set<Klient> getKlientSet() {
        return klientSet;
    }

    public Nieruchomosc getNieruchomosc() {
        return nieruchomosc;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setOprowadzajacy(Oprowadzajacy oprowadzajacy) {
        this.oprowadzajacy = oprowadzajacy;
    }

    public void setNieruchomosc(Nieruchomosc nieruchomosc) {
        this.nieruchomosc = nieruchomosc;
    }

    public Set<WpisNaStronie> getWpisNaStronieSet() {
        return wpisNaStronieSet;
    }
}

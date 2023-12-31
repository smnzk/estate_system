package com.estate.estatesystem.models.other;

import jakarta.persistence.*;

@Entity
@Table(name = "Dom")
public class Dom extends Nieruchomosc{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean pozaMiastem;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dzialka_id", referencedColumnName = "id")
    private Dzialka dzialka;

    public Dom(double powierzchnia, String adres, boolean pozaMiastem) {
        super(powierzchnia, adres);
        this.pozaMiastem = pozaMiastem;
    }

    public Dom(){

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPozaMiastem() {
        return pozaMiastem;
    }

    public void setPozaMiastem(boolean pozaMiastem) {
        this.pozaMiastem = pozaMiastem;
    }

    public Dzialka getDzialka() {
        return dzialka;
    }
}

package com.estate.estatesystem.models.other;

import jakarta.persistence.*;

@Entity
@Table(name = "Mieszkanie")
public class Mieszkanie extends Nieruchomosc{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean uwzgledniaGaraz;
    private int pietroBloku;
    private int numerMieszkania;

    public Mieszkanie(double powierzchnia, String adres, boolean uwzgledniaGaraz, int pietroBloku, int numerMieszkania) {
        super(powierzchnia, adres);
        this.uwzgledniaGaraz = uwzgledniaGaraz;
        this.pietroBloku = pietroBloku;
        this.numerMieszkania = numerMieszkania;
    }

    public Mieszkanie(){

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public boolean isUwzgledniaGaraz() {
        return uwzgledniaGaraz;
    }

    public void setUwzgledniaGaraz(boolean uwzgledniaGaraz) {
        this.uwzgledniaGaraz = uwzgledniaGaraz;
    }

    public int getPietroBloku() {
        return pietroBloku;
    }

    public void setPietroBloku(int pietroBloku) {
        this.pietroBloku = pietroBloku;
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(int numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }
}

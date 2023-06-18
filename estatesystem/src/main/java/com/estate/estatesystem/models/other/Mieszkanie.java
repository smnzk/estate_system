package com.estate.estatesystem.models.other;

public class Mieszkanie extends Nieruchomosc{

    private boolean uwzgledniaGaraz;
    private int pietroBloku;
    private int numerMieszkania;

    public Mieszkanie(double powierzchnia, String adres, boolean uwzgledniaGaraz, int pietroBloku, int numerMieszkania) {
        super(powierzchnia, adres);
        this.uwzgledniaGaraz = uwzgledniaGaraz;
        this.pietroBloku = pietroBloku;
        this.numerMieszkania = numerMieszkania;
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

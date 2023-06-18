package com.estate.estatesystem.models.other;

public class Dom extends Nieruchomosc{

    private boolean pozaMiastem;

    public Dom(double powierzchnia, String adres, boolean pozaMiastem) {
        super(powierzchnia, adres);
        this.pozaMiastem = pozaMiastem;
    }

    public boolean isPozaMiastem() {
        return pozaMiastem;
    }

    public void setPozaMiastem(boolean pozaMiastem) {
        this.pozaMiastem = pozaMiastem;
    }
}

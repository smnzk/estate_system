package com.estate.estatesystem.models.other;

public class Dzialka {

    private double powierzchnia;
    private String zagospodarowanie;

    public Dzialka(double powierzchnia, String zagospodarowanie) {
        this.powierzchnia = powierzchnia;
        this.zagospodarowanie = zagospodarowanie;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public String getZagospodarowanie() {
        return zagospodarowanie;
    }

    public void setZagospodarowanie(String zagospodarowanie) {
        this.zagospodarowanie = zagospodarowanie;
    }
}

package com.estate.estatesystem.models.other;

import jakarta.persistence.*;

@Entity
@Table(name = "Dzialka")
public class Dzialka {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double powierzchnia;
    private String zagospodarowanie;

    @OneToOne(mappedBy = "dzialka")
    private Dom dom;

    public Dzialka(double powierzchnia, String zagospodarowanie) {
        this.powierzchnia = powierzchnia;
        this.zagospodarowanie = zagospodarowanie;
    }

    public Dzialka(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Dom getDom() {
        return dom;
    }
}

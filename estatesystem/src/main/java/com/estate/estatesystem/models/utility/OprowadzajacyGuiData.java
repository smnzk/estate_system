package com.estate.estatesystem.models.utility;

import com.estate.estatesystem.models.people.Oprowadzajacy;

public class OprowadzajacyGuiData {

    private String link;
    private Oprowadzajacy oprowadzajacy;

    public OprowadzajacyGuiData(String link, Oprowadzajacy oprowadzajacy) {
        this.link = link;
        this.oprowadzajacy = oprowadzajacy;
    }

    public OprowadzajacyGuiData() {
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Oprowadzajacy getOprowadzajacy() {
        return oprowadzajacy;
    }

    public void setOprowadzajacy(Oprowadzajacy oprowadzajacy) {
        this.oprowadzajacy = oprowadzajacy;
    }
}

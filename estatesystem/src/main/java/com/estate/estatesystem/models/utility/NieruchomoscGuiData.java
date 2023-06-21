package com.estate.estatesystem.models.utility;

import com.estate.estatesystem.models.other.Nieruchomosc;

public class NieruchomoscGuiData {
    private Nieruchomosc nieruchomosc;
    private String link;

    public NieruchomoscGuiData(Nieruchomosc nieruchomosc, String link) {
        this.nieruchomosc = nieruchomosc;
        this.link = link;
    }

    public Nieruchomosc getNieruchomosc() {
        return nieruchomosc;
    }

    public void setNieruchomosc(Nieruchomosc nieruchomosc) {
        this.nieruchomosc = nieruchomosc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

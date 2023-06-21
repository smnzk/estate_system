package com.estate.estatesystem.models.utility;

import com.estate.estatesystem.models.people.Osoba;

public class OsobaGuiData {
    private Osoba osoba;
    private String link;

    public OsobaGuiData(Osoba osoba, String link) {
        this.osoba = osoba;
        this.link = link;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

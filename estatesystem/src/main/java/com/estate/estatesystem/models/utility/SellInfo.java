package com.estate.estatesystem.models.utility;

public class SellInfo {

    private Long nieruchomoscId;
    private String data;

    public SellInfo(String data) {
        this.data = data;
    }

    public SellInfo(){

    }

    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    public Long getNieruchomoscId() {
        return nieruchomoscId;
    }

    public void setNieruchomoscId(Long nieruchomoscId) {
        this.nieruchomoscId = nieruchomoscId;
    }
}

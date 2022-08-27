package com.example.team16;

public class BuyData {

    private String buy_name;
    private String buy_detail;

    public BuyData(String buy_name, String buy_detail){
        this.buy_name = buy_name;
        this.buy_detail = buy_detail;
    }

    public void setBuy_name(String buy_name) {
        this.buy_name = buy_name;
    }

    public void setBuy_detail(String buy_detail) {
        this.buy_detail = buy_detail;
    }

    public String getBuy_name() {return buy_name; }

    public String getBuy_detail() {
        return buy_detail;
    }
}
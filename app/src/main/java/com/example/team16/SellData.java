package com.example.team16;

public class SellData {

    private String sell_name;
    private String sell_detail;
    private String sell_time;

    public SellData(String sell_name, String sell_detail, String sell_time){
        this.sell_name = sell_name;
        this.sell_detail = sell_detail;
        this.sell_time = sell_time;
    }

    public void setSell_name(String sell_name) {
        this.sell_name = sell_name;
    }

    public void setSell_detail(String buy_detail) {
        this.sell_detail = sell_detail;
    }

    public void setSell_time(String buy_time) { this.sell_time = sell_time; }

    public String getSell_name() {return sell_name; }

    public String getSell_detail() {
        return sell_detail;
    }

    public String getSell_time() { return  sell_time; }
}
package com.frictionhacks.eqt;

import java.util.ArrayList;

public class StockDataModel {
    private String stockName, dayOpen, dayHigh, dayLow, lastTradedPrice, pdc,userRec;
    private ArrayList<String> gVal, tVal;


    public StockDataModel() {

    }


    public StockDataModel(String stockName, String dayOpen, String dayHigh, String dayLow, String lastTradedPrice, String pdc, ArrayList<String> gVal, ArrayList<String> tVal,String userRec) {
        this.stockName = stockName;
        this.dayOpen = dayOpen;
        this.dayHigh = dayHigh;
        this.dayLow = dayLow;
        this.lastTradedPrice = lastTradedPrice;
        this.pdc = pdc;
        this.gVal = gVal;
        this.tVal = tVal;
        this.userRec=userRec;
    }

    public StockDataModel(String stockName, String dayOpen, String dayHigh, String dayLow, String lastTradedPrice) {
        this.stockName = stockName;
        this.dayOpen = dayOpen;
        this.dayHigh = dayHigh;
        this.dayLow = dayLow;
        this.lastTradedPrice = lastTradedPrice;
    }

    public String getUserRec() {
        return userRec;
    }

    public void setUserRec(String userRec) {
        this.userRec = userRec;
    }

    public ArrayList<String> gettVal() {
        return tVal;
    }

    public void settVal(ArrayList<String> tVal) {
        this.tVal = tVal;
    }

    public String getPdc() {
        return pdc;
    }

    public ArrayList<String> getgVal() {
        return gVal;
    }

    public void setgVal(ArrayList<String> gVal) {
        this.gVal = gVal;
    }

    public void setPdc(String pdc) {
        this.pdc = pdc;
    }


    public String getDayOpen() {
        return dayOpen;
    }

    public void setDayOpen(String dayOpen) {
        this.dayOpen = dayOpen;
    }

    public String getDayHigh() {
        return dayHigh;
    }

    public void setDayHigh(String dayHigh) {
        this.dayHigh = dayHigh;
    }

    public String getDayLow() {
        return dayLow;
    }

    public void setDayLow(String dayLow) {
        this.dayLow = dayLow;
    }

    public String getLastTradedPrice() {
        return lastTradedPrice;
    }

    public void setLastTradedPrice(String lastTradedPrice) {
        this.lastTradedPrice = lastTradedPrice;
    }


    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }


}

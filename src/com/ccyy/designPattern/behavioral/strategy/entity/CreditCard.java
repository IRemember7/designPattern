package com.ccyy.designPattern.behavioral.strategy.entity;

/**
 * @author: lianghanmao
 * @create: 2022-03-24
 * @description: 信用卡
 **/
public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

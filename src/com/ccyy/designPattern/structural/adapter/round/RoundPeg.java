package com.ccyy.designPattern.structural.adapter.round;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 圆钉
 **/
public class RoundPeg {

    private double radius;

    public RoundPeg(){}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

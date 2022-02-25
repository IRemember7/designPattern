package com.ccyy.designPattern.structural.adapter.round;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 圆孔
 **/
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 比较，圆钉能否放进圆洞
     * @param peg
     * @return
     */
    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
}

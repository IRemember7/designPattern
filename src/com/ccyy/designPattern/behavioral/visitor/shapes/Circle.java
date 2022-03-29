package com.ccyy.designPattern.behavioral.visitor.shapes;

import com.ccyy.designPattern.behavioral.visitor.visitor.Visitor;

/**
 * @author: lianghanmao
 * @create: 2022-03-29
 * @description: 圆形
 **/
public class Circle extends Dot{
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}

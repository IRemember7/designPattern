package com.ccyy.designPattern.structural.composite.shapes;

import java.awt.*;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 圆形
 **/
public class Circle extends BaseShape{

    private int radius;

    public Circle(int x, int y, Color color,int radius) {
        super(x, y, color);
        this.radius =radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }

}

package com.ccyy.designPattern.structural.composite.shapes;

import java.awt.*;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 形状，定义所有形状的接口
 **/
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}

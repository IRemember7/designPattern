package com.ccyy.designPattern.behavioral.visitor.shapes;

import com.ccyy.designPattern.behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lianghanmao
 * @create: 2022-03-29
 * @description: 组合图形
 **/
public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}

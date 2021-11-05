package com.ccyy.designPattern.creational.clone;

import com.ccyy.designPattern.creational.clone.shapes.Circle;
import com.ccyy.designPattern.creational.clone.shapes.Rectangle;
import com.ccyy.designPattern.creational.clone.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lianghanmao
 * @create: 2021-11-05
 * @description: 演示
 **/
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }
    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
//            shapes.get(i) != shapesCopy.get(i) 比较的是内存地址，内存地址不一样，不是同一个对象
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": 不是同一个对象");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": 它们是一样的");
                } else {
                    System.out.println(i + ": 但它们并不完全相同");
                }
            } else {
                System.out.println(i + ": 属于同一个对象");
            }
        }
    }
}

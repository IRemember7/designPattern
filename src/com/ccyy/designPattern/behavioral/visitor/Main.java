package com.ccyy.designPattern.behavioral.visitor;

import com.ccyy.designPattern.behavioral.visitor.shapes.*;
import com.ccyy.designPattern.behavioral.visitor.visitor.XmlExportVisitor;

/**
 * @author: lianghanmao
 * @create: 2022-03-29
 * @description: 测试入口
 **/
public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XmlExportVisitor exportVisitor = new XmlExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}

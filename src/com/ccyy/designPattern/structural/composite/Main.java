package com.ccyy.designPattern.structural.composite;

import com.ccyy.designPattern.structural.composite.editor.ImageEditor;
import com.ccyy.designPattern.structural.composite.shapes.Circle;
import com.ccyy.designPattern.structural.composite.shapes.CompoundShape;
import com.ccyy.designPattern.structural.composite.shapes.Dot;
import com.ccyy.designPattern.structural.composite.shapes.Rectangle;

import java.awt.*;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 测试类
 **/
public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10,  Color.BLUE,10),

                new CompoundShape(
                        new Circle(110, 110,  Color.RED,50),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100,100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }

}

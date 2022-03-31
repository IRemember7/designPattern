package com.ccyy.designPattern.behavioral.memento;

import com.ccyy.designPattern.behavioral.memento.editor.Editor;
import com.ccyy.designPattern.behavioral.memento.shapes.Circle;
import com.ccyy.designPattern.behavioral.memento.shapes.CompoundShape;
import com.ccyy.designPattern.behavioral.memento.shapes.Dot;
import com.ccyy.designPattern.behavioral.memento.shapes.Rectangle;

import java.awt.*;

/**
 * @author: lianghanmao
 * @create: 2022-03-31
 * @description: 测试入口
 **/
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}

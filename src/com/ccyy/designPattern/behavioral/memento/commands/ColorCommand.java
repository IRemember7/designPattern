package com.ccyy.designPattern.behavioral.memento.commands;

import com.ccyy.designPattern.behavioral.memento.editor.Editor;
import com.ccyy.designPattern.behavioral.memento.shapes.Shape;

import java.awt.*;


/**
 * @author: lianghanmao
 * @create: 2022-03-31
 * @description: 修改已选中的颜色
 **/
public class ColorCommand implements Command{
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}

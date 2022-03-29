package com.ccyy.designPattern.behavioral.visitor.shapes;

import com.ccyy.designPattern.behavioral.visitor.visitor.Visitor;

/**
 * @author: lianghanmao
 * @create: 2022-03-29
 * @description: 通用接口类
 **/
public interface Shape {
    /**
     * 移动图形
     * @param x
     * @param y
     */
    void move(int x, int y);

    /**
     * 绘制图形
     */
    void draw();

    /**
     * 访问图形
     * @param visitor
     * @return
     */
    String accept(Visitor visitor);
}

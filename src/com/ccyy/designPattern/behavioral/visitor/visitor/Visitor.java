package com.ccyy.designPattern.behavioral.visitor.visitor;

import com.ccyy.designPattern.behavioral.visitor.shapes.Circle;
import com.ccyy.designPattern.behavioral.visitor.shapes.CompoundShape;
import com.ccyy.designPattern.behavioral.visitor.shapes.Dot;
import com.ccyy.designPattern.behavioral.visitor.shapes.Rectangle;

/**
 * @author: lianghanmao
 * @create: 2022-03-29
 * @description: 通用访问者接口
 **/
public interface Visitor {
    /**
     * 访问点
     * @param dot
     * @return
     */
    String visitDot(Dot dot);

    /**
     * 访问圆形
     * @param circle
     * @return
     */
    String visitCircle(Circle circle);

    /**
     * 访问矩形
     * @param rectangle
     * @return
     */
    String visitRectangle(Rectangle rectangle);

    /**
     * 访问组合图形
     * @param cg
     * @return
     */
    String visitCompoundGraphic(CompoundShape cg);
}

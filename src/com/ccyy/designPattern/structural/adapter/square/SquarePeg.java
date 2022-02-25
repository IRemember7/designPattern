package com.ccyy.designPattern.structural.adapter.square;

import com.ccyy.designPattern.structural.adapter.adapters.SquarePegAdapter;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 方钉实体类，方钉要放进圆洞，但方钉没有半径，
 * 使用适配器类
 * @see SquarePegAdapter
 **/
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width =width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 方钉的面积
     * @return
     */
    private double getSquare(){
        //Math.pow(x,y) 计算x的y次方
        return Math.pow(this.width,2);
    }
}

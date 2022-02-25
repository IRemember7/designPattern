package com.ccyy.designPattern.structural.adapter.adapters;

import com.ccyy.designPattern.structural.adapter.round.RoundPeg;
import com.ccyy.designPattern.structural.adapter.square.SquarePeg;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 适配器，让方钉适配圆孔
 **/
public class  SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    /**
     * 重写圆钉的getRadius()方法
     * @return
     */
    @Override
    public double getRadius() {
        //Math.sqrt开根号
        //下边这条算式是计算，正方形外切圆的半径
        return Math.sqrt(Math.pow(peg.getWidth() / 2, 2) * 2);
    }
}

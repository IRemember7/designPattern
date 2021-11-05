package com.ccyy.designPattern.creational.factoryMethod.project;

/**
 * @author: lianghanmao
 * @create: 2021-10-11
 * @description: html按钮
 **/
public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("创建一个html按钮");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("点击了html按钮");
    }
}

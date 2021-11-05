package com.ccyy.designPattern.creational.factoryMethod.project;

/**
 * @author: lianghanmao
 * @create: 2021-10-11
 * @description: windows按钮
 **/
public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("创建了一个windows按钮");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("点击了一个windows按钮");
    }
}

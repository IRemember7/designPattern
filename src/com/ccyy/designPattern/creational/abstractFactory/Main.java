package com.ccyy.designPattern.creational.abstractFactory;

import com.ccyy.designPattern.creational.abstractFactory.factory.MacFactory;
import com.ccyy.designPattern.creational.abstractFactory.factory.WinFactory;

/**
 * @author: lianghanmao
 * @create: 2021-10-12
 * @description: 测试
 **/
public class Main {
    public static void main(String[] args) {
//        创建windows组件
        System.out.println("-----创建windows");
        Application win = new Application(new WinFactory());
        win.paint();
//        创建mac组件
        System.out.println("-----创建mac");
        Application mac = new Application(new MacFactory());
        mac.paint();
    }
}

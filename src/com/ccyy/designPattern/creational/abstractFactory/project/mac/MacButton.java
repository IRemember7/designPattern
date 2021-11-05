package com.ccyy.designPattern.creational.abstractFactory.project.mac;

import com.ccyy.designPattern.creational.abstractFactory.project.Button;

/**
 * @author: lianghanmao
 * @create: 2021-10-12
 * @description: mac按钮样式
 **/
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("---创建mac按钮");
    }
}

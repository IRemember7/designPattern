package com.ccyy.designPattern.creational.abstractFactory.project.mac;

import com.ccyy.designPattern.creational.abstractFactory.project.Checkbox;

/**
 * @author: lianghanmao
 * @create: 2021-10-12
 * @description: mac选择框样式
 **/
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("---创建mac选择框");
    }
}

package com.ccyy.designPattern.creational.abstractFactory.project.windows;

import com.ccyy.designPattern.creational.abstractFactory.project.Checkbox;

/**
 * @author: lianghanmao
 * @create: 2021-10-12
 * @description: windows选择框样式
 **/
public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("---创建windows选择框");
    }
}

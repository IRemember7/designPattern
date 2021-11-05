package com.ccyy.designPattern.creational.abstractFactory.project.windows;

import com.ccyy.designPattern.creational.abstractFactory.project.Button;

/**
 * @author: lianghanmao
 * @create: 2021-10-12
 * @description: window按钮样式
 **/
public class WinButton implements Button {

    /**
     * 根据 Windows 样式渲染按钮。
     */
    @Override
    public void paint() {
        System.out.println("---创建windows按钮");
    }
}

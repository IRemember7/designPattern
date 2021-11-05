package com.ccyy.designPattern.creational.factoryMethod.factory;

import com.ccyy.designPattern.creational.factoryMethod.project.Button;
import com.ccyy.designPattern.creational.factoryMethod.project.WindowsButton;

/**
 * @author: lianghanmao
 * @create: 2021-10-11
 * @description: 具体创建者将重写工厂方法以改变其所返回的产品类型。
 **/
public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}

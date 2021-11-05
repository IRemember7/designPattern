package com.ccyy.designPattern.creational.abstractFactory.factory;

import com.ccyy.designPattern.creational.abstractFactory.project.Button;
import com.ccyy.designPattern.creational.abstractFactory.project.Checkbox;
import com.ccyy.designPattern.creational.abstractFactory.project.windows.WinButton;
import com.ccyy.designPattern.creational.abstractFactory.project.windows.WinCheckbox;

/**
 * @author: lianghanmao
 * @create: 2021-10-12
 * @description: 具体工厂可生成属于同一变体的系列产品。工厂会确保其创建的产品能相互搭配使用。
 * 具体工厂方法签名会返回一个抽象产品，但在方法内部则会对具体产品进行实例化。
 **/
public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}

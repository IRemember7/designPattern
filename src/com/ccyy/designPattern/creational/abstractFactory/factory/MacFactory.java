package com.ccyy.designPattern.creational.abstractFactory.factory;

import com.ccyy.designPattern.creational.abstractFactory.project.Button;
import com.ccyy.designPattern.creational.abstractFactory.project.Checkbox;
import com.ccyy.designPattern.creational.abstractFactory.project.mac.MacButton;
import com.ccyy.designPattern.creational.abstractFactory.project.mac.MacCheckbox;

/**
 * @author: lianghanmao
 * @create: 2021-10-12
 * @description:
 **/
public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

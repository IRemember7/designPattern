package com.ccyy.designPattern.creational.abstractFactory;

import com.ccyy.designPattern.creational.abstractFactory.factory.GUIFactory;
import com.ccyy.designPattern.creational.abstractFactory.project.Button;
import com.ccyy.designPattern.creational.abstractFactory.project.Checkbox;

/**
 * @author: lianghanmao
 * @create: 2021-10-12
 * @description: 客户端代码仅通过抽象类型（GUIFactory、Button 和 Checkbox）使用工厂和产品。
 *                 这让你无需修改任何工厂或产品子类就能将其传递给客户端代码。
 **/
public class Application {
    private GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void paint(){
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }
}

package com.ccyy.designPattern.creational.factoryMethod.factory;

import com.ccyy.designPattern.creational.factoryMethod.project.Button;

/**
 * @author: lianghanmao
 * @create: 2021-10-11
 * @description: 创建者类声明工厂方法必须返回一个产品类的对象，创建者的子类通常会提供 该方法的实现。
 **/
public abstract class  Dialog {
    abstract Button createButton();

    public void render(){
        Button button = createButton();
//        使用button
        button.render();
    }
}

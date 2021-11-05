package com.ccyy.designPattern.creational.factoryMethod.factory;

import com.ccyy.designPattern.creational.factoryMethod.project.Button;
import com.ccyy.designPattern.creational.factoryMethod.project.HTMLButton;

/**
 * @author: lianghanmao
 * @create: 2021-10-11
 * @description:
 **/
public class WebDialog extends Dialog{
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}

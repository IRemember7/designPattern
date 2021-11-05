package com.ccyy.designPattern.creational.factoryMethod;

import com.ccyy.designPattern.creational.factoryMethod.factory.Dialog;
import com.ccyy.designPattern.creational.factoryMethod.factory.WebDialog;
import com.ccyy.designPattern.creational.factoryMethod.factory.WindowsDialog;

/**
 * @author: lianghanmao
 * @create: 2021-10-11
 * @description: 测试
 **/
public class Main {
    public static void main(String[] args) {
//        使用工厂方法创建windows按钮
        Dialog winDialog = new WindowsDialog();
        winDialog.render();
//        使用工厂方法创建web按钮
        Dialog webDialog = new WebDialog();
        webDialog.render();
    }
}

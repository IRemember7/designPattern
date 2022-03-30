package com.ccyy.designPattern.behavioral.mediator;

import com.ccyy.designPattern.behavioral.mediator.components.*;
import com.ccyy.designPattern.behavioral.mediator.mediator.Editor;
import com.ccyy.designPattern.behavioral.mediator.mediator.Mediator;

import javax.swing.*;

/**
 * @author: lianghanmao
 * @create: 2022-03-30
 * @description: 测试入口
 **/
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}

package com.ccyy.designPattern.behavioral.mediator.components;

import com.ccyy.designPattern.behavioral.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author: lianghanmao
 * @create: 2022-03-30
 * @description: 保存按钮
 **/
public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}

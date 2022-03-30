package com.ccyy.designPattern.behavioral.mediator.components;

import com.ccyy.designPattern.behavioral.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author: lianghanmao
 * @create: 2022-03-30
 * @description: 删除按钮
 **/
public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
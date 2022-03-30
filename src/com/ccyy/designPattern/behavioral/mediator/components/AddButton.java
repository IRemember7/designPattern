package com.ccyy.designPattern.behavioral.mediator.components;

import com.ccyy.designPattern.behavioral.mediator.mediator.Mediator;
import com.ccyy.designPattern.behavioral.mediator.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author: lianghanmao
 * @create: 2022-03-30
 * @description: 添加按钮
 **/
public class AddButton extends JButton implements Component {

    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}

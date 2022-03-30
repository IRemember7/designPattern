package com.ccyy.designPattern.behavioral.mediator.components;

import com.ccyy.designPattern.behavioral.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author: lianghanmao
 * @create: 2022-03-30
 * @description:
 **/
public class TextBox extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}

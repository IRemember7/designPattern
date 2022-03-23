package com.ccyy.designPattern.behavioral.command.commands;

import java.util.Stack;

/**
 * @author: lianghanmao
 * @create: 2022-03-15
 * @description: 历史命令，撤回
 **/
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}

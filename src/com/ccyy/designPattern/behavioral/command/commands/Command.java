package com.ccyy.designPattern.behavioral.command.commands;

import com.ccyy.designPattern.behavioral.command.editor.Editor;

/**
 * @author: lianghanmao
 * @create: 2022-03-15
 * @description: 命令
 **/
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    /**
     * 执行命令
     * @return
     */
    public abstract boolean execute();
}

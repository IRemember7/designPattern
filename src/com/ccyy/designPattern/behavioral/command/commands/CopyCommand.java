package com.ccyy.designPattern.behavioral.command.commands;

import com.ccyy.designPattern.behavioral.command.editor.Editor;

/**
 * @author: lianghanmao
 * @create: 2022-03-15
 * @description: 复制命令
 **/
public class CopyCommand extends Command{
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}

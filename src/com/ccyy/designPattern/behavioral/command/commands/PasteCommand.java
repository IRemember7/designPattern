package com.ccyy.designPattern.behavioral.command.commands;

import com.ccyy.designPattern.behavioral.command.editor.Editor;

/**
 * @author: lianghanmao
 * @create: 2022-03-15
 * @description: 粘贴命令
 **/
public class PasteCommand extends Command{
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()){
            return false;
        }
        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}

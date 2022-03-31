package com.ccyy.designPattern.behavioral.memento.history;

import com.ccyy.designPattern.behavioral.memento.editor.Editor;

/**
 * @author: lianghanmao
 * @create: 2022-03-31
 * @description: 备忘录类
 **/
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}

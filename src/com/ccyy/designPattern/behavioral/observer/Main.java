package com.ccyy.designPattern.behavioral.observer;

import com.ccyy.designPattern.behavioral.observer.editor.Editor;
import com.ccyy.designPattern.behavioral.observer.listeners.EmailNotificationListener;
import com.ccyy.designPattern.behavioral.observer.listeners.LogOpenListener;

/**
 * @author: lianghanmao
 * @create: 2022-03-28
 * @description: 测试入口
 **/
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.getEvents().subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.getEvents().subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

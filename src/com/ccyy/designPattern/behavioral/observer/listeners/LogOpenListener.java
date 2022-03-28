package com.ccyy.designPattern.behavioral.observer.listeners;

/**
 * @author: lianghanmao
 * @create: 2022-03-28
 * @description: 收到通知后添加一条日志
 **/
public class LogOpenListener implements EventListener{
    private String log;
    @Override
    public void update(String eventType, String filePath) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + filePath);
    }
    public LogOpenListener(String file){
        log = file;
    }
}

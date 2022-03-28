package com.ccyy.designPattern.behavioral.observer.listeners;

/**
 * @author: lianghanmao
 * @create: 2022-03-28
 * @description: 收到通知后发送邮件
 **/
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file);
    }
}

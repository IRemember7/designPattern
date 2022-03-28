package com.ccyy.designPattern.behavioral.observer.listeners;

/**
 * @author: lianghanmao
 * @create: 2022-03-28
 * @description: 通用观察者接口
 **/
public interface EventListener {
    void update(String eventType,String filePath);
}

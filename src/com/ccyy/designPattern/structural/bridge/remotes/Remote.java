package com.ccyy.designPattern.structural.bridge.remotes;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 所有远程控制器通用接口
 **/
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}

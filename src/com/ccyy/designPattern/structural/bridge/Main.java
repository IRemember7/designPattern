package com.ccyy.designPattern.structural.bridge;

import com.ccyy.designPattern.structural.bridge.devices.Device;
import com.ccyy.designPattern.structural.bridge.devices.Radio;
import com.ccyy.designPattern.structural.bridge.devices.Tv;
import com.ccyy.designPattern.structural.bridge.remotes.AdvancedRemote;
import com.ccyy.designPattern.structural.bridge.remotes.BasicRemote;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 测试类
 **/
public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

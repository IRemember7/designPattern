package com.ccyy.designPattern.structural.bridge.remotes;

import com.ccyy.designPattern.structural.bridge.devices.Device;

/**
 * @author: lianghanmao
 * @create: 2022-02-25
 * @description: 高级控制器
 **/
public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}

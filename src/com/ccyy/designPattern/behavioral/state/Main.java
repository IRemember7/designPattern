package com.ccyy.designPattern.behavioral.state;

import com.ccyy.designPattern.behavioral.state.ui.Player;
import com.ccyy.designPattern.behavioral.state.ui.UI;

/**
 * @author: lianghanmao
 * @create: 2022-03-25
 * @description: 测试类
 **/
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}

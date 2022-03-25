package com.ccyy.designPattern.behavioral.state.states;

import com.ccyy.designPattern.behavioral.state.ui.Player;

/**
 * @author: lianghanmao
 * @create: 2022-03-25
 * @description: 通用状态接口
 **/
public abstract class State {
    Player player;
    public State(Player player){
        this.player = player;
    }

    /**
     * 关闭
     * @return
     */
    public abstract String onLock();

    /**
     * 开启
     * @return
     */
    public abstract String onPlay();

    /**
     * 下一集
     * @return
     */
    public abstract String onNext();

    /**
     * 上一集
     * @return
     */
    public abstract String onPrevious();
}

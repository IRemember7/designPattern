package com.ccyy.designPattern.behavioral.state.states;

import com.ccyy.designPattern.behavioral.state.ui.Player;

/**
 * @author: lianghanmao
 * @create: 2022-03-25
 * @description: 关闭状态
 **/
public class LockedState extends State{
    public LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}

package com.ccyy.designPattern.behavioral.state.states;

import com.ccyy.designPattern.behavioral.state.ui.Player;

/**
 * @author: lianghanmao
 * @create: 2022-03-25
 * @description: 播放状态
 **/
public class PlayingState extends State{
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
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

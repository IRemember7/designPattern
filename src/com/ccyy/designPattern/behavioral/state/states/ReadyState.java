package com.ccyy.designPattern.behavioral.state.states;

import com.ccyy.designPattern.behavioral.state.ui.Player;

/**
 * @author: lianghanmao
 * @create: 2022-03-25
 * @description: 准备状态
 **/
public class ReadyState extends State{
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Paused...";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}

package com.ccyy.designPattern.behavioral.memento.commands;

/**
 * @author: lianghanmao
 * @create: 2022-03-31
 * @description: 基础命令类
 **/
public interface Command {
    /**
     * 获取名字
     * @return
     */
    String getName();

    /**
     * 执行命令
     */
    void execute();
}

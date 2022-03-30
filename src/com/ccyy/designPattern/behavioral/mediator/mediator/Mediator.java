package com.ccyy.designPattern.behavioral.mediator.mediator;

import com.ccyy.designPattern.behavioral.mediator.components.Component;

import javax.swing.*;

/**
 * @author: lianghanmao
 * @create: 2022-03-30
 * @description: 通用中介者
 **/
public interface Mediator {
    /**
     * 添加笔记
     * @param note
     */
    void addNewNote(Note note);

    /**
     * 删除笔记
     */
    void deleteNote();

    /**
     * 获取信息
     * @param note
     */
    void getInfoFromList(Note note);

    /**
     * 保存改变
     */
    void saveChanges();

    /**
     * 标记
     */
    void markNote();

    /**
     * 清楚
     */
    void clear();

    /**
     * 发送
     * @param listModel
     */
    void sendToFilter(ListModel listModel);

    /**
     * 设置
     * @param list
     */
    void setElementsList(ListModel list);

    /**
     * 注册
     * @param component
     */
    void registerComponent(Component component);

    /**
     * 隐藏
     * @param flag
     */
    void hideElements(boolean flag);

    /**
     * 创建
     */
    void createGUI();
}

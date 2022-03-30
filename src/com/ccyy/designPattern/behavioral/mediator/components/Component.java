package com.ccyy.designPattern.behavioral.mediator.components;

import com.ccyy.designPattern.behavioral.mediator.mediator.Mediator;

/**
 * @author: lianghanmao
 * @create: 2022-03-30
 * @description: 组合
 **/
public interface Component {

    /**
     * 设置中介者
     * @param mediator
     */
    void setMediator(Mediator mediator);

    /**
     * 获取名字
     * @return
     */
    String getName();
}

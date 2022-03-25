package com.ccyy.designPattern.behavioral.iterator.iterators;

import com.ccyy.designPattern.behavioral.iterator.profile.Profile;

/**
 * @author: lianghanmao
 * @create: 2022-03-25
 * @description: 定义档案接口
 **/
public interface ProfileIterator {

    /**
     * 是否存在下一个
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个
     * @return
     */
    Profile getNext();

    /**
     * 重置
     */
    void reset();


}

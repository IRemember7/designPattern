package com.ccyy.designPattern.behavioral.iterator.networks;

import com.ccyy.designPattern.behavioral.iterator.iterators.ProfileIterator;

/**
 * @author: lianghanmao
 * @create: 2022-03-25
 * @description: 定义通用的社交网络接口
 **/
public interface SocialNetwork {

    /**
     * 遍历朋友
     * @param profileEmail
     * @return
     */
    ProfileIterator createFriendsIterator(String profileEmail);

    /**
     * 遍历同事
     * @param profileEmail
     * @return
     */
    ProfileIterator createCoworkersIterator(String profileEmail);
}

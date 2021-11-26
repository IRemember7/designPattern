package com.ccyy.designPattern.structural.proxy.library;

import java.util.HashMap;

/**
 * @author: lianghanmao
 * @create: 2021-11-26
 * @description: 远程服务接口
 **/
public interface ThirdPartyYouTuBeLib {

    HashMap<String,Video> popularVideos();

    Video getVideo(String videoId);
}

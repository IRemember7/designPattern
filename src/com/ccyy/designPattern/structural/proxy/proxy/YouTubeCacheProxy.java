package com.ccyy.designPattern.structural.proxy.proxy;

import com.ccyy.designPattern.structural.proxy.library.ThirdPartyYouTuBeClass;
import com.ccyy.designPattern.structural.proxy.library.ThirdPartyYouTuBeLib;
import com.ccyy.designPattern.structural.proxy.library.Video;

import java.util.HashMap;

/**
 * @author: lianghanmao
 * @create: 2021-11-26
 * @description: 缓存代理
 **/
public class YouTubeCacheProxy implements ThirdPartyYouTuBeLib {

    private ThirdPartyYouTuBeLib youtubeService;

    private HashMap<String,Video> cachePopular = new HashMap<>();

    private HashMap<String,Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTuBeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()){
            cachePopular = youtubeService.popularVideos();
        }else{
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null){
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId,video);
        }else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void  reset(){
        cacheAll.clear();
        cachePopular.clear();
    }
}

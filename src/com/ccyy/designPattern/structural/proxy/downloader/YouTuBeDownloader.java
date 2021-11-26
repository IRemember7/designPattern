package com.ccyy.designPattern.structural.proxy.downloader;

import com.ccyy.designPattern.structural.proxy.library.ThirdPartyYouTuBeLib;
import com.ccyy.designPattern.structural.proxy.library.Video;

import java.util.HashMap;

/**
 * @author: lianghanmao
 * @create: 2021-11-26
 * @description: 媒体下载应用
 **/
public class YouTuBeDownloader {
    private ThirdPartyYouTuBeLib api;

    public YouTuBeDownloader(ThirdPartyYouTuBeLib api) {
        this.api = api;
    }

    public void  renderVideoPage(String videoId){
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
        }
        System.out.println("-------------------------------\n");
    }
}

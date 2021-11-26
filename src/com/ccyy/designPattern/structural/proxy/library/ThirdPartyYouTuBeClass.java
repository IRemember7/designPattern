package com.ccyy.designPattern.structural.proxy.library;

import java.util.HashMap;

/**
 * @author: lianghanmao
 * @create: 2021-11-26
 * @description: 远程服务实现
 **/
public class ThirdPartyYouTuBeClass implements ThirdPartyYouTuBeLib{
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars ...");
        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
        System.out.println("Done!");
        return hmap;
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server +"...." );
        experienceNetworkLatency();
        System.out.println("Connected");
    }

    private int random(int min,int max){
        return min + (int)(Math.random() * ((max-min)+1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5,10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/"+videoId);
        return getSomeVideo(videoId);
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video ...");
        experienceNetworkLatency();
        Video video = new Video(videoId,"some video title");
        System.out.println("Done!");
        return video;
    }
}

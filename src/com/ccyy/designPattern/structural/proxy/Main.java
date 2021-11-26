package com.ccyy.designPattern.structural.proxy;

import com.ccyy.designPattern.structural.proxy.downloader.YouTuBeDownloader;
import com.ccyy.designPattern.structural.proxy.library.ThirdPartyYouTuBeClass;
import com.ccyy.designPattern.structural.proxy.proxy.YouTubeCacheProxy;

/**
 * @author: lianghanmao
 * @create: 2021-11-26
 * @description: 测试代码
 **/
public class Main {
    public static void main(String[] args) {
        YouTuBeDownloader naiveDownloader = new YouTuBeDownloader(new ThirdPartyYouTuBeClass());
        YouTuBeDownloader smartDownloader = new YouTuBeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTuBeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}

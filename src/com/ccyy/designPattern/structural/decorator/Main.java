package com.ccyy.designPattern.structural.decorator;

import com.ccyy.designPattern.structural.decorator.facade.VideoConversionFacade;

import java.io.File;

/**
 * @author: lianghanmao
 * @create: 2022-03-07
 * @description: 测试main方法
 **/
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}

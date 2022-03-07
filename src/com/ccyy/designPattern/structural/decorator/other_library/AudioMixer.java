package com.ccyy.designPattern.structural.decorator.other_library;

import java.io.File;

/**
 * @author: lianghanmao
 * @create: 2022-03-07
 * @description:
 **/
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}

package com.ccyy.designPattern.structural.decorator.other_library;

/**
 * @author: lianghanmao
 * @create: 2022-03-07
 * @description:
 **/
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}

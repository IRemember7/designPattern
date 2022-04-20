package com.ccyy.designPattern.structural.facade.other_library;

/**
 * @author: lianghanmao
 * @create: 2022-03-07
 * @description: 视频文件
 **/
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}

package com.ccyy.designPattern.behavioral.observer.editor;

import com.ccyy.designPattern.behavioral.observer.publisher.EventManager;

/**
 * @author: lianghanmao
 * @create: 2022-03-28
 * @description: 具体发布者，由其他对象追踪
 **/
public class Editor {
    private EventManager events;
    private String filePath;

    public Editor(){
        this.events = new EventManager("open", "save");
    }
    public void openFile(String file) {
        this.filePath = file;
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.filePath != null) {
            events.notify("save", filePath);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

    public EventManager getEvents() {
        return events;
    }

    public void setEvents(EventManager events) {
        this.events = events;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

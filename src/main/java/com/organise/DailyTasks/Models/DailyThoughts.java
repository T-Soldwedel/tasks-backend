package com.organise.DailyTasks.Models;

public class DailyThoughts {

    private String title;
    private String content;

    public DailyThoughts(){

    }

    public DailyThoughts(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DailyThoughts{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

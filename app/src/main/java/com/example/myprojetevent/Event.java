package com.example.myprojetevent;

public class Event {
    private String title;
    private String description;
    private String coverImage;

    public Event(){}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Event(String title, String description, String coverImage) {
        this.title = title;
        this.description = description;
        this.coverImage = coverImage;
    }
}

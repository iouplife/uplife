package com.giog.uplife;

public class ListItem {
    private String title, description, date;
    private int imageId;

    public ListItem(int imageId, String title, String description, String date) {
        this.imageId = imageId;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getImageId() { return imageId;}
}

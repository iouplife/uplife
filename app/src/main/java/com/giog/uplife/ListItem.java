package com.giog.uplife;

public class ListItem {
    private String title, description, date;
    private int imageId;
    private boolean parceiro;

    public ListItem(int imageId, String title, String description, String date, boolean parceiro) {
        this.imageId = imageId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.parceiro = parceiro;
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

    public boolean isParceiro(){return parceiro;}
}

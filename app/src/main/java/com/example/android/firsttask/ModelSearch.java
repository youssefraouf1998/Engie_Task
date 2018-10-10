package com.example.android.firsttask;

public class ModelSearch {
    String title,desc;
    int img;

    public ModelSearch(String title, String desc, int img) {
        this.title = title;
        this.desc = desc;
        this.img = img;
    }
    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }
}

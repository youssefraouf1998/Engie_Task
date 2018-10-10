package com.example.android.firsttask;

public class ModelpagerViewe {
    String title,desc;
    int img;

    public ModelpagerViewe(String title, String desc, int img) {
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

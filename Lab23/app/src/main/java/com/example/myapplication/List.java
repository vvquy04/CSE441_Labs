package com.example.myapplication;

import android.graphics.Bitmap;

public class List {
    private Bitmap img;
    private String title, info, link;

    public List(Bitmap img, String info, String link, String title) {
        this.img = img;
        this.info = info;
        this.link = link;
        this.title = title;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

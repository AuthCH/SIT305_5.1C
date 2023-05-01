package com.example.newsapp;

public class MyDataModel {

    String news, desc;
    int image;

    public MyDataModel(String news, String desc, int image) {
        this.news = news;
        this.desc = desc;
    }

    public String getNews() {
        return news;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}

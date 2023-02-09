package com.example.reterofitsample.model;

public class ItemsDetails {
    private String imgUrl;
    private String creator;
    private int likes;

    public ItemsDetails(String imgUrl, String creator, int likes) {
        this.imgUrl = imgUrl;
        this.creator = creator;
        this.likes = likes;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}

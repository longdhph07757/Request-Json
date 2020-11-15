package com.example.lab3_longdhph07757;

public class User {
    public int albumId;
    public String title;
    public int id;
    public String url;

    public User(int albumId, String title, int id, String url) {
        this.albumId = albumId;
        this.title = title;
        this.id = id;
        this.url = url;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

package com.example.acer.cleanactivity.Post.Model;

/**
 * Created by Acer on 17/05/2018.
 */

public class Post {
    private Integer id;
    private String Title;

    public Post(Integer id, String title, String body) {
        this.id = id;
        Title = title;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private String body;
}

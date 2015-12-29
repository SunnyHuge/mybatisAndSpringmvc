package com.zenin.mybatis.entity;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Article")
public class Article implements Serializable {
    private static final long serialVersionUID = 6438839226374686302L;

    private int id;
    private User user;
    private String title;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", user=" + user + ", title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}

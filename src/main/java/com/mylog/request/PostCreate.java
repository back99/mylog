package com.mylog.request;

import lombok.ToString;

@ToString
public class PostCreate {

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String title;
    public String content;
}

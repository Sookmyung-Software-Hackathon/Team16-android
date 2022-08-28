package com.example.team16;

import android.graphics.drawable.Drawable;

public class ChatListData {

    private String profile;
    private String name;
    private String content;

    public ChatListData(String profile, String name, String content){

        this.profile = profile;
        this.name = name;
        this.content = content;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) { this.content = content; }

    public String getProfile() {return profile; }

    public String getName() {
        return name;
    }

    public String getContent() { return  content; }
}
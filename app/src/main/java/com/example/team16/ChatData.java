package com.example.team16;

import java.io.Serializable;

/**
 * Created by KPlo on 2018. 11. 3..
 */

public class ChatData implements Serializable {
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private String msg;
    private String nickname;

}
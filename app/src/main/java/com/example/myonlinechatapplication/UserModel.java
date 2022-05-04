package com.example.myonlinechatapplication;

public class UserModel {
    private long messageTime;
    private String messageUser;
    private String messageText;

    public UserModel(long messageTime, String messageUser, String messageText) {
        this.messageTime = messageTime;
        this.messageUser = messageUser;
        this.messageText = messageText;
    }

    public UserModel() {
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}

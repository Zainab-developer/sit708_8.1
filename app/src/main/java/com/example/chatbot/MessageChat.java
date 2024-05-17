package com.example.chatbot;

public class MessageChat {
    private final String message;
    private final boolean isUser;
    public MessageChat(String message, boolean isUser) {
        this.message = message;
        this.isUser = isUser;
    }

    public String getMessage() {
        return message;
    }

    public boolean isUser() {
        return isUser;
    }
}


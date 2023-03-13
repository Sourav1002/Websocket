package com.WebSocket;


public class Message {

    private String message,to;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTo() {
        return to;
    }
}

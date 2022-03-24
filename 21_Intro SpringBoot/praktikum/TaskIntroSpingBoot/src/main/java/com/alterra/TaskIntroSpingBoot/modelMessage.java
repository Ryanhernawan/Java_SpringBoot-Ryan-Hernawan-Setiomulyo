package com.alterra.TaskIntroSpingBoot;

public class modelMessage {
    private Boolean succes;
    private String message;
    private String data;

    public void setSucces(Boolean succes) {
        this.succes = succes;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getSucces() {
        return succes;
    }

    public String getMessage() {
        return message;
    }

    public String getData() {
        return data;
    }
}

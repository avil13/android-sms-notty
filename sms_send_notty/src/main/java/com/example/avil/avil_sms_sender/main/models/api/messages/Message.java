package com.example.avil.avil_sms_sender.main.models.api.messages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("time")
    @Expose
    private String time;

    @SerializedName("phone")
    @Expose
    private String phone;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("done")
    @Expose
    private Boolean done;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

}
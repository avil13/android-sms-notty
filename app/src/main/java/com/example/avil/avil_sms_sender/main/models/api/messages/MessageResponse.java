package com.example.avil.avil_sms_sender.main.models.api.messages;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessageResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private ArrayList<Message> message = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ArrayList<Message> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<Message> message) {
        this.message = message;
    }

}
package com.example.avil.avil_sms_sender.main.models.api.messages;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/sms.json")
    Call<MessageResponse> getSms();
}

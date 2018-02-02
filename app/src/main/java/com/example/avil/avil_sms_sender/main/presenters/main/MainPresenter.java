package com.example.avil.avil_sms_sender.main.presenters.main;

import android.content.Context;

import com.example.avil.avil_sms_sender.main.models.api.messages.ApiService;
import com.example.avil.avil_sms_sender.main.models.api.messages.Message;
import com.example.avil.avil_sms_sender.main.models.api.messages.MessageClient;
import com.example.avil.avil_sms_sender.main.models.api.messages.MessageResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    private static MainPresenter instance = new MainPresenter();
    private static Context context;

    private ArrayList<Message> listMessages;

    private MainPresenter() {
        listMessages = new ArrayList<Message>(2);

        Message msg = new Message();
        msg.setPhone("+7 999 999  9999");
        msg.setTime("2077-02-02 22:22:11");
        msg.setMessage("Hello world");

        listMessages.add(msg);
//        getData();
    }

    public static MainPresenter getInstance(Context context) {
        MainPresenter.context = context;
        return instance;
    }

    private void getData() {
        ApiService api = MessageClient.getApiService();
        Call<MessageResponse> call = api.getSms();

        call.enqueue(new Callback<MessageResponse>() {
            @Override
            public void onResponse(Call<MessageResponse> call, Response<MessageResponse> response) {
                if (response.isSuccessful()) {
                    listMessages = response.body().getMessage();
                }
            }

            @Override
            public void onFailure(Call<MessageResponse> call, Throwable t) {
                listMessages.clear();
            }
        });
    }

    public ArrayList<Message> getListMessages() {
        return listMessages;
    }



}


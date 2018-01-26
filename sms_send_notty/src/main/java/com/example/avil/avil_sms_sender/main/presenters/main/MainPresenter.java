package com.example.avil.avil_sms_sender.main.presenters.main;

import android.content.Context;

public class MainPresenter {
    private static MainPresenter instance = new MainPresenter();
    private static Context context;

    private MainPresenter() {}

    public static MainPresenter getInstance(Context context) {
        MainPresenter.context = context;
        return instance;
    }
}


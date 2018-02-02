package com.example.avil.avil_sms_sender.main.ui.mian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.avil.avil_sms_sender.main.models.api.messages.Message;
import com.example.avil.avil_sms_sender.main.presenters.main.MainPresenter;
import com.example.avil.avil_sms_sender.sms_send_notty.R;

public class MainActivity extends AppCompatActivity {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = MainPresenter.getInstance(this);

//        создаем список
        ListView listView = (ListView) findViewById(R.id.list_items);
        ArrayAdapter<Message> adapter = new ArrayAdapter<>(this, R.layout.list_message_view, presenter.getListMessages());
        listView.setAdapter(adapter);
    }


}

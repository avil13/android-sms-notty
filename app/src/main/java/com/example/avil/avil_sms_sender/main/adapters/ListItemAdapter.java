package com.example.avil.avil_sms_sender.main.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.avil.avil_sms_sender.main.models.api.messages.Message;
import com.example.avil.avil_sms_sender.sms_send_notty.R;

import java.util.ArrayList;

public class ListItemAdapter extends BaseAdapter {

    Context context;
    ArrayList<Message> listItems;

    public ListItemAdapter(Context context, ArrayList<Message> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.list_message_view, null);
        }
        TextView phone = convertView.findViewById(R.id.message_item_phone);
        TextView time = convertView.findViewById(R.id.message_item_time);
        TextView message = convertView.findViewById(R.id.message_item_message);

        phone.setText(listItems.get(position).getPhone());
        time.setText(listItems.get(position).getTime());
        message.setText(listItems.get(position).getMessage());

        return convertView;
    }
}

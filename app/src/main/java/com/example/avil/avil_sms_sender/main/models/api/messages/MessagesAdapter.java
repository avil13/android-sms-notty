package com.example.avil.avil_sms_sender.main.models.api.messages;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.avil.avil_sms_sender.sms_send_notty.R;

import java.util.List;

public class MessagesAdapter extends ArrayAdapter<Message> {
    Context context;
    List<Message> messageList;
    private LayoutInflater layoutInflater;

    MessagesAdapter(Context context, List<Message> objects) {
        super(context, 0, objects);
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.messageList = objects;
    }


    @Nullable
    @Override
    public Message getItem(int position) {
        return super.getItem(position);
    }

    private static class ViewHolder {
        public final TextView phone;
        public final TextView time;
        public final TextView message;

        private ViewHolder(TextView phone, TextView time, TextView message){
            this.phone = phone;
            this.time = time;
            this.message = message;
        }

        public  static ViewHolder create(ConstraintLayout rootView) {
            return  new ViewHolder(
                    (TextView) rootView.findViewById(R.id.message_item_phone),
                    (TextView) rootView.findViewById(R.id.message_item_time),
                    (TextView) rootView.findViewById(R.id.message_item_message)
            );
        }
    }
}

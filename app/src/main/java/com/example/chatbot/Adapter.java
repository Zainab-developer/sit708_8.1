package com.example.chatbot;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class Adapter extends ArrayAdapter<MessageChat>{
    public Adapter(Context context, List<MessageChat> messages) {
        super(context, 0, messages);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        MessageChat  message = getItem(position);


        if (convertView == null || convertView.getTag() == null || !convertView.getTag().equals(message.isUser())) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    message.isUser() ? R.layout.user_activity : R.layout.bot_activity, parent, false);
            convertView.setTag(message.isUser());
        }

        TextView messageTextView = convertView.findViewById(R.id.msgTextView);
        messageTextView.setText(message.getMessage());

        return convertView;
    }
}



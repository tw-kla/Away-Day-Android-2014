package com.tw.awayapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tw.awayapp.R;
import com.tw.awayapp.models.Session;

import java.util.ArrayList;

public class SessionAdapter extends ArrayAdapter<Session> {




    public SessionAdapter(Context context, ArrayList<Session> sessionsA) {
        super(context, 0 ,sessionsA);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Session session = getItem(position);

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.adapter_fragment_session_item, null);
        }

        TextView sessionTitle = (TextView)convertView.findViewById(R.id.sessionTitle);
        TextView sessionDesc = (TextView)convertView.findViewById(R.id.sessionDesc);
        TextView sessionSpeaker = (TextView)convertView.findViewById(R.id.sessionSpeaker);
        TextView sessionRoom = (TextView)convertView.findViewById(R.id.sessionRoom);

        sessionTitle.setText(session.getTitle());
        sessionDesc.setText(session.getDescription());
        sessionSpeaker.setText(session.getSpeaker());
        sessionRoom.setText(session.getRoom());

        return convertView;
    }
}

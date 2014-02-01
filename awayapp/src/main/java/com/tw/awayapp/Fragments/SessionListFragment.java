package com.tw.awayapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.tw.awayapp.Adapters.SessionAdapter;
import com.tw.awayapp.MainActivity;
import com.tw.awayapp.R;
import com.tw.awayapp.models.Session;

import java.util.ArrayList;

public class SessionListFragment extends Fragment {

    ListView sessionListView;
    ArrayList<Session> sessionsA = new ArrayList<Session>();
    Session a = new Session();
    SessionAdapter sessionAdapter;
    public SessionListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_session_list, container, false);
        sessionListView = (ListView) rootView.findViewById(R.id.sessionListView);

        a.setTitle("The Beginning Proverb");
        a.setDescription("thaksjhfjakshdkjas daskjdbakjhdjkad akdsjahdskjahd akdjhas");
        a.setSpeaker("Remo Samuel Paul");
        a.setStarttime("9:00AM");
        a.setRoom("Confrence 232");
        sessionsA.add(a);
        sessionsA.add(a);
        sessionsA.add(a);
        sessionsA.add(a);

        sessionAdapter = new SessionAdapter(this.getActivity().getBaseContext(),sessionsA);
        sessionListView.setAdapter(sessionAdapter);





        return rootView;
    }

}

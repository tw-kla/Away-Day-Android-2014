package com.tw.awayapp.helpers;

import com.tw.awayapp.models.Session;

import java.util.ArrayList;
import java.util.List;

import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;

public class AwayDayService {

    private static final String API_URL = "http://pa-kla-away-day.herokuapp.com/";
    interface AwayDay {
        @GET("/sessions.json")
        List<Session> listSessions();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .build();

        // Create an instance of our GitHub API interface.
        AwayDay awayday = restAdapter.create(AwayDay.class);

        List<Session> sessions = awayday.listSessions();


    }
}

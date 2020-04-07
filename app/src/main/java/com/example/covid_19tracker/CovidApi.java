package com.example.covid_19tracker;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidApi {
    @GET("summary")
    Call<Covid> getCovid();
}

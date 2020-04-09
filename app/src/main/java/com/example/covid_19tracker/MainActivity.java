package com.example.covid_19tracker;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView nConfirmed,tConfirmed,nDeath,tDeath,nRecover,tRecover,global;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignId();

        retroRequest();
     }
    void assignId() {
        nConfirmed = findViewById(R.id.new_confirmed);
        tConfirmed = findViewById(R.id.total_confirmed);
        nDeath = findViewById(R.id.new_deaths);
        tDeath = findViewById(R.id.total_deaths);
        nRecover = findViewById(R.id.new_recovered);
        tRecover = findViewById(R.id.total_recovered);
        global = findViewById(R.id.global);
    }
    void setText(Covid details ){
        nConfirmed.setText("New Confirmed :" + details.getGlobal().getNewConfirmed());
        tConfirmed.setText("Total Confirmed :" + details.getGlobal().getTotalConfirmed());
        nDeath.setText("New Deaths :" + details.getGlobal().getNewDeaths());
        tDeath.setText("Total Deaths :" + details.getGlobal().getTotalDeaths());
        nRecover.setText("New Recovered :" + details.getGlobal().getNewRecovered());
        tRecover.setText("Total Recovered :" + details.getGlobal().getTotalRecovered());}
    void retroRequest(){
        HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient=new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.covid19api.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        CovidApi covidApi = retrofit.create(CovidApi.class);
        Call<Covid> call = covidApi.getCovid();
        call.enqueue(new Callback<Covid>() {
            @Override
            public void onResponse(Call<Covid> call, Response<Covid> response) {
                if (!response.isSuccessful()) {
                    global.setText("code:" + response.code());
                    return;
                }
                Covid details = response.body();
                setText(details);
            }

            @Override
            public void onFailure(Call<Covid> call, Throwable t) {
                global.setText(t.getMessage());
            }
        });
    }
}


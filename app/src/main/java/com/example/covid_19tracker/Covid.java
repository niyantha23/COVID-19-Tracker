
package com.example.covid_19tracker;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Covid {

    @SerializedName("Countries")
    private List<Country> mCountries;
    @SerializedName("Date")
    private String mDate;
    @SerializedName("Global")
    private Global mGlobal;

    public List<Country> getCountries() {
        return mCountries;
    }

    public void setCountries(List<Country> countries) {
        mCountries = countries;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public Global getGlobal() {
        return mGlobal;
    }

    public void setGlobal(Global global) {
        mGlobal = global;
    }

}

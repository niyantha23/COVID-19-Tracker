
package com.example.covid_19tracker;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Country {

    @SerializedName("Country")
    private String mCountry;
    @SerializedName("CountryCode")
    private String mCountryCode;
    @SerializedName("Date")
    private String mDate;
    @SerializedName("NewConfirmed")
    private Long mNewConfirmed;
    @SerializedName("NewDeaths")
    private Long mNewDeaths;
    @SerializedName("NewRecovered")
    private Long mNewRecovered;
    @SerializedName("Slug")
    private String mSlug;
    @SerializedName("TotalConfirmed")
    private Long mTotalConfirmed;
    @SerializedName("TotalDeaths")
    private Long mTotalDeaths;
    @SerializedName("TotalRecovered")
    private Long mTotalRecovered;

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCountryCode() {
        return mCountryCode;
    }

    public void setCountryCode(String countryCode) {
        mCountryCode = countryCode;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public Long getNewConfirmed() {
        return mNewConfirmed;
    }

    public void setNewConfirmed(Long newConfirmed) {
        mNewConfirmed = newConfirmed;
    }

    public Long getNewDeaths() {
        return mNewDeaths;
    }

    public void setNewDeaths(Long newDeaths) {
        mNewDeaths = newDeaths;
    }

    public Long getNewRecovered() {
        return mNewRecovered;
    }

    public void setNewRecovered(Long newRecovered) {
        mNewRecovered = newRecovered;
    }

    public String getSlug() {
        return mSlug;
    }

    public void setSlug(String slug) {
        mSlug = slug;
    }

    public Long getTotalConfirmed() {
        return mTotalConfirmed;
    }

    public void setTotalConfirmed(Long totalConfirmed) {
        mTotalConfirmed = totalConfirmed;
    }

    public Long getTotalDeaths() {
        return mTotalDeaths;
    }

    public void setTotalDeaths(Long totalDeaths) {
        mTotalDeaths = totalDeaths;
    }

    public Long getTotalRecovered() {
        return mTotalRecovered;
    }

    public void setTotalRecovered(Long totalRecovered) {
        mTotalRecovered = totalRecovered;
    }

}

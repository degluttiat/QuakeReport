package com.example.android.quakereport;

/**
 * Created by User on 09.05.2018.
 */

public class Earthquake {

    private String Mmagnitude;
    private String mLocation;
    private String mData;


    public Earthquake(String magnitude, String location, String data) {
        Mmagnitude = magnitude;
        mLocation = location;
        mData = data;
    }

    public String getMmagnitude() {
        return Mmagnitude;
    }

    public void setMmagnitude(String mmagnitude) {
        Mmagnitude = mmagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmData() {
        return mData;
    }

    public void setmData(String mData) {
        this.mData = mData;
    }
}

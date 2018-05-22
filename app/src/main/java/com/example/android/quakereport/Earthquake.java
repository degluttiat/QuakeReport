package com.example.android.quakereport;

/**
 * Created by User on 09.05.2018.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(double magnitude, String location, long data, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = data;
        mUrl = url;
    }

    public String getUrl() {
        return mUrl;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

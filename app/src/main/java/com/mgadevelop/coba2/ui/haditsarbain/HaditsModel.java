package com.mgadevelop.coba2.ui.haditsarbain;

import android.os.Parcelable;
import android.os.Parcel;

import androidx.lifecycle.ViewModel;

public class HaditsModel extends ViewModel implements Parcelable {

    private String title;

    private String overview;

    private Integer poster;


    public HaditsModel(String title, String overview, Integer poster) {
        this.title = title;
        this.overview = overview;
        this.poster = poster;
    }



    public HaditsModel() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getPoster() {
        return poster;
    }

    public void setPoster(Integer poster) {
        this.poster = poster;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.overview);
        dest.writeValue(this.poster);
    }

    protected HaditsModel(Parcel in) {
        this.title = in.readString();
        this.overview = in.readString();
        this.poster = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<HaditsModel> CREATOR = new Creator<HaditsModel>() {
        @Override
        public HaditsModel createFromParcel(Parcel source) {
            return new HaditsModel(source);
        }

        @Override
        public HaditsModel[] newArray(int size) {
            return new HaditsModel[size];
        }
    };
}

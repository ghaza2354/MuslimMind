package com.mgadevelop.coba2.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by husni on 02/02/18.
 */
public class Jadwal {
    @SerializedName("date_for")
    public String tanggal;
    @SerializedName("fajr")
    public String fajar;
    @SerializedName("shurooq")
    public String syuruq;
    @SerializedName("dhuhr")
    public String zuhur;
    @SerializedName("asr")
    public String ashar;
    @SerializedName("maghrib")
    public String maghrib;
    @SerializedName("isha")
    public String isya;

    public String getTanggal() {
        return tanggal;
    }

    public String getSubuh() {
        return fajar;
    }

    public String getZuhur() {
        return zuhur;
    }

    public String getAshar() {
        return ashar;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public String getIsya() {
        return isya;
    }
}

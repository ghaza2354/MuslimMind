package com.mgadevelop.coba2.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by husni on 02/02/18.
 */

public class Items {
    @SerializedName("items")
    public List<Jadwal> items;

    public Items(List<Jadwal> items) {
        this.items = items;
    }

    public List<Jadwal> getItems() {
        return items;
    }

    public void setItems(List<Jadwal> items) {
        this.items = items;
    }
}

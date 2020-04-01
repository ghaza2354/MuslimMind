package com.mgadevelop.coba2.network;

import com.mgadevelop.coba2.model.Items;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by husni on 02/02/18.
 */

public interface ApiInterface {

    @GET("{periode}/daily.json")
    Call<Items> getJadwalSholat(@Path("periode") String periode);
}

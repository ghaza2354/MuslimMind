package com.mgadevelop.coba2.ui.mainpage;

import androidx.lifecycle.ViewModelProviders;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mgadevelop.coba2.R;
import com.mgadevelop.coba2.model.Items;
import com.mgadevelop.coba2.model.Jadwal;
import com.mgadevelop.coba2.network.ApiClient;
import com.mgadevelop.coba2.network.ApiInterface;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPageFragment extends Fragment implements LocationListener {

    private MainPageViewModel mViewModel;

    public static MainPageFragment newInstance() {
        return new MainPageFragment();
    }

    private TextView jadwalSubuh,jadwalDzuhur,jadwalAshar,jadwalMaghrib,jadwalIsya,tanggalan;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_page_fragment, container, false);



//        tanggalan = view.findViewById(R.id.hijriah_date);
        jadwalSubuh = view.findViewById(R.id.jadwal_subuh);
        jadwalDzuhur = view.findViewById(R.id.jadwal_dzuhur);
        jadwalAshar = view.findViewById(R.id.jadwal_ashar);
        jadwalMaghrib = view.findViewById(R.id.jadwal_maghrib);
        jadwalIsya = view.findViewById(R.id.jadwal_isya);

        actionLoad();



        return view;
    }

//    public String currentLocation(double lat,double lon){
//       String currentCity = "";
//
//        Geocoder geocoder = new Geocoder(getActivity(), Locale.getDefault());
//        List<Address> addressList;
//        try {
//            if (addressList.size() > 0){
//                currentCity = addressList.get(0).getLocality();
//            }
//        } catch (Exception e){
//           e.printStackTrace();
//       }
//        return currentCity;
//    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainPageViewModel.class);
        // TODO: Use the ViewModel
    }

    private void actionLoad() {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Items> call = apiInterface.getJadwalSholat("Jakarta");
        call.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(Call<Items> call, Response<Items> response) {
                Log.d("Data ", "" + response.body().getItems());
                List<Jadwal> jadwal = response.body().getItems();
                loadData(jadwal);
            }

            @Override
            public void onFailure(Call<Items> call, Throwable t) {
                Log.d("Data ", "" + t.getMessage());
            }
        });
    }



    private void loadData(List<Jadwal> jadwal) {
        for (Jadwal data : jadwal) {
//            tanggalan.setText(data.getTanggal());
            jadwalSubuh.setText(data.getSubuh());
            jadwalDzuhur.setText(data.getZuhur());
            jadwalAshar.setText(data.getAshar());
            jadwalMaghrib.setText(data.getMaghrib());
            jadwalIsya.setText(data.getIsya());
        }
    }

    @Override
    public void onLocationChanged(Location location) {
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}



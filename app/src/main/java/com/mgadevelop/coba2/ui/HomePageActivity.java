package com.mgadevelop.coba2.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mgadevelop.coba2.R;
import com.mgadevelop.coba2.ui.adzan.AdzanFragment;
import com.mgadevelop.coba2.ui.alquran.AlQuranFragment;
import com.mgadevelop.coba2.ui.haditsarbain.HaditsFragment;
import com.mgadevelop.coba2.ui.mainpage.MainPageFragment;
import com.mgadevelop.coba2.ui.searchmasjid.MasjidFragment;


public class HomePageActivity extends AppCompatActivity  implements BottomNavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "HomePageActivity";

    BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        //main page

        bottomNavigationView.setSelectedItemId(R.id.home_page);

    }
    MasjidFragment masjidFragment = new MasjidFragment();
    AdzanFragment adzanFragment = new AdzanFragment();
    MainPageFragment mainPageFragment = new MainPageFragment();
    AlQuranFragment alQuranFragment = new AlQuranFragment();
    HaditsFragment haditsFragment = new HaditsFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.masjid:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).replace(R.id.container, masjidFragment).commit();
                return true;

            case R.id.adzan:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).replace(R.id.container, adzanFragment).commit();
                return true;

            case R.id.home_page:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).replace(R.id.container, mainPageFragment).commit();
                return true;

            case R.id.alquran:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).replace(R.id.container, alQuranFragment).commit();
                return true;

            case R.id.hadits:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out).replace(R.id.container, haditsFragment).commit();
                return true;
        }

        return false;
    }
}

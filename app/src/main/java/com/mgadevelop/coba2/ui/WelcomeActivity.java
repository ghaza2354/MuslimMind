package com.mgadevelop.coba2.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.mgadevelop.coba2.R;
import com.mgadevelop.coba2.adapter.IntroViewPagerAdapter;
import com.mgadevelop.coba2.item.ScreenItem;
import com.mgadevelop.coba2.ui.mainpage.MainPageFragment;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter ;
    TabLayout tabIndicator;
    Button btnNext;
    int position = 0 ;
    Button btnGetStarted;
    Animation btnAnim ;
    TextView tvSkip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // make the activity on full screen

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        // when this activity is about to be launch we need to check if its openened before or not

        setContentView(R.layout.activity_welcome);

        if (restorePrefData()) {
            Intent mainActivity = new Intent(getApplicationContext(), HomePageActivity.class );
            startActivity(mainActivity);
            finish();
        }

        // hide the action bar

//        getSupportActionBar().hide();

        // ini views
        btnNext = findViewById(R.id.btn_next);
        btnGetStarted = findViewById(R.id.btn_get_started);
        tabIndicator = findViewById(R.id.tab_indicator);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);
        tvSkip = findViewById(R.id.tv_skip);

        // fill list screen

        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Jangan Lupa Sholat","Kami menyediakan pengingat dan jadwal adzan agar kamu tidak lupa sholat lagi, karena sholat itu penting lho! Inget sabda Rasulullah ﷺ dengan Sholat berarti kita bisa menghapus dosa dosa (kecil) kita!",R.drawable.img1));
        mList.add(new ScreenItem("Mari Menghafal Quran","Kami juga menyediakan AlQuran AlKarim full 30 juz untuk kamu supaya bisa jadi hafizh, karena Rasulullah ﷺ bersabda Barangsiapa yang belajar dan mengajari Al-Quran, maka Allah akan permudah jalannya menuju surga",R.drawable.img2));
        mList.add(new ScreenItem("Tips Ibadah","Kami juga memberikan tips ibadah seperti sholat, wudhu dan lain lainnua sesuai sunnah agar kamu tidak salah lagi, karena dengan ibadah sesuai dengan sunnah Rasulullah ﷺ maka itu akan mempermudah jalanmu menuju surganya Allah ﷻ",R.drawable.img3));
        mList.add(new ScreenItem("Amal Jariyah","Bagikan ini ke saudaramu yang sesama muslim agar kamu dan developer mendapat pahala jariyah seperti sabda Rasulullah ﷺ Semua amalan akan terputus ketika kita meninggal kecuali 3 hal, Sedekah jariyah, Ilmu yang bermanfaat dan Doa anak sholeh/ah kepada orang tuanya",R.drawable.img5));
        mList.add(new ScreenItem("Semangat!","Insya Allah ini akan jadi salah satu sebab yang membuatmu masuk ke dalam surga dan amalan jariyyah bagi developer dan kamu yang membagikan aplikasi ini kepada sesama saudara muslim lainnya",R.drawable.img4));

        // setup viewpager
        screenPager =findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);

        // setup tablayout with viewpager

        tabIndicator.setupWithViewPager(screenPager);

        // next button click Listner

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()) {

                    position++;
                    screenPager.setCurrentItem(position);


                }

                if (position == mList.size()-1) { // when we rech to the last screen

                    // TODO : show the GETSTARTED Button and hide the indicator and the next button

                    loaddLastScreen();


                }



            }
        });

        // tablayout add change listener


        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == mList.size()-1) {

                    loaddLastScreen();

                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        // Get Started button click listener

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //open main activity

                Intent mainActivity = new Intent(getApplicationContext(),HomePageActivity.class);
                startActivity(mainActivity);

                savePrefsData();

                finish();



            }
        });

        // skip button click listener

        tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPager.setCurrentItem(mList.size());
            }
        });



    }


    // show the GETSTARTED Button and hide the indicator and the next button
    private void loaddLastScreen() {

        btnNext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tvSkip.setVisibility(View.INVISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);
        // TODO : ADD an animation the getstarted button
        // setup animation
        btnGetStarted.setAnimation(btnAnim);

    }

    private boolean restorePrefData() {


        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        Boolean isIntroActivityOpnendBefore = pref.getBoolean("isIntroOpnend",false);
        return  isIntroActivityOpnendBefore;



    }

    private void savePrefsData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpnend",true);
        editor.commit();


    }
}

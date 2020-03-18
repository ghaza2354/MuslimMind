package com.mgadevelop.coba2.ui.calendar;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.mgadevelop.coba2.R;

import java.util.ArrayList;
import java.util.List;

public class CalendarFragment extends Fragment {

    private CalendarViewModel mViewModel;

    public static CalendarFragment newInstance() {
        return new CalendarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.calendar_fragment, container, false);

//        ImageSlider imageSlider = view.findViewById(R.id.image_slider);
//
//        List<SlideModel> slideModels = new ArrayList<>();
//        slideModels.add(new SlideModel("https://www.google.co.id/url?sa=i&url=https%3A%2F%2Frifkiarya.com%2Fmasa-orientasi-sekolah%2F&psig=AOvVaw0TFw7Ae1lIARog8M9R-t6G&ust=1584603337693000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMCqqc7Bo-gCFQAAAAAdAAAAABAD","Udah Pernah sholat disini belum? Bagus lho tempatnya!"));
//        slideModels.add(new SlideModel("https://www.google.co.id/url?sa=i&url=https%3A%2F%2Fcreativemarket.com%2Faqr.studio%2F3738287-Ramadhan-Mubarak-Vector-Illustration&psig=AOvVaw07kSkaiEUk2yzAQ67ycp51&ust=1584603493531000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMjCzZfCo-gCFQAAAAAdAAAAABAD", "Sebentar lagi ramadhan! udah siap belum?"));
//        imageSlider.setImageList(slideModels, true);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CalendarViewModel.class);
        // TODO: Use the ViewModel
    }

}

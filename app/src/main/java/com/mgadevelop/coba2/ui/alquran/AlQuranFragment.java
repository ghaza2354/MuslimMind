package com.mgadevelop.coba2.ui.alquran;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mgadevelop.coba2.R;

public class AlQuranFragment extends Fragment {

    private AlQuranViewModel mViewModel;

    public static AlQuranFragment newInstance() {
        return new AlQuranFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.al_quran_fragment, container, false);







        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AlQuranViewModel.class);
        // TODO: Use the ViewModel
    }

}

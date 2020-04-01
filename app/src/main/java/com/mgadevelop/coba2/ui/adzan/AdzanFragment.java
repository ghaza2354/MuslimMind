package com.mgadevelop.coba2.ui.adzan;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mgadevelop.coba2.R;

public class AdzanFragment extends Fragment {

    private AdzanViewModel mViewModel;

    public static AdzanFragment newInstance() {
        return new AdzanFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.adzan_fragment, container, false);








        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AdzanViewModel.class);
        // TODO: Use the ViewModel
    }

}

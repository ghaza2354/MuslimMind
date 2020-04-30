package com.mgadevelop.coba2.ui.haditsarbain;

import androidx.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mgadevelop.coba2.R;
import java.util.ArrayList;

public class HaditsFragment extends Fragment {

    private HaditsModel mViewModel;

    private RecyclerView recyclerView;
    private ListHaditsAdapter mAdapter;
    private ArrayList<HaditsModel> modelList = new ArrayList<>();
    public static final String SELECTED_HADITS = "selected_hadits";


    public static HaditsFragment newInstance() {
        return new HaditsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hadits_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HaditsModel.class);
        // TODO: Use the ViewModel
        findViews();
        setAdapter();
    }

    private void findViews() {
        recyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view);
    }

    private void setAdapter() {

        modelList.add(new HaditsModel(getResources().getString(R.string.penulishadits), getString(R.string.descpenulishadits), R.drawable.muslimman));

        modelList.add(new HaditsModel(getResources().getString(R.string.hadits1), getString(R.string.hadits11), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits2), getString(R.string.hadits22), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits3), getString(R.string.hadits33), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits4), getString(R.string.hadits44), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits5), getString(R.string.hadits55), R.drawable.logo_hadits));

        modelList.add(new HaditsModel(getResources().getString(R.string.hadits6), getString(R.string.hadits66), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits7), getString(R.string.hadits77), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits8), getString(R.string.hadits88), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits9), getString(R.string.hadits99), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits10), getString(R.string.hadits1010), R.drawable.logo_hadits));

        modelList.add(new HaditsModel(getResources().getString(R.string.hadits01), getString(R.string.hadits011), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits02), getString(R.string.hadits022), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits03), getString(R.string.hadits033), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits04), getString(R.string.hadits044), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits05), getString(R.string.hadits055), R.drawable.logo_hadits));

        modelList.add(new HaditsModel(getResources().getString(R.string.hadits06), getString(R.string.hadits066), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits07), getString(R.string.hadits077), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits08), getString(R.string.hadits088), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits09), getString(R.string.hadits099), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.hadits010), getString(R.string.hadits01010), R.drawable.logo_hadits));

        modelList.add(new HaditsModel(getResources().getString(R.string.hadits001), getString(R.string.hadits00111), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsa), getString(R.string.haditsaa), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsb), getString(R.string.haditsbb), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsc), getString(R.string.haditscc), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsd), getString(R.string.haditsdd), R.drawable.logo_hadits));

        modelList.add(new HaditsModel(getResources().getString(R.string.haditse), getString(R.string.haditsee), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsf), getString(R.string.haditsff), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsg), getString(R.string.haditsgg), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsh), getString(R.string.haditshh), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsi), getString(R.string.haditsii), R.drawable.logo_hadits));

        modelList.add(new HaditsModel(getResources().getString(R.string.haditsj), getString(R.string.haditsjj), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsk), getString(R.string.haditskk), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsl), getString(R.string.haditsll), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsm), getString(R.string.haditsmm), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsn), getString(R.string.haditsnn), R.drawable.logo_hadits));

        modelList.add(new HaditsModel(getResources().getString(R.string.haditso), getString(R.string.haditsoo), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsp), getString(R.string.haditspp), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsq), getString(R.string.haditsqq), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsr), getString(R.string.haditsrr), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditss), getString(R.string.haditsss), R.drawable.logo_hadits));

        modelList.add(new HaditsModel(getResources().getString(R.string.haditst), getString(R.string.haditstt), R.drawable.logo_hadits));
        modelList.add(new HaditsModel(getResources().getString(R.string.haditsu), getString(R.string.haditsuu), R.drawable.logo_hadits));


        mAdapter = new ListHaditsAdapter(getActivity(), modelList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        mAdapter.SetOnItemClickListener(new ListHaditsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, HaditsModel model) {
                Intent goToDetailMovie = new Intent(getActivity(), DetailHadits.class);
                goToDetailMovie.putExtra(HaditsFragment.SELECTED_HADITS,model);
                startActivity(goToDetailMovie);
            }
        });

    }

}

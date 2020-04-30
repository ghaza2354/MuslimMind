package com.mgadevelop.coba2.ui.haditsarbain;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.mgadevelop.coba2.R;

public class DetailHadits extends AppCompatActivity {
    private TextView tvTitle, tvOverview;
    private ImageView imgPoster;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hadits);
        tvTitle = findViewById(R.id.tv_title);
        tvOverview = findViewById(R.id.tv_ov);
        imgPoster = findViewById(R.id.img_poster);

        HaditsModel movieModel = getIntent().getParcelableExtra(HaditsFragment.SELECTED_HADITS);

        tvTitle.setText(movieModel.getTitle());
        tvOverview.setText(movieModel.getOverview());
        imgPoster.setImageResource(movieModel.getPoster());
        setTitle(movieModel.getTitle());

    }
}
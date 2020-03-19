package com.mgadevelop.coba2.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mgadevelop.coba2.R;
import com.mgadevelop.coba2.ui.HomePageActivity;
import com.mgadevelop.coba2.ui.WelcomeActivity;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (restorePrefData()) {
            Intent mainActivity = new Intent(getApplicationContext(), WelcomeActivity.class );
            startActivity(mainActivity);
            finish();
        }


        Button btnlogin = findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_login) {
//            new SweetAlertDialog(LoginActivity.this, SweetAlertDialog.SUCCESS_TYPE)
//                    .setTitleText("Sukses")
//                    .setContentText("Kamu berhasil login")
//                    .setConfirmText("Lanjut")
//                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
//                        @Override
//                        public void onClick(SweetAlertDialog sDialog {
                            Intent intentbahas = new Intent(LoginActivity.this, WelcomeActivity.class);
                            startActivity(intentbahas);
                                savePrefsData();
                        }
//                    })
//                    .show();
//        }
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

package com.l;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.l.logintest.R;

public class FifthActivity extends AppCompatActivity {
    Button toSix;
    SharedPreferences sharedPreferences = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        toSix = (Button)findViewById(R.id.toSix);
        sharedPreferences = getSharedPreferences("com.l", MODE_PRIVATE);
        toSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FifthActivity.this, SixActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                sharedPreferences.edit().putBoolean("wasInSix", true).commit();
            }
        });
    }

}

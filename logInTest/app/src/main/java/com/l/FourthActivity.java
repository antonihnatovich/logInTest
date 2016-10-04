package com.l;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.l.logintest.R;

public class FourthActivity extends AppCompatActivity {
    Button toFith;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        toFith = (Button)findViewById(R.id.toFifth);
        toFith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthActivity.this, FifthActivity.class));
            }
        });
    }
}

package com.l;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.l.logintest.R;

public class FifthActivity extends AppCompatActivity {
    Button toSix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        toSix = (Button)findViewById(R.id.toSixt);
        toSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FifthActivity.this, SixActivity.class));
            }
        });
    }
}

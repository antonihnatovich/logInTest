package com.l;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.l.logintest.R;

public class SixActivity extends AppCompatActivity {
    TextView view;
    SharedPreferences sharedPreferences = null;
    String textAgain = "Welcome again, mister. You're already been here.",
            textFirst = "Hello. It's seems to see you first time here, mister.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        view = (TextView)findViewById(R.id.sixView);
        sharedPreferences = getSharedPreferences("com.l", MODE_PRIVATE);
        if(sharedPreferences.getBoolean("wentFromOneDirectlyToSix", true))
            view.setText(textAgain);
        else
            view.setText(textFirst);

    }
}

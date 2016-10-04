package com.l.logintest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.l.FirstActivity;

public class MainActivity extends Activity {
Button buttonNullActivity;
    TextView view ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNullActivity = (Button) findViewById(R.id.buttonNullActivity);
        view = (TextView) findViewById(R.id.view);
        buttonNullActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.l;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.l.logintest.R;

public class MainActivity extends Activity {
Button buttonNullActivity;
    TextView view ;
    SharedPreferences sharedPreferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNullActivity = (Button) findViewById(R.id.buttonNullActivity);
        view = (TextView) findViewById(R.id.view);
        sharedPreferences = getSharedPreferences("com.l", MODE_PRIVATE);
        buttonNullActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(getNextIntent());
            }
        });
    }
    private Intent getNextIntent(){
        if(!sharedPreferences.getBoolean("wasInSix", false)){
            sharedPreferences.edit().putBoolean("wentFromOneDirectlyToSix", false).commit();
            return new Intent(MainActivity.this, FirstActivity.class);
        } else {
            sharedPreferences.edit().putBoolean("wentFromOneDirectlyToSix", true).commit();
            return new Intent(MainActivity.this, SixActivity.class);
        }
    }
}

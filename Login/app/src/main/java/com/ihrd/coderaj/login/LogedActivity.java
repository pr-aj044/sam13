package com.ihrd.coderaj.login;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LogedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loged);

        SharedPreferences pref=getSharedPreferences("myprefname",MODE_PRIVATE);
        String x=pref.getString("user",null);

        Toast.makeText(getApplicationContext(),"Welcome"+""+x+"!",Toast.LENGTH_SHORT).show();
    }
}

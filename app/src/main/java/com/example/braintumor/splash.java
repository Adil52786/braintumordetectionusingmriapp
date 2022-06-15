package com.example.braintumor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        getSupportActionBar().hide();
        Thread thread = new Thread(){
            public void run(){
                
                try {
                    sleep(2500);


                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(splash.this, MainActivity.class );
                    startActivity(intent);
                    finish();

                }
            }
        };thread.start();
    }
}
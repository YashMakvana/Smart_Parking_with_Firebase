package com.example.smartparkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    Thread th=new Thread(){

        @Override
        public void run(){

            try{
                sleep(2500);
            }catch (Exception e){
                e.printStackTrace();

            }finally {
                Intent mainactivity=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mainactivity);
            }
        }
    };
        th.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}

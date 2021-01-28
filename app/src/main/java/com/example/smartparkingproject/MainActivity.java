package com.example.smartparkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


import java.net.InetAddress;

public class MainActivity extends AppCompatActivity {
//DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ParulUniversity =findViewById(R.id.btn1);
        ImageButton moviepark =findViewById(R.id.btn2);
        ImageButton restpark =findViewById(R.id.btn3);
        ImageButton stadiumpark =findViewById(R.id.btn4);
        ImageButton officepark =findViewById(R.id.btn5);

        ParulUniversity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent ParulUniversityToSchoolParking=new Intent(getApplicationContext(),SchoolParking.class);
                startActivity(ParulUniversityToSchoolParking);
            }
        });

        moviepark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent ParulUniversityToOfficeParking=new Intent(getApplicationContext(),OfficeParking.class);
                startActivity(ParulUniversityToOfficeParking);
            }
        });

        restpark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent ParulUniversityToMovieParking=new Intent(getApplicationContext(),MovieParking.class);
                startActivity(ParulUniversityToMovieParking);
            }
        });



        stadiumpark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent ParulUniversityToRestaurantParking=new Intent(getApplicationContext(),Restaurant_Parking.class);
                startActivity(ParulUniversityToRestaurantParking);
            }
        });


        officepark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent ParulUniversityToStadiumParking=new Intent(getApplicationContext(),StadiumParking.class);
                startActivity(ParulUniversityToStadiumParking);
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu manu){
        getMenuInflater().inflate(R.menu.main,manu);
        return true;
    }


   //@Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.contact){
            Intent MainToContact=new Intent(MainActivity.this, option1_contact.class);
            startActivity(MainToContact);
            return true;

        }
        if(id==R.id.feedback){
            Intent MainToFeedback=new Intent(MainActivity.this, option2_feedback.class);
            startActivity(MainToFeedback);
            return true;
        }

        if(id==R.id.about){
            Intent MainToAbout=new Intent(MainActivity.this, option3_about.class);
            startActivity(MainToAbout);
            return true;
        }
        return true;
    }



}

package com.example.smartparkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.net.HttpCookie;

public class option1_contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1_contact);

        TextView pranav=findViewById(R.id.pranavmail);
        TextView yash=findViewById(R.id.yashmail);
        TextView ali=findViewById(R.id.alimail);
        TextView jigo=findViewById(R.id.jigomail);
        TextView guide=findViewById(R.id.guide);


        pranav.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri number = Uri.parse("tel:9409665464");
                Intent callIntent704 = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent704);
              }
        });

        yash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri number = Uri.parse("tel:9586477650");
                Intent callIntent707 = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent707);
            }
        });


        jigo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri number = Uri.parse("tel:8238300741");
                Intent callIntent731 = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent731);
            }
        });


        ali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri number = Uri.parse("tel:8320044116");
                Intent callIntent701 = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent701);
            }
        });


        guide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri number = Uri.parse("tel:9898019082");
                Intent callguide = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callguide);
            }
        });

    }
}

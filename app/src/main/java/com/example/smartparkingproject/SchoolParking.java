package com.example.smartparkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SchoolParking extends AppCompatActivity {
DatabaseReference reff, demoreff;
ImageView slot1;
TextView t1;
Button btnFetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_parking);
                t1= findViewById(R.id.tv1);
                slot1= findViewById(R.id.schoolslot1);
                Button btn=findViewById(R.id.btncheck);
        reff = FirebaseDatabase.getInstance().getReference();
        demoreff = reff.child("ParulSchool").child("slot1");
        Button fetchButton = findViewById(R.id.btncheck);
        fetchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoreff.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value = dataSnapshot.child("CAR_DETECTION").getValue().toString();
                        int val1;
                        val1=Integer.parseInt(value.replaceAll("[\\D]",""));
                        t1.setText(value);
                        if(val1==1){
                            slot1.setImageResource(R.drawable.occupied);
                        }
                        else{
                            slot1.setImageResource(R.drawable.available);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(SchoolParking.this, "Error fetching data", Toast.LENGTH_LONG).show();
                    }
                });

            }
        });
    }
}

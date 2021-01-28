package com.example.smartparkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class option2_feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2_feedback);

        TextView feed=findViewById(R.id.feed);



        feed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri web = Uri.parse("https://forms.gle/3cFsBRMjmUNoaaCy9");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, web);
                startActivity(webIntent);
            }
        });
    }
}

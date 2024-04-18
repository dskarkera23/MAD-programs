package com.example.resume;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewName, textViewEmail, textViewMobile, textViewGender, textViewQualification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize TextViews and ImageView
        textViewName = findViewById(R.id.textViewName);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewMobile = findViewById(R.id.textViewMobile);
        textViewGender = findViewById(R.id.textViewGender);
        textViewQualification = findViewById(R.id.textViewQualification);


        // Retrieve data from MainActivity
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String email = intent.getStringExtra("email");
            String mobile = intent.getStringExtra("mobile");
            String gender = intent.getStringExtra("gender");
            String qualification = intent.getStringExtra("qualification");

            // Set data to TextViews
            textViewName.setText("Name: " + name);
            textViewEmail.setText("Email Id: " + email);
            textViewMobile.setText("Mobile No: " + mobile);
            textViewGender.setText("Gender: " + gender);
            textViewQualification.setText("Qualification: " + qualification);

            // Set profile image

        }
    }
}

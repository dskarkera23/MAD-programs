package com.example.resume;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextEmail, editTextMobile, editTextQualification;
    RadioGroup radioGroupGender;
    RadioButton radioButtonMale, radioButtonFemale;
    Button buttonNext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        editTextName = findViewById(R.id.editTextMobile);
        editTextEmail = findViewById(R.id.editTextMobile);
        editTextMobile = findViewById(R.id.editTextMobile);
        editTextQualification = findViewById(R.id.editTextQualification);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        buttonNext = findViewById(R.id.buttonNext);


        // Set OnClickListener for the "Next" button
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user inputs
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String mobile = editTextMobile.getText().toString().trim();
                String qualification = editTextQualification.getText().toString().trim();
                String gender = radioButtonMale.isChecked() ? "Male" : "Female";

                // Pass data to MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("mobile", mobile);
                intent.putExtra("qualification", qualification);
                intent.putExtra("gender", gender);


                // Start MainActivity2
                startActivity(intent);
            }
        });



    }



}

package com.example.androidproject_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {
    TextView txtResFirstName, txtResLastName, txtResNationality, txtResGender, txtResBirthDate,
            txtResPhnNum, txtResEmergency, txtResEmail, txtResProg, txtResYear, txtResScholar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        txtResFirstName = findViewById(R.id.txtResFirstName);
        txtResLastName = findViewById(R.id.txtResLastName);
        txtResNationality = findViewById(R.id.txtResNationality);
        txtResGender = findViewById(R.id.txtResGender);
        txtResBirthDate = findViewById(R.id.txtResBirthDate);
        txtResPhnNum = findViewById(R.id.txtResPhnNum);
        txtResEmergency = findViewById(R.id.txtResEmergency);
        txtResEmail = findViewById(R.id.txtResEmail);
        txtResProg = findViewById(R.id.txtResProg);
        txtResYear = findViewById(R.id.txtResYear);
        txtResScholar = findViewById(R.id.txtResScholar);

        Intent intent = getIntent();

        txtResFirstName.setText(intent.getStringExtra("fname_key"));
        txtResLastName.setText(intent.getStringExtra("lname_key"));
        txtResNationality.setText(intent.getStringExtra("natio_key"));
        txtResBirthDate.setText(intent.getStringExtra("bday_key"));
        txtResPhnNum.setText(intent.getStringExtra("phone_key"));
        txtResEmergency.setText(intent.getStringExtra("emerg_key"));
        txtResEmail.setText(intent.getStringExtra("email_key"));
        txtResProg.setText(intent.getStringExtra("prog_key"));
    }
}
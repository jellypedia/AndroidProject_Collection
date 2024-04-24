package com.example.androidproject_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PassingIntentsExercise extends AppCompatActivity {
    EditText txtFirstName, txtLastName, txtNationality, txtBirthDate, txtPhnNum,
            txtEmergency, txtEmail, txtProg;
    RadioButton rdMale, rdFemale, rdOther;
    CheckBox chkScholar;
    Button btnClear, btnSubmit;
    Spinner dropYearLevel;
    ArrayList<EditText> textField = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtNationality = findViewById(R.id.txtNationality);
        txtBirthDate = findViewById(R.id.txtBirthDate);
        txtPhnNum = findViewById(R.id.txtPhnNum);
        txtEmergency = findViewById(R.id.txtEmergency);
        txtEmail = findViewById(R.id.txtEmail);
        txtProg = findViewById(R.id.txtProg);

        rdMale = findViewById(R.id.rdMale);
        rdFemale = findViewById(R.id.rdFemale);
        rdOther = findViewById(R.id.rdOther);

        chkScholar = findViewById(R.id.chkScholar);

        btnClear = findViewById(R.id.btnClear);
        btnSubmit = findViewById(R.id.btnSubmit);

        dropYearLevel = findViewById(R.id.spinner1);
        String[] items = new String[]{"1", "2", "3", "4", "5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropYearLevel.setAdapter(adapter);

        initializeList();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender, scholar;
                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);

                if(rdFemale.isChecked()) {
                    gender = "Female";
                } else if(rdMale.isChecked()) {
                    gender = "Male";
                } else {
                    gender = "Other";
                }

                if(chkScholar.isChecked()) {
                    scholar = "Yes";
                } else {
                    scholar = "No";
                }

                intent.putExtra("fname_key", txtFirstName.getText().toString());
                intent.putExtra("lname_key", txtLastName.getText().toString());
                intent.putExtra("natio_key", txtNationality.getText().toString());
                intent.putExtra("gender_key", gender);
                intent.putExtra("bday_key", txtBirthDate.getText().toString());
                intent.putExtra("phone_key", txtPhnNum.getText().toString());
                intent.putExtra("emerg_key", txtEmergency.getText().toString());
                intent.putExtra("email_key", txtEmail.getText().toString());
                intent.putExtra("prog_key", txtProg.getText().toString());
                intent.putExtra("year_key",dropYearLevel.getSelectedItem().toString());
                intent.putExtra("scholar_key", scholar);


                startActivity(intent);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(EditText t : textField) {
                    t.setText("");
                }
            }
        });


        txtFirstName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtFirstName.setText("");
                txtFirstName.setTextColor(Color.BLACK);
            }
        });

        txtLastName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLastName.setText("");
                txtLastName.setTextColor(Color.BLACK);
            }
        });


    }

    public void initializeList() {
        textField.add(txtFirstName);
        textField.add(txtLastName);
        textField.add(txtNationality);
        textField.add(txtBirthDate);
        textField.add(txtPhnNum);
        textField.add(txtEmergency);
        textField.add(txtEmail);
        textField.add(txtProg);
    }

}
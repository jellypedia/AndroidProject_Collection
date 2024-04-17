package com.example.androidproject_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTest, btnValentines, btnCalcu, btnMatch3, btnIntents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); ///R is resources

        btnTest = (Button)findViewById(R.id.btnTest);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, LayoutExercise.class); //this activity,destination activity
                startActivity(intent1);
            }
        });

        btnValentines = findViewById(R.id.btnValentines);
        btnValentines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, activity_button_exercise.class);
                startActivity(intent2);
            }
        });

        btnCalcu = findViewById(R.id.btnCalcu);
        btnCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent3);
            }
        });

        btnMatch3 = findViewById(R.id.btnMatch3);
        btnMatch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, Match3.class);
                startActivity(intent4);
            }
        });

        btnIntents = findViewById(R.id.btnIntents);
        btnIntents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent5);
            }
        });
    }
}
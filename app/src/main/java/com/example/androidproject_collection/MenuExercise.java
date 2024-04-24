package com.example.androidproject_collection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MenuExercise extends AppCompatActivity {
    Button btnChanger;
    float size = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnChanger);
        defaultChanges();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Random rdm = new Random();

        if(item.getItemId() == R.id.mItemChange) {
            Toast.makeText(this,"Edit Object Item is Clicked", Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.mItemReset) {
            Toast.makeText(this,"Reset Object Item is Clicked", Toast.LENGTH_SHORT).show();
            defaultChanges();
        } else if(item.getItemId() == R.id.chBGColor) {
            btnChanger.setBackgroundColor(Color.rgb(rdm.nextInt(256),rdm.nextInt(256),rdm.nextInt(256)));
        } else if(item.getItemId() == R.id.chText) {
            btnChanger.setText("Wow!");
        } else if(item.getItemId() == R.id.chTextColor) {
            btnChanger.setTextColor(Color.rgb(rdm.nextInt(256),rdm.nextInt(256),rdm.nextInt(256)));
        } else if(item.getItemId() == R.id.chSize) {
            btnChanger.setTextSize(size);
            size += 30;
        } else if(item.getItemId() == R.id.chRota) {
//            GradientDrawable draw = new GradientDrawable();
//            draw.setShape(GradientDrawable.OVAL);
//            draw.setStroke(5,Color.rgb(rdm.nextInt(256),rdm.nextInt(256),rdm.nextInt(256)));
//
//            btnChanger.setBackground(draw);
            btnChanger.setRotation(size);
            size += 30;
        } else if(item.getItemId() == R.id.mItemExit) {
            finish();
        }
        return true;
    }

    public void defaultChanges() {
        btnChanger.setBackgroundColor(Color.parseColor("#EF5FA7"));
        btnChanger.setRotation(0);
        btnChanger.setTextSize(14);
        btnChanger.setText("Hello!");
    }
}
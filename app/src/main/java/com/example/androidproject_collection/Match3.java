package com.example.androidproject_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class Match3 extends AppCompatActivity {
    boolean btnClicked = false;
    Button btnRestart;
    Button[][] game = new Button[5][5];
    ArrayList<Button> buttons = new ArrayList<>();
    int[] colors = {
            Color.RED, Color.YELLOW, Color.BLUE, Color.GREEN
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);

        initializeBtns();
        newGame();

    }

    public void initializeBtns() {
        int count = 1;

        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 5; col++) {
                String resIDname = "btn"+count;
                game[row][col] = findViewById(this.getResources().getIdentifier(resIDname,"id",this.getPackageName()));
                buttons.add(game[row][col]);
                count++;
            }
        }

        btnRestart = findViewById(R.id.btnRestart);

    }

    Color btnColor;
    public void newGame() {
        Random rnd = new Random();
        int rndNum;

        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 5; col++) {
                rndNum = rnd.nextInt(4);
                game[row][col].setBackgroundColor(colors[rndNum]);

                Button currBtn = game[row][col];
                btnColor = Color.valueOf(colors[rndNum]);

                game[row][col].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Button btnColor1, btnColor2;
                        Color color1, color2;

                        if(!btnClicked) {
                            btnColor1 = currBtn; //btn1
                            btnClicked = true;
                        } else if (btnClicked){
                            btnColor2 = currBtn; //btn2
                            btnClicked = false;
                        }

                    }
                });

            }
        }
    }

    public void switchColors(Button btn1, Button btn2) {

    }

}

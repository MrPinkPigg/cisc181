package com.example.notsorry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private xxxGame game;

    //public static String[] xxxGameImages = new String[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String p1Name = intent.getStringExtra(MainActivity.P1NAME);
        String p2Name = intent.getStringExtra(MainActivity.P2NAME);


        // Capture the layout's TextView and set the string as its text
        TextView p1NameText = findViewById(R.id.textView5);
        p1NameText.setText(p1Name);
        TextView p2NameText = findViewById(R.id.textView6);
        p2NameText.setText(p2Name);


        //creates a new game
        game = new xxxGame();


    }

    public void onClick(View v){

    }
}

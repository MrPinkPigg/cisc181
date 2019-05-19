package com.example.notsorry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String P1NAME = "com.example.notsorry.MESSAGE";
    public static final String P2NAME = "com.example.notsorry.MESSAGE2";

    public void sendMessage(View view){
        Intent intent = new Intent(this, GameActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String message2 = editText2.getText().toString();
        intent.putExtra(P1NAME, message);
        intent.putExtra(P2NAME, message2);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Not Sorry");
    }
}

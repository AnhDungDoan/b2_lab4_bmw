package com.example.b2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        TextView userDisplay = (TextView) findViewById(R.id.textDisplay);
        userDisplay.setText(userDisplay.getText().toString() + " " + username);
    }
}
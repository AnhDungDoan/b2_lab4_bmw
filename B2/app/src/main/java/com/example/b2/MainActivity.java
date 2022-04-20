package com.example.b2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonSignIn;
    private Button buttonReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startReg(View v){
        startActivity(new Intent(MainActivity.this, activity_reg.class));
    }

    public void startSignIn(View v){
        TextView username = (TextView) findViewById(R.id.textUsername);
        TextView password = (TextView) findViewById(R.id.textPassword);

        Button loginbtn = (Button) findViewById(R.id.buttonSignIn);

        loginbtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v){
                    if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                    {
                        Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, display.class);
                        intent.putExtra("username", username.getText().toString());
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        );
    }



}
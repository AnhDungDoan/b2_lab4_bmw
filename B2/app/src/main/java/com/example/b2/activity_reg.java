package com.example.b2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_reg);
    }

    public void startRegister(View v){
        TextView email = (TextView) findViewById(R.id.textEmail);
        TextView username = (TextView) findViewById(R.id.textUsernameReg);
        TextView password = (TextView) findViewById(R.id.textPasswordReg);

        Button regbtn = (Button) findViewById(R.id.RegButton);

        regbtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v){
                    if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty())
                    {
                        if (username.getText().toString().isEmpty())
                            Toast.makeText(activity_reg.this, "USERNAME EMPTY!!!", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(activity_reg.this, "PASSWORD EMPTY!!!", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(activity_reg.this, "REGISTER SUCCESSFUL", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(activity_reg.this, display.class);
                        intent.putExtra("username", username.getText().toString());
                        startActivity(intent);
                    }
                }
            }
        );
    }

}
package com.sujith.authentication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
   private Button phone_auth , email_auth= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        phone_auth= findViewById(R.id.phone_auth);
        email_auth= findViewById(R.id.email_auth);
    }

    @Override
    protected void onResume() {
        super.onResume();

        phone_auth.setOnClickListener((v)->{
            startActivity(new Intent(MainActivity.this, PhoneAuthActivity.class));
        });
        email_auth.setOnClickListener((v)->{
            startActivity(new Intent(MainActivity.this, EmailAuthActivity.class));
        });
    }

}
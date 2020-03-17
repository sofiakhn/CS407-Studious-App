package com.example.studious;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }

    public void signupClick(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("com.example.studious", Context.MODE_PRIVATE);

        EditText emailInput = findViewById(R.id.emailInput);
        EditText passwordInput = findViewById(R.id.passwordInput);

        email = emailInput.getText().toString();
        password = passwordInput.getText().toString();

        sharedPreferences.edit().putString("email", email).apply();
        sharedPreferences.edit().putString("password", password).apply();

        Intent intent = new Intent(this, AddClasses.class);
        startActivity(intent);
    }
}

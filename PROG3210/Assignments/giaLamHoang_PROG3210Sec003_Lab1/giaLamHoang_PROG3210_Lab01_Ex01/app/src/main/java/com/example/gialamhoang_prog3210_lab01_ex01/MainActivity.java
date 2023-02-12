package com.example.gialamhoang_prog3210_lab01_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextUserName;

    Button buttonLogin;

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUserName = findViewById(R.id.editTextUserName);
        buttonLogin = findViewById((R.id.buttonLogin));


    }

    public void buttonLogin_Click(View view) {
        userName = editTextUserName.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("username", userName);
        startActivity(intent);
    }
}
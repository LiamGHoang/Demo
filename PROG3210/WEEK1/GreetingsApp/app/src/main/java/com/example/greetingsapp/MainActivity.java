package com.example.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare view objects and set up references

    EditText editTextFirstName, editTextLastName;

    Button buttonHello;

    TextView textOutput;

    String firstName, lastName, fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        buttonHello = findViewById(R.id.buttonHello);
        textOutput = findViewById(R.id.textOutput);
    }

    //Defining event handler for buttonHello
    public void buttonHello_Click(View view) {
        firstName = editTextFirstName.getText().toString();
        lastName = editTextLastName.getText().toString();
        fullName = firstName + " " + lastName;
        textOutput.setText(fullName);
    }
}

// Code starts from here
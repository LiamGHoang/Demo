package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextFirstNumber, editTextSecondNumber;

    Button buttonAdd, buttonSubtract, buttonNext;

    TextView textViewOutput;

    int firstNumber, secondNumber, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstNumber = findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber = findViewById(R.id.editTextSecondNumber);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        textViewOutput = findViewById(R.id.textViewOutput);

        buttonNext = findViewById(R.id.buttonNext);
    }

    public void buttonAdd_Click(View view) {
        firstNumber = Integer.parseInt(editTextFirstNumber.getText().toString());
        secondNumber = Integer.parseInt(editTextSecondNumber.getText().toString());
        result = firstNumber + secondNumber;
        textViewOutput.setText(String.valueOf(result));
    }

    public void buttonSubtract_Click(View view) {
        firstNumber = Integer.parseInt(editTextFirstNumber.getText().toString());
        secondNumber = Integer.parseInt(editTextSecondNumber.getText().toString());
        result = firstNumber - secondNumber;
        textViewOutput.setText(String.valueOf(result));
    }

    // Go to the next activity page
    public void buttonNext_Click(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
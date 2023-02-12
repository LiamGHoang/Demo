package com.example.gialamhoang_prog3210_lab01_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView userName, textViewNetSalary;

    EditText editTextYearlySalary, editTextTaxRate;

    int yearlySalary,taxRate,netSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        userName = findViewById(R.id.textUserName);
        textViewNetSalary = findViewById(R.id.textViewNetSalary);
        editTextYearlySalary = findViewById(R.id.editTextYearlySalary);
        editTextTaxRate = findViewById(R.id.editTextTaxRate);

        String username = getIntent().getStringExtra("username");

        userName.setText(username);

    }

    public void buttonCalculate_Click(View view) {
        yearlySalary = Integer.parseInt(editTextYearlySalary.getText().toString());
        taxRate = Integer.parseInt(editTextTaxRate.getText().toString());

        netSalary = yearlySalary - (yearlySalary * taxRate / 100);
        textViewNetSalary.setText(String.valueOf(netSalary)+"$");
//        firstNumber = Integer.parseInt(editTextFirstNumber.getText().toString());
//        secondNumber = Integer.parseInt(editTextSecondNumber.getText().toString());
//        result = firstNumber + secondNumber;
//        textViewOutput.setText(String.valueOf(result));

    }
}
package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText FirstValue, SecondValue;
    Button Add, Sub, Multi, Div;
    TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstValue = findViewById(R.id.etFirstNumber);
        SecondValue = findViewById(R.id.etSecondNumber);
        Add = findViewById(R.id.btnAdd);
        Sub = findViewById(R.id.btnSub);
        Multi = findViewById(R.id.btnMultiplication);
        Div = findViewById(R.id.btnDivision);
        Answer = findViewById(R.id.tvAnswer);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int First, Second, Ans;
                // Convert the EditText in Integer
                First = Integer.parseInt(FirstValue.getText().toString());
                Second = Integer.parseInt(SecondValue.getText().toString());

                Ans = First + Second;
                Answer.setText(First + " + " + Second + " = " + Ans);
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int First, Second, Ans;
                // Convert the EditText in Integer
                First = Integer.parseInt(FirstValue.getText().toString());
                Second = Integer.parseInt(SecondValue.getText().toString());

                Ans = First - Second;
                Answer.setText(First + " - " + Second + " = " + Ans);
            }
        });

        Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int First, Second, Ans;
                // Convert the EditText in Integer
                First = Integer.parseInt(FirstValue.getText().toString());
                Second = Integer.parseInt(SecondValue.getText().toString());

                Ans = First * Second;
                Answer.setText(First + " X " + Second + " = " + Ans);
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int First, Second, Ans;
                // Convert the EditText in Integer
                First = Integer.parseInt(FirstValue.getText().toString());
                Second = Integer.parseInt(SecondValue.getText().toString());

                Ans = First / Second;
                Answer.setText(First + " / " + Second + " = " + Ans);
            }
        });
    }
}
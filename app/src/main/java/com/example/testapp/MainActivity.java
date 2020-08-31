package com.example.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sumBtn = (Button) findViewById(R.id.sumBtn);
        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
               EditText secNumEditText = (EditText) findViewById((R.id.secNumTextEdit));
               TextView resultTextView = (TextView) findViewById((R.id.resultTextView));
               int num1 = Integer.parseInt(firstNumEditText.getText().toString());
               int num2 = Integer.parseInt(secNumEditText.getText().toString());
               int result = num1 + num2;
               resultTextView.setText(result + "");
            }
        });

    }
}
package com.example.api2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class activity_generar extends AppCompatActivity {

    private Spinner spinner1;
    private Button buttonSubmit;
    private TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar);

        spinner1 = (Spinner)findViewById(R.id.spinner);

        String [] tokenes = {"Lista de Tokens","11111","2222","33333","44444"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tokenes);
        spinner1.setAdapter(adapter);

        buttonSubmit = (Button) findViewById(R.id.button4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("Hola mundo");

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String token = random();
                textView5.setText(token);

            }
        });
    }

    public static String random() {
        Random generator = new Random();
        StringBuilder randomStringBuilder = new StringBuilder();
        int randomLength = generator.nextInt(64);
        char tempChar;
        for (int i = 0; i < randomLength; i++){
            tempChar = (char) (generator.nextInt(96) + 32);
            randomStringBuilder.append(tempChar);
        }
        return randomStringBuilder.toString();
    }
}



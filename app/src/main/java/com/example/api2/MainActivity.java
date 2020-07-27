package com.example.api2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity_generar(View view) {
        Intent activity_generar = new Intent(this, activity_generar.class);
        startActivity(activity_generar);

        }
    public void activity_agregar (View view){
        Intent activity_agregar = new Intent(this, activity_agregar.class);
        startActivity(activity_agregar);
    }

    ExtensionSqlHelper conn = new ExtensionSqlHelper(this, "bd user_token_code", null, 1);

    public void onClick (View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.button3:
                miIntent=new Intent(MainActivity.this, activity_agregar.class);
                break;
        }
        if (miIntent!= null){
            startActivity(miIntent);
        }
    }
}


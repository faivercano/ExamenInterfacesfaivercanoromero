package com.example.a21650598.exameninterfacesfaivercanoromero;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    protected Button mloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        mloginButton = (Button)findViewById(R.id.loginButton);
        mloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


    public void mostrarVentana(View view){
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);

    }
}

package com.example.a21650598.exameninterfacesfaivercanoromero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SpalshActivity extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        getSupportActionBar().hide();



        TextView titulo = (TextView) findViewById(R.id.splash);
        Animation animaTitulo = AnimationUtils.loadAnimation(this, R.anim.fadein);


        titulo.startAnimation(animaTitulo);
        animaTitulo.setAnimationListener(this);

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }


    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}

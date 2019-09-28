package com.example.test2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageView1;
    Animation animOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView3);
        imageView1 = (ImageView)findViewById(R.id.imageView);
        imageView1.setBackgroundResource(R.drawable.wav);
        final AnimationDrawable animationDrawable = (AnimationDrawable)imageView1.getBackground();
        animOne = AnimationUtils.loadAnimation(this, R.anim.transl);
        animationDrawable.start();
        imageView.startAnimation(animOne);

    }
//    public void onAnimationImageOne(View v){
//        imageView.startAnimation(animOne);
//    }
}

package com.example.actaugust1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation animation;

    TextView tv;
    ImageView kv;
    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.text);
        kv=findViewById(R.id.imageView);
        butt=findViewById(R.id.button);

        animation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.yethachum);


        tv.startAnimation(animation);

        kv.startAnimation(animation);



    }
}
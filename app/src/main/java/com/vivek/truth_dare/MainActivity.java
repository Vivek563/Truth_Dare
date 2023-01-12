package com.vivek.truth_dare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        private Button button;
        private ImageView imageView;
        private Random random = new Random();
        private int newDirection, lastDirection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

    }

    public void spin(View view) {

        newDirection = random.nextInt(3600);

        float pivoitX = imageView.getWidth()/2;
        float pivoitY = imageView.getHeight()/2;

        Animation rotate = new RotateAnimation(lastDirection, newDirection, pivoitX, pivoitY);
        rotate.setDuration(3000);
        rotate.setFillAfter(true);
        lastDirection = newDirection;
        imageView.startAnimation(rotate);
    }
}
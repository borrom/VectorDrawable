package com.goldenkyds.vectordrawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mCpuImageView = (ImageView) findViewById(R.id.cpu);
        Drawable drawable = mCpuImageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }

        ImageView mPathImageView = (ImageView) findViewById(R.id.path);
        Drawable PathDrawable = mPathImageView.getDrawable();
        if (PathDrawable instanceof Animatable) {
            ((Animatable) PathDrawable).start();
        }
    }
}



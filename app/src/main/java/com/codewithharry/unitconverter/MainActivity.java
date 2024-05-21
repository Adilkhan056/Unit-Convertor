package com.codewithharry.unitconverter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ImageView img1,img2,img3,img4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);

    }
    public void open1(View view){
        Intent intent = new Intent(MainActivity.this, weight.class);
        startActivity(intent);
    }
    public void open2(View view){
        Intent intent = new Intent(MainActivity.this, litres.class);
        startActivity(intent);
    }
    public void open3(View view){
        Intent intent = new Intent(MainActivity.this, temperature.class);
        startActivity(intent);
    }
    public void open4(View view){
        Intent intent = new Intent(MainActivity.this, length.class);
        startActivity(intent);
    }
}
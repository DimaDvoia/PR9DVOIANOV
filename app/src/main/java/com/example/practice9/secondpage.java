package com.example.practice9;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);
    }
    public void browser1(View v){
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps"));
        startActivity (browserIntent);
    }
}
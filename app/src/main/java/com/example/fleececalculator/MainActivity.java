package com.example.fleececalculator;

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

    public void spun(View v){
        Intent intent = new Intent(this, InputActivity.class);
        intent.putExtra("a1",1);
        startActivity(intent);
    }
    public void filament(View v){
        Intent intent = new Intent(this, InputActivity.class);
        intent.putExtra("a1",2);
        startActivity(intent);
    }
}

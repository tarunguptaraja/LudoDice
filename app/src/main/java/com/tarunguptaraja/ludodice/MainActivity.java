package com.tarunguptaraja.ludodice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void run(View v){
        Random rand = new Random();
        TextView textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(rand.nextInt(6)+1));
    }
}
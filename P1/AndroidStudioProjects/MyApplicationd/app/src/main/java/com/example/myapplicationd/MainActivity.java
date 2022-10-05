package com.example.myapplicationd;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);

    }

    public void changeFont(View view){
        Typeface tf = textView.getTypeface();
        if(tf.getStyle()==Typeface.NORMAL)
            textView.setTypeface(Typeface.DEFAULT,Typeface.BOLD_ITALIC);
        else
            textView.setTypeface(Typeface.DEFAULT,Typeface.NORMAL); }





}
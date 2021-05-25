package com.nurayim.practicebutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Rectangle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Rectangle,Round,Oval,Circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rectangle = findViewById(R.id.btn1);
        Rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Rectangle Button",Toast.LENGTH_SHORT).show();
            }
        });

        Round = findViewById(R.id.btn2);
        Round.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Round button",Toast.
                        LENGTH_SHORT).show();
            }
        });
        Oval = findViewById(R.id.btn3);
        Oval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Oval Button",Toast.LENGTH_LONG).show();
            }
        });

        Circle = findViewById(R.id.btn4);
        Circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Circle button",Toast.LENGTH_SHORT).show();
            }
        });








    }
}
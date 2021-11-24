package ru.myitschool.lesson20211123;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnflag, btnexit, btnhello;
    LinearLayout linearLayout;
    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.liarLayout);

        btnhello = findViewById(R.id.btnhello);
        btnhello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,TwoActivity.class);
                startActivity(i);
                /*btnhello.setTextColor(Color.YELLOW);

                btnhello.setText("" + (count++));
                linearLayout.setBackgroundColor(Color.rgb(
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255)));*/
            }
        });

        btnexit = findViewById(R.id.btnexit);
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnflag = findViewById(R.id.btnflag);
        btnflag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityFlag.class);
                startActivity(intent);
            }
        });

    }


    public void goPaint(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);

    }
}
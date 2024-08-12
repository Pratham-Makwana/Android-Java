package com.example.profilelistview_java;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CardView c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c9 = findViewById(R.id.c9);
        c10 = findViewById(R.id.c10);


        c1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                i++;

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            if (i == 1) {
                                                Toast.makeText(MainActivity.this, "A R Rehaman selected", Toast.LENGTH_SHORT).show();
                                            } else if (i == 2){
                                                Intent intent = new Intent(getApplicationContext(), ARRehman.class);
                                                startActivity(intent);
                                            }
                                            i = 0;
                                        }
                                    }, 500

                );


            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (i == 1) {
                            Toast.makeText(MainActivity.this, "Arijit Singh selected", Toast.LENGTH_SHORT).show();
                        } else  if (i == 2){
                            Intent intent = new Intent(getApplicationContext(), Arijit.class);
                            startActivity(intent);
                        }
                        i = 0;

                    }
                }, 500);
            }
        });


    }
}
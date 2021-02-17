package com.example.s2_materi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnInt2, btnInt3, btnInt4, btnInt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInt2 = (Button) findViewById(R.id.int2);
        btnInt3 = (Button) findViewById(R.id.int3);
        btnInt4 = (Button) findViewById(R.id.int4);
        btnInt5 = (Button) findViewById(R.id.int5);

        btnInt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Int2 = new Intent(MainActivity.this, Materi2.class);
                startActivity(Int2);

            }
        });
        btnInt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Int3 = new Intent(MainActivity.this, Materi3.class);
                startActivity(Int3);

            }
        });
        btnInt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Int4 = new Intent(MainActivity.this, Materi4.class);
                startActivity(Int4);

            }
        });
        btnInt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Int5 = new Intent(MainActivity.this, Materi5.class);
                startActivity(Int5);

            }
        });
    }
}
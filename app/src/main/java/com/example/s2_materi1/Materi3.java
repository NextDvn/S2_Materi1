package com.example.s2_materi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Materi3 extends AppCompatActivity {

    public static final String EXTRA_DATA = "EXTRA_DATA";

    private EditText editText;
    private Button btnSenData, back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi3);
        editText = (EditText) findViewById(R.id.editText);
        btnSenData = (Button) findViewById(R.id.button);
        back3 = (Button) findViewById(R.id.back3);

        btnSenData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                Intent intent = new Intent(Materi3.this, TargetActivity.class);
                intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);

            }
        });
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi3.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}

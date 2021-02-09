package com.example.s2_materi1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TargetActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = (TextView) findViewById(R.id.textView);

        if (getIntent().getExtras() != null) {
            String data =
                    getIntent().getExtras().getString(Materi3.EXTRA_DATA);
            txtResult.setText(data);

        }

    }
}

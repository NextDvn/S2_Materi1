package com.example.s2_materi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Materi4 extends AppCompatActivity {
    private static final int RC_EDIT_NAME = 112;
    @BindView(R.id.text_view_result)
    TextView textViewResult;
    @BindView(R.id.btn_edit)
    Button btnEdit;
    private Button back4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi4);
        ButterKnife.bind(this);
        back4 = (Button) findViewById(R.id.back4);

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi4.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

    @OnClick(R.id.btn_edit)
    public void onViewClicked() {
        Intent intent = new Intent(this, EditNameActivity.class);
        startActivityForResult(intent, RC_EDIT_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent
            data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_EDIT_NAME && resultCode == RESULT_OK) {
            String name = data.getExtras().getString(EditNameActivity.EXTRA_NAME);
            textViewResult.setText(name);
        }
    }
}

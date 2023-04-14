package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkB extends AppCompatActivity {

    private Button btn_pre2;
    private Button btn_next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_b);

        btn_pre2 = findViewById(R.id.btn_pre2);
        btn_pre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(checkB.this, checkA.class);
                startActivity(intent);
            }
        });

        btn_next2 = findViewById(R.id.btn_next2);
        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(checkB.this, checkC.class);
                startActivity(intent);
            }
        });
    }
}
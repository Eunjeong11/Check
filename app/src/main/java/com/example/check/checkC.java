package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkC extends AppCompatActivity {

    private Button btn_pre3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_c);

        btn_pre3 = findViewById(R.id.btn_pre3);
        btn_pre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(checkC.this, checkB.class);
                startActivity(intent);
            }
        });

    }
}
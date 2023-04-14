package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.net.InetSocketAddress;

public class checkA extends AppCompatActivity {

    private Button btn_next1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        btn_next1 = findViewById(R.id.btn_next1);
        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(checkA.this, checkB.class);
                startActivity(intent);
            }
        });


    }
}
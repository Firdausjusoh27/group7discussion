package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HomePageActivity extends AppCompatActivity {

    private Button relativeBtn;
    private Button constraintBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        relativeBtn = findViewById(R.id.relativebtn);

        relativeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        constraintBtn = findViewById(R.id.constraintbtn);

        constraintBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HomePageActivity.this, ConstraintLayout.class);
                startActivity(intent);
            }
        });
    }





}
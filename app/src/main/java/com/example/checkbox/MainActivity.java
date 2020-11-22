package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cb1 = findViewById(R.id.cb_red);
        cb2 = findViewById(R.id.cb_green);
        cb3 = findViewById(R.id.cb_blue);
        bt1 = findViewById(R.id.submit_button);
        ArrayList<String> mResult = new ArrayList<String>();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb1.isChecked()){
                    String getCBData = cb1.getText().toString();
                    mResult.add(getCBData);
                }

                if (cb2.isChecked()){
                    String getCBData2 = cb2.getText().toString();
                    mResult.add(getCBData2);
                }

                if (cb3.isChecked()){
                    String getCBData3 = cb3.getText().toString();
                    mResult.add(getCBData3);
                }

                String list = Arrays.toString(mResult.toArray()).replace("[", "").replace("]", "");
                Toast.makeText(MainActivity.this,"You click: " + list, Toast.LENGTH_SHORT).show();
                mResult.clear();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch(item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
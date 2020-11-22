package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GridLayout extends AppCompatActivity {

    Button btnClear, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnAdd, btnMul, btnSub, btnDiv, btnZero;
    TextView tvProcess, tvResult;
    String process;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        btnClear =(Button) findViewById(R.id.btn_Clear);
        tvProcess = (TextView) findViewById(R.id.tv_userInput);
        tvResult = (TextView) findViewById(R.id.tv_userResult);
        btnOne = (Button) findViewById(R.id.btn_One);
        btnTwo = (Button) findViewById(R.id.btn_Two);
        btnThree = (Button) findViewById(R.id.btn_Three);
        btnFour = (Button) findViewById(R.id.btn_Four);
        btnFive = (Button) findViewById(R.id.btn_Five);
        btnSix = (Button) findViewById(R.id.btn_Six);
        btnSeven = (Button) findViewById(R.id.btn_Seven);
        btnEight = (Button) findViewById(R.id.btn_Eight);
        btnNine = (Button) findViewById(R.id.btn_Nine);
        btnZero = (Button) findViewById(R.id.btn_Zero);
        btnAdd = (Button) findViewById(R.id.btn_Add);
        btnSub = (Button) findViewById(R.id.btn_Minus);
        btnMul = (Button) findViewById(R.id.btn_Multiply);
        btnDiv = (Button) findViewById(R.id.btn_Divide);

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvProcess.setText("");
                tvResult.setText("");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "-");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "/");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvProcess.getText().toString();
                tvProcess.setText(process + "X");
            }
        });


    }

}
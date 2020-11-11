package com.example.registrationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener {

    EditText number1 , number2;
    Button btnPlus, btnMinus;
    Button btnMulti, btnDivide;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.mini.calculator);

        number1 = findViewById(R.id.et_number1);
        number2 = findViewById(R.id.et_number2);

        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMulti = findViewById(R.id.btn_multi);
        btnDivide = findViewById(R.id.btn_divis);

        tvResult = findViewById(R.id.tv_result);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        int res = 0;
        if(view.getId() == R.id.btn_plus){
            res = Integer.parseInt(number1.getText().toString()) +
                    Integer.parseInt(number2.getText().toString());


        }else if(view.getId() == R.id.btn_minus){
            res = Integer.parseInt(number1.getText().toString()) -
                    Integer.parseInt(number2.getText().toString());


        }else if(view.getId() == R.id.btn_multi){
            res = Integer.parseInt(number1.getText().toString()) *
                    Integer.parseInt(number2.getText().toString());


        }else if(view.getId() == R.id.btn_divis){
            res = Integer.parseInt(number1.getText().toString()) /
                    Integer.parseInt(number2.getText().toString());

        }
        tvResult.setText("Result:" +res);
    }

    public void btnPlusClicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) +
                Integer.parseInt(number2.getText().toString());
        tvResult.setText("Result:" +res);
    }

    public void btnMinusClicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) -
                Integer.parseInt(number2.getText().toString());
        tvResult.setText("Result:" +res);
    }

    public void btnMultiplClicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) *
                Integer.parseInt(number2.getText().toString());
        tvResult.setText("Result:" +res);
    }

    public void btnDivisionClicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) /
                Integer.parseInt(number2.getText().toString());
        tvResult.setText("Result:" +res);
    }
}
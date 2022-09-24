package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    String AllData;
    TextView resultView  , solutionView ;
    MaterialButton btn0 , btn1 , btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    MaterialButton btnDot,btnEqual , btnadd , btnMinus , btnMultiply , btnDivide , btnrightbrac , btnleftbrac , btnclear , btnallclear ;
    float Allresult ;
    int  Addlength1 , Addlength2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();

        resultView = findViewById(R.id.resultView);
        solutionView = findViewById(R.id.solutionView);
        btn9 = findViewById(R.id.btn_9);
        btn8 = findViewById(R.id.btn_8);
        btn7 = findViewById(R.id.btn_7);
        btn6 = findViewById(R.id.btn_6);
        btn5 = findViewById(R.id.btn_5);
        btn4= findViewById(R.id.btn_4);
        btn3 = findViewById(R.id.btn_3);
        btn2 = findViewById(R.id.btn_2);
        btn1 = findViewById(R.id.btn_1);
        btn0 = findViewById(R.id.btn_0);
        btnDot = findViewById(R.id.btn_dot);
        btnEqual = findViewById(R.id.btn_equal);
        btnadd = findViewById(R.id.btn_add);
        btnMinus = findViewById(R.id.btn_minus);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);
        btnleftbrac = findViewById(R.id.btn_left_bracket);
        btnrightbrac = findViewById(R.id.btn_right_bracket);
        btnclear = findViewById(R.id.btn_clear);
        btnallclear = findViewById(R.id.btn_clearAll);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });

//        -----------------------------------------------------------------------------------------------------------------------------------
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();

                if (AllData!= null ){
                    AllData += btnText ;
                }
                else {
                    AllData = null ;
                }


                solutionView.setText(AllData);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }

                solutionView.setText(AllData);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btnleftbrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });
        btnrightbrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialButton button = (MaterialButton) view ;
                String btnText = button.getText().toString();
                if (AllData!= null){
                    AllData += btnText;
                }
                else {
                    AllData = btnText;
                }
                solutionView.setText(AllData);
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tempdatalength = AllData.length() ;

                if (tempdatalength>=1){

                    AllData =AllData.substring(0 ,tempdatalength-1);
                    solutionView.setText(AllData);

                }
                else {
                    AllData = "";

                }


            }
        });


        btnallclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AllData!= null){
                    AllData = null;
                }
                else {
                    AllData ="";
                }
                solutionView.setText(AllData);

            }
        });

    }
}
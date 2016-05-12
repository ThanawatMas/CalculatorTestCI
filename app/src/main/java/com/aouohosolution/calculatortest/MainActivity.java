package com.aouohosolution.calculatortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener{

    private EditText tvOperand1;
    private EditText tvOperand2;
    private Button btnAdd;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;
    private TextView tvResult;

    MainController mainController;

//    Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        bindOperator();

        mainController = new MainController();
        mainController.setListener(this);
    }

    private void initView() {
        tvOperand1 = (EditText) findViewById(R.id.tv_operand1);
        tvOperand2 = (EditText) findViewById(R.id.tv_operand2);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btnDivide = (Button) findViewById(R.id.btn_divide);
        tvResult = (TextView) findViewById(R.id.tv_result);
    }

    private void bindOperator() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minus();
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multi();
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divide();
            }
        });
    }

    private double getOperand(EditText input) {
        double result = 0;
        try {
            String inputText = input.getText().toString();
            result = Double.parseDouble(inputText);
        } catch (NumberFormatException e) {

        }

        return result;
    }

    public void add() {
        double input1 = getOperand(tvOperand1);
        double input2 = getOperand(tvOperand2);
        mainController.add(input1, input2);
//        tvResult.setText(calculator.addplus(input1, input2) + "");
    }

    public void minus() {
        double input1 = getOperand(tvOperand1);
        double input2 = getOperand(tvOperand2);
        mainController.minus(input1, input2);
//        tvResult.setText(calculator.subtrack(input1, input2) + "");
    }

    public void multi() {
        double input1 = getOperand(tvOperand1);
        double input2 = getOperand(tvOperand2);
        mainController.multiply(input1, input2);
//        tvResult.setText(calculator.multiply(input1, input2) + "");
    }

    public void divide() {
        double input1 = getOperand(tvOperand1);
        double input2 = getOperand(tvOperand2);
        mainController.divide(input1, input2);
//        tvResult.setText(calculator.divide(input1, input2) + "");
    }

    @Override
    public void onSuccess(double result) {
        tvResult.setText(String.valueOf(result));
    }
}

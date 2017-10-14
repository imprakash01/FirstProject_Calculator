package com.example.abc.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abc on 10/10/2017.
 */
// checking with multiple user
public class Calculator extends Activity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnMultiply, btnDivide, btnClear, btnEqual,
            btnSin, btnCos, btnTan, btnSquare;
    TextView txtOutput;

    int firstValue, secondValue, result;
    String operand;
    //test with same line 1
    //test with same line 2 user 2

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_calculator_linear);
        setupView();
        registerListener();
    }

    private void setupView() {
        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btnDivide = (Button) findViewById(R.id.btn_divide);
        btnClear = (Button) findViewById(R.id.btn_clear);
        btnEqual = (Button) findViewById(R.id.btn_equal);
        btnSin = (Button) findViewById(R.id.btn_sin);
        btnCos = (Button) findViewById(R.id.btn_cos);
        btnTan = (Button) findViewById(R.id.btn_tan);
        btnSquare = (Button) findViewById(R.id.btn_square);
        txtOutput = (TextView) findViewById(R.id.txt_output);
    }

    private void registerListener() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("9");

            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.valueOf(txtOutput.getText().toString());
                setData("+");
                operand = "+";


            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.valueOf(txtOutput.getText().toString());
                setData("-");
                operand = "-";
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.valueOf(txtOutput.getText().toString());
                setData("*");
                operand = "*";
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.valueOf(txtOutput.getText().toString());
                setData("/");
                operand = "/";
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtOutput.getText().toString().isEmpty())
                    firstValue = Integer.valueOf(txtOutput.getText().toString());
                txtOutput.setText("");
                txtOutput.setText("Sin" + firstValue);
                operand = "sin";
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.valueOf(txtOutput.getText().toString());
                txtOutput.setText("");
                txtOutput.setText("Cos" + firstValue);
                operand = "cos";
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.valueOf(txtOutput.getText().toString());
                txtOutput.setText("");
                txtOutput.setText("Tan" + firstValue);
                operand = "tan";
            }
        });

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.valueOf(txtOutput.getText().toString());
                txtOutput.setText("");
                txtOutput.setText("Square" + firstValue);
                operand = "square";
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = txtOutput.getText().toString();
                if (data.length() > 0)
                    data = data.substring(0, data.length() - 1);
                txtOutput.setText(data);
            }
        });

        btnClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txtOutput.setText("");
                return true;
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = txtOutput.getText().toString();
                if (operand.equals("sin") || operand.equals("cos") || operand.equals("tan") || operand.equals("square")) {
                    double value = 0.0;
                    double input = 0.0;
                    if (operand.equals("sin")) {
                        input = Double.valueOf(data.substring(3));
                        value = Math.sin(input);
                    } else if (operand.equals("cos")) {
                        input = Double.valueOf(data.substring(3));
                        value = Math.cos(input);
                    } else if (operand.equals("tan")) {
                        input = Double.valueOf(data.substring(3));
                        value = Math.tan(input);
                    } else if (operand.equals("square")) {
                        input = Double.valueOf(data.substring(6));
                        value = input * input;
                    }
                    txtOutput.setText(value + "");

                } else {
                    secondValue = Integer.valueOf(data);
                    txtOutput.setText("");
                    if (operand.equals("+"))
                        result = firstValue + secondValue;
                    else if (operand.equals("-"))
                        result = firstValue - secondValue;
                    else if (operand.equals("*"))
                        result = firstValue * secondValue;
                    else if (operand.equals("/"))
                        result = firstValue / secondValue;
                    txtOutput.setText(result + "");
                }



                operand = "";
            }
        });
    }

    private void setData(String input) {
        clearWhileAction();
        String digit = txtOutput.getText().toString();
        digit = digit + input;
        txtOutput.setText(digit);

    }

    private void clearWhileAction() {
        String value = txtOutput.getText().toString();
        if (value.contains("+") || value.contains("-") || value.contains("*") || value.contains("/"))
            txtOutput.setText("");
    }


}

package com.example.my.seniorcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btn_1)
    public Button  button1;
    @BindView(R.id.btn_2)
    public Button  button2;
    @BindView(R.id.btn_3)
    public Button button3;
    @BindView(R.id.btn_4)
    public Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        X.bind(this);

        button1.setText("Button1");
        button2.setText("Button2");
        button3.setText("Button3");
        button4.setText("Button4");


    }
}

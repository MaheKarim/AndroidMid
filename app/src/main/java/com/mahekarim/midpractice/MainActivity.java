package com.mahekarim.midpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNumber(View v) {

       EditText edit1 = (EditText)findViewById(R.id.edit1);
       EditText edit2 = (EditText)findViewById(R.id.edit2);
       TextView textResult = (TextView)findViewById(R.id.textResult);

       Integer n1 = Integer.parseInt(edit1.getText().toString());
       Integer n2 = Integer.parseInt(edit2.getText().toString());

       Integer result = n1 + n2 ;

       textResult.setText(Integer.toString(result));
    }

}
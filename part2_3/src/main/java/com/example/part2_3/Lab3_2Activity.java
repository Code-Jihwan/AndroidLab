package com.example.part2_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab3_2Activity extends AppCompatActivity implements View.OnClickListener{

    Button truebutton;
    TextView textView;
    Button falsebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab32);

        //View 객체 획득
        truebutton = findViewById(R.id.visible_true);
        textView = findViewById(R.id.text_visible_target);
        falsebutton = findViewById(R.id.visible_false);

        //Button 이벤트 등록
        truebutton.setOnClickListener(this);
        falsebutton.setOnClickListener(this);
    }
    //자기수신자 사용
    @Override
    public void onClick(View v) {
        if (v == truebutton){
            textView.setVisibility(View.VISIBLE);
        }
        else if (v == falsebutton) {
            textView.setVisibility(View.INVISIBLE);
        }
    }
}
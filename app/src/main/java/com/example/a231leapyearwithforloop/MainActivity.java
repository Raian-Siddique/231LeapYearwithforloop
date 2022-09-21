package com.example.a231leapyearwithforloop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView tvDisplay;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ===================== Introducing all the button and box================================
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        tvDisplay=findViewById(R.id.tvDisplay);
        button=findViewById(R.id.button);
      //=============== making button functional for calculation===================
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Leap Tears are:\n");

              int valueFrom= Integer.parseInt(ed1.getText().toString()) ;
              int valueTo= Integer.parseInt(ed2.getText().toString());

              for (int year=valueFrom; year<=valueTo; year++){

                  if ((year%400==0)|| (year%4==0 && year%100!=0) ){
                      tvDisplay.append(year+", ");

                  }
              }


            }
        });










    }
}
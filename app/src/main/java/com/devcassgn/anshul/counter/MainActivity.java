package com.devcassgn.anshul.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView count = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.incbtn);
        btn2 = (Button) findViewById(R.id.decbtn);
        btn3 = (Button) findViewById(R.id.resbtn);
        count.setText(Integer.toString(cnt));
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cnt++;
                count.setText(Integer.toString(cnt));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cnt--;
                count.setText(Integer.toString(cnt));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cnt = 0;
                count.setText(Integer.toString(cnt));
            }
        });



    }
}

package com.example.todaysdateandtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.tv_date);

        Intent intent = getIntent();
        textView.setText("Today's Date and Time is:\n" + intent.getStringExtra("date"));
    }
}

package com.example.todaysdateandtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    String strDate = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_date = findViewById(R.id.btn_date);

        Date date = Calendar.getInstance().getTime();
     //   DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
     //   DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        strDate = dateFormat.format(date);

   /*     TextView textView = findViewById(R.id.tv_date);
        textView.setText(strDate);*/
    /*    System.out.println("Converted String: " + strDate);
        Log.i("Todays Date: ", strDate);*/
        btn_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("date", strDate);
                startActivity(intent);

            }
        });
    /*    Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("date", intent);*/



    }
}

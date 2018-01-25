package com.example.rajeshwari.setawayapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btn_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
        int am_pm = 0;
        String result="";
        am_pm = calendar.get(Calendar.AM_PM);
        if(am_pm == 1){
            result = "PM";
        }else {
            result = "AM";
        }
        String formattedDate = dateFormat.format(calendar.getTime());
        EditText editText = (EditText) findViewById(R.id.edit_date_time);
        editText.setText(formattedDate);
        editText.setEnabled(false);

        btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Display_Layout.class);
                startActivity(intent);
            }
        });
    }
}

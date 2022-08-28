package com.example.team16;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Calendar;

public class BuydetailActivity extends AppCompatActivity {

    int alarmHour = 0, alarmMinute = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_detail);

        TextView time_start = findViewById(R.id.time_start);
        TextView time_end = findViewById(R.id.time_end);
        Button btn_done = findViewById(R.id.btn_done);

        time_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (view == time_start) {
                    final Calendar c = Calendar.getInstance();
                    int mHour = c.get(Calendar.HOUR);
                    int mMinute = c.get(Calendar.MINUTE);

                    TimePickerDialog timePickerDialog1 = new TimePickerDialog(BuydetailActivity.this,
                            android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker timePicker, int i, int i1) {
                            time_start.setText(String.format("%02d:%02d", i, i1));

                        }
                    }, mHour, mMinute, false);
                    timePickerDialog1.show();
                }
            }
        });

        time_end.setOnClickListener(new View.OnClickListener() {

            TextView time_start = findViewById(R.id.time_start);
            TextView time_end = findViewById(R.id.time_end);
            Button btn_done = findViewById(R.id.btn_done);

            @Override
            public void onClick(View view) {
                if (view == time_end) {
                    final Calendar c = Calendar.getInstance();
                    int mHour = c.get(Calendar.HOUR);
                    int mMinute = c.get(Calendar.MINUTE);

                    TimePickerDialog timePickerDialog2 = new TimePickerDialog(BuydetailActivity.this,
                            android.R.style.Theme_Holo_Light_Dialog_NoActionBar,new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker timePicker, int i, int i1) {
                            time_end.setText(String.format("%02d:%02d", i, i1));

                        }
                    }, mHour, mMinute, false);
                    timePickerDialog2.show();
                }
            }
        });

        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"신청이 완료되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

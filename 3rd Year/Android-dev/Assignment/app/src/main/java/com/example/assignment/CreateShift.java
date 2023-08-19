package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class CreateShift extends AppCompatActivity {
    TextView timeFrom1;
    TextView timeUntil1;
    TextView timeFrom2;
    TextView timeUntil2;
    TimePickerDialog timePicker;
    EditText EmployeesNum;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_shift);

        timeFrom1 = findViewById(R.id.timeFrom1);
        timeFrom1.setOnClickListener(view -> {
            // Users TimePicker (Clock API) to set time for shifts
            timePicker = new TimePickerDialog(CreateShift.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hour, int minutes) {
                    // if hours or minutes less than 10 adds an extra 0 to correct data
                    String minutesSTR = String.valueOf(minutes);
                    if (minutes < 10) {
                        minutesSTR = "0" + minutes;
                    }
                    String hourStr = String.valueOf(hour);
                    if (hour < 10) {
                        hourStr = "0" + hour;
                    }
                    timeFrom1.setText(hourStr + ":" + minutesSTR);
                }
            }, 0, 0, true);
            timePicker.show();
        });

        timeUntil1 = findViewById(R.id.timeUntil1);
        timeUntil1.setOnClickListener(view -> {
            timePicker = new TimePickerDialog(CreateShift.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hour, int minutes) {

                    String minutesSTR = String.valueOf(minutes);
                    if (minutes < 10) {
                        minutesSTR = "0" + minutes;
                    }

                    String hourStr = String.valueOf(hour);
                    if (hour < 10) {
                        hourStr = "0" + hour;
                    }
                    timeUntil1.setText(hourStr + ":" + minutesSTR);
                }
            }, 0, 0, true);
            timePicker.show();
        });

        timeFrom2 = findViewById(R.id.timeFrom2);
        timeFrom2.setOnClickListener(view -> {
            timePicker = new TimePickerDialog(CreateShift.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hour, int minutes) {
                    String minutesSTR = String.valueOf(minutes);
                    if (minutes < 10) {
                        minutesSTR = "0" + minutes;
                    }
                    String hourStr = String.valueOf(hour);
                    if (hour < 10) {
                        hourStr = "0" + hour;
                    }
                    timeFrom2.setText(hourStr + ":" + minutesSTR);
                }
            }, 0, 0, true);
            timePicker.show();
        });

        timeUntil2 = findViewById(R.id.timeUntil2);
        timeUntil2.setOnClickListener(view -> {
            timePicker = new TimePickerDialog(CreateShift.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hour, int minutes) {

                    String minutesSTR = String.valueOf(minutes);
                    if (minutes < 10) {
                        minutesSTR = "0" + minutes;
                    }

                    String hourStr = String.valueOf(hour);
                    if (hour < 10) {
                        hourStr = "0" + hour;
                    }
                    timeUntil2.setText(hourStr + ":" + minutesSTR);
                }
            }, 0, 0, true);
            timePicker.show();
        });

        Button button = findViewById(R.id.continueBtn);
        button.setOnClickListener(v -> {
            // Stores answers from dropdowns in an array
            String[] answers1 = new String[5];

            EmployeesNum = findViewById(R.id.EmployeesNum);
            String e1 = EmployeesNum.getText().toString();
            if (!e1.equals("")) {
                answers1[0] = e1;
            }

            String t1 = timeFrom1.getText().toString();
            if (!t1.equals("")) {
                answers1[1] = t1;
            }

            String t2 = timeUntil1.getText().toString();
            if (!t2.equals("")) {
                answers1[2] = t2;
            }

            String t3 = timeFrom2.getText().toString();
            if (!t1.equals("")) {
                answers1[3] = t3;
            }

            String t4 = timeUntil2.getText().toString();
            if (!t2.equals("")) {
                answers1[4] = t4;
            }

            // Sends the answers to createShift 2
            Intent intent = new Intent(getApplicationContext(), CreateShift2.class);
            intent.putExtra("answers1", answers1);
            startActivity(intent);
            finish();

        });
    }
}
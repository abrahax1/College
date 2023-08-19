package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class CreateShift2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_shift2);

        // Create dropdown and stores their answers
        Spinner RotateDropdown = findViewById(R.id.RotateDropdown);
        String[] items3 = new String[]{"Rotate employees?", "Yes", "No"};
        ArrayAdapter<CharSequence> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        RotateDropdown.setAdapter(adapter3);
        RotateDropdown.setOnItemSelectedListener(this);

        Spinner Monthly_Weekly = findViewById(R.id.Monthly_Weekly);
        Monthly_Weekly.setVisibility(View.VISIBLE);
        String[] items4 = new String[]{"How many times?", "Monthly", "Weekly"};
        ArrayAdapter<CharSequence> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        Monthly_Weekly.setAdapter(adapter4);
        Monthly_Weekly.setOnItemSelectedListener(this);

        Button button = findViewById(R.id.FinishBtn);

        button.setOnClickListener(v -> {
            // Stores answers to into array
            Bundle bundle = getIntent().getExtras();
            String[] answers1 = bundle.getStringArray("answers1");
            String[] answers2 = new String[4];

            String d3 = RotateDropdown.getSelectedItem().toString();
            if (!d3.equals("Rotate employees?")) {
                answers2[2] = d3;
            }
            if (d3.equals("Yes")){
                String d4 = Monthly_Weekly.getSelectedItem().toString();
                if (!d4.equals("How many times?")){
                    answers2[3] = d4;
                }
            }

            // Sends answers to HomePage
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            intent.putExtra("answers1", answers1);
            intent.putExtra("answers2", answers2);
            startActivity(intent);
            finish();

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position != 0){
            String text = parent.getItemAtPosition(position).toString();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(this, "nothing" , Toast.LENGTH_SHORT).show();
    }
}
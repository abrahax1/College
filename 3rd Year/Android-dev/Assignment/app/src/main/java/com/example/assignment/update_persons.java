package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class update_persons extends AppCompatActivity {

    TextView TVPersonID;
    EditText UpdateName, UpdateWorkTime;
    Button UpdateBtn, DeleteBtn;
    String PersonID, Name, Work_Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_persons);

        TVPersonID = findViewById(R.id.PersonID);
        UpdateName = findViewById(R.id.UpdateName);
        UpdateWorkTime = findViewById(R.id.UpdateWorkTime);

        UpdateBtn = findViewById(R.id.UpdateBtn);
        get_and_SetData();

        // Update person by calling the DBHelper and using the person ID
        UpdateBtn.setOnClickListener(view -> {
            DBHelper myDB = new DBHelper(update_persons.this);
            myDB.updatePerson(PersonID, UpdateName.getText().toString(), UpdateWorkTime.getText().toString());
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        // Confirms delete
        DeleteBtn = findViewById(R.id.DeleteBtn);
        DeleteBtn.setOnClickListener(view -> {
            confirmDelete();
        });
    }

    // if there is data in the DB fields set them into the objects
    void get_and_SetData() {
        if (getIntent().hasExtra("ID") && getIntent().hasExtra("Name") && getIntent().hasExtra("Work_Time")) {
            PersonID = getIntent().getStringExtra("ID");
            Name = getIntent().getStringExtra("Name");
            Work_Time = getIntent().getStringExtra("Work_Time");

            TVPersonID.setText("ID: " + PersonID);
            UpdateName.setText(Name);
            UpdateWorkTime.setText(Work_Time);
        }
        else {
            Toast.makeText(this, "Nothing", Toast.LENGTH_SHORT).show();
        }
    }

    // Makes an alert confirming delete of person by calling DBHelper and using the person ID
    void confirmDelete(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Delete ID: " + PersonID + " ?");
        alert.setMessage("Are you sure you want to delete " + Name + "?");
        alert.setPositiveButton("Yes", (dialogInterface, i) -> {
            DBHelper myDB = new DBHelper(update_persons.this);
            myDB.deletePerson(PersonID);
            finish();
        });
        alert.setNegativeButton("No", (dialogInterface, i) -> {

        });
        alert.create().show();
    }
}
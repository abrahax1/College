package com.example.assignment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerV1;
    Adapter adapter;
    DBHelper myDB;
    ArrayList<String> PERSON_ID, PERSON_NAME, PERSON_WORK_TIME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        myDB = new DBHelper(getApplicationContext());
        PERSON_ID = new ArrayList<>();
        PERSON_NAME = new ArrayList<>();
        PERSON_WORK_TIME = new ArrayList<>();

        recyclerV1 = findViewById(R.id.recyclerV1);
        recyclerV1.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(HomeActivity.this, this, PERSON_ID, PERSON_NAME, PERSON_WORK_TIME);
        recyclerV1.setAdapter(adapter);
        recyclerV1.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        // Checks if there is any information sent from the CreateShift1 and 2 and adds the people to the different shifts
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            addPeopletoShifts(bundle);
        }

        // Displays data from DB to homePage
        displayData();

        // Adds shift
        Button shiftBtn = findViewById(R.id.shiftBtn);
        shiftBtn.setOnClickListener(v -> openNewPage());

        // Deletes shift
        Button deleteAllBtn = findViewById(R.id.DeleteAllBtn);
        deleteAllBtn.setOnClickListener(view -> {
            // Confirms deletion
            confirmDelete();
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            recreate();
        }
    }

    // Changes page
    private void openNewPage() {
        Intent intent = new Intent(this, CreateShift.class);
        startActivity(intent);
    }

    // Adding people to different shift
    void addPeopletoShifts(Bundle bundle){
        // Stores information entered by user in createShift 1 and 2
        String[] answers1 = bundle.getStringArray("answers1");
        String[] answers2 = bundle.getStringArray("answers2");

        // Uses Calendar API to get current date
        TextView date = findViewById(R.id.date);
        Calendar currentDate = Calendar.getInstance();
        int dd = currentDate.get(Calendar.DAY_OF_MONTH);
        int mm = currentDate.get(Calendar.MONTH);
        int yy = currentDate.get(Calendar.YEAR);
        int Wdd = dd + 5;
        int Mdd = dd + 20;

        date.setText(new StringBuilder().append(dd).append("/").append(mm + 1).append("/").append(yy));

        int NumOfPeople = Integer.parseInt(answers1[0]);

        // Stores time from answers
        String time1 = answers1[1];
        time1 += " - " + answers1[2];
        String time2 = answers1[3];
        time2 += " - " + answers1[4];

        // DB
        DBHelper shiftDB = new DBHelper(getApplicationContext());

        // puts half of the people into each shift
        int counter = 0, counter2 = 0;
        int halfPeople = NumOfPeople / 2;
        while(counter < NumOfPeople + 1){
            if (counter < halfPeople) {
                shiftDB.addShift(time1);
            }
            if (counter > halfPeople) {
                shiftDB.addShift(time2);
            }

            // Checks if user selected yes to rotation
            if (answers2[2].equals("Yes")) {
                // Checks if user selected weekly to rotation and changes the people doing shift 1 to shift 2 and viceversa
                if (answers2[3].equals("Weekly")) {
                    if (dd == Wdd) {
                        while (counter2 < NumOfPeople + 1) {
                            if (counter2 < halfPeople) {
                                shiftDB.addShift(time2);
                            }
                            if (counter2 > halfPeople) {
                                shiftDB.addShift(time1);
                            }
                            counter2++;
                        }
                    }

                    // Checks if user selected monthly to rotation and changes the people doing shift 1 to shift 2 and viceversa
                    if (answers2[3].equals("Monthly")) {
                        if (dd == Mdd) {
                            while (counter2 < NumOfPeople + 1) {
                                if (counter2 < halfPeople) {
                                    shiftDB.addShift(time2);
                                }
                                if (counter2 > halfPeople) {
                                    shiftDB.addShift(time1);
                                }
                                counter2++;
                            }
                        }
                    }
                }
            }
            counter++;
        }
    }

    void displayData(){
        Cursor cursor = myDB.readAll();

        // Checks if DB is empty, hides and un-hides objects depending on it
        if (cursor.getCount() == 0){
            ImageView emptyDB = findViewById(R.id.emptyDB);;
            emptyDB.setVisibility(View.VISIBLE);
            TextView emptyTextV = findViewById(R.id.emptyTextV);;
            emptyTextV.setVisibility(View.VISIBLE);
            TableLayout DBtitles = findViewById(R.id.DBtitles);
            DBtitles.setVisibility(View.GONE);
            Button deleteAllBtn = findViewById(R.id.DeleteAllBtn);
            deleteAllBtn.setVisibility(View.GONE);
            TextView date = findViewById(R.id.date);
            date.setVisibility(View.GONE);
        }
        // if DB not empty then adds then to homePage
        else{
            while (cursor.moveToNext()){
                PERSON_ID.add(cursor.getString(0));
                PERSON_NAME.add(cursor.getString(1));
                PERSON_WORK_TIME.add(cursor.getString(2));
            }
        }
    }

    // Puts an alert to confirm deletion of all items in DB
    void confirmDelete(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Delete all?");
        alert.setMessage("Are you sure you want to delete all?");
        alert.setPositiveButton("Yes", (dialogInterface, i) -> {
            // Calls DB helper to delete every
            DBHelper myDB = new DBHelper(this);
            myDB.deleteAllPersons();
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            finish();

        });
        alert.setNegativeButton("No", (dialogInterface, i) -> {

        });
        alert.create().show();
    }
}
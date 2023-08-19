package com.example.listswithdatabases;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends ListActivity {

    TextView tasks;
    SimpleCursorAdapter taskAdapter;
    String names []     = new String[] {"name", "description"};
    int[] rowColumns    = new int [] {R.id.name, R.id.description};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Insert: ", "Starting...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TasksDatabaseManager db = new TasksDatabaseManager(this);


        db.open();

        // Add some sample Persons
        Log.d("Insert: ", "Inserting ..");
        if(db.getTasksCount() == 0) {
            db.addTask(new Task("Shopping", "Get the weekly shop", "0"));
            db.addTask(new Task("hair", "Get a hair cut", "1"));
            db.addTask(new Task("study", "CAs to be done", "0"));
        }
        else
            Log.i("Message", "There are " + db.getTasksCount()+ " on the database");

        Cursor results = db.getAllTasks();
        taskAdapter = new SimpleCursorAdapter(this, R.layout.row, results, names, rowColumns, 0);
        Log.i("test", "Number of rows returned are " + results.getCount());
        setListAdapter(taskAdapter);
        db.close();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        Cursor data = (Cursor)l.getItemAtPosition(position);
        int index = data.getColumnIndex("name");
        String dataName = data.getString(index);
        index = data.getColumnIndex("description");
        String dataDescription = data.getString(index);

        String dataString = dataName + " " + dataDescription;
        Intent intent = new Intent(MainActivity.this, NewActivity.class);
        intent.putExtra("data", dataString);
        Log.i("test", "DataName is - " + dataName +  " - " + ", DataDescription is -" + dataDescription + "-");
        startActivity(intent);
    }
}
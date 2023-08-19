package com.example.listswithdatabases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static com.example.listswithdatabases.TasksDatabaseHelper.KEY_DESCRIPTION;
import static com.example.listswithdatabases.TasksDatabaseHelper.KEY_ID;
import static com.example.listswithdatabases.TasksDatabaseHelper.KEY_NAME;
import static com.example.listswithdatabases.TasksDatabaseHelper.KEY_STATUS;
import static com.example.listswithdatabases.TasksDatabaseHelper.TABLE_CONTACTS;


public class TasksDatabaseManager
{
    Context context;
    private TasksDatabaseHelper TaskdbHelper;
    private SQLiteDatabase database;


    public TasksDatabaseManager(Context context)
    {
        this.context = context;
    }

    public TasksDatabaseManager open() throws SQLException {
        TaskdbHelper = new TasksDatabaseHelper(context);
        database = TaskdbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        TaskdbHelper.close();
    }

    public void Remove() {
        TaskdbHelper.onUpgrade(database,1,1);
    }

    // add the new task
    void addTask(Task task) {

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, task.getName()); // Task Name
        values.put(KEY_DESCRIPTION, task.getDescription()); // Task Phone
        values.put(KEY_STATUS, task.getStatus()); // Task Name

        // Inserting Row
        database.insert(TABLE_CONTACTS, null, values);
        //2nd argument is String containing nullColumnHack

    }


    Task getTask(int id) {

        Cursor cursor = database.query(TABLE_CONTACTS, new String[] { KEY_ID,
                        KEY_NAME, KEY_DESCRIPTION, KEY_STATUS }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Task task = new Task(
                cursor.getString(1), cursor.getString(2), cursor.getString(3));
        // return task
        return task;
    }

    // code to get all tasks in a list view
    public Cursor getAllTasks() {
        // Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_CONTACTS;

        Cursor taskList = database.rawQuery(selectQuery, null);

        return taskList;
    }

    // code to update the single task
    public int updateTask(Task task) {

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, task.getName());
        values.put(KEY_DESCRIPTION, task.getDescription());

        // updating row
        return database.update(TABLE_CONTACTS, values, KEY_ID + " = ?",
                new String[] { String.valueOf(task.getID()) });
    }

    // Deleting single task
    public void deleteTask(Task task) {

        database.delete(TABLE_CONTACTS, KEY_ID + " = ?",
                new String[] { String.valueOf(task.getID()) });
        database.close();
    }

    // Getting tasks Count
    public int getTasksCount() {
        String countQuery = "SELECT * FROM " + TABLE_CONTACTS;
        Cursor cursor = database.rawQuery(countQuery, null);
        int total_rows = cursor.getCount();
        cursor.close();

        // return count
        return total_rows;
    }


}
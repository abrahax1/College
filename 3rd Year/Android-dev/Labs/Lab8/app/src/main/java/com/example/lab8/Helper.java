package com.example.lab8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Helper extends SQLiteOpenHelper
{
    public static final String KEY_ROWID = "_id";
    public static final String KEY_Task_name = "_name";
    public static final String KEY_Description = "_description";
    public static final String KEY_Complete_status = "_status";

    public static final String DATABASE_NAME = "tasklistDB";
    public static final String DATABASE_TABLE = "tasklistDB";
    public static final int DATABASE_VERSION = 1;

    // This is the string containing the SQL database create statement
    private static final String DATABASE_CREATE = "create table " + DATABASE_TABLE  +
                    " (" +
                    "_id integer primary key autoincrement, " +
                    "_name text not null, " +
                    "_description text not null, "  +
                    "_status text not null" +
                    ");";

    public Helper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        // The “Database_create” string below needs to contain the SQL statement needed to create the dB
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        // If you want to change the structure of your database, e.g.
    }
}


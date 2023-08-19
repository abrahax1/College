package com.example.lab8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import static com.example.lab8.Helper.KEY_ROWID;
import static com.example.lab8.Helper.KEY_Task_name;
import static com.example.lab8.Helper.KEY_Description;
import static com.example.lab8.Helper.KEY_Complete_status;
import static com.example.lab8.Helper.DATABASE_TABLE;

public class Manager
{
    Context context;
    private Helper myDatabaseHelper;
    private SQLiteDatabase myDatabase;

    public Manager(Context context)
    {
        this.context = context;
    }

    public Manager open() throws SQLException
    {
        myDatabaseHelper = new Helper(context);
        myDatabase = myDatabaseHelper.getWritableDatabase();
        return this;
    }

    //---closes the database--- any activity that uses the dB will need to do this
    public void close()
    {
        myDatabaseHelper.close();
    }

    //---insert a contact person into the database---
    public long insertPerson(String Task_name, String Description, String Complete_status)
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_Task_name, Task_name);
        initialValues.put(KEY_Description, Description);
        initialValues.put(KEY_Complete_status, Complete_status);
        return myDatabase.insert(DATABASE_TABLE, null, initialValues);
    }

    //---deletes a particular contact person---
    public boolean deletePerson(long rowId)
    {
        // delete statement.  If any rows deleted (i.e. >0), returns true
        return myDatabase.delete(DATABASE_TABLE, KEY_ROWID + "=" + rowId, null) > 0;
    }

    //---retrieves all the rows ---
    public Cursor getAllPeople()
    {
        return myDatabase.query(DATABASE_TABLE, new String[]
        {
            KEY_ROWID,
            KEY_Task_name,
            KEY_Description,
            KEY_Complete_status
        },
    null,
    null,
    null,
    null,
    null);
    }

    //---retrieves a particular contact person---
    public Cursor getPerson(long rowId) throws SQLException
    {
        Cursor mCursor =
        myDatabase.query(true, DATABASE_TABLE, new String[]
        {
            KEY_ROWID,
            KEY_Task_name,
            KEY_Description,
            KEY_Complete_status
        },
    KEY_ROWID + "=" + rowId,
    null,
    null,
    null,
    null,
    null
        );

        if (mCursor != null)
        {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    //---updates a contact person---
    public boolean updatePerson(long rowId, String Task_name, String Description, String Complete_status)
    {
        ContentValues args = new ContentValues();
        args.put(KEY_Task_name, Task_name);
        args.put(KEY_Description, Description);
        args.put(KEY_Complete_status, Complete_status);
        return myDatabase.update(DATABASE_TABLE, args, KEY_ROWID + "=" + rowId, null) > 0;
    }
}

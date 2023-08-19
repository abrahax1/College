package com.example.assignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private Context context;

    private static final String DATABASE_NAME = "AssignmentDB";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "Schedule";
    private static final String PERSON_ID = "_id";
    private static final String PERSON_NAME = "_name";
    private static final String PERSON_WORK_TIME = "_workTime";

    DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    // Creates DB
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " (" + PERSON_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                       + PERSON_NAME + " TEXT, " + PERSON_WORK_TIME + " TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }

    // Adds persons without name to DB
    void addShift(String workTime){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(PERSON_NAME, "Name");
        cv.put(PERSON_WORK_TIME, workTime);
        db.insert(TABLE_NAME, null, cv);

    }

    // Reads data from DB and show it in HomePage
    Cursor readAll(){
         String query = "SELECT * FROM " + TABLE_NAME;
         SQLiteDatabase db = this.getReadableDatabase();

         Cursor cursor = null;
         if (db != null) {
             cursor = db.rawQuery(query, null);
         }

         return cursor;
    }

    // Updates details for person_ID selected
    void updatePerson(String person_id, String Name, String Work_Time){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(PERSON_NAME, Name);
        cv.put(PERSON_WORK_TIME, Work_Time);

        long result = db.update(TABLE_NAME, cv, "_id=?", new String[]{person_id});
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Updated", Toast.LENGTH_SHORT).show();
        }
    }

    // Deletes person selected by ID
    void deletePerson(String person_id){
        SQLiteDatabase db = this.getWritableDatabase();

        long result = db.delete(TABLE_NAME, "_id=?", new String[]{person_id});
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();
        }
    }

    // Deletes everything from DB and resets sequence
    void deleteAllPersons(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_NAME);
        db.execSQL("DELETE FROM SQLITE_SEQUENCE WHERE NAME = '" + TABLE_NAME + "'");
    }
}

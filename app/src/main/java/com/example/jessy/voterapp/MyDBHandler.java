package com.example.jessy.voterapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;

/**
 * Created by jessy on 17/4/18.
 */

public class MyDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ogi.db";
    public static final String TABLE_NAME = "Team";
    public static final String COLUMN_ID = "TeamID";
    public static final String COLUMN_NAME = "TeamName";




    //initialize the database
    public MyDBHandler(Context context, Stringname, SQLiteDatabase.CursorFactoryfactory, intversion) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {}

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}
    public String loadHandler() {}
    public void addHandler(Team team) {}
    public Team findHandler(String team_name) {}
    public boolean deleteHandler(int ID) {}
    public boolean updateHandler(int ID, String name) {}
}

    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE" + TABLE_NAME + "(" + COLUMN_ID +
                "INTEGER PRIMARYKEY," + COLUMN_NAME + "TEXT )";
        db.execSQL(CREATE_TABLE);
    }
    public String loadHandler() {
        String result = "";
        String query = "Select*FROM" + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            int result_0 = cursor.getInt(0);
            String result_1 = cursor.getString(1);
            result += String.valueOf(result_0) + " " + result_1 +
                    System.getProperty("line.separator");
        }
        cursor.close();
        db.close();
        return result;
    }
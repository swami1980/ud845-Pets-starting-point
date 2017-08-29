package com.example.android.pets;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 118168 on 7/7/2017.
 */

public class PetsDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Pets.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + PetsContract.pets.TABLE_NAME + " (" +
                    PetsContract.pets._ID + " INTEGER PRIMARY KEY," +
                    PetsContract.pets.PET_NAME + " TEXT," +
                    PetsContract.pets.PET_BREED + " TEXT," +
                    PetsContract.pets.PET_GENDER + " INTEGER," +
                    PetsContract.pets.PET_WEIGHT + " INTEGER)" ;

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + PetsContract.pets.TABLE_NAME;

    public PetsDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}

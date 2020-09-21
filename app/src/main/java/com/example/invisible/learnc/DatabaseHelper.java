package com.example.invisible.learnc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public  static final String DATABASE_NAME="OnlineJudge.db";
    private  static final String TABLE_NAME="OnlineJudgeTable";
    private  static final String CoL_1="QuestionId";
    private  static final String CoL_2="Question";
    private  static final String CoL_3="Solution";
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME+" (QuestionId INTEGER PRIMARY KEY AUTOINCREMENT, Question TEXT, Solution TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }



}

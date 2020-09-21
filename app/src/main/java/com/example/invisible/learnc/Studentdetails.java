package com.example.invisible.learnc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class Studentdetails extends SQLiteOpenHelper {


    private  static final String DATABASENAME="STUDENT.db";
    private  static final String TABLENAME="Studenttable";
    private  static final String ID="Id";
    private  static final String EMAIL="EMAIL";
    private  static final String Username="Username";
    private  static final String Passwordname="Password";
    private  static final String Highscore="Highscore";
    private  static final int version=6;
    private Context C;
    private  static final String TABLE="CREATE TABLE "+TABLENAME+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+EMAIL+" TEXT,"+Username+" TEXT,"+Passwordname+" TEXT,"+Highscore+" INTEGER)";

    private  static final String DROP="DROP TABLE IF EXISTS "+TABLENAME;
    public Studentdetails( Context context) {
        super(context, DATABASENAME, null, version);
        this.C=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            db.execSQL(TABLE);
            Toast.makeText(C,"Table is  created",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(C,"Table is not created",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP);
        onCreate(db);
        Toast.makeText(C,"Onupgrade is called",Toast.LENGTH_SHORT).show();
    }


    public  void Insertinfo(String email,String s1, String s2, int High)
    {
        SQLiteDatabase  sq=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(EMAIL,email);
        cv.put(Username,s1);
        cv.put(Passwordname,s2);
        cv.put(Highscore,High);
        long l=sq.insert(TABLENAME,null,cv);
        if(l==-1)
        {
            Toast.makeText(C,"NOT INSERTED",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(C,"INSERTED",Toast.LENGTH_SHORT).show();
        }
    }

    public  void Updateinfo(int id,String s1, String s2, String s3,int High)
    {
        SQLiteDatabase  sq=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(ID,id);
        cv.put(EMAIL,s1);
        cv.put(Username,s2);
        cv.put(Passwordname,s3);
        cv.put(Highscore,High);
        String hi=Integer.toString(High);
        sq.update(TABLENAME,cv,"ID=?",new String []{String.valueOf(id)});
        Toast.makeText(C,"Informations  are updated",Toast.LENGTH_SHORT).show();
    }
    public Cursor getCusor()
    {
        SQLiteDatabase  sq=this.getWritableDatabase();
        Cursor cur=sq.rawQuery("select * from  "+TABLENAME,null);
        return cur;
    }
}

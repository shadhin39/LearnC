package com.example.invisible.learnc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;

public class database extends SQLiteOpenHelper {
    private  static final String DATABASENAME="Queswithans.db";
    private  static final String TABLENAME="MYDATABASE";
    private  static final String QUESTION="QUESTION";
    private  static final String OPTION1="OPTION1";
    private  static final String OPTION2="OPTION2";
    private  static final String OPTION3="OPTION3";
    private  static final String CORANS="CORRECTANSWER";
    private  static final String DROP="DROP TABLE IF EXISTS "+TABLENAME;
    private  static final String TABLE="CREATE TABLE "+TABLENAME+"("+QUESTION+" TEXT,"+OPTION1+" TEXT,"+OPTION2+" TEXT,"+OPTION3+" TEXT,"+CORANS+" INTEGER)";
    public String SELECTALL="select * from  "+TABLENAME;
    private  static final int  version=11;
    private static Context context;
    public database(Context context) {
        super(context, DATABASENAME, null, version);
        this.context=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
       try
       {
           db.execSQL(TABLE);
           Toast.makeText(context,"Oncreate method is called",Toast.LENGTH_SHORT).show();
       }
       catch (Exception e)
       {

       }
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try
        {
            db.execSQL(DROP);
            onCreate(db);
            Toast.makeText(context,"Onupgrade is called",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {

        }
    }
    public  void Createquestion(String s1, String s2, String s3, String s4, int s5)
    {
        SQLiteDatabase  sql=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(QUESTION,s1);
        cv.put(OPTION1,s2);
        cv.put(OPTION2,s3);
        cv.put(OPTION3,s4);
        cv.put(CORANS,s5);
        long l=sql.insert(TABLENAME,null,cv);
        if(l==-1)
        {
            Toast.makeText(context,"NOT INSERTED",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(context,"INSERTED",Toast.LENGTH_SHORT).show();
        }

    }

    public Cursor getCr() {
        SQLiteDatabase  sql=this.getWritableDatabase();
        Cursor cr=sql.rawQuery("select * from  "+TABLENAME,null);
        return cr;
    }
}

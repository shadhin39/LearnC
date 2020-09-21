package com.example.invisible.learnc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class database2 extends SQLiteOpenHelper {


    private  static final String DATABASENAME="ONLINETURIAL.db";
    private  static final String TABLENAME="Youtubetbl";
    private  static final String ID="ID";
    private  static final String VIDEONAME="Videoname";
    private  static final String LINK="URL";
    private  static final int version=6;
    private Context C;
    private  static final String TABLE="CREATE TABLE "+TABLENAME+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+VIDEONAME+" TEXT,"+LINK+" TEXT)";
    private  static final String DROP="DROP TABLE IF EXISTS "+TABLENAME;
    private  static final String SELECTALL="SELECT * FROM "+TABLENAME;
    public database2(@Nullable Context context) {
        super(context, DATABASENAME, null, version);
        this.C=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try{
            sqLiteDatabase.execSQL(TABLE);
            Toast.makeText(C,"Table is  created",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(C,"Table is not created",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        try {
            sqLiteDatabase.execSQL(DROP);
            onCreate(sqLiteDatabase);
            Toast.makeText(C,"Onupgrade is called",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {

        }

    }

    public  long Insertinfo(String vname,String url )
    {
        SQLiteDatabase  sq=this.getWritableDatabase();
        ContentValues cv=new ContentValues();

        cv.put(VIDEONAME,"vname");
        cv.put(LINK,url);



        long l=sq.insert(TABLENAME,null,cv);
        return l;

    }
    public Cursor readdata()
    {
        SQLiteDatabase  sq=this.getWritableDatabase();
        Cursor cursor=sq.rawQuery(SELECTALL,null);
        return cursor;
    }
    public Cursor getCr() {
        SQLiteDatabase  sql=this.getWritableDatabase();
        Cursor cr=sql.rawQuery("select * from  "+TABLENAME,null);
        return cr;
    }
}


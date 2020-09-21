package com.example.invisible.learnc;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CreateOnline extends AppCompatActivity {

    database2 db2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_online);

        db2=new database2(this);
        SQLiteDatabase sqd=db2.getWritableDatabase();

        // Here Video links and Names are inserted





        long rowid1=db2.Insertinfo("IntroDuction","https://youtu.be/2NWeucMKrLI?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid2=db2.Insertinfo("Setting_up_codeblocks","https://youtu.be/3DeLiClDd04?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid3=db2.Insertinfo("how_program_works","https://youtu.be/iWx3yyFMWQA?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid4=db2.Insertinfo("Print","https://youtu.be/oSpmApiUsHw?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid5=db2.Insertinfo("Comments","https://youtu.be/oX2FpFYXE38?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid6=db2.Insertinfo("Conversion","https://youtu.be/To7WA4ijQQ0?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid7=db2.Insertinfo("Variables","https://youtu.be/k1ur8rX-DQQ?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid8=db2.Insertinfo("String","https://youtu.be/LEHaSSYreeo?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid9=db2.Insertinfo("Array","https://youtu.be/7F-Q2oVBYKk?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        long rowid10=db2.Insertinfo("Header_file","https://youtu.be/1EeetMPACMI?list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq");
        if(rowid1>0&&rowid2>0&&rowid3>0&&rowid4>0&&rowid5>0&&rowid6>0&&rowid7>0&&rowid8>0&&rowid9>0&&rowid10>0)
        {
            Toast.makeText(getApplicationContext(),"Inserted",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Not Inserted ",Toast.LENGTH_LONG).show();
        }

    }
}
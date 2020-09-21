package com.example.invisible.learnc;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

     private EditText et1,et2,et3,et4,et5;
     database d;
     private Button save,show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        d=new database(this);
        SQLiteDatabase sq=d.getWritableDatabase();
        et1=findViewById(R.id.Question);
        et2=findViewById(R.id.Option_1);
        et3=findViewById(R.id.Option_2);
        et4=findViewById(R.id.Option_3);
        et5=findViewById(R.id.correctanswer);
        save=findViewById(R.id.Save);
        show=findViewById(R.id.ShowAlert);
        save.setOnClickListener(this);
        show.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        String s3=et3.getText().toString();
        String s4=et4.getText().toString();
        int s5= Integer.parseInt(et5.getText().toString());

        if(v.getId()==R.id.Save)
        {
            d.Createquestion(s1,s2,s3,s4,s5);
        }
        if(v.getId()==R.id.ShowAlert) {

        }
    }
    public void Showdata(String g,String s)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(g);
        builder.setMessage(s);
        builder.setCancelable(true);
        builder.show();
    }
}

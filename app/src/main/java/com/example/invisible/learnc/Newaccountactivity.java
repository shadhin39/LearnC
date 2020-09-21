package com.example.invisible.learnc;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Newaccountactivity extends AppCompatActivity {

    private EditText Etext;
    private EditText usertext;
    private EditText passwordtext;
    private Button save;
    Studentdetails d;
    private  int error=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newaccountactivity);
        d=new Studentdetails(this);
        Etext=findViewById(R.id.Emailtext);
        usertext=findViewById(R.id.Usernametext);
        passwordtext=findViewById(R.id.PasswordText);
        save=findViewById(R.id.Savedetails);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               User info=new User();
               info.email= Etext.getText().toString();
               info.username=usertext.getText().toString();
               String email=info.email;
               String un=info.username;
               info.password=passwordtext.getText().toString();
               info.highscore=0;
               Cursor cur=d.getCusor();
               if(cur.getCount()==0)
               {
                   d.Insertinfo(info.email,info.username,info.password,info.highscore);
                   Intent in=new Intent(Newaccountactivity.this,Loginactivity.class);
                   startActivity(in);
                   finish();
               }
               else
               {
                   while(cur.moveToNext())
                   {
                       if(un.equals(cur.getString(2))||email.equals(cur.getString(1)))
                       {
                           Alert("Error","This username or Id is already taken Enter a unique username and Id");
                           Etext.setText(null);
                           usertext.setText(null);
                           passwordtext.setText(null);
                           error=1;
                           break;
                       }
                       if(info.password.length()<8)
                       {
                           Toast.makeText(Newaccountactivity.this,"Password should be at least 8 charecters",Toast.LENGTH_SHORT).show();
                           passwordtext.setText(null);
                           error=1;
                       }
                   }
                   if(error==0)
                   {
                       d.Insertinfo(info.email,info.username,info.password,info.highscore);
                       Intent in=new Intent(Newaccountactivity.this,Loginactivity.class);
                       startActivity(in);
                   }
                   error=0;
               }
            }
        });
    }
    public void Alert(String alt,String msg)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(alt);
        builder.setMessage(msg);
        builder.setCancelable(true);
        builder.show();
    }
}

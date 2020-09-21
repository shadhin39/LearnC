package com.example.invisible.learnc;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class Loginactivity extends AppCompatActivity implements View.OnClickListener {

    private EditText usertext;
    private EditText passwordtext;
    private RelativeLayout login;
    private TextView newacc;
    Studentdetails std;
    private int error=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        std=new Studentdetails(this);
        SQLiteDatabase sqd =std.getWritableDatabase();
        usertext=findViewById(R.id.Username);
        passwordtext=findViewById(R.id.Password);
        login= findViewById(R.id.Login);
        newacc=findViewById(R.id.Newaccount);
        login.setOnClickListener(this);
        newacc.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.Login)
        {
            String em=usertext.getText().toString();
            String pt=passwordtext.getText().toString();
            Cursor detect=std.getCusor();
            if(detect.getCount()==0)
            {
                Toast.makeText(Loginactivity.this,"Invalid username or password try again",Toast.LENGTH_SHORT).show();
            }
            else
            {
                while (detect.moveToNext())
                {
                    if(em.equals(detect.getString(1))&&pt.equals(detect.getString(3)))
                    {
                        String user=detect.getString(0);

                        Intent in=new Intent(Loginactivity.this,Main2Activity.class);
                        in.putExtra("Userid",user);
                        startActivity(in);
                        finish();
                        error=0;
                        break;
                    }
                }
                if(error==1)
                {
                    Toast.makeText(Loginactivity.this,"Invalid username or password try again",Toast.LENGTH_SHORT).show();
                }
                error=1;
            }
        }
        if(v.getId()==R.id.Newaccount)
        {
            Intent nxt=new Intent(Loginactivity.this,Newaccountactivity.class);
            startActivity(nxt);
        }
    }
}

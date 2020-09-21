package com.example.invisible.learnc;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private CardView Quiz;
    private CardView onlinetutorial;
    private CardView oflinetutorial;
    private CardView code;
    private CardView viva;
    private CardView onlinejudge;
    database d;
    Studentdetails st;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d=new database(this);
        st=new Studentdetails(this);
        Quiz= findViewById(R.id.Quiz);
        onlinetutorial=    findViewById(R.id.Onlinetutorials);
        oflinetutorial= findViewById(R.id.Oflinetutorials);
        code= findViewById(R.id.code);
        viva= findViewById(R.id.viva);
        onlinejudge = findViewById(R.id.onlinejudge);
        /*Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,Loginactivity.class);
                startActivity(in);

            }
        });*/
        Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,Loginactivity.class);
                startActivity(in);

            }
        });
        oflinetutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(MainActivity.this,Tutorialsactivity.class);
                startActivity(in2);

            }
        });
        viva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in2=new Intent(MainActivity.this,vivaactivity.class);
                startActivity(in2);

            }
        });
        /*
        onlinetutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(MainActivity.this,CreateOnline.class);
                startActivity(in2);

            }
        });*/

            onlinetutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(MainActivity.this,Youtubeactivity.class);
                startActivity(in2);

            }
        });



        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(MainActivity.this,codeactivity.class);
                startActivity(in2);

            }
        });
        onlinejudge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(MainActivity.this,OnlineJudgeActivity.class);
                startActivity(in2);

            }
        });
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

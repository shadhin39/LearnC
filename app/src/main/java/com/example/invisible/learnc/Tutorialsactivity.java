package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class Tutorialsactivity extends AppCompatActivity implements View.OnClickListener {


    private CardView control,Function,Array,pointer,MemoryAlocation,String,Mathfunction,Structure,Filehandeling,preprocessor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorialsactivity);
        control= findViewById(R.id.control);
        Function= findViewById(R.id.Function);
        Array= findViewById(R.id.Array);
        pointer= findViewById(R.id.Pointer);
        MemoryAlocation= findViewById(R.id.Memoryalocation);
        String= findViewById(R.id.String);
        Mathfunction= findViewById(R.id.Mathfunction);
        Structure= findViewById(R.id.Structure);
        Filehandeling= findViewById(R.id.Filehandeling);
        preprocessor= findViewById(R.id.Preprocessor);
        control.setOnClickListener(this);
        Function.setOnClickListener(this);
        Array.setOnClickListener(this);
        pointer.setOnClickListener(this);
        MemoryAlocation.setOnClickListener(this);
        String.setOnClickListener(this);
        Mathfunction.setOnClickListener(this);
        Structure.setOnClickListener(this);
        Filehandeling.setOnClickListener(this);
        preprocessor.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        if(v.getId()==control.getId())
        {

            Intent in=new Intent(Tutorialsactivity.this,control.class);
            startActivity(in);
        }
        if(v.getId()==Function.getId())
        {

            Intent in=new Intent(Tutorialsactivity.this,Function.class);
            startActivity(in);
        }
        if(v.getId()==Array.getId())
        {

            Intent in=new Intent(Tutorialsactivity.this,Array.class);
            startActivity(in);
        }
        if(v.getId()==pointer.getId())
        {

            Intent in=new Intent(Tutorialsactivity.this,pointer.class);
            startActivity(in);
        }


        if(v.getId()==MemoryAlocation.getId())
        {
            Intent in=new Intent(Tutorialsactivity.this,Memoryalocation.class);
            startActivity(in);

        }
        if(v.getId()==String.getId())
        {

            Intent in=new Intent(Tutorialsactivity.this,stringactivity.class);
            startActivity(in);
        }
        if(v.getId()==Mathfunction.getId())
        {
            Intent in=new Intent(Tutorialsactivity.this,Mathfunction.class);
            startActivity(in);

        }
        if(v.getId()==Structure.getId())
        {

            Intent in=new Intent(Tutorialsactivity.this,Structure.class);
            startActivity(in);
        }
        if(v.getId()==Filehandeling.getId())
        {

            Intent in=new Intent(Tutorialsactivity.this,Filehandeling.class);
            startActivity(in);


        }
        if(v.getId()==preprocessor.getId())
        {
            Intent in=new Intent(Tutorialsactivity.this,preprocessor.class);
            startActivity(in);
        }

    }
}

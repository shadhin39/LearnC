package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pointer extends AppCompatActivity implements View.OnClickListener {


    private Button main, point_to, arithmatic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointer);
        main=(Button)findViewById(R.id.main_id);
        point_to=(Button)findViewById(R.id.pointto_id);
        arithmatic=(Button)findViewById(R.id.arithmatic_id);


        main.setOnClickListener(this);
        point_to.setOnClickListener(this);
        arithmatic.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==main.getId())
        {
            Intent intent=new Intent(pointer.this, Pointer_theory.class);
            intent.putExtra("key", 0);
            startActivity(intent);
        }

        if(v.getId()==point_to.getId())
        {
            Intent intent=new Intent(pointer.this, Pointer_theory.class);
            intent.putExtra("key", 1);
            startActivity(intent);
        }

        if(v.getId()==arithmatic.getId())
        {
            Intent intent=new Intent(pointer.this, Pointer_theory.class);
            intent.putExtra("key", 2);
            startActivity(intent);
        }
    }
}

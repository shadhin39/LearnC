package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Array extends AppCompatActivity implements View.OnClickListener {

    private Button one, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        one=(Button)findViewById(R.id.one_id);
        two=(Button)findViewById(R.id.two_id);
        three=(Button)findViewById(R.id.three_id);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        if(v.getId()==one.getId())
        {
            Intent intent=new Intent(Array.this, Array_theory.class);
            intent.putExtra("key", 0);
            startActivity(intent);
        }

        if(v.getId()==two.getId())
        {
            Intent intent=new Intent(Array.this, Array_theory.class);
            intent.putExtra("key", 1);
            startActivity(intent);
        }

        if(v.getId()==three.getId())
        {
            Intent intent=new Intent(Array.this, Array_theory.class);
            intent.putExtra("key", 2);
            startActivity(intent);
        }
    }
}


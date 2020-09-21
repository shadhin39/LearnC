package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Structure extends AppCompatActivity implements View.OnClickListener {

    private Button structure, array_strc, nested_strc, union;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure);
        structure=(Button)findViewById(R.id.structure_id);
        array_strc=(Button)findViewById(R.id.array_structure_id);
        nested_strc=(Button)findViewById(R.id.nested_structure_id);
        union=(Button)findViewById(R.id.union_id);

        structure.setOnClickListener(this);
        array_strc.setOnClickListener(this);
        nested_strc.setOnClickListener(this);
        union.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==structure.getId())
        {
            Intent intent=new Intent(Structure.this, Structure_theory.class);
            intent.putExtra("key", 0);
            startActivity(intent);
        }

        if(v.getId()==array_strc.getId())
        {
            Intent intent=new Intent(Structure.this, Structure_theory.class);
            intent.putExtra("key", 1);
            startActivity(intent);
        }

        if(v.getId()==nested_strc.getId())
        {
            Intent intent=new Intent(Structure.this, Structure_theory.class);
            intent.putExtra("key", 2);
            startActivity(intent);
        }
        if(v.getId()==union.getId())
        {
            Intent intent=new Intent(Structure.this, Structure_theory.class);
            intent.putExtra("key", 3);
            startActivity(intent);
        }
    }
}

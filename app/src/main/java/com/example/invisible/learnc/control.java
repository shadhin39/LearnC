package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class control extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        listView=findViewById(R.id.controllst);
        String[] name=getResources().getStringArray(R.array.control_names);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(control.this,R.layout.textrec,R.id.textvid,name);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(control.this, Condition_theory.class);
                intent.putExtra("key", position);
                startActivity(intent);

            }
        });




    }
}

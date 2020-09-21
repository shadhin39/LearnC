package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class preprocessor extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preprocessor);
        listView=findViewById(R.id.prelist);
        String[] name=getResources().getStringArray(R.array.Pre_names);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(preprocessor.this,R.layout.textrec,R.id.textvid,name);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(preprocessor.this, Preprocessor_theory.class);
                intent.putExtra("key", position);
                startActivity(intent);

            }
        });

    }
}

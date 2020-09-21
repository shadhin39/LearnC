package com.example.invisible.learnc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class vivaactivity extends AppCompatActivity {

    private ExpandableListView ev;
    List<String> listdataheader;
    HashMap<String,List<String>> listchild;
    private CustomAdapter cadapter;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivaactivity);

        prepdata();


        ev=findViewById(R.id.expandablelistview);
        cadapter=new CustomAdapter(this,listdataheader,listchild);
        ev.setAdapter(cadapter);




    }

    public void prepdata()
    {
        String[] Questiondata=getResources().getStringArray(R.array.vivaques);
        String[] ansdata=getResources().getStringArray(R.array.vivaand);
        listdataheader= new ArrayList<>();
        listchild= new HashMap<>();

        for(int i=0;i<Questiondata.length;i++)
        {
            listdataheader.add(Questiondata[i]);
            List<String> child=new ArrayList<>();

            child.add(ansdata[i]);

            listchild.put(listdataheader.get(i),child);



        }
    }
}

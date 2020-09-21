package com.example.invisible.learnc;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.google.android.youtube.player.internal.v;

import java.io.IOException;
import java.io.InputStream;
public class Solution extends AppCompatActivity {

    private TextView text1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
        text1=(TextView)findViewById(R.id.tt_id);
        Bundle bundle=getIntent().getExtras();
        int data1=bundle.getInt("key");

        if(data1==13)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution1.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


        if(data1==14)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution2.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


        if(data1==15)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution3.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }

        if(data1==16)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution4.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


        if(data1==17)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution5.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


        if(data1==18)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution6.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


        if(data1==19)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution7.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==20)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution8.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==21)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution9.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==22)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution10.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==23)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution11.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==24)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution12.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==25)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("solution13.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
    }
}

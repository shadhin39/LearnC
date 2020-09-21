package com.example.invisible.learnc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class String_theory extends AppCompatActivity {

    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_theory);

        text1=(TextView)findViewById(R.id.text_id);

        Bundle bundle=getIntent().getExtras();
        int data1=bundle.getInt("key");

        if(data1==0)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_main.txt");
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


        if(data1==1)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_cmp.txt");
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


        if(data1==2)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_concat.txt");
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

        if(data1==3)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_copy.txt");
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

        if(data1==4)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_func.txt");
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

        if(data1==5)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_gets_puts.txt");
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

        if(data1==6)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_lenght.txt");
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

        if(data1==7)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_rev.txt");
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

        if(data1==8)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_str.txt");
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
        if(data1==9)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_upr.txt");
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
        if(data1==10)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("string_wr.txt");
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

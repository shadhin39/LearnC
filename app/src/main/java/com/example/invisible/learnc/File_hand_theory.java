package com.example.invisible.learnc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class File_hand_theory extends AppCompatActivity {

    private TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_hand_theory);


        text1=(TextView)findViewById(R.id.text_id);

        Bundle bundle=getIntent().getExtras();
        int data1=bundle.getInt("key");

        if(data1==0)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("file_handling_main.txt");
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
                InputStream inputStream = getAssets().open("fprintf_fscanf.txt");
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
                InputStream inputStream = getAssets().open("fputc_fgetc.txt");
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
                InputStream inputStream = getAssets().open("fputs_fgets.txt");
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
                InputStream inputStream = getAssets().open("fseek.txt");
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
                InputStream inputStream = getAssets().open("ftell.txt");
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
                InputStream inputStream = getAssets().open("file_rewind.txt");
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

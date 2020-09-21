package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




import java.io.IOException;
import java.io.InputStream;

public class Question1 extends AppCompatActivity implements View.OnClickListener{
    private TextView text1;
    private Button b1,b2;
    public int flag = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlinejudge_handle);


        text1=(TextView)findViewById(R.id.txt_id);

        Bundle bundle=getIntent().getExtras();
        int data1=bundle.getInt("key");
        b1 = (Button) findViewById(R.id.b1_id);
        b2 = (Button) findViewById(R.id.b2_id);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        if(data1==0)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question1.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 1");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);


        }


        if(data1==1)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question2.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 2");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);


        }


        if(data1==2)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question3.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 3");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);


        }

        if(data1==3)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question4.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 4");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);


        }


        if(data1==4)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question5.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 5");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);


        }


        if(data1==5)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question6.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 6");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


        if(data1==6)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question7.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 7");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);


        }
        if(data1==7)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question8.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==8)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question9.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 9");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==9)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question10.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 10");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==10)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question11.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 11");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==11)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question12.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 12");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==12)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("question13.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
                b1.setText("Solution 13");
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


    }
    public void onClick(View v) {

        if (v.getId() == b1.getId()) {
            String ButtonText = b1.getText().toString();
            if(ButtonText.equals("Solution 1"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 13);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 2"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 14);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 3"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 15);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 4"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 16);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 5"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 17);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 6"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 18);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 7"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 19);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 8"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 20);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 9"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 21);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 10"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 22);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 11"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 23);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 12"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 13);
                startActivity(intent);
            }
            if(ButtonText.equals("Solution 13"))
            {
                Intent intent = new Intent(Question1.this, Solution.class);
                intent.putExtra("key", 25);
                startActivity(intent);
            }

        }


        if (v.getId() == b2.getId()) {
            Intent intent = new Intent(Question1.this, codeactivity.class);
            intent.putExtra("key", 14);
            startActivity(intent);
        }
    }



}

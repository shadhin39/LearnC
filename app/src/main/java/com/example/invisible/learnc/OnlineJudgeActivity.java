package com.example.invisible.learnc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.InputStream;

public class OnlineJudgeActivity extends AppCompatActivity implements View.OnClickListener{
    //DatabaseHelper mydb;
    private Button q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13;
    public int flag = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlinejudge);
        //mydb = new DatabaseHelper(this);
        q1 = (Button) findViewById(R.id.q1_id);
        q2 = (Button) findViewById(R.id.q2_id);
        q3 = (Button) findViewById(R.id.q3_id);
        q4 = (Button) findViewById(R.id.q4_id);
        q5 = (Button) findViewById(R.id.q5_id);
        q6 = (Button) findViewById(R.id.q6_id);
        q7 = (Button) findViewById(R.id.q7_id);
        q8 = (Button) findViewById(R.id.q8_id);
        q9 = (Button) findViewById(R.id.q9_id);
        q10 = (Button) findViewById(R.id.q10_id);
        q11 = (Button) findViewById(R.id.q11_id);
        q12 = (Button) findViewById(R.id.q12_id);
        q13 = (Button) findViewById(R.id.q13_id);


        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);
        q8.setOnClickListener(this);
        q9.setOnClickListener(this);
        q10.setOnClickListener(this);
        q11.setOnClickListener(this);
        q12.setOnClickListener(this);
        q13.setOnClickListener(this);

    }
    public void onClick(View v) {
        if (v.getId() == q1.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 0);
            startActivity(intent);

        }

        if (v.getId() == q2.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 1);
            startActivity(intent);

        }

        if (v.getId() == q3.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 2);
            startActivity(intent);

        }

        if (v.getId() == q4.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 3);
            startActivity(intent);

        }

        if (v.getId() == q5.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 4);
            startActivity(intent);

        }

        if (v.getId() == q6.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 5);
            startActivity(intent);

        }

        if (v.getId() == q7.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 6);
            startActivity(intent);

        }

        if (v.getId() == q8.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 7);
            startActivity(intent);

        }

        if (v.getId() == q9.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 8);
            startActivity(intent);

        }

        if (v.getId() == q10.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 9);
            startActivity(intent);

        }

        if (v.getId() == q11.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 10);
            startActivity(intent);

        }

        if (v.getId() == q12.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 11);
            startActivity(intent);

        }

        if (v.getId() == q13.getId()) {
            Intent intent = new Intent(OnlineJudgeActivity.this, Question1.class);
            intent.putExtra("key", 12);
            startActivity(intent);

        }
      }

}


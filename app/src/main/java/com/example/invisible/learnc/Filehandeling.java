package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Filehandeling extends AppCompatActivity implements View.OnClickListener {

    private Button file_main, fprintf, fputc, fputs, fseek, ftell, rewind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filehandeling);
        file_main = (Button) findViewById(R.id.file_hand_main_id);
        fprintf = (Button) findViewById(R.id.fprintf_id);
        fputc = (Button) findViewById(R.id.fputc_id);
        fputs = (Button) findViewById(R.id.fputs_id);
        fseek = (Button) findViewById(R.id.fseek_id);
        ftell = (Button) findViewById(R.id.ftell_id);
        rewind = (Button) findViewById(R.id.frewind_id);




        file_main.setOnClickListener(this);
        fprintf.setOnClickListener(this);
        fputc.setOnClickListener(this);
        fputs.setOnClickListener(this);
        fseek.setOnClickListener(this);
        ftell.setOnClickListener(this);
        rewind.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {

        if (v.getId() == file_main.getId()) {
            Intent intent = new Intent(Filehandeling.this, File_hand_theory.class);
            intent.putExtra("key", 0);
            startActivity(intent);
        }

        if (v.getId() == fprintf.getId()) {
            Intent intent = new Intent(Filehandeling.this, File_hand_theory.class);
            intent.putExtra("key", 1);
            startActivity(intent);
        }

        if (v.getId() == fputc.getId()) {
            Intent intent = new Intent(Filehandeling.this, File_hand_theory.class);
            intent.putExtra("key", 2);

            startActivity(intent);
        }
        if (v.getId() == fputs.getId()) {
            Intent intent = new Intent(Filehandeling.this, File_hand_theory.class);
            intent.putExtra("key", 3);
            startActivity(intent);
        }

        if (v.getId() == fseek.getId()) {
            Intent intent = new Intent(Filehandeling.this, File_hand_theory.class);
            intent.putExtra("key", 4);

            startActivity(intent);
        }
        if (v.getId() == ftell.getId()) {
            Intent intent = new Intent(Filehandeling.this, File_hand_theory.class);
            intent.putExtra("key", 5);
            startActivity(intent);
        }

        if (v.getId() == rewind.getId()) {
            Intent intent = new Intent(Filehandeling.this, File_hand_theory.class);
            intent.putExtra("key", 6);

            startActivity(intent);
        }
    }
}


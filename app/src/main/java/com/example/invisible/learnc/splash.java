package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class splash extends AppCompatActivity {


    private ProgressBar pb;
    private int prog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        pb=findViewById(R.id.probar);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

                    countdown();
                    startapp();

            }
        });
        thread.start();
    }

    public void countdown()  {


        for(prog=20;prog<=100;prog=prog+20)
        {
                try {
                Thread.sleep(1000);
                pb.setProgress(prog);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void startapp()
    {
        Intent in=new Intent(splash.this,MainActivity.class);
        startActivity(in);
        finish();
    }
}

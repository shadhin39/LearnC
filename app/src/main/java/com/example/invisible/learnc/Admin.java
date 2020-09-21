package com.example.invisible.learnc;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin extends AppCompatActivity {

    private EditText Password;
    private Button Log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Password=findViewById(R.id.admin);
        Log=findViewById(R.id.LOGIN);
        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass=Password.getText().toString();
                if(pass.equals("admin"))
                {
                    Intent in=new Intent(Admin.this,Main3Activity.class);
                    startActivity(in);
                }
                else {
                    Getalert("Error","Invalid Password");
                }
            }
        });
    }
    public void Getalert(String alt,String msg)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(alt);
        builder.setMessage(msg);
        builder.setCancelable(true);
        builder.show();
    }


}

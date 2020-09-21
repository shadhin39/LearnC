package com.example.invisible.learnc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    public static final long countdowninmils=30000;
    private ColorStateList colorst;
    private CountDownTimer ct;
    private  long timeleft;
    private TextView tv,sc,ques,time,ans;
    private Button confirmbutton;
    private Button STARTBUTTON;
    private Button NextButton;
    Question[] q=new Question[100];
    private RadioGroup grp;
    private RadioButton RB;
    private RadioButton Rb1;
    private RadioButton Rb2;
    private RadioButton Rb3;
    Studentdetails std;
    String newid;
    Random rand;
    Cursor cr;
    int y=0,z=0,score=0,a=1,number=1,count=0,stop=0;
    int check[]=new int[100];
    database d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        d=new database(this);
        SQLiteDatabase sqlite =d.getWritableDatabase();
        Intent intent=getIntent();
        newid=intent.getStringExtra("Userid");
        std=new Studentdetails(this);
        rand=new Random();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        confirmbutton=findViewById(R.id.ConfirmButton);
        STARTBUTTON=findViewById(R.id.start);
        confirmbutton=findViewById(R.id.ConfirmButton);
        ans=findViewById(R.id.answer);
        time=findViewById(R.id.Time);
        ques=findViewById(R.id.textView3);
        NextButton=findViewById(R.id.Nextid);
        STARTBUTTON.setOnClickListener(this);
        confirmbutton.setOnClickListener(this);
        NextButton.setOnClickListener(this);
        sc=findViewById(R.id.SCORE);
        Rb1=findViewById(R.id.Option_1);
        Rb2=findViewById(R.id.Option_2);
        Rb3=findViewById(R.id.Option_3);
        tv=findViewById(R.id.textView4);
        grp=findViewById(R.id.group);
        colorst=time.getTextColors();
        timeleft=countdowninmils;
    }
    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.start)
        {

            //startcountdown();
            cr=d.getCr();
            if(cr.getCount()==0)
            {
                setquestion();
               // Showdata("Error","No data");
                return;
            }
            else
            {
                StringBuffer Sb=new StringBuffer();
                while(cr.moveToNext())
                {
                    q[y]=new Question();
                    Sb.append(" Question "+cr.getString(0)+"\n");
                    q[y].question=cr.getString(0);
                    Sb.append(" Option1 "+cr.getString(1)+"\n");
                    q[y].Option1=cr.getString(1);
                    Sb.append(" Option2 "+cr.getString(2)+"\n");
                    q[y].Option2=cr.getString(2);
                    Sb.append(" Option3 "+cr.getString(3)+"\n");
                    q[y].Option3=cr.getString(3);
                    Sb.append(" Corans "+cr.getString(4)+"\n");
                    q[y].corans= Integer.parseInt(cr.getString(4));
                    y++;
                }
                ques.setText("Question:1/"+y);
                tv.setText(q[z].question);
                Rb1.setText(q[z].Option1);
                Rb2.setText(q[z].Option2);
                Rb3.setText(q[z].Option3);
                STARTBUTTON.setVisibility(View.INVISIBLE);
                check[0]=100;
                for(int i=1;i<y;i++)
                {
                    check[i]=i;
                }
            }
            Toast.makeText(Main2Activity.this,"Total  number of Questions is"+y,Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.ConfirmButton)
        {
            int selcted=grp.getCheckedRadioButtonId();
            RB=findViewById(selcted);
            confirmbutton.setVisibility(View.INVISIBLE);
            if(q[z].corans==1)
            {
                //tv.setText("The Correct answer is"+q[z].Option1);
                ans.setText("The Correct answer is"+q[z].Option1);
            }
            else if(q[z].corans==2)
            {
               // tv.setText("The Correct answer is"+q[z].Option2);
                ans.setText("The Correct answer is"+q[z].Option2);
            }
            else if(q[z].corans==3)
            {
                //tv.setText("The Correct answer is"+q[z].Option3);
                ans.setText("The Correct answer is"+q[z].Option3);
            }
            if(q[z].corans==1)
            {
                Rb1.setTextColor(Color.GREEN);

            }
            else if(q[z].corans==2)
            {

                Rb2.setTextColor(Color.GREEN);

            }
            else if(q[z].corans==3)
            {

                Rb3.setTextColor(Color.GREEN);
            }
            if(q[z].corans==1&&RB==Rb1)
            {
                score++;
                sc.setText("Score: "+score);
            }
            else if(q[z].corans==2&&RB==Rb2)
            {
                score++;
                sc.setText("Score: "+score);
            }
            else if(q[z].corans==3&&RB==Rb3)
            {
                score++;
                sc.setText("Score: "+score);
            }
            if(count>y-1)
            {
                Toast.makeText(this,"Last score is "+score,Toast.LENGTH_SHORT).show();
                Cursor stc=std.getCusor();
                while(stc.moveToNext())
                {
                    if(stc.getString(0).equals(newid))
                    {
                        if(score>Integer.parseInt(stc.getString(4)))
                        {

                            std.Updateinfo(Integer.parseInt(stc.getString(0)),stc.getString(1),stc.getString(2),stc.getString(3),score);
                            Alert("Final score"," "+score+" is your new high score");
                            Intent in=new Intent(Main2Activity.this,MainActivity.class);
                            startActivity(in);
                        }
                        else
                        {
                            Alert("Final score"," "+score+" is your  score");
                        }
                        break;
                    }
                }
            }

        }
        if(v.getId()==R.id.Nextid)
        {
            ans.setText("");
            number++;
            z=rand.nextInt(y);
            while(check[z]!=z)
            {
                z=rand.nextInt(y);
            }
                count++;
                ques.setText("Question:"+number+"/"+y);
                check[z]=500;
                grp.clearCheck();
                if(count==y-1)
                {
                    tv.setText(q[z].question);
                    Rb1.setText(q[z].Option1);
                    Rb2.setText(q[z].Option2);
                    Rb3.setText(q[z].Option3);
                    Rb1.setTextColor(Color.BLACK);
                    Rb2.setTextColor(Color.BLACK);
                    Rb3.setTextColor(Color.BLACK);
                    confirmbutton.setVisibility(View.VISIBLE);
                    NextButton.setVisibility(View.INVISIBLE);
                    count++;
                }
                else if(z<y)
                {
                    confirmbutton.setVisibility(View.VISIBLE);
                    tv.setText(q[z].question);
                    Rb1.setText(q[z].Option1);
                    Rb2.setText(q[z].Option2);
                    Rb3.setText(q[z].Option3);
                    Rb1.setTextColor(Color.BLACK);
                    Rb2.setTextColor(Color.BLACK);
                    Rb3.setTextColor(Color.BLACK);
                }
        }
    }
    public void startcountdown()
    {
        ct=new CountDownTimer(timeleft,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeleft=millisUntilFinished;
                updatecountdowntext();
            }
            @Override
            public void onFinish() {
                timeleft=0;
                updatecountdowntext();
                confirmbutton.setVisibility(View.INVISIBLE);
            }
        }.start();
    }
    public void updatecountdowntext()
    {
        int minitues= (int) ((timeleft/1000)/60);
        int second= (int) ((timeleft/1000)%60);
        String timeformated=String.format(Locale.getDefault(),"%0.2d:%0.2d",minitues,second);
        time.setText(timeformated);
        if(timeleft<10000)
        {
            time.setTextColor(Color.RED);
        }
        else
        {
            time.setTextColor(Color.CYAN);
        }
    }
    public String getinfo(String s)
    {
        String inf="";

        return inf;
    }
    public void Showdata(String g,String s)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(g);
        builder.setMessage(s);
        builder.setCancelable(true);
        builder.show();
    }
    public void ShowToast()
    {
        Toast.makeText(Main2Activity.this,q[y-1].question+" "+q[y-1].Option1+" "+q[y-1].Option2+" "+q[y-1].Option3+" "+q[y-1].corans,Toast.LENGTH_SHORT).show();
    }
    public void Alert(String alt,String msg)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(alt);
        builder.setMessage(msg);
        builder.setCancelable(true);
        builder.show();
    }
    public void setquestion()
    {
        d.Createquestion("Which of the following statements should be used to obtain a remainder after dividing 3.14 by 2.1 ?","rem = 3.14 % 2.1;","rem = modf(3.14, 2.1);","rem = fmod(3.14, 2.1);",3);
        d.Createquestion("What are the types of linkages?","Internal and External","External, Internal and None","External and None",2);
        d.Createquestion("Which of the following special symbol allowed in a variable name?","r* (asterisk)","| (pipeline)","_ (underscore)",3);
        d.Createquestion("How would you round off a value from 1.66 to 2.0?","ceil(1.66)","floor(1.66)","roundup(1.66)",1);
        d.Createquestion("The keyword used to transfer control from a function back to the calling function is ?","switch","goto","return",3);
        d.Createquestion("Which of the following function sets first n characters of a string to a given character?","strinit()","strnset()","echo \"\\\\n\";",2);
        d.Createquestion("If the two strings are identical, then strcmp() function returns","printf('\\n');","printf(\"\\\\n\")","_ (underscore)",1);
        d.Createquestion("The library function used to find the last occurrence of a character in a string is","strnstr()","laststr()","strrchr()",3);
        d.Createquestion("What is (void*)0?","Representation of NULL pointer","Representation of void pointer","Error",1);
        d.Createquestion("How many bytes are occupied by near, far and huge pointers (DOS)?","near=2 far=4 huge=4","near=4 far=8 huge=8","near=2 far=4 huge=8",1);
        d.Createquestion("A local variable is stored in ___","Code segment","Stack segment","Heap segment",2);
        d.Createquestion("Which of the following operator can be used to access value at address stored in a pointer variable?","*","#","&&",1);
        d.Createquestion("To print a float value which format specifier can be used?","%f","%lf","%Lf",1);
        d.Createquestion("Which of the above three functions are likely to cause problems with pointers?"," Only P3","Only P1 and P3","Only P1 and P2",3);
        d.Createquestion("What is (void*)0?"," Representation of NULL pointer","Representation of void pointer","Error",1);
        d.Createquestion("In which header file is the NULL macro defined?"," stdio.h","stddef.h","stdio.h and stddef.h",3);
        d.Createquestion("For 'C' programming language"," String constants can be concatenated at compile time","Size of array should be known at compile time","All of these",3);
        d.Createquestion(" What is the maximun number of dimensions an array in C may have?"," Eight","Twenty","Theoratically no limit. The only practical limits are memory size and compilers",3);
        d.Createquestion("If x is an array of interger, then the value of &x[i] is same as"," &x[i-1] + sizeof (int)","x + sizeof (int) * i","x+i",1);
        d.Createquestion(" Size of the array need not be specified, when"," Initialization","declaratrion","It is a formal parameter",1);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(ct!=null)
        {
            ct.cancel();
        }
    }
}

package com.example.ch4ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private String [] questions={"Is Magnus Bane the coolest ?","Is clave required?","Will and Jace are the best?","Isabelle is a Badass?","Is Simon a Vampire now?","Did Alec marry Magnus?"};
private boolean[] answers={true,false,true,true,false,true};
private int score=0;
private int index=0;
Button yes;
Button no;
TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                if (index <= questions.length - 1) {
                    if (answers[index] == true) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is : " + score + "/"+ questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
            }
            });
        no.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                if (index<=questions.length-1)
                {
                    if (answers[index]==false)
                    {
                        score++;
                    }
                    index++;
                    if (index<=questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your score is : "+score, Toast.LENGTH_SHORT).show();
                    }
                }


               //
            }
        });
    }
}
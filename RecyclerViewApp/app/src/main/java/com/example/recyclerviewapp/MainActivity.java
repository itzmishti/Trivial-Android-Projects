package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    Contact o1=new Contact(1,"8890164345","Jace Herondale");
    Contact o9=new Contact(2,"8890164345","Will Herondale");
    Contact o2=new Contact(3,"8890164345","Charlotte Barnwell");
    Contact o3=new Contact(4,"8890164345","Alec Lightwood");
    Contact o4=new Contact(5,"8890164345","Jem Castairs");
    Contact o10=new Contact(6,"8890164345","Simon Lewis");
    Contact o5=new Contact(7,"8890164345","Magnus Bane");
    Contact o6=new Contact(8,"8890164345","Tessa Gray");
    Contact o7=new Contact(9,"8890164345","Isabelle Lightwood");
    Contact o8=new Contact(10,"8890164345","Jordan Kyle");

Contact [] contacts={o1,o2,o3,o4,o5,o6,o7,o8,o9,o10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c=new CustomAdapter(contacts);
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}
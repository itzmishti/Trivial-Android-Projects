package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
String arr[]={"Will Herondale","Tessa Gray","Jace Herondale","Clarissa Fray","Magnus Bane","Alec Lightwood","Izzy Lightwood","Simon Lewis","Jem Castairs","Zach Herron","Jonah Marais","Corbyn Besson","Daniel Seavey","Jack Avery"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        //ArrayAdapter ad =new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        //listView.setAdapter(ad);
        com.example.listview.MishtiAdapter ad=new com.example.listview.MishtiAdapter(this,R.layout.mishti_layout,arr);
        listView.setAdapter(ad);
    }
}
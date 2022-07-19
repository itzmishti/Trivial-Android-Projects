package com.example.myapplication2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class MainActivity extends AppCompatActivity {
    CircleMenu circleMenu;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleMenu = findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#F38BA0"), R.mipmap.icon_menu, R.mipmap.icon_cancel)
                .addSubMenu(Color.parseColor("#F38BA0"), R.mipmap.icon_home)
                .addSubMenu(Color.parseColor("#F38BA0"), R.mipmap.icon_search)
                .addSubMenu(Color.parseColor("#F38BA0"), R.mipmap.icon_notify)
                .addSubMenu(Color.parseColor("#F38BA0"), R.mipmap.icon_setting)
                .addSubMenu(Color.parseColor("#F38BA0"), R.mipmap.icon_gps)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        switch (index) {
                            case 0:
                                Toast.makeText(MainActivity.this,"home",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("B5EAEA"));
                            case 1:
                                Toast.makeText(MainActivity.this,"search",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("EDF6E5"));
                            case 2:
                                Toast.makeText(MainActivity.this,"notifiaction",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("FFBCBC"));
                            case 3:
                                Toast.makeText(MainActivity.this,"setting",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("B5EAEA"));
                            case 4:
                                Toast.makeText(MainActivity.this,"gps",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("B5EAEA"));



                        }
                    }

                });

        () {
        }
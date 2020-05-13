package com.example.recyclerviewproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment retainedInstance = fm.findFragmentById(R.id.list_fragment);

        if (retainedInstance == null){
            FragmentTransaction ft =fm.beginTransaction();
            TodoFragment todoFragment = TodoFragment.newInstance();
            ft.add(R.id.list_fragment,todoFragment);
            ft.commit();
        }


    }

}

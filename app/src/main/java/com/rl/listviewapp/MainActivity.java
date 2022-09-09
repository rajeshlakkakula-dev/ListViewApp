package com.rl.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    String names[] = {
            "Abhi", "Aha" ,"cam", "rof" , "kate" ,"vinod","rajesh lakkakula","rehman" ,"ravi","sujith","sam","vijay" ,"hema","data"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter;

        arrayAdapter = new ArrayAdapter<String>(
                this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                names
        );

        listView.setAdapter(arrayAdapter);




    }
}
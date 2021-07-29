package com.manijee.control_part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView view;
ArrayList studentsList;
ArrayAdapter adapter;
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.myprogress);
        view=findViewById(R.id.mygrid);

        studentsList=new ArrayList();
        studentsList.add("Ravi");
        studentsList.add("Gaurav");
        studentsList.add("Abhisek");
        studentsList.add("Rimjhim");
        studentsList.add("mouli");
        studentsList.add("sumit");

       adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,studentsList);
       view.setAdapter(adapter);
       //progressBar.setVisibility(View.GONE);

    }
}
package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerview;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<MyDataModel> newslist;
    MyAdapter myAdapter;
    FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerview = findViewById(R.id.recyclerview);
        floatingActionButton = findViewById(R.id.icon);

        newslist = new ArrayList<>();


        newslist.add(new MyDataModel("news1","desc1",R.drawable.plane));
        newslist.add(new MyDataModel("news2","desc2",R.drawable.plane));
        newslist.add(new MyDataModel("news3","desc3",R.drawable.plane));
        newslist.add(new MyDataModel("news4","desc4",R.drawable.plane));
        newslist.add(new MyDataModel("news5","desc5",R.drawable.plane));
        newslist.add(new MyDataModel("news6","desc6",R.drawable.plane));

        layoutManager = new LinearLayoutManager(this);//,LinearLayoutManager.HORIZONTAL,false);

        myAdapter = new MyAdapter(this, newslist);

        mRecyclerview.setAdapter(myAdapter);
        mRecyclerview.setLayoutManager(layoutManager);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
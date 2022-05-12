package com.example.a511j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open();
    }

    void open() {
        recyclerView = findViewById(R.id.main_R_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.raw.c_2);
        list.add(R.raw.cycling);
        list.add(R.raw.facebook);
        Adapters adapters = new Adapters(this, list);
        recyclerView.setAdapter(adapters);
    }
}
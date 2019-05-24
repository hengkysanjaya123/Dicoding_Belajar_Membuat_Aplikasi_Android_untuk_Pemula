package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("My Coffee");

        CoffeeData coffeeData = new CoffeeData();

        RecyclerView rvResult = findViewById(R.id.rvResult);
        rvResult.setLayoutManager(new LinearLayoutManager(this));
        rvResult.setAdapter(new CoffeeAdapter(this, coffeeData.getCoffeeList()));
    }
}

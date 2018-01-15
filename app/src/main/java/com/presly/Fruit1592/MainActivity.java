package com.presly.Fruit1592;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Fruit> fruits = new ArrayList<>();
    private ListView listViewFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewFruits = (ListView)findViewById(R.id.listViewFruits);


        fruits.add(new Fruit("banana", 4, R.drawable.banana));
        fruits.add(new Fruit("apple", 2, R.drawable.apple));
        fruits.add(new Fruit("coconut", 3, R.drawable.coconut));
        fruits.add(new Fruit("lemon", 4, R.drawable.lemon));
        fruits.add(new Fruit("strawberry", 2, R.drawable.strawberry));
        fruits.add(new Fruit("watermelon", 6, R.drawable.watermelon));
        fruits.add(new Fruit("starfruit", 8, R.drawable.starfruit));
        fruits.add(new Fruit("cherry", 10, R.drawable.cherry));

        FruitsAdapter fruitsAdapter = new FruitsAdapter(this, fruits);

        listViewFruits.setAdapter(fruitsAdapter);

    }
}

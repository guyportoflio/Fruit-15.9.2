package com.presly.Fruit1592;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.presly.Fruit1592.MainActivity;

import java.util.ArrayList;

/**
 * Created by presly on 14/01/2018.
 */

class FruitsAdapter extends ArrayAdapter<Fruit> {

    private ArrayList<Fruit> fruits;
    private LayoutInflater layoutInflater;

    public FruitsAdapter(MainActivity mainActivity, ArrayList<Fruit> fruits) {
        super(mainActivity, 0 , fruits);

        this.fruits = fruits;
        this.layoutInflater = (LayoutInflater)mainActivity.getSystemService(mainActivity.LAYOUT_INFLATER_SERVICE);


    }

    //return inflated layout each time
    public View getView(int position, View convertView, ViewGroup parent){

        //get current fruit from list
        Fruit fruit = fruits.get(position);


        //create layout for current object
        LinearLayout linearLayout = (LinearLayout)layoutInflater.inflate(R.layout.item_fruit, null);


        //set the imageView
        ImageView imageFruit = (ImageView)linearLayout.findViewById(R.id.imageViewFruit);
        imageFruit.setBackgroundResource(fruit.getImageID());

        //set fruitName
        TextView fruitName = (TextView)linearLayout.findViewById(R.id.textFruitName);
        fruitName.setText(fruit.getFruitName());

        //set price
        TextView price = (TextView)linearLayout.findViewById(R.id.priceViewFruit);
       price.setText(String.valueOf(fruit.getPrice()));
      //  price.setInputType(fruit.getPrice());


        return linearLayout;
    }


}

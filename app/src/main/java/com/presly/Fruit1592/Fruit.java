package com.presly.Fruit1592;

/**
 * Created by presly on 14/01/2018.
 */

public class Fruit {

    private String fruitName;
    private int price, imageID;


         //empty constructor
         public Fruit(){
         }

        public Fruit(String fruitName, int price, int imageID){
        setFruitName(fruitName);
        setPrice(price);
        setImageID(imageID);
    }


    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getPrice() {

        return price;
    }

    public int getImageID() {
        return imageID;
    }
}

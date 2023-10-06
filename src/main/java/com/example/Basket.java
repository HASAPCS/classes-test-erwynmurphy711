package com.example;

import java.util.ArrayList;

public class Basket {
    private int capacity;
    private ArrayList<Fruit> fruitlist;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.fruitlist = new ArrayList<Fruit>();
        // TODO: Initialize the attributes (and initialize the fruits list)
    }

    public void addFruit(Fruit fruit) {
        if(this.fruitlist.size()<this.capacity){
            this.fruitlist.add(fruit);
        }
        // TODO: Add the fruit to the basket IF THERE IS SPACE!
    }

    public void removeFruit(Fruit fruit) {
        this.fruitlist.remove(fruit);
        // TODO: Remove the fruit from the basket
    }
    public ArrayList<Fruit> getFruits(){
        return this.fruitlist;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setFruits(ArrayList<Fruit> newFruits){
        this.fruitlist = newFruits;
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
}

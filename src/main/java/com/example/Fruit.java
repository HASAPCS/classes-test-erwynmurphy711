package com.example;

public class Fruit {
    private String name;
    private String color;
    private String taste;
    private double weight;

    public Fruit(String name, String color, String taste, double weight) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.weight = weight;
        // TODO: Initialize the attributes
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public String getTaste(){
        return taste;
    }
    public double getWeight(){
        return weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
         this.color = color;
    }
    public void setTaste(String taste){
        this.taste = taste;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
}

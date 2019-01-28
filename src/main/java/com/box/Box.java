package com.box;

public class Box {
    String name;
    int price;
    float length;
    float width;
    float height;

    public Box(String name, int price, float length, float width, float height) {
        this.name = name;
        this.price = price;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean validate(float length, float width, float height) {
        if (length <= this.length && width <= this.width && height <= this.height){
            return true;
        }else{
            return false;
        }
    }
}

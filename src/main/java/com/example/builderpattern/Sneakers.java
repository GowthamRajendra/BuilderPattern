package com.example.builderpattern;

public class Sneakers extends Footwear{
    private String colour;
    private int size;
    private String fastenMethod;

    @Override
    public String getName() {
        return "Sneakers";
    }

    @Override
    public float getPrice() {
        return 140.0f;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String getFastenMethod() {
        return fastenMethod;
    }

    @Override
    public void setFastenMethod(String fastenMethod) {
        this.fastenMethod = fastenMethod;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}

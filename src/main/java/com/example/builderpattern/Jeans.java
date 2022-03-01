package com.example.builderpattern;

public class Jeans extends Bottom{
    private String colour;
    private int waistSize;
    private int length;

    @Override
    public String getName() {
        return "Jeans";
    }

    @Override
    public float getPrice() {
        return 30.0f;
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
    public int getWaistSize() {
        return waistSize;
    }

    @Override
    public void setWaistSize(int waistSize) {
        this.waistSize = waistSize;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }
}

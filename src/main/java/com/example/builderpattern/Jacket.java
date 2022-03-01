package com.example.builderpattern;

public class Jacket extends OuterTop{
    private String colour;
    private boolean hasHood;
    private String size;

    @Override
    public String getName() {
        return "Jacket";
    }

    @Override
    public float getPrice() {
        return 175.0f;
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
    public boolean getHood() {
        return hasHood;
    }

    @Override
    public void setHood(boolean hasHood) {
        this.hasHood = hasHood;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getSize() {
        return size;
    }
}

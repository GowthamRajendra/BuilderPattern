package com.example.builderpattern;

public class Windbreaker extends OuterTop{
    private String colour;
    private boolean hasHood;
    private String size;

    @Override
    public String getName() {
        return "Windbreaker";
    }

    @Override
    public float getPrice() {
        return 200.0f;
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

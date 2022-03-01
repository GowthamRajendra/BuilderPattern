package com.example.builderpattern;

public class Watch implements Accessories{
    private String quality;
    private float price = 75.0f;

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int multiplier) {
        this.price *= multiplier;
    }

    @Override
    public String getName() {
        return "Watch";
    }

    @Override
    public String getQuality() {
        return quality;
    }

    @Override
    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return getQuality() + " " + getName() + "\n\tCost: " + getPrice();
    }
}

package com.example.builderpattern;

public class Necklace implements Accessories{
    private String quality;
    private float price = 300.0f;

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
        return "Necklace";
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

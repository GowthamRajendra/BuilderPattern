package com.example.builderpattern;

public class TShirt extends Top{
    private String colour;
    private boolean hasLongSleeve;
    private String size;

    @Override
    public String getName() {
        return "T-Shirt";
    }

    @Override
    public float getPrice() {
        return 20.0f;
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
    public void setLongSleeve(boolean hasLongSleeve) {
        this.hasLongSleeve = hasLongSleeve;
    }

    @Override
    public boolean getLongSleeve() {
        return hasLongSleeve;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }
}

package com.example.builderpattern;

public abstract class Bottom implements Clothes {
    public abstract String getName();
    public abstract float getPrice();
    public abstract String getColour();
    public abstract void setColour(String colour);
    public abstract void setLength(int Length);
    public abstract int getLength();
    public abstract void setWaistSize(int waistSize);
    public abstract int getWaistSize();

    public String toString() {
        return  getName() + " - Length: " + getLength() + ". Waist Size: " + getWaistSize() + "\n\tCost: " + getPrice();
    }
}

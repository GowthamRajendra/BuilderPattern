package com.example.builderpattern;

public abstract class Footwear implements Clothes {
    public abstract String getName();
    public abstract float getPrice();
    public abstract String getColour();
    public abstract void setColour(String colour);
    public abstract void setFastenMethod(String fastenMethod);
    public abstract String getFastenMethod();
    public abstract void setSize(int size);
    public abstract int getSize();

    public String toString() {
        return  "Size " + getSize() + " " + getName() + " with " + getFastenMethod() + "\n\tCost: " + getPrice();
    }
}

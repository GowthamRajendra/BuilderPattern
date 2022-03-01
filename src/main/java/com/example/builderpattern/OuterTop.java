package com.example.builderpattern;

public abstract class OuterTop implements Clothes {
    public abstract String getName();
    public abstract float getPrice();
    public abstract String getColour();
    public abstract void setColour(String colour);
    public abstract void setHood(boolean hasHood);
    public abstract boolean getHood();
    public abstract void setSize(String size);
    public abstract String getSize();

    public String toString() {
        String temp;
        if (getHood())
        {
            temp = " with ";
        }
        else{
            temp = " without ";
        }
        return  getSize() + " " + getName() + temp + "a hood" + "\n\tCost: " + getPrice();
    }
}

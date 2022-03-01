package com.example.builderpattern;

public abstract class Top implements Clothes {
    public abstract String getName();
    public abstract float getPrice();
    public abstract String getColour();
    public abstract void setColour(String colour);
    public abstract void setLongSleeve(boolean hasLongSleeve);
    public abstract boolean getLongSleeve();
    public abstract void setSize(String size);
    public abstract String getSize();

    public String toString() {
        String temp;
        if (getLongSleeve())
        {
            temp = " with ";
        }
        else{
            temp = " without ";
        }
        return getSize() + " " + getName() + temp + "long sleeves" + "\n\tCost: " + getPrice();
    }
}

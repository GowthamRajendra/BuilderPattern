package com.example.builderpattern;

public abstract class Footwear implements Clothes {
    public abstract String getName();
    public abstract float getPrice();
    public abstract String getColour();
    public abstract void setColour(String colour);

    /**
     * sets the fasten method for footwear (velcro or laces)
     *
     * @param fastenMethod fasten method for footwear
     */
    public abstract void setFastenMethod(String fastenMethod);

    /**
     * returns fasten method for footwear (velcro or laces)
     *
     * @return fasten method for footwear
     */
    public abstract String getFastenMethod();

    /**
     * sets size of footwear (integer between 1 and 5)
     *
     * @param size - size of footwear
     */
    public abstract void setSize(int size);

    /**
     * returns size of footwear (integer between 1 and 5)
     *
     * @return size of footwear
     */
    public abstract int getSize();

    /**
     * returns a string representation of the footwear class
     *
     * @return - a string representation of the footwear class
     */
    public String toString() {
        return  "Size " + getSize() + " " + getName() + " with " + getFastenMethod() + "\n\tCost: " + getPrice();
    }
}

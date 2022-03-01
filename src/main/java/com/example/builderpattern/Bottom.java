package com.example.builderpattern;

public abstract class Bottom implements Clothes {
    public abstract String getName();
    public abstract float getPrice();
    public abstract String getColour();
    public abstract void setColour(String colour);

    /**
     * sets the length of the bottoms (integer between 1 and 5)
     *
     * @param Length the length of the bottoms
     */
    public abstract void setLength(int Length);

    /**
     * returns the length of the bottoms (integer between 1 and 5)
     *
     * @return the length of the bottoms
     */
    public abstract int getLength();

    /**
     * sets the waist size of the bottoms (integer between 1 and 5)
     *
     * @param waistSize - the waist size of the bottoms
     */
    public abstract void setWaistSize(int waistSize);

    /**
     * returns the waist size of the bottoms (integer between 1 and 5)
     *
     * @return - the waist size of the bottoms
     */
    public abstract int getWaistSize();

    /**
     * returns a string representation of the bottoms class
     *
     * @return - a string representation of the bottoms class
     */
    public String toString() {
        return  getName() + " - Length: " + getLength() + ". Waist Size: " + getWaistSize() + "\n\tCost: " + getPrice();
    }
}

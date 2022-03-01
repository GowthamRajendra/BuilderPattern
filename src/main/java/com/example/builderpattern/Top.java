package com.example.builderpattern;

public abstract class Top implements Clothes {
    public abstract String getName();
    public abstract float getPrice();
    public abstract String getColour();
    public abstract void setColour(String colour);

    /**
     * sets if the top has long sleeves or not
     *
     * @param hasLongSleeve a boolean that defines if the top has long sleeves or not
     */
    public abstract void setLongSleeve(boolean hasLongSleeve);

    /**
     * gets if the top has long sleeves or not
     *
     * @return a boolean that defines if the top has long sleeves or not
     */
    public abstract boolean getLongSleeve();

    /**
     * sets size of top (small, medium, large)
     *
     * @param size size of top
     */
    public abstract void setSize(String size);

    /**
     * gets size of top (small, medium, large)
     *
     * @return size of top
     */
    public abstract String getSize();

    /**
     * returns a string representation of the top class
     *
     * @return - a string representation of the top class
     */
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

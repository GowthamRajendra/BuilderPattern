package com.example.builderpattern;

public abstract class OuterTop implements Clothes {
    public abstract String getName();
    public abstract float getPrice();
    public abstract String getColour();
    public abstract void setColour(String colour);

    /**
     * sets if the outer top has a hood or not
     *
     * @param hasHood boolean that defines if the outer top has a hood or not
     */
    public abstract void setHood(boolean hasHood);

    /**
     * gets if the outer top has a hood or not
     *
     * @return boolean that defines if the outer top has a hood or not
     */
    public abstract boolean getHood();

    /**
     * sets the size of outer top (small, medium, large)
     *
     * @param size size of outer top
     */
    public abstract void setSize(String size);

    /**
     * gets size of outer top (small, medium, large)
     *
     * @return size of outer top
     */
    public abstract String getSize();

    /**
     * returns a string representation of the outer top class
     *
     * @return - a string representation of the outer top class
     */
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

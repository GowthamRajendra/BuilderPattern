package com.example.builderpattern;

public interface Clothes {
    /***
     * returns the name of the clothes
     *
     * @return name of clothes
     */
    String getName();

    /***
     * returns the price of the clothes
     *
     * @return price of clothes
     */
    float getPrice();

    /***
     * returns the price of the clothes
     *
     * @return price of clothes
     */
    String getColour();

    /**
     * sets the colour of the clothes
     *
     * @param colour the colour of the clothes
     */
    void setColour(String colour);
}

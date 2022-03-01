package com.example.builderpattern;

public interface Accessories {
    /***
     * returns the name of the accessory
     *
     * @return name of accessory
     */
    String getName();

    /***
     * returns the price of the accessory
     *
     * @return price of accessory
     */
    float getPrice();

    /***
     * calculates price of accessory based on quality and sets that as the proce
     *
     * @param multiplier amount to multiply the original price by
     */
    void setPrice(int multiplier);

    /**
     * sets the quality of the accessory
     *
     * @param quality quality of accessory
     */
    void setQuality(String quality);

    /**
     * returns the quality of the accessory
     *
     * @return the quality of the accessory
     */
    String getQuality();

    /**
     * returns a string representation of the accessory
     *
     * @return string representation of the accessory
     */
    String toString();
}

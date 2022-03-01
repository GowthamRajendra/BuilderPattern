package com.example.builderpattern;

public interface Accessories {
    String getName();
    float getPrice();
    void setPrice(int multiplier);
    void setQuality(String quality);
    String getQuality();
    String toString();
}

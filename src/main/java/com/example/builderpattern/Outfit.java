package com.example.builderpattern;

import java.util.ArrayList;

public class Outfit {
    // list of clothes and accessories that make up the outfit
    final private ArrayList<Clothes> outfit = new ArrayList<>();
    final private ArrayList<Accessories> accessories = new ArrayList<>();

    /**
     * adds specified clothes to the list
     *
     * @param clothes an instance of the clothes class
     */
    public void addClothes(Clothes clothes)
    {
        outfit.add(clothes);
    }

    /**
     * adds specified accessory to list
     *
     * @param accessory an instance of the accessories class
     */
    public void addAccessory(Accessories accessory)
    {
        accessories.add(accessory);
    }

    /**
     * calculates the total price of the outfit
     *
     * @return total price of outfit
     */
    public float priceTotal()
    {
        float total = 0.0f;

        for(Clothes clothes : outfit)
        {
            total += clothes.getPrice();
        }

        for(Accessories accessory : accessories)
        {
            total += accessory.getPrice();
        }

        return total;
    }

    /**
     * returns the string representation of the whole outfit
     *
     * @return string representation of class
     */
    @Override
    public String toString() {
        StringBuilder finalOutfit = new StringBuilder();

        for(Clothes cloth : outfit)
        {
            finalOutfit.append(cloth.toString()).append("\n");
        }
        for(Accessories access : accessories)
        {
            finalOutfit.append(access.toString()).append("\n");
        }

        finalOutfit.append("\nTotal price of outfit: ").append(priceTotal());

        return finalOutfit.toString();
    }
}

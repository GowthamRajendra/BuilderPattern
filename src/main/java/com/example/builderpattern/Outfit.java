package com.example.builderpattern;

import java.util.ArrayList;

public class Outfit {
    private ArrayList<Clothes> outfit = new ArrayList<Clothes>();
    private ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    public void addClothes(Clothes clothes)
    {
        outfit.add(clothes);
    }

    public void addAccessory(Accessories accessory)
    {
        accessories.add(accessory);
    }

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

    @Override
    public String toString() {
        String finalOutfit = "";

        for(Clothes cloth : outfit)
        {
            finalOutfit += cloth.toString() + "\n";
        }
        for(Accessories access : accessories)
        {
            finalOutfit += access.toString() + "\n";
        }

        finalOutfit += "\nTotal price of outfit: " + priceTotal();

        return finalOutfit;
    }
}

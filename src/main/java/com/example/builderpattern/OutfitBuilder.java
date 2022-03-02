package com.example.builderpattern;

public class OutfitBuilder {
    final private Outfit outfit = new Outfit();

    public void buildOuterTop(String name, String colour, Boolean hasHood, String size)
    {
        if(name.equals("Jacket")) {
            Jacket jacket = new Jacket();
            jacket.setColour(colour);
            jacket.setHood(hasHood);
            jacket.setSize(size);

            this.outfit.addClothes(jacket);
        }
        else
        {
            Windbreaker windbreaker = new Windbreaker();
            windbreaker.setColour(colour);
            windbreaker.setHood(hasHood);
            windbreaker.setSize(size);

            this.outfit.addClothes(windbreaker);
        }

    }

    public void buildAccessory(String name, String quality)
    {
        int multiplier;

        if(quality.equals(("Cheap")))
        {
            multiplier = 1;
        }
        else if(quality.equals("Regular"))
        {
            multiplier = 3;
        }
        else
        {
            multiplier = 5;
        }

        if(name.equals("Necklace")) {
            Necklace necklace = new Necklace();
            necklace.setQuality(quality);
            necklace.setPrice(multiplier);

            this.outfit.addAccessory(necklace);
        }
        else if (name.equals("Bracelet"))
        {
            Bracelet bracelet = new Bracelet();
            bracelet.setQuality(quality);
            bracelet.setPrice(multiplier);

            this.outfit.addAccessory(bracelet);
        }
        else
        {
            Watch watch = new Watch();
            watch.setQuality(quality);
            watch.setPrice(multiplier);

            this.outfit.addAccessory(watch);
        }

    }

    public void buildBottom(String name, String colour, int length, int waistSize)
    {
        if(name.equals("Shorts"))
        {
            Shorts shorts = new Shorts();
            shorts.setColour(colour);
            shorts.setLength(length);
            shorts.setWaistSize(waistSize);

            this.outfit.addClothes(shorts);
        }
        else
        {
            Jeans jeans = new Jeans();
            jeans.setColour(colour);
            jeans.setLength(length);
            jeans.setWaistSize(waistSize);

            this.outfit.addClothes(jeans);
        }
    }

    public void buildFootwear(String name, String colour, int size, String fastenMethod)
    {
        if(name.equals("Sneakers")) {
            Sneakers sneakers = new Sneakers();
            sneakers.setColour(colour);
            sneakers.setSize(size);
            sneakers.setFastenMethod(fastenMethod);

            this.outfit.addClothes(sneakers);
        }
        else
        {
            Boots boots = new Boots();
            boots.setColour(colour);
            boots.setFastenMethod(fastenMethod);
            boots.setSize(size);

            this.outfit.addClothes(boots);
        }
    }

    public void buildTop(String name, String colour, String size, Boolean hasLongSleeve)
    {
        if(name.equals("T-Shirt"))
        {
            TShirt tShirt = new TShirt();
            tShirt.setColour(colour);
            tShirt.setSize(size);
            tShirt.setLongSleeve(hasLongSleeve);

            this.outfit.addClothes(tShirt);
        }
        else {
            ButtonShirt buttonShirt = new ButtonShirt();
            buttonShirt.setColour(colour);
            buttonShirt.setSize(size);
            buttonShirt.setLongSleeve(hasLongSleeve);

            this.outfit.addClothes(buttonShirt);
        }
    }

    public Outfit buildOutfit()
    {
        return this.outfit;
    }

}

package com.example.builderpattern;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class Director extends Application {
    @Override
    public void start(Stage stage)  {

        OutfitBuilder outfitBuilder = new OutfitBuilder();

        stage.setTitle("Outfit Selector");

        GridPane gp = new GridPane();
        gp.setPadding( new Insets(10) );
        gp.setHgap(10);
        gp.setVgap(8);

        Label infoLbl = new Label("This is the Outfit Selector. This application will simulate " +
                "choosing and purchasing simple outfits at a store.");
        gp.add(infoLbl, 0,0,6,1);

        Label topLbl = new Label("Choose a Top and its specifications:");
        gp.add(topLbl, 0,1);

        ComboBox<String> topBox = new ComboBox<>();
        topBox.setPromptText("Top");

        topBox.getItems().add("T-Shirt");
        topBox.getItems().add("Button Shirt");

        gp.add(topBox,1,1);

        ComboBox<String> sizeTop = new ComboBox<>();

        sizeTop.getItems().add("Small");
        sizeTop.getItems().add("Medium");
        sizeTop.getItems().add("Large");
        sizeTop.setPromptText("Size");

        gp.add(sizeTop,3,1);

        ComboBox<String> colourTop = new ComboBox<>();

        colourTop.getItems().add("Black");
        colourTop.getItems().add("White");
        colourTop.getItems().add("Red");
        colourTop.getItems().add("Green");
        colourTop.getItems().add("Blue");
        colourTop.setPromptText("Colour");

        gp.add(colourTop,2,1);

        CheckBox sleeveChk = new CheckBox("Long Sleeve");
        gp.add(sleeveChk,4,1);

        // ----------------------------------------------------------------------------

        Label outerTopLbl = new Label("Choose an Outer Top and its specifications:");
        gp.add(outerTopLbl, 0,2);

        ComboBox<String> outerTopBox = new ComboBox<>();
        outerTopBox.setPromptText("Outer Top");

        outerTopBox.getItems().add("Jacket");
        outerTopBox.getItems().add("Windbreaker");

        gp.add(outerTopBox,1,2);

        ComboBox<String> sizeOuterTop = new ComboBox<>();

        sizeOuterTop.getItems().add("Small");
        sizeOuterTop.getItems().add("Medium");
        sizeOuterTop.getItems().add("Large");
        sizeOuterTop.setPromptText("Size");

        gp.add(sizeOuterTop,3,2);

        ComboBox<String> colourOuterTop = new ComboBox<>();

        colourOuterTop.getItems().add("Black");
        colourOuterTop.getItems().add("White");
        colourOuterTop.getItems().add("Red");
        colourOuterTop.getItems().add("Green");
        colourOuterTop.getItems().add("Blue");
        colourOuterTop.setPromptText("Colour");

        gp.add(colourOuterTop,2,2);

        CheckBox hoodChk = new CheckBox("Hood");
        gp.add(hoodChk,4,2);

        // ----------------------------------------------------------------------------

        Label bottomsLbl = new Label("Choose a Bottom and its specifications:");
        gp.add(bottomsLbl, 0,3);

        ComboBox<String> bottomBox = new ComboBox<>();
        bottomBox.setPromptText("Bottom");

        bottomBox.getItems().add("Jeans");
        bottomBox.getItems().add("Shorts");

        gp.add(bottomBox,1,3);

        ComboBox<Integer> bottomWSBox = new ComboBox<>();

        ArrayList<Integer> waistArr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        bottomWSBox.getItems().addAll(waistArr);
        bottomWSBox.setPromptText("Waist Size");

        gp.add(bottomWSBox,3,3);

        ComboBox<Integer> bottomLenBox = new ComboBox<>();

        ArrayList<Integer> lenArr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        bottomLenBox.getItems().addAll(lenArr);
        bottomLenBox.setPromptText("Length");

        gp.add(bottomLenBox,4,3);

        ComboBox<String> colourBottom = new ComboBox<>();

        colourBottom.getItems().add("Black");
        colourBottom.getItems().add("White");
        colourBottom.getItems().add("Red");
        colourBottom.getItems().add("Green");
        colourBottom.getItems().add("Blue");
        colourBottom.setPromptText("Colour");

        gp.add(colourBottom,2,3);

        // ----------------------------------------------------------------------------

        Label footwearLbl = new Label("Choose a footwear and its specifications:");
        gp.add(footwearLbl, 0,4);

        ComboBox<String> footwearBox = new ComboBox<>();
        footwearBox.setPromptText("Footwear");

        footwearBox.getItems().add("Sneakers");
        footwearBox.getItems().add("Boots");

        gp.add(footwearBox,1,4);

        ComboBox<Integer> footwearSizeBox = new ComboBox<>();

        ArrayList<Integer> sizeBottom = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        footwearSizeBox.getItems().addAll(sizeBottom);
        footwearSizeBox.setPromptText("Size");
        footwearSizeBox.setMaxSize(200,200);

        gp.add(footwearSizeBox,3,4);

        ComboBox<String> colourFootwear = new ComboBox<>();

        colourFootwear.getItems().add("Black");
        colourFootwear.getItems().add("White");
        colourFootwear.getItems().add("Red");
        colourFootwear.getItems().add("Green");
        colourFootwear.getItems().add("Blue");
        colourFootwear.setPromptText("Colour");

        gp.add(colourFootwear,2,4);

        ComboBox<String> fastenBox = new ComboBox<>();
        fastenBox.getItems().add("Laces");
        fastenBox.getItems().add("Velcro");
        fastenBox.setPromptText("Fasten Method");

        gp.add(fastenBox,4,4);

        // ----------------------------------------------------------------------------

        Label ques = new Label("How many accessories would you like?");
        gp.add(ques,0,5);

        RadioButton none = new RadioButton("None");
        RadioButton one = new RadioButton("1");
        RadioButton two = new RadioButton("2");
        RadioButton three = new RadioButton("3");

        ToggleGroup accessOptGp = new ToggleGroup();

        none.setToggleGroup(accessOptGp);
        one.setToggleGroup(accessOptGp);
        two.setToggleGroup(accessOptGp);
        three.setToggleGroup(accessOptGp);

        gp.add(none,1,5);
        gp.add(one, 2,5);
        gp.add(two, 3,5);
        gp.add(three, 4,5);


        Label accessLbl = new Label("Choose an accessory and its specifications:");

        ComboBox<String> access = new ComboBox<>();
        access.setPromptText("Accessory");

        access.getItems().add("Watch");
        access.getItems().add("Necklace");
        access.getItems().add("Bracelet");

        ComboBox<String> qualityBox = new ComboBox<>();
        qualityBox.setPromptText("Quality");

        qualityBox.getItems().add("Cheap");
        qualityBox.getItems().add("Regular");
        qualityBox.getItems().add("Premium");

        // --

        Label accessLbl1 = new Label("Choose an accessory and its specifications:");

        ComboBox<String> access1 = new ComboBox<>();
        access1.setPromptText("Accessory");

        access1.getItems().add("Watch");
        access1.getItems().add("Necklace");
        access1.getItems().add("Bracelet");

        ComboBox<String> qualityBox1 = new ComboBox<>();
        qualityBox1.setPromptText("Quality");

        qualityBox1.getItems().add("Cheap");
        qualityBox1.getItems().add("Regular");
        qualityBox1.getItems().add("Premium");

        // --

        Label accessLbl2 = new Label("Choose an accessory and its specifications:");

        ComboBox<String> access2 = new ComboBox<>();
        access2.setPromptText("Accessory");

        access2.getItems().add("Watch");
        access2.getItems().add("Necklace");
        access2.getItems().add("Bracelet");

        ComboBox<String> qualityBox2 = new ComboBox<>();
        qualityBox2.setPromptText("Quality");

        qualityBox2.getItems().add("Cheap");
        qualityBox2.getItems().add("Regular");
        qualityBox2.getItems().add("Premium");

        Button submit = new Button("Finalize Outfit");

        accessOptGp.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            none.setDisable(true);
            one.setDisable(true);
            two.setDisable(true);
            three.setDisable(true);
            int rowIndex = 5;
            if(one.isSelected() || two.isSelected() || three.isSelected())
            {
                gp.add(accessLbl, 0,6);
                gp.add(access,1,6);
                gp.add(qualityBox,2,6);
                rowIndex=6;

                if(two.isSelected() || three.isSelected())
                {
                    gp.add(accessLbl1, 0,7);
                    gp.add(access1,1,7);
                    gp.add(qualityBox1,2,7);
                    rowIndex=7;

                    if(three.isSelected())
                    {
                        gp.add(accessLbl2, 0,8);
                        gp.add(access2,1,8);
                        gp.add(qualityBox2,2,8);
                        rowIndex=8;
                    }
                }
            }

            gp.add(submit,1,rowIndex+1);
        });

        // ----------------------------------------------------------------------------

        submit.setOnAction(event -> {
            gp.setDisable(true);

            outfitBuilder.buildTop(
                    topBox.getValue(), colourTop.getValue(),
                    sizeTop.getValue(),sleeveChk.isSelected()
            );

            outfitBuilder.buildOuterTop(
                    outerTopBox.getValue(),colourOuterTop.getValue(),
                    hoodChk.isSelected(), sizeOuterTop.getValue()
            );

            outfitBuilder.buildBottom(
                    bottomBox.getValue(),colourBottom.getValue(),
                    bottomLenBox.getValue(), bottomWSBox.getValue()
            );

            outfitBuilder.buildFootwear(
                    footwearBox.getValue(),colourFootwear.getValue(),
                    footwearSizeBox.getValue(),fastenBox.getValue()
            );

            if(access.getValue() != null)
            {
                outfitBuilder.buildAccessory(access.getValue(),qualityBox.getValue());
            }
            if(access1.getValue() != null)
            {
                outfitBuilder.buildAccessory(access1.getValue(),qualityBox1.getValue());
            }
            if(access2.getValue() != null)
            {
                outfitBuilder.buildAccessory(access2.getValue(),qualityBox2.getValue());
            }

            HBox hBox = new HBox();
            Label newOutfit = new Label(outfitBuilder.buildOutfit().toString());
            hBox.getChildren().add(newOutfit);
            hBox.setAlignment(Pos.CENTER);

            Scene newScene = new Scene(hBox);
            Stage newStage = new Stage();
            newStage.setTitle("Outfit");
            newStage.setScene(newScene);
            newStage.setWidth(400);
            newStage.setHeight(400);
            newStage.show();
        });

        Scene scene = new Scene(gp);
        stage.setScene(scene);
        stage.setWidth(800);
        stage.setHeight(370);


        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
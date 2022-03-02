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

        // creating GridPane and its specifications
        GridPane gp = new GridPane();
        gp.setPadding( new Insets(10) );
        gp.setHgap(10);
        gp.setVgap(8);

        // creating an ArrayList that will hold the sizes for certain clothing
        // that can be added to combo box in one line
        ArrayList<String> colourArr = new ArrayList<>(Arrays.asList("Black","White", "Red", "Green","Blue"));

        // creating an ArrayList that will hold the sizes for certain clothing
        // that can be added to combo box in one line
        ArrayList<Integer> sizeArr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // creating an ArrayList that will hold the sizes for certain clothing
        // that can be added to combo box in one line
        ArrayList<String> sizeStrArray = new ArrayList<>(Arrays.asList("Small", "Medium", "Large"));

        // a message to explain to the user what the application is for
        Label infoLbl = new Label("This is the Outfit Selector. This application will simulate " +
                "choosing and purchasing simple outfits at a store.");
        gp.add(infoLbl, 0,0,6,1);

        // specifying which clothing the user is choosing
        Label topLbl = new Label("Choose a Top and its specifications:");
        gp.add(topLbl, 0,1);

        // letting user choose a top
        ComboBox<String> topBox = new ComboBox<>();
        topBox.setPromptText("Top");
        topBox.getItems().add("T-Shirt");
        topBox.getItems().add("Button Shirt");
        gp.add(topBox,1,1);

        // letting user choose the size of their top
        ComboBox<String> sizeTop = new ComboBox<>();
        sizeTop.getItems().addAll(sizeStrArray);
        sizeTop.setPromptText("Size");
        gp.add(sizeTop,3,1);

        // letting user choose the colour of their top
        ComboBox<String> colourTop = new ComboBox<>();
        colourTop.getItems().addAll(colourArr);
        colourTop.setPromptText("Colour");
        gp.add(colourTop,2,1);

        // letting user choose if their top has long sleeves or not
        CheckBox sleeveChk = new CheckBox("Long Sleeve");
        gp.add(sleeveChk,4,1);

        // ----------------------------------------------------------------------------

        // specifying which clothing user is choosing
        Label outerTopLbl = new Label("Choose an Outer Top and its specifications:");
        gp.add(outerTopLbl, 0,2);

        // letting user choose an outer top
        ComboBox<String> outerTopBox = new ComboBox<>();
        outerTopBox.setPromptText("Outer Top");
        outerTopBox.getItems().add("Jacket");
        outerTopBox.getItems().add("Windbreaker");
        gp.add(outerTopBox,1,2);

        // letting user choose the size of their top
        ComboBox<String> sizeOuterTop = new ComboBox<>();
        sizeOuterTop.getItems().addAll(sizeStrArray);
        sizeOuterTop.setPromptText("Size");
        gp.add(sizeOuterTop,3,2);

        // letting user choose the colour of their top
        ComboBox<String> colourOuterTop = new ComboBox<>();
        colourOuterTop.getItems().addAll(colourArr);
        colourOuterTop.setPromptText("Colour");
        gp.add(colourOuterTop,2,2);

        // letting user choose if they want their outer top to have a hood
        CheckBox hoodChk = new CheckBox("Hood");
        gp.add(hoodChk,4,2);

        // ----------------------------------------------------------------------------

        // letting user know what clothing they are choosing
        Label bottomsLbl = new Label("Choose a Bottom and its specifications:");
        gp.add(bottomsLbl, 0,3);

        // letting user choose their bottom clothing
        ComboBox<String> bottomBox = new ComboBox<>();
        bottomBox.setPromptText("Bottom");
        bottomBox.getItems().add("Jeans");
        bottomBox.getItems().add("Shorts");
        gp.add(bottomBox,1,3);

        // letting user choose the waist size of their bottom clothing
        ComboBox<Integer> bottomWSBox = new ComboBox<>();
        bottomWSBox.getItems().addAll(sizeArr); // adds all values of array as options
        bottomWSBox.setPromptText("Waist Size");
        gp.add(bottomWSBox,3,3);

        // letting users choose the length of their bottom clothing
        ComboBox<Integer> bottomLenBox = new ComboBox<>();
        bottomLenBox.getItems().addAll(sizeArr);
        bottomLenBox.setPromptText("Length");
        gp.add(bottomLenBox,4,3);

        // letting users choose the colour of their bottom clothing
        ComboBox<String> colourBottom = new ComboBox<>();
        colourBottom.getItems().addAll(colourArr);
        colourBottom.setPromptText("Colour");
        gp.add(colourBottom,2,3);

        // ----------------------------------------------------------------------------

        // letting users know what clothing they are choosing
        Label footwearLbl = new Label("Choose a footwear and its specifications:");
        gp.add(footwearLbl, 0,4);

        // letting user choose a footwear
        ComboBox<String> footwearBox = new ComboBox<>();
        footwearBox.setPromptText("Footwear");
        footwearBox.getItems().add("Sneakers");
        footwearBox.getItems().add("Boots");
        gp.add(footwearBox,1,4);

        // letting user choose the size for their footwear
        ComboBox<Integer> footwearSizeBox = new ComboBox<>();
        footwearSizeBox.getItems().addAll(sizeArr);
        footwearSizeBox.setPromptText("Size");
        footwearSizeBox.setMaxSize(200,200);
        gp.add(footwearSizeBox,3,4);

        // letting use choose the colour of their footwear
        ComboBox<String> colourFootwear = new ComboBox<>();
        colourFootwear.getItems().addAll(sizeStrArray);
        colourFootwear.setPromptText("Colour");
        gp.add(colourFootwear,2,4);

        // letting user choose what fastening method their footwear should have
        ComboBox<String> fastenBox = new ComboBox<>();
        fastenBox.getItems().add("Laces");
        fastenBox.getItems().add("Velcro");
        fastenBox.setPromptText("Fasten Method");
        gp.add(fastenBox,4,4);

        // ----------------------------------------------------------------------------

        Label ques = new Label("How many accessories would you like?");
        gp.add(ques,0,5);

        // creating radio buttons for user options
        RadioButton none = new RadioButton("None");
        RadioButton one = new RadioButton("1");
        RadioButton two = new RadioButton("2");
        RadioButton three = new RadioButton("3");

        // adding radio buttons to a group
        ToggleGroup accessOptGp = new ToggleGroup();
        none.setToggleGroup(accessOptGp);
        one.setToggleGroup(accessOptGp);
        two.setToggleGroup(accessOptGp);
        three.setToggleGroup(accessOptGp);

        gp.add(none,1,5);
        gp.add(one, 2,5);
        gp.add(two, 3,5);
        gp.add(three, 4,5);

        // three sets of accessory options will be created in advance

        // a list of the accessories to be used for adding to combo box
        ArrayList<String> accessArr = new ArrayList<>(Arrays.asList("Watch", "Necklace", "Bracelet"));

        // a list that will hold the quality of the accessories that can be added to combo box easily
        ArrayList<String> qualityArr = new ArrayList<>(Arrays.asList("Cheap", "Regular", "Premium"));

        Label accessLbl = new Label("Choose an accessory and its specifications:");

        // letting user choose an accessory
        ComboBox<String> access = new ComboBox<>();
        access.setPromptText("Accessory");
        access.getItems().addAll(accessArr);

        // letting user choose quality for accessory
        ComboBox<String> qualityBox = new ComboBox<>();
        qualityBox.setPromptText("Quality");
        qualityBox.getItems().addAll(qualityArr);

        // --

        Label accessLbl1 = new Label("Choose an accessory and its specifications:");

        // letting user choose an accessory
        ComboBox<String> access1 = new ComboBox<>();
        access1.setPromptText("Accessory");
        access1.getItems().addAll(accessArr);

        // letting user choose quality for accessory
        ComboBox<String> qualityBox1 = new ComboBox<>();
        qualityBox1.setPromptText("Quality");
        qualityBox1.getItems().addAll(qualityArr);

        // --

        Label accessLbl2 = new Label("Choose an accessory and its specifications:");

        // letting user choose accessory
        ComboBox<String> access2 = new ComboBox<>();
        access2.setPromptText("Accessory");
        access2.getItems().addAll(accessArr);

        // letting user choose quality of accessory
        ComboBox<String> qualityBox2 = new ComboBox<>();
        qualityBox2.setPromptText("Quality");
        qualityBox2.getItems().addAll(qualityArr);

        // creating a button that will let user finalize their outfit
        Button submit = new Button("Finalize Outfit");

        // an event listener for when the user chooses how many accessories they want
        accessOptGp.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            // disabling options after user chooses one
            none.setDisable(true);
            one.setDisable(true);
            two.setDisable(true);
            three.setDisable(true);

            // used for specifying where the submit button will be
            int rowIndex = 5;

            // nested if statements to add the accessory options based on the user's choice
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

            // adding the submit button under the accessory options
            gp.add(submit,1,rowIndex+1);
        });

        // ----------------------------------------------------------------------------

        // event handler for when user clicks the submit button
        submit.setOnAction(event -> {
            gp.setDisable(true); // disabling the GridPane so user cannot make any more changes

            // calling the builder to build the top clothing
            outfitBuilder.buildTop(
                    topBox.getValue(), colourTop.getValue(),
                    sizeTop.getValue(),sleeveChk.isSelected()
            );

            // calling the builder to build the outer top clothing
            outfitBuilder.buildOuterTop(
                    outerTopBox.getValue(),colourOuterTop.getValue(),
                    hoodChk.isSelected(), sizeOuterTop.getValue()
            );

            // calling the builder to build the bottom clothing
            outfitBuilder.buildBottom(
                    bottomBox.getValue(),colourBottom.getValue(),
                    bottomLenBox.getValue(), bottomWSBox.getValue()
            );

            // calling the builder to create the footwear
            outfitBuilder.buildFootwear(
                    footwearBox.getValue(),colourFootwear.getValue(),
                    footwearSizeBox.getValue(),fastenBox.getValue()
            );

            // calling builder to create build 1-3 accessories based on user choice
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

            // calling the builder to build the completed outfit
            Label newOutfit = new Label(outfitBuilder.buildOutfit().toString());

            // creating and displaying a new window where the user will be able to see
            // the outfit they created and its cost
            HBox hBox = new HBox();
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
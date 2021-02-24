package com.company;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main extends Application {
// Fields for all of the UIElements
    ArrayList<ImageView> RobloxImages;
    Label Text;
    Label robuxText;
    Button myFirstButton;
    CheckBox myFirstCheckBox;
    CheckBox option1;
    CheckBox option2;
    CheckBox option3;
    FileInputStream RobuxImage;
    Image RobuxImage1;
    ImageView RobuxImageView;
    FileChooser fileChooser;
    FileInputStream RobloxLogoImage;
    Image RobloxLogo;
    ImageView RobloxLogoView;
    FileInputStream Robux2image;
    Image Robux2;
    ImageView Robux2View;
    ToggleButton toggleImage;
    ToggleButton toggleImage2;
    ToggleButton toggleImage3;
    ToggleGroup toggleImageGroup;
    FileInputStream Robux3image;
    Image Robux3;
    ImageView Robux3View;
    FileInputStream Robux4image;
    Image Robux4;
    ImageView Robux4View;

    public static void main(String[] args) {
	// write your code here
        Application.launch(args);
    }

    //What happen if user clicks:


    public void start(Stage stage) throws FileNotFoundException {

        stage.setTitle("FreeRobux.com");

        //Create UI elements

            //ImageView

        RobloxImages = new ArrayList<>();
        RobloxImages.add(RobuxImageView);
        RobloxImages.add(RobloxLogoView);
        RobloxImages.add(Robux2View);


        RobuxImage = new FileInputStream("C:\\Users\\Ethan\\Desktop\\RobuxImage.png");
        RobuxImage1 = new Image(RobuxImage);
        RobuxImageView = new ImageView(RobuxImage1);
        RobuxImageView.setFitHeight(100);
        RobuxImageView.setFitWidth(100);

        RobloxLogoImage = new FileInputStream("C:\\Users\\Ethan\\Desktop\\Roblox New Logo.png");
        RobloxLogo = new Image(RobloxLogoImage);
        RobloxLogoView = new ImageView(RobloxLogo);
        RobloxLogoView.setFitHeight(100);
        RobloxLogoView.setFitWidth(100);

        Robux2image = new FileInputStream("C:\\Users\\Ethan\\Desktop\\Robux2.png");
        Robux2 = new Image(Robux2image);
        Robux2View = new ImageView(Robux2);
        Robux2View.setFitHeight(100);
        Robux2View.setFitWidth(100);

        Robux3image = new FileInputStream("C:\\Users\\Ethan\\Desktop\\Robux3.jpg");
        Robux3 = new Image(Robux3image);
        Robux3View = new ImageView(Robux3);
        Robux3View.setFitHeight(100);
        Robux3View.setFitWidth(100);

        Robux4image =  new FileInputStream("C:\\Users\\Ethan\\Desktop\\Robux4.jpg");
        Robux4 = new Image(Robux4image);
        Robux4View = new ImageView(Robux4);
        Robux4View.setFitHeight(100);
        Robux4View.setFitWidth(100);


            // Checkboxes
        myFirstCheckBox = new CheckBox("Verify you're not a robot");
        option1 = new CheckBox("1,0000 FREE ROBUX");
        option2 = new CheckBox("10,0000 FREE ROBUX");
        option3 = new CheckBox("100,0000 FREE ROBUX");
        myFirstCheckBox.setOnAction(actionEvent -> {
            handleCheckboxOptions( option1,  option2,  option3,  myFirstCheckBox);
    });

            //Button
        myFirstButton = new Button("CLICK HERE FOR FREE ROBUX");
        myFirstButton.setOnAction(actionEvent -> {
            userClickedTheButton();
        });

        //Toggle imagae
        toggleImage = new ToggleButton("Image1");
        toggleImage2 = new ToggleButton("Image2");
        toggleImage3 = new ToggleButton("Image3");
        toggleImageGroup = new ToggleGroup();
        toggleImage.setToggleGroup(toggleImageGroup);
        toggleImage2.setToggleGroup(toggleImageGroup);
        toggleImage3.setToggleGroup(toggleImageGroup);


        toggleImage.setOnAction(actionEvent -> {
            boolean isSelected = toggleImage.isSelected();
            Robux2View.setVisible(isSelected);
        });

        toggleImage2.setOnAction(actionEvent -> {
            boolean isSelected = toggleImage2.isSelected();
            Robux3View.setVisible(isSelected);
        });

        toggleImage3.setOnAction(actionEvent -> {
            boolean isSelected = toggleImage3.isSelected();
            Robux4View.setVisible(isSelected);
        });

            // Text
        Text = new Label("CLICK IT NOW!");
        robuxText = new Label("SELECT HOW MANY ROBUX YOU WANT!");


            //create Layout
        VBox myLayout = new VBox( RobloxLogoView, RobuxImageView, Robux2View, toggleImage, Robux3View, toggleImage2, Robux4View, toggleImage3, robuxText, option1, option2, option3, Text, myFirstButton, myFirstCheckBox);

        // create Scene
        Scene myFirstScene = new Scene(myLayout);
        stage.setScene(myFirstScene);

        stage.setWidth(300);
        stage.setHeight(750);

        myFirstScene.setCursor(Cursor.CROSSHAIR);

        // Display Scene
        stage.show();
    }

    //Handling checkbox options
    public void handleCheckboxOptions(CheckBox option1, CheckBox option2, CheckBox option3, CheckBox myFirstCheckBox) {
        String message = "Users selected:\n";

        if(option1.isSelected())
            message += "1,0000 free robux";

        if(option2.isSelected())
            message += " 10,0000 free robux";

        if(option3.isSelected())
            message += " 100,0000 free robux";

        if(myFirstCheckBox.isSelected())
            message += " User is not a robot";

        System.out.println(message);
    }

    public void  userClickedTheButton() {
        System.out.println("Information successfully stolen");
        Text.setText("You got your free Robux ;)");


    }



}



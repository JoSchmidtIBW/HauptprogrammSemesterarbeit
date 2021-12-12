package com.example.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SwitchSceneSample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // I am using window as primaryStage
        window = primaryStage;
        // Label 1
        Label label1 = new Label("Welcome to the first scene!");
        // Label 2
        //Label label2 = new Label("This is second scene!");
        // Button 1, by pressing this button primaryStage will be set as scene 2
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));


        // Creating an object of the class'LayoutOne.java'
        LayoutOne l1 = new LayoutOne();
        // set my scene 1(by calling method called 'sceneView1()' from class 'LayoutOne.java')
        scene1 = new Scene(l1.sceneView1( button1), 200, 200);
        // Set my scene 2 inside my main class
        StackPane layout2 = new StackPane();//der brauchts mal

        // Button 2, by pressing this button primaryStage will be set as scene 1
        Button button2 = new Button("Click to go scene 1");
        button2.setOnAction(e -> window.setScene(scene1));
        layout2.getChildren().addAll( button2);
        scene2 = new Scene(layout2, 600, 300);
        //scene2.setFill(Color.YELLOWGREEN);
        // Making my
        window.setScene(scene1);
        window.setTitle("Scene Switch Sample");
        window.show();
    }
}


class LayoutOne {
    public VBox sceneView1(Button button) {//Label label,

        // Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        Label label33 = new Label("This is second scene!");
        layout1.getChildren().addAll(label33, button);

        return layout1;
    }
}
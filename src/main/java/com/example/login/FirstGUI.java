package com.example.login;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;

public class FirstGUI extends Application {

    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("My First JavaFX GUI");

//Scene 1
        Label label1= new Label("This is the first scene");
       // label1.
        Button button1= new Button("Go to scene 2");
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1= new Scene(layout1, 350, 250);
        scene1.setFill(Color.YELLOW);

//Scene 2
        Label label2= new Label("This is the second scene");
        Button button2= new Button("Go to scene 1");
        button2.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2= new Scene(layout2,300,250);


        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}


//    If you want to have different classes to represent different scenes/windows:
//        (I tried this and it worked).
//
//        This is a class for the second scene. Notice that the class extends Application, but there's no main method. Also notice that the start method (could have named it anything else) receives a Stage type argument.
//
//public class SecondWindow extends Application
//{
//    // This method, when called, will receive the original primary stage
//// on which a new scene will then be attached
//    public void start(Stage stage)
//    {
//        Label lbl = new Label("This is a new window.");
//        BorderPane bp = new BorderPane();
//        bp.setCenter(lbl);
//
//        Scene scene = new Scene(bp, 500, 500);
//        stage.setScene(scene);
//        stage.show();
//
//    }
//}
//
//// From the main method in the first class:
//
//btnSubmit.setOnAction(e-> {
//// Instantiate the class that creates a new scene
//// Call method in newly instantiated class, passing primaryStage to it
//        SecondWindow secondWindow = new SecondWindow();
//        secondWindow.start(primaryStage);
//        });

//        Conclusion:
//        The primaryStage cannot change, but the scene can, so after instantiating the secondWindow class, call the start method, passing the primaryStage as argument. You can then set the new scene created in this secondWindow class to the original stage.
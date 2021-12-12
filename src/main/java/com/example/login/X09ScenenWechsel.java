package com.example.login;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 12.12.2021, 00:58
 */
class ScenenWechselMain extends Application {
    private BorderPane mainLayout = new BorderPane();

    private static Stage guiStage;
    public static Stage getStage() {
        return guiStage;
    }

    @Override
    public void start(Stage primaryStage) {
        guiStage = primaryStage;
        primaryStage.setTitle("Main Menu");

        FlowPane layout = new FlowPane();
        Button button = new Button("Click");
        layout.getChildren().addAll(button);

        button.setOnAction(event -> {
            Regi newScene = new Regi();// ... commands which define the new scene.
            //Scene scene2 = new Scene();
                   // Stage stage = ((Node) event.getTarget()).getScene().getStage();
            // or alternatively, just:
            // Stage stage = button.getScene().getStage();
            primaryStage.setScene(newScene.getScene3());
        });

        mainLayout.setTop(layout);

        Scene scene = new Scene(mainLayout, 600, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("HelloWorld");
        launch();//lauch //anzeigen Fenster
    }
}

class Regi {

    HBox hboxi = new HBox();
    Scene scene3 = new Scene(hboxi);

    public Regi(){
        this.hboxi=hboxi;
        this.scene3=scene3;
    }

    public Scene getScene3(){
        Label l1 = new Label("Halllllooooo");
        hboxi.getChildren().add(l1);
        return scene3;
    }
    //scene3 = new Scene(new Group(new Label("1")), 200, 150);
//    scene2 = new Scene(new Group(new Label("2")), 200, 150);
//
//        scene.setFill(Color.GREEN);
//        scene2.setFill(Color.ORANGE);
//
//        scene.setOnMouseClicked(e -> changeScene(scene2));
//        scene2.setOnMouseClicked(e -> changeScene(scene));
//
//    stage = s;
//        s.setScene(scene);
//        s.show();

}
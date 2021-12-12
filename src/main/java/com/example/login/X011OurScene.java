package com.example.login;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.stage.Stage;

class TestScene {

//    private Group root = new Group();
//    Scene test = new Scene(root);
//    Button button1 = new Button("test");
//    root.getChildren.add(button1);

}

class OurScene {
    Group root = new Group();
    Scene scene = new Scene(root, Color.GREEN);
    public OurScene(){
        this.scene = scene;
    }

    public Scene getScene() {

        Button button = new Button("Hello world!");
        root.getChildren().add(button);
        return scene;
    }
}

class OurSceneMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStageHauptfenster) throws Exception {
        OurScene ourScene = new OurScene();
        primaryStageHauptfenster.setScene(ourScene.getScene());
        primaryStageHauptfenster.show();
    }
}
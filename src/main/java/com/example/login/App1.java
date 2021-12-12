package com.example.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App1 extends Application
{

    @Override
    public void start(Stage primaryStageHauptfenster) throws Exception
    {
        primaryStageHauptfenster.setScene(SceneAFactory.createSceneA(primaryStageHauptfenster));
        primaryStageHauptfenster.show();
    }

    public static void main(String[] args)
    {
        Application.launch(App1.class, args);
    }
}

 class SceneAFactory
{
    public static Scene createSceneA(Stage stage)
    {
        Button button = new Button("Switch to B");
        button.setOnAction(event -> stage.setScene(SceneBFactory.createSceneB(stage)));

        HBox hbox = new HBox();
        Label label1 = new Label("Scene A");
        Label lzusatz = new Label("Bin ein zusätliches Labelzeug");

        hbox.getChildren().addAll(label1,button,lzusatz);
        Scene scene = new Scene(hbox);
        //scene.setFill(Color.YELLOWGREEN);

        return scene;
        //return new Scene(new HBox(new Label("Scene A"), button));
    }
}

 class SceneBFactory
{
    public static Scene createSceneB(Stage stage)
    {
        Button button = new Button("Switch to A");
        button.setOnAction(event -> stage.setScene(SceneAFactory.createSceneA(stage)));
        return new Scene(new HBox(new Label("Scene B"), button));
    }
}
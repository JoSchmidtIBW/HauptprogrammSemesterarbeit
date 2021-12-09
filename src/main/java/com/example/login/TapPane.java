package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 09.12.2021, 23:13
 */
/**
 * @author - John Schmidt
 * 09.12.2021, 23:40
 */
public class TapPane  extends Application {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        launch();//lauch //anzeigen Fenster
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox(5);

        Button btn = new Button("1");
        Button btn2 = new Button("2");

        final Pane cardsPane = new StackPane();
        final Group card1 = new Group(new Text(25, 25, "Card 1"));
        final Group card2 = new Group(new Text(25, 25, "Card 2"));
        final Group card3 = new Group(new Text(30, 25, "Card 2"));

        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(card1);
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(card2);
            }
        });

        vbox.getChildren().addAll(btn, btn2, cardsPane);
        stage.setScene(new Scene(vbox));
        stage.setWidth(200);
        stage.setHeight(200);
        stage.show();
    }
}
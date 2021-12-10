package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.ColorInput;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

import static javafx.scene.paint.Color.RED;

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



        Label  labelTaskleiste = new Label("LabelTaskleiste");
        labelTaskleiste.setStyle("-fx-background-color: blue;");
        //JPanel jpanel1 = new JPanel();//Instead of a JPanel set to BoderLayout, use BorderPane
        BorderPane bpanel = new BorderPane();
        //Instead of a JPanel set to GridLayout, use GridPane
        Pane maxpane = new Pane();
        maxpane.setStyle("-fx-background-color: black;");
       // maxpane.setBackground(RED);
        Label lirgendwas = new Label("lirgendwas");
        lirgendwas.setStyle("-fx-background-color: red;");
        //bpanel.getChildren().add(lirgendwas);

        Label fuckLabel = new Label("Fucklabel im FuckPanel von Fuckyou");
        Pane fuckyou = new Pane(fuckLabel);
        Pane hauptOberflaechenPaneTskleiste = new Pane();

        Button btn = new Button("1");
        Button btn2 = new Button("2");

        final Pane cardsPane = new StackPane();
        final Group card1 = new Group(new Text(25, 25, "Card 1"));
        final Group card2 = new Group(new Text(25, 25, "Card 2"));
        //card2.setStyle("-fx-background-color: blue;");

        //final Group card3 = new Group(new Text(30, 30, "Card 3"));

        ColorInput ci = new ColorInput(card2.getLayoutX(),
                card2.getLayoutY(),
                card2.getLayoutBounds().getWidth(),
                card2.getLayoutBounds().getHeight(),
                Color.RED);
        card2.setEffect(ci);

//        ColorInput ci = new ColorInput(
//                Color.RED);
//        card2.setEffect(Color.RED);


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

        //hauptOberflaechenPaneTskleiste..add(new TaskLeiste(anzeigePanel, cardLayout));
        //hauptOberflaechenPaneTskleiste(new TaskLeiste(hauptOberflaechenPaneTskleiste, cardLayout));
        hauptOberflaechenPaneTskleiste(new TaskLeiste(hauptOberflaechenPaneTskleiste));

        vbox.getChildren().addAll(fuckyou,btn, btn2, cardsPane,labelTaskleiste,  bpanel,maxpane,lirgendwas);
        //final Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        final Scene scene = new Scene(new ScrollPane(vbox));
        //stage.setScene(new Scene(new ScrollPane(vbox)));//mit scrollpane drin (youtube)
        stage.setScene(scene);
        stage.setWidth(200);
        stage.setHeight(200);
        stage.show();
    }
}
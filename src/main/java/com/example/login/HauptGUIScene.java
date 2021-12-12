package com.example.login;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 12.12.2021, 14:51
 */
public class HauptGUIScene {

    public static Scene createGetHauptScene(Stage stage){

        VBox layoutH = new VBox(1);

        Label lHauptGuin= new Label("Bin Label HauptGui");


        final Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben
        final Group card1 = new Group(new Text(25, 25, "Card 1"));
        final Group card2 = new Group(new Text(25, 25, "Card 2"));

        Button btn = new Button("1");
        Button btn2 = new Button("2");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(card1);
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                //cardsPane.getChildren().add(card2);
                cardsPane.getChildren().add(new GroupStack2(cardsPane).macheGroup2());
            }
        });


        Button buttonHauptGUIzuruekLogin = new Button("zuruekLogin");
        buttonHauptGUIzuruekLogin.setOnAction(e -> stage.setScene(Login.createLoginScene(stage)));
        layoutH.getChildren().addAll(lHauptGuin,btn, btn2, cardsPane,TaskLeistePane.getPane(),buttonHauptGUIzuruekLogin);

        Scene hauptGuiScene = new Scene(layoutH);
        return hauptGuiScene;
    }



}


class GroupStack2{
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public GroupStack2(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheGroup2(){
        final Group card2 = new Group(new Text(25, 25, "Card 2"));
        return card2;
    }

}
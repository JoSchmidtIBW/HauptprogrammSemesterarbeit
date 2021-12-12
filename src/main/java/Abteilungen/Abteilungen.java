package Abteilungen;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 15:49
 */
public class Abteilungen {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Abteilungen(Pane cardsPane) {
        this.cardsPane = cardsPane;
    }

    public Group macheAbteilung() {
        final Group cardAbteilung = new Group(new Text(25, 25, "Abteilung blabvlabla"));

        HBox layoutH = new HBox(1);
        Button bAnarbeit = new Button("Anarbeit");
        Button bZieherei = new Button("Zieherei");
        Button bSchweisserei = new Button("Schweisserei");

        bAnarbeit.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Anarbeit(cardsPane).macheAnarbeit());
            }
        });

        bZieherei.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                Label sinnlosZieherei = new Label("Zieherei");
                cardsPane.getChildren().addAll(sinnlosZieherei);
                // cardsPane.getChildren().add(new Zieherei(cardsPane).macheZieherei());
            }
        });

        bSchweisserei.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                Label sinnlosSchweisserei = new Label("Scheisserei");
                cardsPane.getChildren().addAll(sinnlosSchweisserei);
                //cardsPane.getChildren().add(new Schweisserei(cardsPane).macheSchweisserei());
            }
        });

        layoutH.getChildren().addAll(bAnarbeit, bZieherei, bSchweisserei);
        cardAbteilung.getChildren().addAll(layoutH);
        return cardAbteilung;
    }
}
//package com.example.login;
//
//import com.example.login.Abteilungen22.Anarbeit;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Group;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.text.Text;
//
///**
// * @author - John Schmidt
// * 12.12.2021, 15:49
// */
//public class X199Abteilungen {
//    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben
//
//    public X199Abteilungen(Pane cardsPane){
//        this.cardsPane=cardsPane;
//    }
//
//    public Group macheAbteilung(){
//        final Group cardAbteilung = new Group(new Text(25, 25, "Abteilung blabvlabla"));
//
//        HBox layoutH = new HBox(1);
//        Button bAnarbeit = new Button("Anarbeit");
//        Button bZieherei = new Button("Zieherei");
//        Button bSchweisserei = new Button("Schweisserei");
//
//        bAnarbeit.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                cardsPane.getChildren().clear();
//                cardsPane.getChildren().add(new Anarbeit(cardsPane).macheAnarbeit());
//            }
//        });
//
//        bZieherei.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                cardsPane.getChildren().clear();
//                Label sinnlosZieherei = new Label("Zieherei");
//                cardsPane.getChildren().addAll(sinnlosZieherei);
//               // cardsPane.getChildren().add(new Zieherei(cardsPane).macheZieherei());
//            }
//        });
//
//        bSchweisserei.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                cardsPane.getChildren().clear();
//                Label sinnlosSchweisserei = new Label("Scheisserei");
//                cardsPane.getChildren().addAll(sinnlosSchweisserei);
//                //cardsPane.getChildren().add(new Schweisserei(cardsPane).macheSchweisserei());
//            }
//        });
//
//        layoutH.getChildren().addAll(bAnarbeit,bZieherei,bSchweisserei);
//        cardAbteilung.getChildren().addAll(layoutH);
//        return cardAbteilung;
//    }
//}
//
////
////    final Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben
////    final Group card1 = new Group(new Text(25, 25, "Card 1"));
////    final Group card2Anleitung = new Group(new Text(25, 25, "Anleitung"));
////
////    Button bAbteilung = new Button("Abteilung");
////    Button bAnleitung = new Button("Anleitung");
////
////
////    Button bRattunde1 = new Button("Rattunde1");
////        bRattunde1.setOnAction(new EventHandler<ActionEvent>() {
////public void handle(ActionEvent t) {
////        cardsPane.getChildren().clear();
////        cardsPane.getChildren().add(new Rattunde1(cardsPane).macheRattunde1());
////        }
////        });
////
////
////
////        bAbteilung.setOnAction(new EventHandler<ActionEvent>() {
////public void handle(ActionEvent t) {
////        cardsPane.getChildren().clear();
////        cardsPane.getChildren().add(card1);
////        }
////        });

package Abteilungen;

import Abteilungen.AnlagenAnarbeit.*;
import Abteilungen.AnlagenZieherei.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 17:55
 */
public class Zieherei {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Zieherei(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheZiherei(){
        final Group cardZieherei = new Group(new Text(25, 25, "Zieherei"));

        HBox layoutH = new HBox(1);

        Button bAsmag = new Button("ASMAG");
        bAsmag.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new ASMAG(cardsPane).macheAsmag());
            }
        });

        Button bInder = new Button("INDER");
        bInder.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new INDER(cardsPane).macheInder());
            }
        });

        Button bBuelltmann = new Button("Bülltmann");
        bBuelltmann.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Buelltmann(cardsPane).macheBuelltmann());
            }
        });

        Button bNordSued = new Button("Nord / Süd");
        bNordSued.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new NordSued(cardsPane).macheNordSued());
            }
        });

        Button bSEMA1= new Button("SEMA1");
        bSEMA1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new SEMA1(cardsPane).macheSema1());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });

        Button bSEMA2= new Button("SEMA2 :(");
        bSEMA2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new SEMA2(cardsPane).macheSema2());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });

        Button bGluehOfen2= new Button("GluehOfen2");
        bGluehOfen2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new GluehOfen2(cardsPane).macheGluehOfen2());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });

        Button bGluehOfen3= new Button("GluehOfen3");
        bGluehOfen3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new GluehOfen3(cardsPane).macheGluehOfen3());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });

        Button bAVS63= new Button("AVS63");
        bAVS63.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new AVS63(cardsPane).macheAVS63());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });

        Button bAVS100= new Button("AVS100");
        bAVS100.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new AVS100(cardsPane).macheAVS100());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });

        Button bAPM100= new Button("APM100");
        bAPM100.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new APM100(cardsPane).macheAPM100());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });

        layoutH.getChildren().addAll(bAsmag,bInder,bBuelltmann,bNordSued,bSEMA1,bSEMA2,bGluehOfen2,bGluehOfen3,bAVS63,bAVS100,bAPM100);
        cardZieherei.getChildren().addAll(layoutH);
        return cardZieherei;
    }
}

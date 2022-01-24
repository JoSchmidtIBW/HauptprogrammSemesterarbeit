package Abteilungen.AnlagenAnarbeit.Rattunde1;

import Abteilungen.AnlagenAnarbeit.Rattunde3;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 15:33
 */
public class Rattunde1 {
    Pane cardsPane = new StackPane();

    public static String getNameAnlageRattunde1() {
        return nameAnlageRattunde1;
    }

    public static String nameAnlageRattunde1 = "Rattunde1";

    public Rattunde1(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRattunde1(){

        //VBox layoutV = new VBox(1);
        HBox layoutH = new HBox(1);

        Button bAddafer = new Button("Addafer");
        bAddafer.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Addafer(cardsPane).macheAddafer());
            }
        });

        Button bRat1 = new Button("Rat.1");
        Button b100Prozent = new Button("100%");



        final Group cardRattunde1 = new Group(new Text(25, 25, "Rattunde 1 blabvlabla"));
//ToDo
        //layouth,v ev umbenennen
        //ev ein retour button einfügen
        //muss noch gemacht werden mit text wegen new group new text
        //
        layoutH.getChildren().addAll(bAddafer,bRat1,b100Prozent);
        //layoutV.getChildren().addAll(layoutH);

        VBox layoutVRattunde1 = new VBox(1);
        Label lsinnlosPlatzhalterRattunde1 = new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        layoutVRattunde1.getChildren().addAll(layoutH,lsinnlosPlatzhalterRattunde1);
        //cardRattunde1.getChildren().addAll(layoutV);
        cardRattunde1.getChildren().addAll(layoutVRattunde1);

        return cardRattunde1;


    }
}

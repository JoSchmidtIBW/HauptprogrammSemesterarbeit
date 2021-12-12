package Abteilungen;

import Abteilungen.AnlagenAnarbeit.Rattunde1;
import Abteilungen.AnlagenAnarbeit.Rattunde2;
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
 * 12.12.2021, 17:55
 */
public class Schweisserei {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Schweisserei(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheSchweisserei(){
        final Group cardSchweisserei = new Group(new Text(25, 25, "Schweisserei a"));

        HBox layoutH = new HBox(1);

        Button bRS50 = new Button("RS50");
        bRS50.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                Label lRS50 = new Label("RS50 Label");
                cardsPane.getChildren().add(lRS50);
//                cardsPane.getChildren().add(new RS50(cardsPane).macheRS50());
            }
        });

        Button bRS65 = new Button("RS65");
        bRS65.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                Label lRS65 = new Label("RS65 Label");
                cardsPane.getChildren().add(lRS65);
                //cardsPane.getChildren().add(new Rattunde2(cardsPane).macheRattunde2());
            }
        });

        Button bRS25 = new Button("RS25");
        bRS25.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                Label lRS25 = new Label("RS25 Label");
                cardsPane.getChildren().add(lRS25);
                //cardsPane.getChildren().add(new Rattunde2(cardsPane).macheRattunde2());
            }
        });

        Button bRS30 = new Button("RS30");
        bRS30.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                Label lRS30 = new Label("RS30 Label");
                cardsPane.getChildren().add(lRS30);
                //cardsPane.getChildren().add(new Rattunde2(cardsPane).macheRattunde2());
            }
        });

        Button bSpaltAnlage = new Button("SpaltAnlage");
        bSpaltAnlage.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                Label lSpaltAnlage = new Label("SpaltAnlage Label");
                cardsPane.getChildren().add(lSpaltAnlage);
                //cardsPane.getChildren().add(new Rattunde2(cardsPane).macheRattunde2());
            }
        });

        layoutH.getChildren().addAll(bRS25,bRS30,bRS50,bRS65,bSpaltAnlage);
        cardSchweisserei.getChildren().addAll(layoutH);
        return cardSchweisserei;
    }

}
package Abteilungen;

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
 * 30.12.2021, 15:49
 */
public class Abteilungen {
    Pane cardsPane = new StackPane();


    public Abteilungen(Pane cardsPane) {
        this.cardsPane = cardsPane;
    }

    public Group macheAbteilung() {
        final Group cardAbteilung = new Group();//new Text(25, 25, "Abteilung")

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
                cardsPane.getChildren().addAll(new Zieherei(cardsPane).macheZiherei());
            }
        });

        bSchweisserei.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
//                cardsPane.setScaleX(100/0);
//                cardsPane.setScaleY(100/0);
                cardsPane.getChildren().add(new Schweisserei(cardsPane).macheSchweisserei());
            }
        });

        VBox layoutVHauptAbteilung = new VBox(1);
        Label lsinnlosPlatzhalter = new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//platzhalter wegen Taskleiste

        layoutH.getChildren().addAll(bAnarbeit, bZieherei, bSchweisserei);

        layoutVHauptAbteilung.getChildren().addAll(layoutH,lsinnlosPlatzhalter);

        //cardAbteilung.getChildren().addAll(layoutH);
        cardAbteilung.getChildren().addAll(layoutVHauptAbteilung);
        return cardAbteilung;
    }
}

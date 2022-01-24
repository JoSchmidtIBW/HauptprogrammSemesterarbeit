package Abteilungen;

import Abteilungen.AnlagenAnarbeit.*;

import Abteilungen.AnlagenAnarbeit.Rattunde1.Rattunde1;
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
 * 30.12.2021, 15:58
 */
public class Anarbeit {
    Pane cardsPane = new StackPane();

    public static String getNameAbteilungAnarbeit() {
        return nameAbteilungAnarbeit;
    }

    public static String nameAbteilungAnarbeit = "Anarbeit";

    public Anarbeit(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheAnarbeit(){
        final Group cardAnarbeit = new Group();//new Text(25, 25, "Anarbeit blabvlabla")

        HBox layoutH = new HBox(1);

        Button bRattunde1 = new Button("Rattunde1");
        bRattunde1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Rattunde1(cardsPane).macheRattunde1());
            }
        });

        Button bRattunde2 = new Button("Rattunde2");
        bRattunde2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Rattunde2(cardsPane).macheRattunde2());
            }
        });

        Button bRattunde3 = new Button("Rattunde3");
        bRattunde3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Rattunde3(cardsPane).macheRattunde3());
            }
        });

        Button bRattunde4 = new Button("Rattunde4");
        bRattunde4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Rattunde4(cardsPane).macheRattunde4());
            }
        });

        Button bConni1 = new Button("Conni1");
        bConni1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Conni1(cardsPane).macheConni1());
            }
        });

        Button bTRT2 = new Button("TRT2");
        bTRT2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new TRT2(cardsPane).macheTRT2());
            }
        });

        Button bTRT1 = new Button("TRT2");
        bTRT1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new TRT1(cardsPane).macheTRT1());
            }
        });

        VBox layoutVAnarbeit = new VBox(1);
        Label lsinnlosPlatzhalterAnarbeit = new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        layoutH.getChildren().addAll(bRattunde1,bRattunde2,bRattunde3,bRattunde4,bConni1,bTRT2,bTRT1);
        //cardAnarbeit.getChildren().addAll(layoutH);
        layoutVAnarbeit.getChildren().addAll(layoutH,lsinnlosPlatzhalterAnarbeit);
        cardAnarbeit.getChildren().addAll(layoutVAnarbeit);

        return cardAnarbeit;
    }

}

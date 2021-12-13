package Abteilungen.AnlagenAnarbeit.Rattunde1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 13.12.2021, 21:11
 */
public class Addafer {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Addafer(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheAddafer(){
        final Group cardAddafer = new Group(new Text(25, 25, "Addafer blabvlabla"));

        VBox layoutV = new VBox(20);
        HBox layoutHBundlader = new HBox(20);



        Label lBundlader = new Label("Bundlader");


        Button bGurte = new Button("Gurte");
        bGurte.setStyle("-fx-background-color: green");



        //bGurte.setStyle("-fx-background-color: #ff0000; ");
        bGurte.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                bGurte.setStyle("-fx-background-color: yellow");
            }
        });

        Button bLichtSchranke = new Button("Lichtschranke 1");
        bLichtSchranke.setStyle("-fx-background-color: green");

        Button bAnschlag = new Button("Anschlag");
        bAnschlag.setStyle("-fx-background-color: green");

        Button bSchutzZaun = new Button("Schutz- Zaun");
        bSchutzZaun.setStyle("-fx-background-color: green");

        Button bStoerMeldungAbsetzen = new Button("Stör-Meldung absetzen");
        bStoerMeldungAbsetzen.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        bStoerMeldungAbsetzen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                //ToDo
                //hier kommt eine ifschleife rein, damit button sofern gelb geklickt, rot wird,
                //darf sich nicht mehr verändern, muss wie gesperrt sein
                bGurte.setStyle("-fx-background-color: darkred");
                //bGurte.setDefaultButton(true);//ist es das vielleicht????????
            }
        });

        HBox layoutHVereinzelung = new HBox(20);
        Label lVereinzelung = new Label("Vereinzelung");
        Button bRollenSchraeg = new Button("Rollen schräg");
        Button bStopperBolzen1 = new Button("Stopper-Bolzen 1");
        Button bStopperBolzen123 = new Button("Stopper- Bolzen 123");

        bRollenSchraeg.setStyle("-fx-background-color: green");
        bStopperBolzen1.setStyle("-fx-background-color: green");
        bStopperBolzen123.setStyle("-fx-background-color: green");


        layoutHBundlader.getChildren().addAll(lBundlader,bGurte,bLichtSchranke,bAnschlag,bSchutzZaun);
        layoutHVereinzelung.getChildren().addAll(lVereinzelung,bRollenSchraeg,bStopperBolzen1,bStopperBolzen123);
        layoutV.getChildren().addAll(layoutHBundlader,layoutHVereinzelung,bStoerMeldungAbsetzen);
        cardAddafer.getChildren().addAll(layoutV);
        //ToDo ev ein retour button
        return cardAddafer;
    }
}

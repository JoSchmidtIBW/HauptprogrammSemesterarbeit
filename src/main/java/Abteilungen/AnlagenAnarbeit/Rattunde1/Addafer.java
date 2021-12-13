package Abteilungen.AnlagenAnarbeit.Rattunde1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
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

    boolean istStoerMeldungButtonGedruecktWorden = false;//irgendwie wurde der halt so, weil in Button

    public Addafer(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheAddafer(){
        final Group cardAddafer = new Group(new Text(25, 25, "Addafer blabvlabla"));

        VBox layoutV = new VBox(20);
        HBox layoutHBundlader = new HBox(20);



        Label lBundlader = new Label("Bundlader");


        //ToggleButton bGurte = new ToggleButton("Gurte");
        Button bGurte = new Button("Gurte");
        bGurte.setStyle("-fx-background-color: green");

        //bGurte.setStyle("-fx-background-color: #ff0000; ");
        bGurte.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
               // if(istStoerMeldungButtonGedruecktWorden=false){
                    bGurte.setStyle("-fx-background-color: yellow");
               // }else{
//                    bGurte.setStyle("-fx-background-color: red");
//                }

            }
        });

        Button bLichtSchranke1 = new Button("Lichtschranke 1");
        bLichtSchranke1.setStyle("-fx-background-color: green");

        Button bAnschlag = new Button("Anschlag");
        bAnschlag.setStyle("-fx-background-color: green");

        Button bSchutzZaun = new Button("Schutz- Zaun");
        bSchutzZaun.setStyle("-fx-background-color: green");


//Vereinzelung----------------------------------------------------------------------------------------------------------
        HBox layoutHVereinzelung = new HBox(20);
        Label lVereinzelung = new Label("Vereinzelung");
        Button bRollenSchraeg = new Button("Rollen schräg");
        Button bStopperBolzen1 = new Button("Stopper-Bolzen 1");
        Button bStopperBolzen123 = new Button("Stopper- Bolzen 123");

        bRollenSchraeg.setStyle("-fx-background-color: green");
        bStopperBolzen1.setStyle("-fx-background-color: green");
        bStopperBolzen123.setStyle("-fx-background-color: green");



        HBox layoutHRollgang1 = new HBox(20);
        Label lRollgang1 = new Label("Rollgang 1");
        Button bRollen1 = new Button("Rollen 1");
        Button bSchweissNahtErkennung = new Button("Schweissnaht-\n Erkennung");
        Button bPinchRolle12 = new Button("Pinch-Rollen 1 2");

        bRollen1.setStyle("-fx-background-color: green");
        bSchweissNahtErkennung.setStyle("-fx-background-color: green");
        bPinchRolle12.setStyle("-fx-background-color: green");
//Messstation----------------------------------------------------------------------------------------------------------------------

        HBox layoutHMessstation = new HBox(20);
        Label lMessstation = new Label("Messstation");
        lMessstation.setFont(Font.font("Arial", 18));
        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
        Button bUSSensor = new Button("US-Sensor");
        Button bLaser = new Button("Laserg");
        Button bEinstellRollen = new Button("Einstell- Rollen");
        Button bLichtSchrankeM = new Button("Lichtschranke MS");
        Button bPumpeRueckFuehr = new Button("Pumpe Emulsion");
        Button bSchutzTuereM = new Button("Schutz-Türe");

        bUSSensor.setStyle("-fx-background-color: green");
        bLaser.setStyle("-fx-background-color: green");
        bEinstellRollen.setStyle("-fx-background-color: green");
        bLichtSchrankeM.setStyle("-fx-background-color: green");
        bPumpeRueckFuehr.setStyle("-fx-background-color: green");
        bSchutzTuereM.setStyle("-fx-background-color: green");

//Rollgang4----------------------------------------------------------------------------------------------------------------------
        HBox layoutHRollgang4 = new HBox(20);
        Label lRollgang4 = new Label("Rollgang 4");
        lRollgang4.setFont(Font.font("Arial", 18));
        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
        Button bPinchRolle3 = new Button("Pinch-Rolle 3");
        Button bRollen4 = new Button("Rollen 4");
        Button bRohrAuswerfer = new Button("Rohr- Auswerfer");
        Button bSchrottGurte = new Button("Gurte Schrott");
        Button bLichtSchranke2 = new Button("Lichtschranke 2");

        bPinchRolle3.setStyle("-fx-background-color: green");
        bRollen4.setStyle("-fx-background-color: green");
        bRohrAuswerfer.setStyle("-fx-background-color: green");
        bSchrottGurte.setStyle("-fx-background-color: green");
        bLichtSchranke2.setStyle("-fx-background-color: green");

//WalkingBeam----------------------------------------------------------------------------------------------------------------------
        HBox layoutHWalkingBeam = new HBox(20);
        Label lWalkingBeam = new Label("WalkingBeam");
        lWalkingBeam.setFont(Font.font("Arial", 18));
        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
        Button bWalkingBeam = new Button("WalkingBeam");
        Button bDrehGreifer = new Button("Dreh-Greifer");
        Button bRadRat1 = new Button("Rad-Rat1");


        bWalkingBeam.setStyle("-fx-background-color: green");
        bDrehGreifer.setStyle("-fx-background-color: green");
        bRadRat1.setStyle("-fx-background-color: green");

//ButtonZurückRat1----------------------------------------------------------------------------------------------------------------------
        Button bZurueckRat1 = new Button("Zurück");
        bZurueckRat1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Rattunde1(cardsPane).macheRattunde1());
            }
        });
//ButtonStörMeldungAbsetzen----------------------------------------------------------------------------------------------------------------------

        Button bStoerMeldungAbsetzen = new Button("Stör-Meldung absetzen");
        bStoerMeldungAbsetzen.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        bStoerMeldungAbsetzen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                //istStoerMeldungButtonGedruecktWorden =true;
                //this.
                //ToDo
                //hier kommt eine ifschleife rein, damit button sofern gelb geklickt, rot wird,
                //darf sich nicht mehr verändern, muss wie gesperrt sein
                bGurte.setStyle("-fx-background-color: red");//darkred
                //bGurte.setDefaultButton(true);//ist es das vielleicht????????
            }
        });
//LayoutZeugs----------------------------------------------------------------------------------------------------------------------
        layoutHBundlader.getChildren().addAll(lBundlader,bGurte,bLichtSchranke1,bAnschlag,bSchutzZaun);
        layoutHVereinzelung.getChildren().addAll(lVereinzelung,bRollenSchraeg,bStopperBolzen1,bStopperBolzen123);
        layoutHRollgang1.getChildren().addAll(lRollgang1,bRollen1,bSchweissNahtErkennung,bPinchRolle12);
        layoutHMessstation.getChildren().addAll(lMessstation,bUSSensor,bLaser,bEinstellRollen,bLichtSchrankeM,bPumpeRueckFuehr,bSchutzTuereM);
        layoutHRollgang4.getChildren().addAll(lRollgang4,bPinchRolle3,bRollen4,bRohrAuswerfer,bSchrottGurte,bLichtSchranke2);
        layoutHWalkingBeam.getChildren().addAll(lWalkingBeam,bWalkingBeam,bDrehGreifer,bRadRat1);
        layoutV.getChildren().addAll(layoutHBundlader,layoutHVereinzelung,layoutHRollgang1,layoutHMessstation,layoutHRollgang4,layoutHWalkingBeam,bZurueckRat1,bStoerMeldungAbsetzen);
        cardAddafer.getChildren().addAll(layoutV);
        //ToDo ev ein retour button
        return cardAddafer;
    }

    public void setIstStoerMeldungButtonGedruecktWorden(Boolean istStoerMeldungButtonGedruecktWorden){
        this.istStoerMeldungButtonGedruecktWorden=istStoerMeldungButtonGedruecktWorden;
    }

}

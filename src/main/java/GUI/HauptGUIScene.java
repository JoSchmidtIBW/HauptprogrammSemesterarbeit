package GUI;
//package Abteilungen;

import Abteilungen.Abteilungen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
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

        VBox layoutV = new VBox(1);


        Label lHauptGui= new Label("- HauptGui -");
//        Label lWerAngemeldet = new Label("Wer ist hier eigentlich angebeldet, das soll hier stehen");
//        Label lAbmelden = new Label("Wo kommt Benutzer ABMELDEN REIN???");

        final Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben
//        final Group card1 = new Group(new Text(25, 25, "Card 1"));
//        final Group card2Anleitung = new Group(new Text(25, 25, "Anleitung"));

        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachAbteilung =
                {"Abteilung", "Dipartimento","Odjel", "Departamenti", "Bölüm"};


        Button bAbteilung = new Button(sprachAbteilung[Sprache.getSprachenZahl()]);//"Abteilung"
        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachAnleitung =
                {"Anleitung", "Manuale","priručnik", "manual", "düsturülamel"};
        Button bAnleitung = new Button(sprachAnleitung[Sprache.getSprachenZahl()]);//"Anleitung"


//        Button bRattunde1 = new Button("Rattunde1");
//        bRattunde1.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                cardsPane.getChildren().clear();
//                cardsPane.getChildren().add(new Rattunde1(cardsPane).macheRattunde1());
//            }
//        });


        bAbteilung.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Abteilungen(cardsPane).macheAbteilung());
                //cardsPane.getChildren().add(new Abteilungen(cardsPane).macheAbteilung())
            }
        });
//        bAbteilung.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                cardsPane.getChildren().clear();
//                cardsPane.getChildren().add(card1);
//            }
//        });

        bAnleitung.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                //cardsPane.getChildren().add(card2Anleitung);
                //cardsPane.getChildren().add(new GroupStack2(cardsPane).macheGroup2());
                cardsPane.getChildren().add(new Anleitung(cardsPane).macheAnleitung());
            }
        });

        HBox layoutH1 = new HBox(1);
        layoutH1.getChildren().addAll(bAbteilung,bAnleitung);


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachAbmelden =
                {"Abmelden", "Disconnettersi","Odjaviti se", "Çregjistrohu", "Çıkış Yap"};
        Button bZuruekLogin = new Button(sprachAbmelden[Sprache.getSprachenZahl()]);//"Abmelden"
        //bZuruekLogin.setOnAction(e -> stage.setScene(Login.createLoginScene(stage)));
        bZuruekLogin.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                Login.setIsFoundInDbAndPasswortCorrect(false);
                Login.isFoundInDB=false;
                stage.setScene(Login.createLoginScene(stage));
            }
        });



        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachZurueckSprache =
                {"Zurück-Sprache", "Indietro linguaggio  ","Nazad jezik", "Mbrapa gjuhe", "geri dilim"};
        Button bZuruekSprache = new Button(sprachZurueckSprache[Sprache.getSprachenZahl()]);//"Zurück-Sprache"
        bZuruekSprache.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));

        //HBox layoutH2 = new HBox(1);
        //layoutH2.getChildren().addAll(bZuruekLogin,bZuruekSprache,TaskLeistePane.getPane());

        HBox layoutHlHauptGuiScene = new HBox(557);
        HBox layoutHZurueckSpracheAbmelden = new HBox(1);
        layoutHZurueckSpracheAbmelden.getChildren().addAll(bZuruekSprache,bZuruekLogin);
        layoutHlHauptGuiScene.getChildren().addAll(lHauptGui,layoutHZurueckSpracheAbmelden);

        layoutV.getChildren().addAll(layoutHlHauptGuiScene,layoutH1, cardsPane,TaskLeistePane.getPane());

        Scene hauptGuiScene = new Scene(new ScrollPane(layoutV),800,628);
        return hauptGuiScene;
    }



}


//class GroupStack2{
//    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben
//
//    public GroupStack2(Pane cardsPane){
//        this.cardsPane=cardsPane;
//    }
//
//    public Group macheGroup2(){
//        final Group card2 = new Group(new Text(25, 25, "Card 2"));
//        return card2;
//    }
//
//}
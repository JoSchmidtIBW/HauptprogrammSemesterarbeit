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
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 28.12.2021, 14:51
 */
public class HauptGUIScene {

    public static Scene createGetHauptScene(Stage stage) {

        VBox layoutV = new VBox(22);
        //layoutV.setPrefSize(500, 100);

        Label lHauptGui = new Label("- HauptGui -");

        final Pane cardsPane = new StackPane();
        //damit leeres cardPane, damit Taskleiste nicht oben, nur schönheit für Präsentation
        Label lSinnlos = new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        cardsPane.getChildren().addAll(lSinnlos);


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachAbteilung =
                {"Abteilung", "Dipartimento", "Odjel", "Departamenti", "Bölüm"};
        Button bAbteilung = new Button(sprachAbteilung[Sprache.getSprachenZahl()]);//"Abteilung"


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachAnleitung =
                {"Anleitung", "Manuale", "priručnik", "manual", "düsturülamel"};
        Button bAnleitung = new Button(sprachAnleitung[Sprache.getSprachenZahl()]);//"Anleitung"


        bAbteilung.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Abteilungen(cardsPane).macheAbteilung());
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
        layoutH1.getChildren().addAll(bAbteilung, bAnleitung);


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachAbmelden =
                {"Abmelden", "Disconnettersi", "Odjaviti se", "Çregjistrohu", "Çıkış Yap"};
        Button bZuruekLogin = new Button(sprachAbmelden[Sprache.getSprachenZahl()]);//"Abmelden"
        //bZuruekLogin.setOnAction(e -> stage.setScene(Login.createLoginScene(stage)));
        bZuruekLogin.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                Login.setIsFoundInDbAndPasswortCorrect(false);
                Login.isFoundInDB = false;
                stage.setScene(Login.createLoginScene(stage));
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachZurueckSprache =
                {"Zurück-Sprache", "Indietro linguaggio  ", "Nazad jezik", "Mbrapa gjuhe", "geri dilim"};
        Button bZuruekSprache = new Button(sprachZurueckSprache[Sprache.getSprachenZahl()]);//"Zurück-Sprache"
        bZuruekSprache.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));

        //HBox layoutH2 = new HBox(1);
        //layoutH2.getChildren().addAll(bZuruekLogin,bZuruekSprache,TaskLeistePane.getPane());

        HBox layoutHlHauptGuiScene = new HBox(564);//557
        HBox layoutHZurueckSpracheAbmelden = new HBox(1);
        layoutHZurueckSpracheAbmelden.getChildren().addAll(bZuruekSprache, bZuruekLogin);
        layoutHlHauptGuiScene.getChildren().addAll(lHauptGui, layoutHZurueckSpracheAbmelden);

        BorderPane borderPaneTP = new BorderPane();
        borderPaneTP.setCenter(layoutV);

        //VBox layoutVCardsPane = new VBox(300);//dann geht gar nicht

        layoutV.getChildren().addAll(layoutHlHauptGuiScene, layoutH1, cardsPane, TaskLeistePane.getPane());
        //layoutV.getChildren().addAll(layoutHlHauptGuiScene, layoutH1, layoutVCardsPane, TaskLeistePane.getPane());//geht gar nicht

        Scene hauptGuiScene = new Scene(new ScrollPane(borderPaneTP), 850, 628);
        //Scene hauptGuiScene = new Scene(new ScrollPane(layoutV),800,628);
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
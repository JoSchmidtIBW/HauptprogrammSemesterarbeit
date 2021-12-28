package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 28.12.2021, 20:54
 */
public class MADelete {


    public static Scene createMADeleteScene(Stage stage){

        Label labelMADeleteScene= new Label("- MADelete- Scene - Mitarbeiter löschen");
//MA-NummerNeu----------------------------------------------------------------------------------------------------------
//        Label lMANummerNeu = new Label("Neue MA.-Nummer");
//        TextField txfMANummerNeu = new TextField(eingabeMANummerNeu);
//
//        Button bMANummerNeu = new Button("MA-NummerNeuOK");
//        Label lzeigeMANummerNeu = new Label();
//        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
//        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+txfMANummer.getText()));
//        bMANummerNeu.setOnAction(e -> {
//            lzeigeMANummerNeu.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerNeu.getText());
//            setEingabeMANummerNeu(txfMANummerNeu.getText());
//            System.out.println(getEingabeMANummerNeu());
//        });

//MADelete---------------------------------------------------------------------------------------------
        Button bMADelete = new Button("MA-Delete");
//ZurückSprache---------------------------------------------------------------------------------------------------------
        Button bZurueckSpracheMADelete= new Button("Go to Sprache - Scene");
        bZurueckSpracheMADelete.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));
//LayoutZeugs-----------------------------------------------------------------------------------------------------------
        VBox layoutVR= new VBox(1);



        layoutVR.getChildren().addAll(labelMADeleteScene,bMADelete,bZurueckSpracheMADelete,TaskLeistePane.getPane());

        //Scene sceneRegistrieren = new Scene(layoutVR);
        Scene sceneMADelete = new Scene(new ScrollPane(layoutVR),700,400);//hat scrollpane drin
        return sceneMADelete;
    }

}


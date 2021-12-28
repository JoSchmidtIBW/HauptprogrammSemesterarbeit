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

    public static String getEingabeMANummerDelete() {
        return eingabeMANummerDelete;
    }

    public static void setEingabeMANummerDelete(String eingabeMANummerDelete) {
        MADelete.eingabeMANummerDelete = eingabeMANummerDelete;
    }

    private static String eingabeMANummerDelete;

    public static Scene createMADeleteScene(Stage stage){

        Label labelMADeleteScene= new Label("- MADelete- Scene - Mitarbeiter löschen");
//MA-NummerNeu----------------------------------------------------------------------------------------------------------
        Label lMANummerDelete = new Label("Delete MA.-Nummer");
        TextField txfMANummerDelete = new TextField(eingabeMANummerDelete);

        Button bMANummerDelete = new Button("MA-NummerDeleteOK");
        Label lzeigeMANummerDelete = new Label();
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
        bMANummerDelete.setOnAction(e -> {
            lzeigeMANummerDelete.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerDelete.getText());
            setEingabeMANummerDelete(txfMANummerDelete.getText());
            System.out.println(getEingabeMANummerDelete());
        });

//MADelete---------------------------------------------------------------------------------------------
        Button bMADelete = new Button("MA-Delete");
//ZurückSprache---------------------------------------------------------------------------------------------------------
        Button bZurueckSpracheMADelete= new Button("Go to Sprache - Scene");
        bZurueckSpracheMADelete.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));
//LayoutZeugs-----------------------------------------------------------------------------------------------------------
        VBox layoutVD= new VBox(1);

        HBox layoutH = new HBox(1);

        layoutH.getChildren().addAll(lMANummerDelete,txfMANummerDelete,bMANummerDelete,lzeigeMANummerDelete);

        layoutVD.getChildren().addAll(labelMADeleteScene,layoutH,bMADelete,bZurueckSpracheMADelete,TaskLeistePane.getPane());

        //Scene sceneRegistrieren = new Scene(layoutVR);
        Scene sceneMADelete = new Scene(new ScrollPane(layoutVD),700,400);//hat scrollpane drin
        return sceneMADelete;
    }

}


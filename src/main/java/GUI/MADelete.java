package GUI;

import DatenBank.DatenBank;
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

    static  DatenBank dBD = new DatenBank();

    public static String getEingabeMANummerDelete() {
        return eingabeMANummerDelete;
    }

    public static void setEingabeMANummerDelete(String eingabeMANummerDelete) {
        MADelete.eingabeMANummerDelete = eingabeMANummerDelete;
    }

    private static String eingabeMANummerDelete;
    private static String ausgabeGesamtMANummerDeleteFrageVonDB;

    public static void setAusgabeSucheMANummerDeleteMitMANummerFrageDB(String ausgabeGesamtMANummerDeleteFrageVonDB) {
        MADelete.ausgabeGesamtMANummerDeleteFrageVonDB = ausgabeGesamtMANummerDeleteFrageVonDB;
    }
    public static String getAusgabeSucheMANummerDeleteMitMANummerFrageDB() {
        return ausgabeGesamtMANummerDeleteFrageVonDB;
    }


    public static Scene createMADeleteScene(Stage stage){

        Label labelMADeleteScene= new Label("- MADelete- Scene - Mitarbeiter löschen");
//MA-NummerNeu----------------------------------------------------------------------------------------------------------
        Label lMANummerDelete = new Label("Delete MA.-Nummer");
        TextField txfMANummerDelete = new TextField();

        Button bMANummerDelete = new Button("MA-NummerDeleteOK");
        Label lzeigeMANummerDelete = new Label();
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
        bMANummerDelete.setOnAction(e -> {
            eingabeMANummerDelete = txfMANummerDelete.getText();

            String strMANummerDeleteFrage = txfMANummerDelete.getText();
            String ausgabeGesamtMANummerDeleteFrageVonDB = "SELECT * FROM userMubea WHERE MA_Nummer = '"+strMANummerDeleteFrage+"';";
            setAusgabeSucheMANummerDeleteMitMANummerFrageDB(dBD.ausgebenGesamtDBRetourString(ausgabeGesamtMANummerDeleteFrageVonDB));
            System.out.println("DBD AusgabeSucheMANummerDeleteMitMANummerFrageDB: " + getAusgabeSucheMANummerDeleteMitMANummerFrageDB());
//eingabeMANummerNeu
            if(eingabeMANummerDelete.length()==0){//wenn leer//eingabeVornameNeu.length()==0//strMANummerFrage==null
                lzeigeMANummerDelete.setTextFill(Color.RED);
                lzeigeMANummerDelete.setText("der zu löschende User muss einen Mitarbeiter- Nummer besitzen!");
            }
            else{//else if(eingabeMANummerNeu != null){
                if(getAusgabeSucheMANummerDeleteMitMANummerFrageDB().isEmpty()){
                    System.out.println("Mitarbeiter gibt es nicht");
                    //ToDo Darf keine Leertaste haben und nur aus Zahlen bestehen!!!
                    //lzeigeMANummerDelete.setText("JUNIT-Test: Enthält keine Zahl!!!" + txfMANummerDelete.getText());
//                    lzeigeMANummerNeu.setTextFill(Color.GREEN);
//                    setEingabeMANummerNeu(txfMANummerNeu.getText());
//                    System.out.println(getEingabeMANummerNeu());
                    lzeigeMANummerDelete.setTextFill(Color.RED);
                    lzeigeMANummerDelete.setText("Der User existiert nicht!");
                }
                else {
                    System.out.println("Mitarbeiter existiert");
                    lzeigeMANummerDelete.setTextFill(Color.GREEN);
                    lzeigeMANummerDelete.setText("Der User wurde gefunden");
                    setEingabeMANummerDelete(txfMANummerDelete.getText());
                }
//                else if(!getAusgabeSucheMANummerMitMANummerFrageDB().isEmpty()&&eingabeMANummerNeu != null){
//                lzeigeMANummerNeu.setTextFill(Color.RED);
//                lzeigeMANummerNeu.setText("User muss einen Mitarbeiter- Nummer besitzen!");
//                }
            }




//            lzeigeMANummerDelete.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerDelete.getText());
//            setEingabeMANummerDelete(txfMANummerDelete.getText());
//            System.out.println(getEingabeMANummerDelete());
        });

//MADelete---------------------------------------------------------------------------------------------
        Button bMADelete = new Button("MA-Delete");
        Label lZeigeMADelete = new Label();
        bMADelete.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(getEingabeMANummerDelete().length()==0){
                    lZeigeMADelete.setText("Erst muss eine MA- Nummer eingegeben werden!");
                    lZeigeMADelete.setTextFill(Color.RED);
                }
                else{
                    String schreibeMADeleteInDB = "DELETE FROM userMubea WHERE MA_Nummer = '"+ getEingabeMANummerDelete()+"';";
                    dBD.schreibeDB(schreibeMADeleteInDB);
                    lZeigeMADelete.setText("Der User wurde erfolgreich gelöscht\nID geseht ez halt komisch us, aber mir egal");
                    lZeigeMADelete.setTextFill(Color.GREEN);
                }
                setEingabeMANummerDelete("");
            }
        });
//ZurückSprache---------------------------------------------------------------------------------------------------------
        Button bZurueckSpracheMADelete= new Button("Go to Sprache - Scene");
        bZurueckSpracheMADelete.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));
//LayoutZeugs-----------------------------------------------------------------------------------------------------------
        VBox layoutVD= new VBox(1);

        HBox layoutH = new HBox(1);
        HBox layoutHDelete = new HBox(1);

        layoutH.getChildren().addAll(lMANummerDelete,txfMANummerDelete,bMANummerDelete,lzeigeMANummerDelete);
        layoutHDelete.getChildren().addAll(bMADelete,lZeigeMADelete);
        layoutVD.getChildren().addAll(labelMADeleteScene,layoutH,layoutHDelete,bZurueckSpracheMADelete,TaskLeistePane.getPane());

        //Scene sceneRegistrieren = new Scene(layoutVR);
        Scene sceneMADelete = new Scene(new ScrollPane(layoutVD),700,400);//hat scrollpane drin
        return sceneMADelete;
    }

}


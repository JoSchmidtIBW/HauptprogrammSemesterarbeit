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
 * 28.12.2021, 15:15
 */
public class PasswortChange {

    public static Scene createPasswortChangeScene(Stage stage) {
        Label lPasswortChangeScene = new Label("- Bin die Passwort-Change- Scene -");



//AltesPasswort---------------------------------------------------------------------------------------------------------
        Label lPassWortALtI = new Label("Altes Passwort");
        final PasswordField pFIPasswortAlt = new PasswordField();

        Button bPasswortAltOK = new Button("PasswortAltOK");
        final Label lzeigePasswortAlt = new Label("");

        bPasswortAltOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

//                System.out.println("bin drin");
//                if(isFoundInDB==false){//txfMANummerL leer??
//                    //System.out.println("bin noch mehr drin");
//                    lzeigePasswortL.setText("Your password is incorrect! \n FIRST WRITE MA_NUMMER!!!!!");
//                    lzeigePasswortL.setTextFill(Color.rgb(210, 39, 30));
//                }else {
//                    //System.out.println("bin schon hier");
//                    lzeigePasswortL.setText("Your password is incorrect! aber noch nicht eingegeben");
////                    String eingabeMaNummerUndPasswortDB = "SELECT * FROM userMubea WHERE MA_Nummer = '" + txfMANummerL.getText() + "' AND Passwort_User = '" + pFInternetL.getText() + "'";
////                    String ausgabeDbMaNummerUndPasswort = dbL1.ausgebenGesamtDBRetourString(eingabeMaNummerUndPasswortDB);
////                    System.out.println("jeeehaaa: " + ausgabeDbMaNummerUndPasswort);
//                }
//
//                //überprüfung allenfals, ob beide Spalten doppelt sind oder falsch sind, aber braucht es nicht
//                String eingabeMaNummerUndPasswortDB = "SELECT * FROM userMubea WHERE MA_Nummer = '" + txfMANummerL.getText() + "' AND Passwort_User = '" + pFInternetL.getText() + "'";
//                String ausgabeDbMaNummerUndPasswort = dbL1.ausgebenGesamtDBRetourString(eingabeMaNummerUndPasswortDB);
//                System.out.println("Überprüfung passwort und Ma-Nummer in DB: " + ausgabeDbMaNummerUndPasswort);
//
//                System.out.println("getPasswortUser: "+getPasswort_User());
//
//                //Entweder splitten nochmals und vergleichen
//                //oder nur ausgeben eineSpalte, retour String
//
//                // } else
//                if( (pFInternetL.getText().equals(getPasswort_User())) && isFoundInDB==true){//(!pFInternetL.getText().equals(null)) ) {
//                    setIsFoundInDbAndPasswortCorrect(true);
//                    lzeigePasswortL.setText("Your password has been confirmed");
//                    lzeigePasswortL.setTextFill(Color.rgb(21, 117, 84));
//                }
//                else if (!pFInternetL.getText().equals(getPasswort_User()) || !pFInternetL.getText().equals(null)) {
//                    setIsFoundInDbAndPasswortCorrect(false);//isFoundInDbAndPasswortCorrect
//                    lzeigePasswortL.setText("Your password is incorrect! \n oder es ist weder Passwort noch Manummer eingegeben worden");
//                    lzeigePasswortL.setTextFill(Color.rgb(210, 39, 30));
//                }
//                //}
//                pFIPasswortAlt.clear();
            }
        });
//NeuesPasswort---------------------------------------------------------------------------------------------------------
        Label lPassWortNeuI = new Label("Neues Passwort");
        final PasswordField pFIPasswortNeu = new PasswordField();

        Button bPasswortNeuOK = new Button("PasswortNeuOK");
        final Label lzeigePasswortNeu = new Label("");

        bPasswortNeuOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

//                pFIPasswortNeu.clear();
            }
        });
//NeuesPasswortWiederholen---------------------------------------------------------------------------------------------------------
        Label lPassWortNeuWiederholenI = new Label("Neues Passwort wiederholen");
        final PasswordField pFIPasswortNeuWiederholen = new PasswordField();

        Button bPasswortNeuWiederholenOK = new Button("PasswortNeuWiederholenOK");
        final Label lzeigePasswortNeuWiederholen = new Label("");

        bPasswortNeuWiederholenOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

//                pFIPasswortNeuWiederholen.clear();
            }
        });
//IhrPasswortWurdeGeändert---------------------------------------------------------------------------------------------------------
        Label lPassWortAendern = new Label("Passwort ändern?");
        Button bPasswortAendernOK = new Button("PasswortAendernOK");
        final Label lzeigePasswortAendern = new Label("");

        bPasswortAendernOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

//                pFIPasswortNeuWiederholen.clear();
            }
        });
//Zurück----------------------------------------------------------------------------------------------------------------
        Button bZurueckSprache = new Button("Zurück");
        bZurueckSprache.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));





        VBox layoutV1 = new VBox(1);
        HBox layoutHPasswortAlt = new HBox(1);
        HBox layoutHPasswortNeu = new HBox(1);
        HBox layoutHPasswortNeuWiederholen = new HBox(1);
        HBox layoutHPasswortAendern = new HBox(1);

        layoutHPasswortAlt.getChildren().addAll(lPassWortALtI,pFIPasswortAlt,bPasswortAltOK,lzeigePasswortAlt);
        layoutHPasswortNeu.getChildren().addAll(lPassWortNeuI,pFIPasswortNeu,bPasswortNeuOK,lzeigePasswortNeu);
        layoutHPasswortNeuWiederholen.getChildren().addAll(lPassWortNeuWiederholenI,pFIPasswortNeuWiederholen,bPasswortNeuWiederholenOK,lzeigePasswortNeuWiederholen);
        layoutHPasswortAendern.getChildren().addAll(lPassWortAendern,bPasswortAendernOK,lzeigePasswortAendern);


        layoutV1.getChildren().addAll(layoutHPasswortAlt,layoutHPasswortNeu,layoutHPasswortNeuWiederholen,layoutHPasswortAendern,bZurueckSprache,TaskLeistePane.getPane());


        Scene scenePasswortChange = new Scene(new ScrollPane(layoutV1), 650, 200);//scene braucht ein Layout, hat scrollpane drin

        return scenePasswortChange;
    }
}
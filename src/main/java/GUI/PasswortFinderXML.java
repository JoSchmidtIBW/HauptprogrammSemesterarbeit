package GUI;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 09.01.2022, 01:04
 */
public class PasswortFinderXML {
   // private Stage stage;

    public static Scene createPasswortFinderScene(Stage stage) throws Exception {
       // FXMLLoader fxmlLoader = new FXMLLoader(PasswortFinderXML.class.getResource("passwortFinderXML.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(PasswortFinderXML.class.getResource("/passwortFinderXML.fxml"));

//        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/createCategory.fxml"));
//        //                                                           ^


        ScrollPane scrollPane1 = new ScrollPane();

        //Scene scenePasswortFinder = new Scene(scrollPane1, 650, 200);//new ScrollPane(), 650, 200

        //Scene    scenePasswortFinder = new Scene(new ScrollPane(fxmlLoader.load()), 650, 200);//entweder new scrollpane oder irgendwie anderst


        //FXMLLoader fxmlLoader = new FXMLLoader(PasswortFinderXML.class.getResource("passwortFinderXML.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(PasswortFinderXML.class.getClassLoader().getResource("passwortFinderXML.fxml"));
        Scene scenePasswortFinder = new Scene(fxmlLoader.load(), 320, 240);                      // /


        return scenePasswortFinder;
    }

    @FXML
    private PasswordField passwordField;

    @FXML private Text actiontargetPasswortAusgeben;
    @FXML protected void handlePWSucheButtonAction(ActionEvent event) {
//        String lMANummer = txfMANummerL.getText();
//        String ausgabeGesamtString22 = "SELECT * FROM userMubea WHERE MA_Nummer = '"+lMANummer+"'";
//        setAusgabeSucheMANummerMitNameDB(dbL1.ausgebenGesamtDBRetourString(ausgabeGesamtString22));
//        System.out.println("DBL1 ausgabeSucheMANummerMitNameDB: " + getAusgabeSucheMANummerMitNameDB());
//        werIstAngemeldet = getAusgabeSucheMANummerMitNameDB();
//        setWerIstAngemeldet(werIstAngemeldet);
//        System.out.println("werIstAngemeldet "+getWerIstAngemeldet());
//        splittWerIstAngemeldet(werIstAngemeldet);
//        System.out.println("oooooooohhhh  soo geil du  Static  --> "+ getPasswort_User());
//        //setWerIstAngemeldet(getAusgabeSucheMANummerMitNameDB());
//        if(ausgabeSucheMANummerMitNameDB.equals("")){
//            lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText()+"Sie sind kein Mitarbeiter!");
//            lzeigeMANummerL.setTextFill(Color.web("#ff0000", 0.8));
//            isFoundInDB=false;
//        }else{
//            lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText()+"Sie wurden in der Datenbank gefunden");
//            lzeigeMANummerL.setTextFill(Color.rgb(21, 117, 84));
//            isFoundInDB=true;//??? atomic was???
//        }
        actiontargetPasswortAusgeben.setText("MA-Nummer ist: "+passwordField.getText());
    }

//    @FXML protected void handleZurueckButtonAction(ActionEvent event, Stage stage) {
//        stage.setScene(Sprache.createSpracheScene(stage));
//    }

    public void handleZurueckButtonAction(ActionEvent actionEvent) {
        Stage stage = new Stage();

        //Main.
        System.out.println("Mir egal :) bin jo Admin... ");
        //Platform.exit();
        ///stage.close();
        stage.setScene(Sprache.createSpracheScene(stage));
//stage.close();
        stage.show();

        //Platform.exit();
        //System.exit(0);
    }
}

package GUI;


import DatenBank.DatenBank;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author - John Schmidt
 * 12.12.2021, 13:52
 */
public class Login {
    //Scene scene1, scene2;//muss noch angeschaut werden
    static boolean isFoundInDB = false;

    public static Scene createLoginScene(Stage stage){
        DatenBank dbL1 = new DatenBank();
        //AtomicBoolean isFoundInDB = new AtomicBoolean(false);

        Label lLoginScene1= new Label("- Bin die Login-Scene -");

        Label lLoginBenutzername = new Label("Benutzername");
        TextField txfLoginBenutzername = new TextField();
        Button bLoginBenutzerNameOK = new Button("LoginBenutzerNameOK");

        Label lMANummerL = new Label("LMANummer");
        TextField txfMANummerL = new TextField();
        //eingabeMANummer = txfMANummer.getText();
        Button bMANummerL = new Button("MA-Nummer");
        Label lzeigeMANummerL = new Label();
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+txfMANummer.getText()));
        bMANummerL.setOnAction(e -> {

            String lMANummer = txfMANummerL.getText();
            String ausgabeGesamtString22 = "SELECT * FROM userMubea WHERE MA_Nummer = '"+lMANummer+"'";
            String ausgabeSucheMANummerMitNameDB = dbL1.ausgebenGesamtDBRetourString(ausgabeGesamtString22);
            System.out.println("DBL1 ausgabeSucheMANummerMitNameDB: " + ausgabeSucheMANummerMitNameDB);
            if(ausgabeSucheMANummerMitNameDB.equals("")){
                lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText()+"Sie sind kein Mitarbeiter!");
                lzeigeMANummerL.setTextFill(Color.web("#ff0000", 0.8));
                isFoundInDB=false;
            }else{
                lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText()+"Sie wurden in der Datenbank gefunden");
                lzeigeMANummerL.setTextFill(Color.rgb(21, 117, 84));
                isFoundInDB=true;//??? atomic was???
            }

           // lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText());
//            setEingabeMANummerL(txfMANummerL.getText());
//            System.out.println(getEingabeMANummerL());
        });

        Label lLoginPasswort = new Label("Passwort:");
        TextField txfLoginPasswort = new TextField();
        Button bLoginPasswortOK = new Button("LoginPasswortOK");

        Label lLoginRegistrieren = new Label("Registrieren");
        Button bLoginRegistrieren = new Button("Passwort Vergessen - Hilfe kommt");
        Button button1= new Button("Go to Registrieren- Scene");
        //button1.setOnAction(e -> primaryStage.setScene(scene2));
        button1.setOnAction(e -> stage.setScene(Registrieren.createRegistrierenScene(stage)));
        //todo button sprache anderst machen
        Button buttonSprache = new Button("Go to HauptGui wenn Login erfolgreich aus DB");
       // buttonHauptGUI.setOnAction(e -> stage.setScene(HauptGUIScene.createGetHauptScene(stage)));
       // buttonHauptGUI.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));
//        buttonHauptGUI.setOnAction(event -> {
//            Scene newSceneRegistrieren = new Registrieren();// ... commands which define the new scene.
//                   // Stage stage = ((Node) event.getTarget()).getScene().getStage();
//            // or alternatively, just:
//             Stage stage =  buttonHauptGUI.getScene().getStage();
//            stage.setScene(newSceneRegistrieren);
//        });
        //   scene.setOnMouseClicked(e -> changeScene(scene2));
        System.out.println("isFoundInDB"+isFoundInDB );
        Label lZeigeIsFoundInDBL = new Label();
        buttonSprache.setOnAction(e -> {
            if(isFoundInDB== true){
                System.out.println("bin drin Hello Kitty");
                stage.setScene(Sprache.createSpracheScene(stage));
            }else {//if(isFoundInDB==false)
                lZeigeIsFoundInDBL.setTextFill(Color.web("#ff0000", 0.8));
                lZeigeIsFoundInDBL.setText("Sie müssen sich erst Anmelden!");
                //lzeigeMANummerL.setTextFill(Color.web("#ff0000", 0.8));
                System.out.println("isFoundDB ist false!!!!");
            }
        });



        VBox layoutV1 = new VBox(1);
        HBox layoutHMANummerL = new HBox(1);
        HBox layoutHBenutzername = new HBox(1);
        HBox layoutHPasswort = new HBox(1);
        HBox layoutGoToSprache = new HBox(1);

        layoutHMANummerL.getChildren().addAll(lMANummerL,txfMANummerL,bMANummerL,lzeigeMANummerL);
        layoutHBenutzername.getChildren().addAll(lLoginBenutzername,txfLoginBenutzername,bLoginBenutzerNameOK);//muss addAll sein
        layoutHPasswort.getChildren().addAll(lLoginPasswort,txfLoginPasswort,bLoginPasswortOK);
        layoutGoToSprache.getChildren().addAll(buttonSprache,lZeigeIsFoundInDBL);

        layoutV1.getChildren().addAll(lLoginScene1,layoutHMANummerL,layoutHBenutzername,layoutHPasswort,bLoginRegistrieren,button1,layoutGoToSprache);

        //Scene sceneLogin = new Scene(layoutV1);//scene braucht ein Layout
        Scene sceneLogin = new Scene(new ScrollPane(layoutV1),400,200);//scene braucht ein Layout, hat scrollpane drin
        //Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        //scene1 = new Scene(layoutV1, 800, 400);
        //scene1.setFill(Color.YELLOWGREEN);
        return sceneLogin;
    }
}


//scene1= new Scene(layoutV1, 350, 250);
//final Scene scene = new Scene(root, 800, 400, Color.BEIGE);
//scene1 = new Scene(layoutV1, 800, 400, Color.TOMATO);
//scene1.setStyle("-fx-background-color: #FFFFFF;");
//scene1.setFill(Color.YELLOW);
package GUI;


import DatenBank.DatenBank;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicBoolean;

import static javafx.scene.text.FontWeight.BOLD;

/**
 * @author - John Schmidt
 * 12.12.2021, 13:52
 */
public class Login {
    //Scene scene1, scene2;//muss noch angeschaut werden
    static boolean isFoundInDB = false;

    public  static  String eingabeMANummerL = "";

    public static boolean isIsFoundInDbAndPasswortCorrect() {
        return isFoundInDbAndPasswortCorrect;
    }

    public static void setIsFoundInDbAndPasswortCorrect(boolean isFoundInDbAndPasswortCorrect) {
        Login.isFoundInDbAndPasswortCorrect = isFoundInDbAndPasswortCorrect;
    }

    static boolean isFoundInDbAndPasswortCorrect = false;

    public static String getWerIstAngemeldet() {
        return werIstAngemeldet;
    }

    public static void setWerIstAngemeldet(String werIstAngemeldet) {
        Login.werIstAngemeldet = werIstAngemeldet;
    }

    static String werIstAngemeldet = "";

    public static String getiD_User() {
        return iD_User;
    }


    public static void setiD_User(String iD_User) {//newiD_User
        Login.iD_User = iD_User;
    }

    public static String getVorName() {
        return vorName;
    }

    public static void setVorName(String vorName) {
        Login.vorName = vorName;
    }

    public static String getNachName() {
        return nachName;
    }

    public static void setNachName(String nachName) {
        Login.nachName = nachName;
    }

    public static String getPasswort_User() {
        return passwort_User;
    }

    public static void setPasswort_User(String passwort_User) {
        Login.passwort_User = passwort_User;
    }

    public static String getMaNummer() {
        return maNummer;
    }

    public static void setMaNummer(String maNummer) {
        Login.maNummer = maNummer;
    }

    public     static   String iD_User = "";
    public static String vorName = "";
    public static String nachName = "";
    public static String passwort_User = "";
    public static String maNummer = "";

    public static String getIstChef() {
        return istChef;
    }

    public static void setIstChef(String istChef) {
        Login.istChef = istChef;
    }

    public static String istChef = "";

    public static String getIstUnterhalt() {
        return istUnterhalt;
    }

    public static void setIstUnterhalt(String istUnterhalt) {
        Login.istUnterhalt = istUnterhalt;
    }

    public static String istUnterhalt = "";

//    public String getWerIstAngemeldet() {
//        return werIstAngemeldet;
//    }

    public static void splittWerIstAngemeldet(String werIstAngemeldet) {
        //this.werIstAngemeldet = werIstAngemeldet;
        // werIstAngemeldet.split()
        //String datumStart = "22 11 2000 ";
//werIstAngemeldet//1/Administrator/Administrator/1234/33////
        String iD_User = "";
        String vorName = "";
        String nachName = "";
        String maNummer = "";
        String passwort_User = "";
        String istChef = "";
        String istUnterhalt = "";


        int zaehlerFuerSchraegerBuchstabe = 0;
        while(zaehlerFuerSchraegerBuchstabe<werIstAngemeldet.length()){
            if (werIstAngemeldet.charAt(zaehlerFuerSchraegerBuchstabe) == '/'){

                System.out.print("hat leertaste");

                String[] getrenntwerIstAngemeldetArr = werIstAngemeldet.split("/");


                iD_User = getrenntwerIstAngemeldetArr[0];
                setiD_User( iD_User);

                maNummer = getrenntwerIstAngemeldetArr[1];
                setMaNummer(maNummer);

                vorName = getrenntwerIstAngemeldetArr[2];
                setVorName(vorName);

                nachName = getrenntwerIstAngemeldetArr[3];
                setNachName(nachName);

                passwort_User = getrenntwerIstAngemeldetArr[4];
                setPasswort_User(passwort_User);

                istChef = getrenntwerIstAngemeldetArr[5];
                setIstChef(istChef);

                istUnterhalt = getrenntwerIstAngemeldetArr[6];
                setIstUnterhalt(istUnterhalt);

            }
            else {
                System.out.print("String ist leeeeeer");
            }
            zaehlerFuerSchraegerBuchstabe++;
        }
        System.out.println();
        System.out.println("nachnameStringalleine "+nachName);
        System.out.println("getiD_User "+getiD_User());
        System.out.println("werIstAngemeldet: "+werIstAngemeldet);
    }
    static String ausgabeSucheMANummerMitNameDB;

    public static Scene createLoginScene(Stage stage){
        DatenBank dbL1 = new DatenBank();
        //AtomicBoolean isFoundInDB = new AtomicBoolean(false);

        Font fontTitle = Font.font("Verdana", FontPosture.ITALIC, 20);
        Label lLoginScene1= new Label("- Welcome - Login -");
        lLoginScene1.setFont(fontTitle);

//        Label lLoginBenutzername = new Label("Benutzername");
//        TextField txfLoginBenutzername = new TextField();
//        Button bLoginBenutzerNameOK = new Button("LoginBenutzerNameOK");

        Label lMANummerL = new Label("MA-Nummer:");
        TextField txfMANummerL = new TextField();
        //eingabeMANummer = txfMANummer.getText();
        Button bMANummerL = new Button("MA-Nummer OK");
        Label lzeigeMANummerL = new Label();
        final PasswordField pFInternetL = new PasswordField();
        final Label lzeigePasswortL = new Label("");
        Label lZeigeIsFoundInDBL = new Label();
        Label lZeigePasswortVergessen = new Label();
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+txfMANummer.getText()));
        bMANummerL.setOnAction(e -> {

                    eingabeMANummerL = txfMANummerL.getText();
                    //ueberpruefungEingabeMANummerLogin(eingabeMANummerL);
                    lzeigeMANummerL.setText(ueberpruefungEingabeMANummerLogin(eingabeMANummerL));
//**********************************-------------------------------------//////////////////*****************************
                    if (ueberpruefungEingabeMANummerLogin(eingabeMANummerL).equals("leer")) {
                        lzeigeMANummerL.setTextFill(Color.RED);
                        lzeigeMANummerL.setText("Es muss eine Mitarbeiter- Nummer \neingegeben werden!");
                        pFInternetL.clear();
                        lzeigePasswortL.setText("");
                        lZeigeIsFoundInDBL.setText("");
                        lZeigePasswortVergessen.setText("");
                    } else if (ueberpruefungEingabeMANummerLogin(eingabeMANummerL).equals("Enthält keine Zahl")) {
                        lzeigeMANummerL.setTextFill(Color.DARKRED);
                        lzeigeMANummerL.setText("Falsche Eingabe \nDie Mitarbeiter- Nummer \nbesteht nur aus Zahlen!");
                        pFInternetL.clear();
                        lzeigePasswortL.setText("");
                        lZeigeIsFoundInDBL.setText("");
                        lZeigePasswortVergessen.setText("");
                    } else if (ueberpruefungEingabeMANummerLogin(eingabeMANummerL).equals("ist richtig")) {
                        //lzeigeMANummerL.setTextFill(Color.GREEN);
                    //}

                    String ausgabeGesamtString22 = "SELECT * FROM userMubea WHERE MA_Nummer = '" + eingabeMANummerL + "'";
                    setAusgabeSucheMANummerMitNameDB(dbL1.ausgebenGesamtDBRetourString(ausgabeGesamtString22));
                    System.out.println("DBL1 ausgabeSucheMANummerMitNameDB: " + getAusgabeSucheMANummerMitNameDB());
                    werIstAngemeldet = getAusgabeSucheMANummerMitNameDB();
                    setWerIstAngemeldet(werIstAngemeldet);
                    System.out.println("werIstAngemeldet " + getWerIstAngemeldet());
                    splittWerIstAngemeldet(werIstAngemeldet);
                    //System.out.println("oooooooohhhh  soo geil du  Static  --> " + getPasswort_User());
                    //setWerIstAngemeldet(getAusgabeSucheMANummerMitNameDB());
                    if (ausgabeSucheMANummerMitNameDB.equals("")) {
                        lzeigeMANummerL.setText("Falsche Mitarbeiter- Nummer --> " + txfMANummerL.getText() + "\nSie sind kein Mitarbeiter!");
                        lzeigeMANummerL.setTextFill(Color.web("#ff0000", 0.8));
                        isFoundInDB = false;
                        lZeigeIsFoundInDBL.setText("");
                        lZeigePasswortVergessen.setText("");
                    } else {
                        lzeigeMANummerL.setText("Sie wurden in der Datenbank gefunden :)\n--> " + txfMANummerL.getText());
                        lzeigeMANummerL.setTextFill(Color.rgb(21, 117, 84));
                        isFoundInDB = true;//??? atomic was???
                    }


                    }
//             lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText());
//            setEingabeMANummerL(txfMANummerL.getText());
//            System.out.println(getEingabeMANummerL());
        });
//------------------------------------------------------------------------------------------------------------------------
//        Label lLoginPasswort = new Label("Passwort:");
//        TextField txfLoginPasswort = new TextField();
//        Button bLoginPasswortOK = new Button("LoginPasswortOK");

        Label lPassWortInternetL = new Label("Passwort:       ");



        Button bLoginPasswortOK = new Button("LoginPasswortOK");

        bLoginPasswortOK.setOnAction(new EventHandler<ActionEvent>() {
        //pFInternetL.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                System.out.println("bin drin");
                if(isFoundInDB==false){//txfMANummerL leer??
                    //System.out.println("bin noch mehr drin");
                    lzeigePasswortL.setText("Your password is incorrect! \nFIRST WRITE MA_NUMMER!!!!!");
                    lzeigePasswortL.setTextFill(Color.rgb(210, 39, 30));
                    lZeigePasswortVergessen.setText("");
                }else {
                    //System.out.println("bin schon hier");
//                    lzeigePasswortL.setText("Your password is incorrect! \naber noch nicht eingegeben");
//                    lZeigeIsFoundInDBL.setText("");
//                    lZeigePasswortVergessen.setText("");
////                    String eingabeMaNummerUndPasswortDB = "SELECT * FROM userMubea WHERE MA_Nummer = '" + txfMANummerL.getText() + "' AND Passwort_User = '" + pFInternetL.getText() + "'";
////                    String ausgabeDbMaNummerUndPasswort = dbL1.ausgebenGesamtDBRetourString(eingabeMaNummerUndPasswortDB);
////                    System.out.println("jeeehaaa: " + ausgabeDbMaNummerUndPasswort);
//                }

                //überprüfung allenfals, ob beide Spalten doppelt sind oder falsch sind, aber braucht es nicht
                String eingabeMaNummerUndPasswortDB = "SELECT * FROM userMubea WHERE MA_Nummer = '" + txfMANummerL.getText() + "' AND Passwort_User = '" + pFInternetL.getText() + "'";
                String ausgabeDbMaNummerUndPasswort = dbL1.ausgebenGesamtDBRetourString(eingabeMaNummerUndPasswortDB);
                System.out.println("Überprüfung passwort und Ma-Nummer in DB: " + ausgabeDbMaNummerUndPasswort);

                System.out.println("getPasswortUser: "+getPasswort_User());

                //Entweder splitten nochmals und vergleichen
                //oder nur ausgeben eineSpalte, retour String

               // } else
                    if( (pFInternetL.getText().equals(getPasswort_User())) && isFoundInDB==true){//(!pFInternetL.getText().equals(null)) ) {
                        setIsFoundInDbAndPasswortCorrect(true);
                        lzeigePasswortL.setText("Your password has been confirmed");
                        lzeigePasswortL.setTextFill(Color.rgb(21, 117, 84));
                        lZeigePasswortVergessen.setText("");

                    }
                    else if (!pFInternetL.getText().equals(getPasswort_User()) || !pFInternetL.getText().equals(null)) {
                            setIsFoundInDbAndPasswortCorrect(false);//isFoundInDbAndPasswortCorrect
                            lzeigePasswortL.setText("Your password is incorrect!");
                            lzeigePasswortL.setTextFill(Color.rgb(210, 39, 30));
                        lZeigePasswortVergessen.setText("");

                    }
                }
                pFInternetL.clear();
            }
        });



//-------------------------------------------------------------------------------------------------------------------------

//        Button button1= new Button("Go to Registrieren- Scene");
//        //button1.setOnAction(e -> primaryStage.setScene(scene2));
//        button1.setOnAction(e -> stage.setScene(Registrieren.createRegistrierenScene(stage)));
        //todo button sprache anderst machen
        Button bAnmeldenSpracheScene = new Button("Anmelden");
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

        bAnmeldenSpracheScene.setOnAction(e -> {
            if(isFoundInDbAndPasswortCorrect== true){
                splittWerIstAngemeldet(werIstAngemeldet);
                stage.setScene(Sprache.createSpracheScene(stage));
            }else {//if(isFoundInDB==false)
                lZeigeIsFoundInDBL.setTextFill(Color.web("#ff0000", 0.8));
                lZeigeIsFoundInDBL.setText("Sie müssen sich erst Anmelden!");
                //lzeigeMANummerL.setTextFill(Color.web("#ff0000", 0.8));
                System.out.println("isFoundDB ist false!!!!");
                            //Fehlermeldungen und Eingaben unsichtbar-machen
                            txfMANummerL.clear();
                            lzeigeMANummerL.setText("");
                            lzeigePasswortL.setText("");
                            pFInternetL.clear();
                            lZeigePasswortVergessen.setText("");
            }
        });



        Button bPasswortVergessen = new Button("Passwort Vergessen");

        bPasswortVergessen.setOnAction(e -> {
            lZeigePasswortVergessen.setText("--> Tel. 9272 <--");
            lZeigePasswortVergessen.setTextFill(Color.DARKRED);
            lZeigePasswortVergessen.setFont(Font.font("Verdana", BOLD, 16));
        });

//    splittWerIstAngemeldet(werIstAngemeldet);

//        System.out.println("hallllooo bii "+getiD_User());
        //this.splittWerIstAngemeldet(werIstAngemeldet);
        //werIstAngemeldet


        GridPane gridP = new GridPane();
        gridP.setAlignment(Pos.CENTER);
        gridP.setHgap(10);
        gridP.setVgap(10);
        //gridP.setGridLinesVisible(true);
        gridP.setPadding(new Insets(25, 25, 25, 25));

        VBox layoutVTitle = new VBox(30);
        VBox layoutV1 = new VBox(7);
        HBox layoutHMANummerL = new HBox(3);
        //HBox layoutHBenutzername = new HBox(1);
        HBox layoutHPasswort = new HBox(3);
        HBox layoutGoToSprache = new HBox(1);
        HBox layoutHPasswortVergessen = new HBox(20);


        layoutHMANummerL.getChildren().addAll(lMANummerL,txfMANummerL,bMANummerL,lzeigeMANummerL);
        //layoutHBenutzername.getChildren().addAll(lLoginBenutzername,txfLoginBenutzername,bLoginBenutzerNameOK);//muss addAll sein
        layoutHPasswort.getChildren().addAll(lPassWortInternetL,pFInternetL,bLoginPasswortOK,lzeigePasswortL);
        layoutGoToSprache.getChildren().addAll(bAnmeldenSpracheScene,lZeigeIsFoundInDBL);
        layoutHPasswortVergessen.getChildren().addAll(bPasswortVergessen,lZeigePasswortVergessen);

        layoutVTitle.getChildren().addAll(lLoginScene1,layoutV1);
        layoutV1.getChildren().addAll(layoutHMANummerL,layoutHPasswort,layoutGoToSprache, layoutHPasswortVergessen);

        VBox layoutVHaupt = new VBox(30);
        layoutVHaupt.getChildren().addAll(layoutVTitle);
        gridP.add(layoutVHaupt,1,2);
        //Scene sceneLogin = new Scene(layoutV1);//scene braucht ein Layout
        Scene sceneLogin = new Scene(new ScrollPane(gridP),600,300);//scene braucht ein Layout, hat scrollpane drin
        //Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        //scene1 = new Scene(layoutV1, 800, 400);
        //scene1.setFill(Color.YELLOWGREEN);
        return sceneLogin;
    }

    public static String getAusgabeSucheMANummerMitNameDB() {
        return ausgabeSucheMANummerMitNameDB;
    }

    public static void setAusgabeSucheMANummerMitNameDB(String ausgabeSucheMANummerMitNameDB) {
        Login.ausgabeSucheMANummerMitNameDB = ausgabeSucheMANummerMitNameDB;
    }

    public static String ueberpruefungEingabeMANummerLogin(String eingabeMANummerL){

        if(eingabeMANummerL.length()==0){
            return "leer";
        }
        else{
//            if (text.matches("[0-9]+") && text.length() > 2) {
            if (!eingabeMANummerL.matches("[0-9]+")){
                return "Enthält keine Zahl";
            }
//            else{
//                return "Nummer viel zu lang";
//            }
        }

        return "ist richtig";
    }

}


//scene1= new Scene(layoutV1, 350, 250);
//final Scene scene = new Scene(root, 800, 400, Color.BEIGE);
//scene1 = new Scene(layoutV1, 800, 400, Color.TOMATO);
//scene1.setStyle("-fx-background-color: #FFFFFF;");
//scene1.setFill(Color.YELLOW);


//scene1= new Scene(layoutV1, 350, 250);
//final Scene scene = new Scene(root, 800, 400, Color.BEIGE);
//scene1 = new Scene(layoutV1, 800, 400, Color.TOMATO);
//scene1.setStyle("-fx-background-color: #FFFFFF;");
//scene1.setFill(Color.YELLOW);


//Sicherheit------------------------------------------------------------------------------------------------------------
//public class Login {
//    //Scene scene1, scene2;//muss noch angeschaut werden
//    static boolean isFoundInDB = false;
//
//    public static Scene createLoginScene(Stage stage){
//        DatenBank dbL1 = new DatenBank();
//        //AtomicBoolean isFoundInDB = new AtomicBoolean(false);
//
//        Label lLoginScene1= new Label("- Bin die Login-Scene -");
//
//        Label lLoginBenutzername = new Label("Benutzername");
//        TextField txfLoginBenutzername = new TextField();
//        Button bLoginBenutzerNameOK = new Button("LoginBenutzerNameOK");
//
//        Label lMANummerL = new Label("LMANummer");
//        TextField txfMANummerL = new TextField();
//        //eingabeMANummer = txfMANummer.getText();
//        Button bMANummerL = new Button("MA-Nummer");
//        Label lzeigeMANummerL = new Label();
//        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
//        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+txfMANummer.getText()));
//        bMANummerL.setOnAction(e -> {
//
//            String lMANummer = txfMANummerL.getText();
//            String ausgabeGesamtString22 = "SELECT * FROM userMubea WHERE MA_Nummer = '"+lMANummer+"'";
//            String ausgabeSucheMANummerMitNameDB = dbL1.ausgebenGesamtDBRetourString(ausgabeGesamtString22);
//            //Todo manummer und paswort gleich, dann zeige in taskleiste an,
//            System.out.println("DBL1 ausgabeSucheMANummerMitNameDB: " + ausgabeSucheMANummerMitNameDB);
//            if(ausgabeSucheMANummerMitNameDB.equals("")){
//                lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText()+"Sie sind kein Mitarbeiter!");
//                lzeigeMANummerL.setTextFill(Color.web("#ff0000", 0.8));
//                isFoundInDB=false;
//            }else{
//                lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText()+"Sie wurden in der Datenbank gefunden");
//                lzeigeMANummerL.setTextFill(Color.rgb(21, 117, 84));
//                isFoundInDB=true;//??? atomic was???
//            }
//
//            // lzeigeMANummerL.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerL.getText());
////            setEingabeMANummerL(txfMANummerL.getText());
////            System.out.println(getEingabeMANummerL());
//        });
////todo passwort internetpasswort verwenden und L am schluss für login zeugs
//        Label lLoginPasswort = new Label("Passwort:");
//        TextField txfLoginPasswort = new TextField();
//        Button bLoginPasswortOK = new Button("LoginPasswortOK");
//
//        Label lLoginRegistrieren = new Label("Registrieren");
//        Button bLoginRegistrieren = new Button("Passwort Vergessen - Hilfe kommt");
//        Button button1= new Button("Go to Registrieren- Scene");
//        //button1.setOnAction(e -> primaryStage.setScene(scene2));
//        button1.setOnAction(e -> stage.setScene(Registrieren.createRegistrierenScene(stage)));
//        //todo button sprache anderst machen
//        Button buttonSprache = new Button("Go to HauptGui wenn Login erfolgreich aus DB");
//        // buttonHauptGUI.setOnAction(e -> stage.setScene(HauptGUIScene.createGetHauptScene(stage)));
//        // buttonHauptGUI.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));
////        buttonHauptGUI.setOnAction(event -> {
////            Scene newSceneRegistrieren = new Registrieren();// ... commands which define the new scene.
////                   // Stage stage = ((Node) event.getTarget()).getScene().getStage();
////            // or alternatively, just:
////             Stage stage =  buttonHauptGUI.getScene().getStage();
////            stage.setScene(newSceneRegistrieren);
////        });
//        //   scene.setOnMouseClicked(e -> changeScene(scene2));
//        System.out.println("isFoundInDB"+isFoundInDB );
//        Label lZeigeIsFoundInDBL = new Label();
//        buttonSprache.setOnAction(e -> {
//            if(isFoundInDB== true){
//                System.out.println("bin drin Hello Kitty");
//                stage.setScene(Sprache.createSpracheScene(stage));
//            }else {//if(isFoundInDB==false)
//                lZeigeIsFoundInDBL.setTextFill(Color.web("#ff0000", 0.8));
//                lZeigeIsFoundInDBL.setText("Sie müssen sich erst Anmelden!");
//                //lzeigeMANummerL.setTextFill(Color.web("#ff0000", 0.8));
//                System.out.println("isFoundDB ist false!!!!");
//            }
//        });
//
//
//
//        VBox layoutV1 = new VBox(1);
//        HBox layoutHMANummerL = new HBox(1);
//        HBox layoutHBenutzername = new HBox(1);
//        HBox layoutHPasswort = new HBox(1);
//        HBox layoutGoToSprache = new HBox(1);
//
//        layoutHMANummerL.getChildren().addAll(lMANummerL,txfMANummerL,bMANummerL,lzeigeMANummerL);
//        layoutHBenutzername.getChildren().addAll(lLoginBenutzername,txfLoginBenutzername,bLoginBenutzerNameOK);//muss addAll sein
//        layoutHPasswort.getChildren().addAll(lLoginPasswort,txfLoginPasswort,bLoginPasswortOK);
//        layoutGoToSprache.getChildren().addAll(buttonSprache,lZeigeIsFoundInDBL);
//
//        layoutV1.getChildren().addAll(lLoginScene1,layoutHMANummerL,layoutHBenutzername,layoutHPasswort,bLoginRegistrieren,button1,layoutGoToSprache);
//
//        //Scene sceneLogin = new Scene(layoutV1);//scene braucht ein Layout
//        Scene sceneLogin = new Scene(new ScrollPane(layoutV1),400,200);//scene braucht ein Layout, hat scrollpane drin
//        //Scene scene = new Scene(root, 800, 400, Color.BEIGE);
//        //scene1 = new Scene(layoutV1, 800, 400);
//        //scene1.setFill(Color.YELLOWGREEN);
//        return sceneLogin;
//    }
//}
//
//
////scene1= new Scene(layoutV1, 350, 250);
////final Scene scene = new Scene(root, 800, 400, Color.BEIGE);
////scene1 = new Scene(layoutV1, 800, 400, Color.TOMATO);
////scene1.setStyle("-fx-background-color: #FFFFFF;");
////scene1.setFill(Color.YELLOW);
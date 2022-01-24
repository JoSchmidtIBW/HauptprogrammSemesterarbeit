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
 * 28.12.2021, 00:34
 */
public class Registrieren {

    public static DatenBank dBR = new DatenBank();

    private static String eingabeMANummerNeu;
    private static String eingabeVornameNeu;

    //private static String vornameNeu;

    private static String eingabeNachnameNeu;
    private static String eingabePasswortNeu;
    private static String eingabeIstChef;
    private static String eingabeIstUnterhalt;

    private static String ausgabeSucheMANummerMitMANummerFrageDB;


    private static void setEingabeMANummerNeu(String eingabeMANummerNeu) {
        Registrieren.eingabeMANummerNeu = eingabeMANummerNeu;
    }

    public static String getEingabeMANummerNeu() {
        return eingabeMANummerNeu;
    }

    public static void setEingabeVornameNeu(String eingabeVornameNeu) {
        Registrieren.eingabeVornameNeu = eingabeVornameNeu;
    }

    public static String getEingabeVornameNeu() {
        return eingabeVornameNeu;
    }

    public static void setEingabeNachnameNeu(String eingabeNachnameNeu) {
        Registrieren.eingabeNachnameNeu = eingabeNachnameNeu;
    }

    public static String getEingabeNachnameNeu() {
        return eingabeNachnameNeu;
    }

    public static void setEingabePasswortNeu(String eingabePasswortNeu) {
        Registrieren.eingabePasswortNeu = eingabePasswortNeu;
    }

    public static String getEingabePasswortNeu() {
        return eingabePasswortNeu;
    }

    public static void setEingabeIstChef(String eingabeIstChef) {
        Registrieren.eingabeIstChef = eingabeIstChef;
    }


    public static String getEingabeIstChef() {
        return eingabeIstChef;
    }

    public static void setEingabeIstUnterhalt(String eingabeIstUnterhalt) {
        Registrieren.eingabeIstUnterhalt = eingabeIstUnterhalt;
    }

    public static String getEingabeIstUnterhalt() {
        return eingabeIstUnterhalt;
    }


    public static void setAusgabeSucheMANummerMitMANummerFrageDB(String ausgabeSucheMANummerMitMANummerFrageDB) {
        Registrieren.ausgabeSucheMANummerMitMANummerFrageDB = ausgabeSucheMANummerMitMANummerFrageDB;
    }
    public static String getAusgabeSucheMANummerMitMANummerFrageDB() {
        return ausgabeSucheMANummerMitMANummerFrageDB;
    }


    public static Scene createRegistrierenScene(Stage stage) {

        Label labelRegistrierenScene = new Label("- Registrieren- Scene - Ein neuer Mitarbeiter wird geboren");
        TextField txfVornameNeu = new TextField();
        Label lZeigeVornameNeu = new Label();
        TextField txfNachnameNeu = new TextField();
        Label lZeigeNachnameNeu = new Label();
        TextField txfPasswortNeu = new TextField();
        Label lZeigePasswortNeu = new Label();
        Label lZeigeIstChefNeu = new Label("");
        Label lZeigeIstUnterhaltNeu = new Label("");
//MA-NummerNeu----------------------------------------------------------------------------------------------------------
        Label lMANummerNeu = new Label("Neue MA.-Nummer:");
        TextField txfMANummerNeu = new TextField();

        Button bMANummerNeu = new Button("MA-NummerNeuOK");
        Label lzeigeMANummerNeu = new Label();
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+txfMANummer.getText()));
        bMANummerNeu.setOnAction(e -> {
            eingabeMANummerNeu = txfMANummerNeu.getText();

            String strMANummerFrage = txfMANummerNeu.getText();
            String ausgabeGesamtMANummerFrageVonDB = "SELECT * FROM userMubea WHERE MA_Nummer = '"+strMANummerFrage+"';";
            setAusgabeSucheMANummerMitMANummerFrageDB(dBR.ausgebenGesamtDBRetourString(ausgabeGesamtMANummerFrageVonDB));
            System.out.println("DBR AusgabeSucheMANummerMitMANummerFrageDB: " + getAusgabeSucheMANummerMitMANummerFrageDB());
//eingabeMANummerNeu
            if(eingabeMANummerNeu.length()==0){//wenn leer//eingabeVornameNeu.length()==0//strMANummerFrage==null
                lzeigeMANummerNeu.setTextFill(Color.RED);
                lzeigeMANummerNeu.setText("User muss einen Mitarbeiter- Nummer besitzen!");
                txfMANummerNeu.setText("");
            }
            else{//else if(eingabeMANummerNeu != null){
                if(getAusgabeSucheMANummerMitMANummerFrageDB().isEmpty()){
                    System.out.println("Mitarbeiter gibt es nicht");
                    //ToDo Darf keine Leertaste haben und nur aus Zahlen bestehen!!!


                    if (Login.ueberpruefungEingabeMANummerLogin(eingabeMANummerNeu).equals("leer")) {
                        lzeigeMANummerNeu.setTextFill(Color.RED);
                        lzeigeMANummerNeu.setText("Es muss eine neue Mitarbeiter- Nummer \neingegeben werden!");
                        txfMANummerNeu.setText("");
                        lZeigeVornameNeu.setText("");
                        lZeigeNachnameNeu.setText("");
                        lZeigePasswortNeu.setText("");
                        lZeigeIstChefNeu.setText("");
                        lZeigeIstUnterhaltNeu.setText("");
                        txfVornameNeu.setText("");
                        txfNachnameNeu.setText("");
                        txfPasswortNeu.setText("");
                    } else if (Login.ueberpruefungEingabeMANummerLogin(eingabeMANummerNeu).equals("Enthält keine Zahl")) {
                        lzeigeMANummerNeu.setTextFill(Color.DARKRED);
                        lzeigeMANummerNeu.setText("Falsche Eingabe \nDie Mitarbeiter- Nummer \nbesteht nur aus Zahlen!");
                        txfMANummerNeu.setText("");
                        lZeigeVornameNeu.setText("");
                        lZeigeNachnameNeu.setText("");
                        lZeigePasswortNeu.setText("");
                        lZeigeIstChefNeu.setText("");
                        lZeigeIstUnterhaltNeu.setText("");
                        txfVornameNeu.setText("");
                        txfNachnameNeu.setText("");
                        txfPasswortNeu.setText("");
                    } else if (Login.ueberpruefungEingabeMANummerLogin(eingabeMANummerNeu).equals("ist richtig")) {
                        lzeigeMANummerNeu.setText("JUNIT-Test vielleicht Zahlgrösse??? " + txfMANummerNeu.getText());
                        lzeigeMANummerNeu.setTextFill(Color.GREEN);
                        setEingabeMANummerNeu(txfMANummerNeu.getText());
                        System.out.println(getEingabeMANummerNeu());
                    }

                }
                else {
                    System.out.println("Mitarbeiter existiert schon");
                    lzeigeMANummerNeu.setTextFill(Color.RED);
                    lzeigeMANummerNeu.setText("Mitarbeiter existiert schon!");
                    setEingabeMANummerNeu("");

                    txfMANummerNeu.setText("");
                    lZeigeVornameNeu.setText("");
                    lZeigeNachnameNeu.setText("");
                    lZeigePasswortNeu.setText("");
                    lZeigeIstChefNeu.setText("");
                    lZeigeIstUnterhaltNeu.setText("");
                    txfVornameNeu.setText("");
                    txfNachnameNeu.setText("");
                    txfPasswortNeu.setText("");
                }

            }

           // txfMANummerNeu.clear();
        });
//VornameNeu------------------------------------------------------------------------------------------------------------
        Label lVornameNeu = new Label("      Neuer Vorname:");

        Button bVornameNeuOK = new Button("VornameNeuOK");

        bVornameNeuOK.setOnAction(e -> {
            eingabeVornameNeu = txfVornameNeu.getText();
//            System.out.println("eingabeVornameNeu: "+eingabeVornameNeu.length());
//            System.out.println("Textf: "+txfVornameNeu.getText()+"!");
           // System.out.println("Textf: "+txfVornameNeu.getText().equals("")+"!");
//eingabeVornameNeu.equals("")
            if(eingabeVornameNeu.length()==0){//wenn leer//eingabeVornameNeu.length()==0//eingabeVornameNeu==null//txfVornameNeu.equals("")
                lZeigeVornameNeu.setTextFill(Color.RED);
                lZeigeVornameNeu.setText("User muss einen Vornamen besitzen!");
            }
                else {//eingabeVornameNeu.length()>0//if (!eingabeVornameNeu.equals(""))
                    lZeigeVornameNeu.setText("Sonderzeichen wegen DB??? " + txfVornameNeu.getText());
                    lZeigeVornameNeu.setTextFill(Color.DEEPPINK);
                    setEingabeVornameNeu(txfVornameNeu.getText());
                }
        });
//NachnameNeu-----------------------------------------------------------------------------------------------------------

        Label lNachnameNeu = new Label("   Neuer Nachname:");

        Button bNachnameNeuOK = new Button("NachnameNeuOK");

        bNachnameNeuOK.setOnAction(e -> {
            eingabeNachnameNeu=txfNachnameNeu.getText();
            if(eingabeNachnameNeu.length()==0){//wenn leer//eingabeVornameNeu.length()==0
                lZeigeNachnameNeu.setTextFill(Color.RED);
                lZeigeNachnameNeu.setText("User muss einen Nachnamen besitzen!");
            }
            else{
                lZeigeNachnameNeu.setText("Sonderzeichen wegen DB??? " + txfNachnameNeu.getText());
                lZeigeNachnameNeu.setTextFill(Color.web("#FFD700", 0.8));//1.8 mal schauen//dann kommt Fehler
                setEingabeNachnameNeu(txfNachnameNeu.getText());
            }
        });
//PasswortNeuRegistrieren-----------------------------------------------------------------------------------------------
        Label lPassWortNeu = new Label("      Neues Passwort:");

        Button bPasswortNeuOK = new Button("PasswortNeuOK");

        bPasswortNeuOK.setOnAction(e -> {
            eingabePasswortNeu = txfPasswortNeu.getText();
            if(eingabePasswortNeu.length()==0){//wenn leer//eingabeVornameNeu.length()==0
                lZeigePasswortNeu.setTextFill(Color.RED);
                lZeigePasswortNeu.setText("User muss einen Passwort besitzen!");
            }
            else{
                lZeigePasswortNeu.setText("Sonderzeichen wegen DB??? " + txfPasswortNeu.getText());
                lZeigePasswortNeu.setTextFill(Color.web("#7CFC00", 0.8));//1.8 mal schauen//dann kommt Fehler
                setEingabePasswortNeu(txfPasswortNeu.getText());
            }
        });
        //lzeigePasswortNeu
//IstChef----------------------------------------------------------------------------------------------------------------------
        Label lIstChefNeu = new Label("                       Chef?:");
        ComboBox comboBoxChef = new ComboBox();
        comboBoxChef.getItems().add("istChef");//0
        comboBoxChef.getItems().add("keinChef");//1

        EventHandler<ActionEvent> event =
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        lZeigeIstChefNeu.setTextFill(Color.rgb(21, 117, 84));
                        lZeigeIstChefNeu.setText("You selected \"" + comboBoxChef.getValue());
                        System.out.println("comboBoxChef?? " + comboBoxChef.getValue());

                        String strComboBoxistChefGewaehlt = (String) comboBoxChef.getValue();
                        System.out.println("strComboBoxistChefGewaehlt: " + strComboBoxistChefGewaehlt);

                        switch (strComboBoxistChefGewaehlt) {
                            case "istChef":
                                setEingabeIstChef("istChef");
//                                sprachenZahl = 0;
//                                setSprachenZahl(0);
                                System.out.println("istChef getistcheff: " + getEingabeIstChef());
                                break;
                            case "keinChef":
                                setEingabeIstChef("keinChef");
                                //setSprachenZahl(1);
                                System.out.println("keinChef getistcheff: " + getEingabeIstChef());
                                break;
                        }
                    }
                };
        comboBoxChef.setOnAction(event);
//IstUnterhalt----------------------------------------------------------------------------------------------------------------
        Label lIstUnterhaltNeu = new Label("               Unterhalt?:");
        ComboBox comboBoxUnterhalt = new ComboBox();
        comboBoxUnterhalt.getItems().add("istU");//0
        comboBoxUnterhalt.getItems().add("keinU");//1

        EventHandler<ActionEvent> event2 =
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        lZeigeIstUnterhaltNeu.setTextFill(Color.rgb(21, 117, 84));
                        lZeigeIstUnterhaltNeu.setText("You selected \"" + comboBoxUnterhalt.getValue());
                        System.out.println("comboBoxChef?? " + comboBoxUnterhalt.getValue());

                        String strComboBoxistUnterhaltGewaehlt = (String) comboBoxUnterhalt.getValue();
                        System.out.println("strComboBoxistUnterhaltGewaehlt: " + strComboBoxistUnterhaltGewaehlt);

                        switch (strComboBoxistUnterhaltGewaehlt) {
                            case "istU":
                                setEingabeIstUnterhalt("istU");
//                                sprachenZahl = 0;
//                                setSprachenZahl(0);
                                //System.out.println("istU hier muss was geschehen");
                                break;
                            case "keinU":
                                setEingabeIstUnterhalt("keinU");
                                //setSprachenZahl(1);
                                //System.out.println("keinU hier muss was geschehen");
                                break;
                        }
                    }
                };
        comboBoxUnterhalt.setOnAction(event2);
//RegistrierungAbschliessen---------------------------------------------------------------------------------------------
        Button bRegistrierungAbschliessen = new Button("Registrierung \n Abschliessen");
        Label lZeigeRegistrierungAbschliessen = new Label();

//
//        if( (getEingabePasswortNeu().isEmpty()) ){
//            bRegistrierungAbschliessen.setStyle("-fx-background-color: green");
//            System.out.println("günner wirds nicht");
//        }
//        else{
//
//            bRegistrierungAbschliessen.setStyle("-fx-background-color: red");
//            System.out.println("roter toter");
//        }

        bRegistrierungAbschliessen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                System.out.println("RegistrierungAbschliessenButton gedrückt ");
//                if( (!getEingabeMANummerNeu().equals(null)||!getEingabeVornameNeu().equals(null)
//                || !getEingabeNachnameNeu().equals(null)||!getEingabePasswortNeu().equals(null)
//                || !getEingabeIstChef().equals(null)||!getEingabeIstUnterhalt().equals(null) )){
                if((getEingabeMANummerNeu()== null||getEingabeVornameNeu()==null||getEingabeNachnameNeu()==null
                ||getEingabePasswortNeu()==null||getEingabeIstChef()==null||getEingabeIstUnterhalt()==null)
                || (getEingabeMANummerNeu().length()==0||getEingabeIstChef().length()==0||getEingabeIstUnterhalt().length()==0)){

                    lZeigeRegistrierungAbschliessen.setText("Es muss alles vollständig ausgefüllt sein!");
                    lZeigeRegistrierungAbschliessen.setTextFill(Color.RED);
                    lzeigeMANummerNeu.setText("");
                    lZeigeVornameNeu.setText("");
                    lZeigeNachnameNeu.setText("");
                    lZeigePasswortNeu.setText("");
                    lZeigeIstChefNeu.setText("");
                    lZeigeIstUnterhaltNeu.setText("");
                    txfMANummerNeu.setText("");
                    txfVornameNeu.setText("");
                    txfNachnameNeu.setText("");
                    txfPasswortNeu.setText("");
                }
                else{
                    //ToDo hier könnte man zB Geburtsdatum reinmachen, oder weitere Anlagen wie Freischalten usw
                    String einfuegRegistrierenDb = "INSERT INTO userMubea"
                            + "(MA_Nummer, Vorname, Nachname, Passwort_User, IstChef, IstUnterhalt)"
                            + "VALUES  ('" + getEingabeMANummerNeu() + "', '" + getEingabeVornameNeu() + "', "
                            + "'" + getEingabeNachnameNeu() + "','" + getEingabePasswortNeu() + "', "
                            + "'" + getEingabeIstChef() + "','" + getEingabeIstUnterhalt() + "');";


                    dBR.schreibeDB(einfuegRegistrierenDb);
                    //lZeigeRegistrierungAbschliessen.setText(einfuegRegistrierenDb);
                    lZeigeRegistrierungAbschliessen.setText("Der Mitarbeiter wurde erfolgreich\nder Datenbank hinzugefügt");
                    lZeigeRegistrierungAbschliessen.setTextFill(Color.YELLOWGREEN);
                    setEingabeMANummerNeu("");
                    setEingabeIstChef("");
                    setEingabeIstUnterhalt("");
                }

            }
        });
//ZurückSprache---------------------------------------------------------------------------------------------------------
        Button bZurueckSpracheR = new Button("Zurück");
        bZurueckSpracheR.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));
//LayoutZeugs-----------------------------------------------------------------------------------------------------------
        VBox layoutVR = new VBox(6);

        HBox layoutHMANummerNeu = new HBox(2);
        HBox layoutHVornameNeu = new HBox(2);
        HBox layoutHNachnameNeu = new HBox(2);
        HBox layoutPasswortNeu = new HBox(2);
        HBox layoutIstChef = new HBox(2);
        HBox layoutIstUnterhalt = new HBox(2);
        HBox layoutHRegistrierungAbschliessen = new HBox(2);


        layoutHMANummerNeu.getChildren().addAll(lMANummerNeu, txfMANummerNeu, bMANummerNeu, lzeigeMANummerNeu);
        layoutHVornameNeu.getChildren().addAll(lVornameNeu, txfVornameNeu, bVornameNeuOK, lZeigeVornameNeu);
        layoutHNachnameNeu.getChildren().addAll(lNachnameNeu, txfNachnameNeu, bNachnameNeuOK, lZeigeNachnameNeu);
        layoutPasswortNeu.getChildren().addAll(lPassWortNeu, txfPasswortNeu, bPasswortNeuOK, lZeigePasswortNeu);
        layoutIstChef.getChildren().addAll(lIstChefNeu, comboBoxChef, lZeigeIstChefNeu);
        layoutIstUnterhalt.getChildren().addAll(lIstUnterhaltNeu, comboBoxUnterhalt, lZeigeIstUnterhaltNeu);
        layoutHRegistrierungAbschliessen.getChildren().addAll(bRegistrierungAbschliessen,lZeigeRegistrierungAbschliessen);

        layoutVR.getChildren().addAll(labelRegistrierenScene, layoutHMANummerNeu, layoutHVornameNeu, layoutHNachnameNeu, layoutPasswortNeu, layoutIstChef, layoutIstUnterhalt, layoutHRegistrierungAbschliessen, bZurueckSpracheR, TaskLeistePane.getPane());

        //Scene sceneRegistrieren = new Scene(layoutVR);
        Scene sceneRegistrieren = new Scene(new ScrollPane(layoutVR), 700, 400);//hat scrollpane drin
        return sceneRegistrieren;
    }

}

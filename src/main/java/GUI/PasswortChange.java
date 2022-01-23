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
 * 28.12.2021, 15:15
 */
public class PasswortChange {

    private static String ausgabeSuchePasswortAltMitPasswortFrageDB;

    public static Boolean getAltesPasswortCorrect() {
        return altesPasswortCorrect;
    }

    public static void setAltesPasswortCorrect(Boolean altesPasswortCorrect) {
        PasswortChange.altesPasswortCorrect = altesPasswortCorrect;
    }

    private static Boolean altesPasswortCorrect = false;

    public static String getEingabePasswortNeu() {
        return eingabePasswortNeu;
    }

    public static void setEingabePasswortNeu(String eingabePasswortNeu) {
        PasswortChange.eingabePasswortNeu = eingabePasswortNeu;
    }

    public static String getEingabePasswortNeuWiederholen() {
        return eingabePasswortNeuWiederholen;
    }

    public static void setEingabePasswortNeuWiederholen(String eingabePasswortNeuWiederholen) {
        PasswortChange.eingabePasswortNeuWiederholen = eingabePasswortNeuWiederholen;
    }

    private static String eingabePasswortNeu="";
    private static String eingabePasswortNeuWiederholen ="";

    public static void setAusgabeSuchePasswortAltMitPasswortFrageDB(String ausgabeSuchePasswortAltMitPasswortFrageDB) {
        PasswortChange.ausgabeSuchePasswortAltMitPasswortFrageDB = ausgabeSuchePasswortAltMitPasswortFrageDB;
    }
    public static String getAusgabeSuchePasswortAltMitPasswortFrageDB() {
        return ausgabeSuchePasswortAltMitPasswortFrageDB;
    }


    public static Scene createPasswortChangeScene(Stage stage) {

        DatenBank dBP = new DatenBank();


        Label lPasswortChangeScene = new Label("- Hier können Sie ihr persöhnliches Passwort ändern -");

        final Label lzeigePasswortAlt = new Label("");
        final Label lzeigePasswortNeu = new Label();
        final Label lzeigePasswortNeuWiederholen = new Label();
        final Label lzeigePasswortAendern = new Label();
        final PasswordField pFIPasswortNeu = new PasswordField();
        final PasswordField pFIPasswortNeuWiederholen = new PasswordField();

//AltesPasswort---------------------------------------------------------------------------------------------------------
        Label lPassWortALtI = new Label("Altes Passwort:    ");
        final PasswordField pFIPasswortAlt = new PasswordField();

        Button bPasswortAltOK = new Button("Passwort-Alt OK");

//das braucht es, weil sonst kann ja irgendjemand beim "eingelogten" User sein Passwort ändern!
        bPasswortAltOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String eingabePasswortAltFrage = pFIPasswortAlt.getText();
                String ausgabeSuchePasswortAltMitPasswort = "SELECT * FROM userMubea WHERE Passwort_User = '"+eingabePasswortAltFrage+"'";
                setAusgabeSuchePasswortAltMitPasswortFrageDB(dBP.ausgebenGesamtDBRetourString(ausgabeSuchePasswortAltMitPasswort));
                System.out.println("dBP getAusgabeSuchePasswortAltMitPasswortFrageDB: " + getAusgabeSuchePasswortAltMitPasswortFrageDB());
                System.out.println("sdsv "+Login.getPasswort_User());
                if(eingabePasswortAltFrage.length()==0){
                    lzeigePasswortAlt.setTextFill(Color.RED);
                    lzeigePasswortAlt.setText("Sie müssen Ihr Passwort erst eingeben!");
                    setAltesPasswortCorrect(false);
                    pFIPasswortNeu.clear();
                    pFIPasswortNeuWiederholen.clear();
                    setEingabePasswortNeu("");
                    setEingabePasswortNeuWiederholen("");
                    lzeigePasswortNeu.setText("");
                    lzeigePasswortNeuWiederholen.setText("");
                    lzeigePasswortNeu.setText("");
                    pFIPasswortNeu.clear();
                    lzeigePasswortNeuWiederholen.setText("");
                    pFIPasswortNeuWiederholen.clear();
                    lzeigePasswortAendern.setText("");

                }
                else{
                    if(eingabePasswortAltFrage.equals(Login.getPasswort_User())){
                        lzeigePasswortAlt.setTextFill(Color.GREEN);
                        lzeigePasswortAlt.setText("Passwort richtig");
                        setAltesPasswortCorrect(true);
                        pFIPasswortNeu.clear();
                        pFIPasswortNeuWiederholen.clear();
                        lzeigePasswortNeu.setText("");
                        lzeigePasswortNeuWiederholen.setText("");
                        lzeigePasswortAendern.setText("");
                    }
                    else{
                        lzeigePasswortAlt.setTextFill(Color.RED);
                        lzeigePasswortAlt.setText("Ihr eingegebenes Passwort ist falsch!");
                        setAltesPasswortCorrect(false);
                        pFIPasswortNeu.clear();
                        pFIPasswortNeuWiederholen.clear();
                        setEingabePasswortNeu("");
                        setEingabePasswortNeuWiederholen("");
                        lzeigePasswortNeu.setText("");
                        lzeigePasswortNeuWiederholen.setText("");

                        lzeigePasswortAendern.setText("");

                    }

                }
                pFIPasswortAlt.clear();
            }
        });
//NeuesPasswort---------------------------------------------------------------------------------------------------------
        Label lPassWortNeuI = new Label("Neues Passwort:  ");


        Button bPasswortNeuOK = new Button("Passwort-Neu OK");


        bPasswortNeuOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                setEingabePasswortNeu(pFIPasswortNeu.getText());

                if(getAltesPasswortCorrect()==false){
                    lzeigePasswortNeu.setTextFill(Color.RED);
                    lzeigePasswortNeu.setText("Sie müssen erst Ihr altes Passwort eingeben!");
                    pFIPasswortAlt.clear();
                    lzeigePasswortAlt.setText("");
                    pFIPasswortAlt.clear();
                    lzeigePasswortNeuWiederholen.setText("");

                    pFIPasswortNeu.clear();
                    lzeigePasswortNeuWiederholen.setText("");
                    pFIPasswortNeuWiederholen.clear();
                    lzeigePasswortAendern.setText("");
                }
                else{
                    if(getEingabePasswortNeu().length()==0&&getAltesPasswortCorrect()==true){
                        lzeigePasswortNeu.setTextFill(Color.RED);
                        lzeigePasswortNeu.setText("Sie müssen ein neues Passwort eingeben!");


                        lzeigePasswortNeuWiederholen.setText("");

                        pFIPasswortNeu.clear();
                        lzeigePasswortNeuWiederholen.setText("");
                        pFIPasswortNeuWiederholen.clear();
                        lzeigePasswortAendern.setText("");
                    }
                    else{
                        lzeigePasswortNeu.setTextFill(Color.GREEN);
                        lzeigePasswortNeu.setText("Erster Schritt erledigt");
                        lzeigePasswortAendern.setText("");
                    }
                }
                //pFIPasswortNeu.clear();
            }
        });
//NeuesPasswortWiederholen---------------------------------------------------------------------------------------------------------
        Label lPassWortNeuWiederholenI = new Label("Neues Passwort   \nwiederholen:");


        Button bPasswortNeuWiederholenOK = new Button("PW-NeuWiederholen OK");


        bPasswortNeuWiederholenOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                setEingabePasswortNeuWiederholen(pFIPasswortNeuWiederholen.getText());

                if(getAltesPasswortCorrect()==false){
                    lzeigePasswortNeuWiederholen.setTextFill(Color.RED);
                    lzeigePasswortNeuWiederholen.setText("Sie müssen erst Ihr altes Passwort eingeben!");
                    lzeigePasswortAendern.setText("");
                    lzeigePasswortAlt.setText("");
                    lzeigePasswortNeu.setText("");
                    pFIPasswortAlt.clear();
                    pFIPasswortNeu.clear();

                }
                else{
                    if(getEingabePasswortNeu().length()==0&&getAltesPasswortCorrect()==true){
                        lzeigePasswortNeuWiederholen.setTextFill(Color.RED);
                        lzeigePasswortNeuWiederholen.setText("Sie müssen erst ein neues Passwort eingeben!");
                        pFIPasswortNeu.clear();
                        lzeigePasswortNeu.setText("");
                    }
                    else {
                        if (getEingabePasswortNeuWiederholen().length() == 0) {
                            lzeigePasswortNeuWiederholen.setTextFill(Color.RED);
                            lzeigePasswortNeuWiederholen.setText("Sie müssen ihr neues Passwort wiederholt eingeben.");
                            lzeigePasswortAendern.setText("");
                        }
                        else{
                            if(getEingabePasswortNeuWiederholen().equals(getEingabePasswortNeu())&&getAltesPasswortCorrect()==true){
                                lzeigePasswortNeuWiederholen.setTextFill(Color.GREEN);
                                lzeigePasswortNeuWiederholen.setText("Sie haben bis jetzt alles richtig gemacht");
                                lzeigePasswortAendern.setText("");
                            }
                            else{
                                lzeigePasswortNeuWiederholen.setTextFill(Color.RED);
                                lzeigePasswortNeuWiederholen.setText("Passwort stimmt nicht mit dem neuen Passwort überrein!");
                                lzeigePasswortAendern.setText("");
                                pFIPasswortNeuWiederholen.clear();
                            }
                        }
                    }
                }
//                pFIPasswortNeuWiederholen.clear();
            }
        });
//IhrPasswortWurdeGeändert---------------------------------------------------------------------------------------------------------
        Label lPassWortAendern = new Label("Passwort ändern?");
        Button bPasswortAendernOK = new Button("PasswortAendernOK");


        bPasswortAendernOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                if (getAltesPasswortCorrect() == false) {
                    lzeigePasswortAendern.setTextFill(Color.RED);
                    lzeigePasswortAendern.setText("Erst müssen Sie Ihr altes Passwort eingeben!");
                    pFIPasswortAlt.clear();
                    pFIPasswortNeu.clear();
                    pFIPasswortNeuWiederholen.clear();
                    lzeigePasswortAlt.setText("");
                    lzeigePasswortNeu.setText("");
                    lzeigePasswortNeuWiederholen.setText("");
                }
                else{
                    if(getEingabePasswortNeu().length()==0 || getEingabePasswortNeuWiederholen().length()==0){
                        lzeigePasswortAendern.setTextFill(Color.RED);
                        lzeigePasswortAendern.setText("Sie müssen Ihr neues Passwort \nRichtig und Vollständig eingeben!");
                        pFIPasswortAlt.clear();
                        pFIPasswortNeu.clear();
                        pFIPasswortNeuWiederholen.clear();
                        //lzeigePasswortAlt.setText("");
                        lzeigePasswortNeu.setText("");
                        lzeigePasswortNeuWiederholen.setText("");
                    }
                    else{
                        if(getEingabePasswortNeuWiederholen().equals(getEingabePasswortNeu())){
                            lzeigePasswortAendern.setTextFill(Color.GREEN);
                            lzeigePasswortAendern.setText("Ihr Passwort wurde geändert");
                            String strNeuesPasswortFuerDB = getEingabePasswortNeuWiederholen();
                            String schreibeNeuesPasswortInDB = "UPDATE userMubea SET Passwort_User = '"
                                    + strNeuesPasswortFuerDB + "' WHERE Passwort_User = '" + Login.getPasswort_User() +"';";

                            dBP.schreibeDB(schreibeNeuesPasswortInDB);
                            setAltesPasswortCorrect(false);
                            Login.setPasswort_User(strNeuesPasswortFuerDB);
                            pFIPasswortNeu.clear();
                            pFIPasswortNeuWiederholen.clear();
                            setEingabePasswortNeu("");
                            setEingabePasswortNeuWiederholen("");
                            lzeigePasswortNeu.setText("");
                            lzeigePasswortNeuWiederholen.setText("");
                            lzeigePasswortAlt.setText("");
                        }
                        else{
                            lzeigePasswortAendern.setTextFill(Color.RED);
                            lzeigePasswortAendern.setText("Sie müssen Ihr neues Passwort \nRichtig und Vollständig eingeben!");
                            pFIPasswortAlt.clear();
                            pFIPasswortNeu.clear();
                            pFIPasswortNeuWiederholen.clear();
                            //lzeigePasswortAlt.setText("");
                            lzeigePasswortNeu.setText("");
                            lzeigePasswortNeuWiederholen.setText("");
                        }
                    }
                }

            }
        });
//Zurück----------------------------------------------------------------------------------------------------------------
        Button bZurueckSprachePWC = new Button("Zurück");
        bZurueckSprachePWC.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));





        VBox layoutV1 = new VBox(11);
        HBox layoutHPasswortAlt = new HBox(4);
        HBox layoutHPasswortNeu = new HBox(4);
        HBox layoutHPasswortNeuWiederholen = new HBox(4);
        HBox layoutHPasswortAendern = new HBox(4);

        layoutHPasswortAlt.getChildren().addAll(lPassWortALtI,pFIPasswortAlt,bPasswortAltOK,lzeigePasswortAlt);
        layoutHPasswortNeu.getChildren().addAll(lPassWortNeuI,pFIPasswortNeu,bPasswortNeuOK,lzeigePasswortNeu);
        layoutHPasswortNeuWiederholen.getChildren().addAll(lPassWortNeuWiederholenI,pFIPasswortNeuWiederholen,bPasswortNeuWiederholenOK,lzeigePasswortNeuWiederholen);
        layoutHPasswortAendern.getChildren().addAll(lPassWortAendern,bPasswortAendernOK,lzeigePasswortAendern);


        layoutV1.getChildren().addAll(lPasswortChangeScene,layoutHPasswortAlt,layoutHPasswortNeu,layoutHPasswortNeuWiederholen,layoutHPasswortAendern,bZurueckSprachePWC,TaskLeistePane.getPane());


        Scene scenePasswortChange = new Scene(new ScrollPane(layoutV1), 650, 270);//scene braucht ein Layout, hat scrollpane drin

        return scenePasswortChange;
    }
}
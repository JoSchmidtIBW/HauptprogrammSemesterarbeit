package GUI;

import GUI.Login;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 12.12.2021, 00:34
 */
public class Registrieren {

    public static String getEingabeNachname() {
        return eingabeNachname;
    }

    public static void setEingabeNachname(String eingabeNachname) {
        Registrieren.eingabeNachname = eingabeNachname;
    }

    public static String eingabeNachname;

    private static void setEingabeMANummer(String eingabeMANummer) {
        Registrieren.eingabeMANummer = eingabeMANummer;
    }

    public static String getEingabeMANummer() {
        return eingabeMANummer;
    }

    private static String eingabeMANummer;

    public static String getEingabeVorname() {
        return eingabeVorname;
    }

    public static void setEingabeVorname(String eingabeVorname) {
        Registrieren.eingabeVorname = eingabeVorname;
    }

    private static String eingabeVorname;

    public static String getEingabePasswortGegeben() {
        return eingabePasswortGegeben;
    }

    public static void setEingabePasswortGegeben(String eingabePasswortGegeben) {
        Registrieren.eingabePasswortGegeben = eingabePasswortGegeben;
    }

    private static String eingabePasswortGegeben;

    public static String getEingabePasswortNeu() {
        return eingabePasswortNeu;
    }

    public static void setEingabePasswortNeu(String eingabePasswortNeu) {
        Registrieren.eingabePasswortNeu = eingabePasswortNeu;
    }

    private static String eingabePasswortNeu;

    public static String getEingabePasswortNeuWiederholen() {
        return eingabePasswortNeuWiederholen;
    }

    public static void setEingabePasswortNeuWiederholen(String eingabePasswortNeuWiederholen) {
        Registrieren.eingabePasswortNeuWiederholen = eingabePasswortNeuWiederholen;
    }

    private static String eingabePasswortNeuWiederholen;
    public static Scene createRegistrierenScene(Stage stage){

        //  HBox hbox = new HBox();


        Label labelRegistrierenScene= new Label("- Registrieren- Scene -");
        //labelRegistrierenScene.setForeground(Color.red);
        //labelRegistrierenScene.setFont(Font.font("Calibri", Font.font().ITALIC, 16));

        Label lMANummer = new Label("LMANummer");
        TextField txfMANummer = new TextField(eingabeMANummer);
        //eingabeMANummer = txfMANummer.getText();
        Button bMANummer = new Button("MA-Nummer");
        Label lzeigeMANummer = new Label();
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+txfMANummer.getText()));
        bMANummer.setOnAction(e -> {
            lzeigeMANummer.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummer.getText());
            setEingabeMANummer(txfMANummer.getText());
            System.out.println(getEingabeMANummer());
        });
        //bMANummer.setOnAction(e -> System.out.println(getEingabeMANummer()));

        //bMANummer.setOnAction(e -> System.out.println(getEingabeMANummer()));
//        System.out.println(txfMANummer.getText());
//        System.out.println(eingabeMANummer);
       // System.out.println(getEingabeMANummer());

        Label lVorname = new Label("Vorname:");
        TextField txfVorname = new TextField(eingabeVorname);
        Button bVornameOK = new Button("VornameOK");
        Label lZeigeVorname = new Label();
        bVornameOK.setOnAction(e -> {
            lZeigeVorname.setText("Darf keine Leertaste und Sonderzeichen!!!"+txfVorname.getText());
            lZeigeVorname.setTextFill(Color.web("#ff0000", 0.8));
            setEingabeVorname(txfVorname.getText());
        });


        Label lNachname = new Label("Nachname:");
        TextField txfNachname = new TextField(eingabeNachname);
        Button bNachnameOK = new Button("NachnameOK");
        Label lZeigeNachname = new Label();
        bNachnameOK.setOnAction(e -> {
            lZeigeNachname.setText("JUNIT Leertaste und Sonderzeichen!!!"+txfNachname.getText());
            lZeigeNachname.setTextFill(Color.web("#FFD700", 0.8));//1.8 mal schauen//dann kommt Fehler
            setEingabeNachname(txfNachname.getText());
        });

        Label lPassWortGegeben = new Label("PassWortGegeben:");
        TextField txfPasswortGegeben = new TextField(eingabePasswortGegeben);
        Button bPasswortGegebenOK = new Button("Passwort \n Gegeben \n OK");
        Label lZeigePasswortGegeben = new Label();
        bPasswortGegebenOK.setOnAction(e -> {
            lZeigePasswortGegeben.setText("JUNIT Leertaste und Sonderzeichen!!!"+txfPasswortGegeben.getText());
            lZeigePasswortGegeben.setTextFill(Color.web("#7CFC00", 0.8));//1.8 mal schauen//dann kommt Fehler
            setEingabePasswortGegeben(txfPasswortGegeben.getText());
        });

        Label lPassWortNeu = new Label("Neues Passwort:");
        TextField txfPasswortNeu = new TextField(eingabePasswortNeu);
        Button bPasswortNeuOK = new Button("PasswortNeuOK");
        Label lZeigePasswortNeu = new Label();
        bPasswortNeuOK.setOnAction(e -> {
            lZeigePasswortNeu.setText("JUNIT Leertaste und Sonderzeichen!!!"+txfPasswortNeu.getText());
            lZeigePasswortNeu.setTextFill(Color.web("#4682B4", 0.8));//1.8 mal schauen//dann kommt Fehler
            setEingabePasswortNeu(txfPasswortNeu.getText());
        });

        Label lPasswortNeuWiederholen = new Label("Neues Passwort wiederholen:");
        TextField txfPasswortNeuWiederholen = new TextField(eingabePasswortNeuWiederholen);
        Button bPasswortNeuWiederholenOK = new Button("PW Neu WiederholenOK");
        Label lZeigePasswortNeuWiederholen = new Label();
        bPasswortNeuWiederholenOK.setOnAction(e -> {
            lZeigePasswortNeuWiederholen.setText("JUNIT Muss gleich PWNEU oben Sein!!!!!!"+txfPasswortNeuWiederholen.getText());
            lZeigePasswortNeuWiederholen.setTextFill(Color.web("#DDA0DD", 0.8));//1.8 mal schauen//dann kommt Fehler
            setEingabePasswortNeuWiederholen(txfPasswortNeuWiederholen.getText());
        });

        //Todo, PasswortTextField richtig implementieren
        Label lPassWortInternet = new Label("Password");
        final Label lMessageInternet = new Label("");
        final PasswordField pFInternet = new PasswordField();

        pFInternet.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                if (!pFInternet.getText().equals("T2f$Ay!")) {
                    lMessageInternet.setText("Your password is incorrect!");
                    lMessageInternet.setTextFill(Color.rgb(210, 39, 30));
                } else {
                    lMessageInternet.setText("Your password has been confirmed");
                    lMessageInternet.setTextFill(Color.rgb(21, 117, 84));
                }
                pFInternet.clear();
            }
        });




        //ToDo
        //Achtung, tippt man bei registrieren alles ein, und geht zurück login, und wieder ins registrieren
        //sind alle buchstaben noch dort!!!!!!!

        Button bRegistrierungAbschliessen = new Button("Registrierung \n Abschliessen");

        Button bZurueckSprache= new Button("Go to Sprache - Scene");


        bZurueckSprache.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));//primaryStage
        VBox layoutVR= new VBox(1);

        HBox layoutHMANummer = new HBox(1);
        HBox layoutHVorname1 = new HBox(1);
        HBox layoutHNachname1 = new HBox(1);
        HBox layoutPasswortGegeben = new HBox(1);
        HBox layoutPasswortNeu = new HBox(1);
        HBox layoutPasswortwiderholen = new HBox(1);
        HBox layoutPasswortInternet = new HBox(1);

        Label lPWVergessen = new Label("Passwort vergessen?");

        layoutHMANummer.getChildren().addAll(lMANummer,txfMANummer,bMANummer,lzeigeMANummer);
        layoutHVorname1.getChildren().addAll(lVorname,txfVorname,bVornameOK,lZeigeVorname);
        layoutHNachname1.getChildren().addAll(lNachname,txfNachname,bNachnameOK,lZeigeNachname);

        layoutPasswortGegeben.getChildren().addAll(lPassWortGegeben,txfPasswortGegeben,bPasswortGegebenOK,lZeigePasswortGegeben);
        layoutPasswortNeu.getChildren().addAll(lPassWortNeu,txfPasswortNeu,bPasswortNeuOK,lZeigePasswortNeu);
        layoutPasswortwiderholen.getChildren().addAll(lPasswortNeuWiederholen,txfPasswortNeuWiederholen,bPasswortNeuWiederholenOK,lZeigePasswortNeuWiederholen);

        layoutPasswortInternet.getChildren().addAll(lPassWortInternet,pFInternet,lMessageInternet);

        layoutVR.getChildren().addAll(labelRegistrierenScene,layoutHMANummer, layoutHVorname1,layoutHNachname1,
                layoutPasswortGegeben,layoutPasswortNeu,layoutPasswortwiderholen,layoutPasswortInternet,bRegistrierungAbschliessen,bZurueckSprache,lPWVergessen);

        //Scene sceneRegistrieren = new Scene(layoutVR);
        Scene sceneRegistrieren = new Scene(new ScrollPane(layoutVR),700,400);//hat scrollpane drin
        return sceneRegistrieren;
    }

}

//    scene2= new Scene(layoutVR,300,250);// scene2= new Scene(layout2,300,250,Color.BISQUE);
//    //scene2.setFill(Color.BISQUE);



//RezeptArtikelnummerEingabeButton.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent evt) {
//        RezeptArtikelnummerEingabe = textFieldArtikelnummer.getText();
//        falscheArtikelnummer = false;
//        if (RezeptArtikelnummerEingabe.length()==0) {
//        falscheArtikelnummer = true;
//        labelGetArtikelnummer.setForeground(Color.red);
//        labelGetArtikelnummer.setFont(new Font("Calibri", Font.ITALIC, 16));
//        labelGetArtikelnummer.setText("Erst Artikelnummer eingeben!!!");
//        }
//
//        else if (RezeptArtikelnummerEingabe.length()<8 && RezeptArtikelnummerEingabe.length()>0){
//        falscheArtikelnummer = true;
//        labelGetArtikelnummer.setForeground(Color.red);
//        labelGetArtikelnummer.setFont(new Font("Calibri", Font.ITALIC, 16));
//        labelGetArtikelnummer.setText("Artikelnummer zu klein!!!");
//        } else if (RezeptArtikelnummerEingabe.length()>8){
//        falscheArtikelnummer = true;
//        labelGetArtikelnummer.setForeground(Color.red);
//        labelGetArtikelnummer.setFont(new Font("Calibri", Font.ITALIC, 16));
//        labelGetArtikelnummer.setText("Artikelnummer zu gross!!!");
//        } else
//
//        if((RezeptArtikelnummerEingabe.matches("[0-9]" + "[0-9]" + "[0-9]" + "[0-9]" + "[0-9]" + "[0-9]" + "[0-9]" + "[0-9]")) && (falscheArtikelnummer != true)) {
//        falscheArtikelnummer = false;
//        labelGetArtikelnummer.setForeground(Color.black);
//        RezeptArtikelnummerEingabe = textFieldArtikelnummer.getText();
//
//        RezeptArtikelnummerEingabe = textFieldArtikelnummer.getText();
//        labelGetArtikelnummer.setText("Ausgabe Artikelnummer:");
//
//        setRezeptArtikelnummerEingabe(RezeptArtikelnummerEingabe);
//        System.out.println(RezeptArtikelnummerEingabe);
//        RezeptArtikelnummerAusgabeGetLabel.setText("" + getRezeptArtikelnummerEingabe());
//        }else{
//        falscheArtikelnummer = true;
//        labelGetArtikelnummer.setForeground(Color.red);
//        labelGetArtikelnummer.setText("Enthält keine Zahl!!!");
//        }
//}
//});





//  submit.setOnAction(e -> {
//          boolean validated = validate(name.getText());
//          if(validated) System.out.println("validated");
//          }








// passwortEingabeButton.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent evt) {
//        //String passwd = new String (pass.getText());
//        passwortRezeptEingabe = textFieldPasswortEingabe.getText();
//        if (passwortRezeptEingabe.equals("1234")){
//        //passwort.setVisible(false);
//        //Frame.setVisible(true);
//        textFieldPasswortEingabe.setBackground(Color.green);
//        // geschwindigkeitueberprüfunghundert();
//        setRezeptGeschwindigkeitEingabe(RezeptGeschwindigkeitEingabeRichtig);
//        RezeptGeschwindigkeitEingabeRichtig = textFieldGeschwindigkeit.getText();
//
//
//        //RezeptGeschwindigkeitAusgabeGetLabel.setText(RezeptGeschwindigkeitEingabeRichtig);
//
//        RezeptGeschwindigkeitAusgabeGetLabel.setText(RezeptGeschwindigkeitEingabeRichtig);
//        System.out.println("oiuhguzgzgzggzgg");
//        }
//        else{
//        textFieldPasswortEingabe.setBackground(Color.red);
//
//        RezeptGeschwindigkeitEingabeRichtig = "15";
//        RezeptGeschwindigkeitAusgabeGetLabel.setText(RezeptGeschwindigkeitEingabeRichtig);
//
//
//        //RezeptGeschwindigkeitEingabe = "15";
//        }
//
//        }
//        });
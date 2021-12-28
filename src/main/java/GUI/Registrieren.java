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
 * 12.12.2021, 00:34
 */
public class Registrieren {

    private static String eingabeMANummerNeu;
    private static String eingabeVornameNeu;
    private static String eingabeNachnameNeu;
    private static String eingabePasswortNeu;

    public static String getEingabeNachnameNeu() {
        return eingabeNachnameNeu;
    }

    public static void setEingabeNachnameNeu(String eingabeNachnameNeu) {
        Registrieren.eingabeNachnameNeu = eingabeNachnameNeu;
    }



    private static void setEingabeMANummerNeu(String eingabeMANummerNeu) {
        Registrieren.eingabeMANummerNeu = eingabeMANummerNeu;
    }

    public static String getEingabeMANummerNeu() {
        return eingabeMANummerNeu;
    }



    public static String getEingabeVornameNeu() {
        return eingabeVornameNeu;
    }

    public static void setEingabeVornameNeu(String eingabeVornameNeu) {
        Registrieren.eingabeVornameNeu = eingabeVornameNeu;
    }



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

    private static String eingabePasswortNeuWiederholen;

    public static String getEingabePasswortNeuWiederholen() {
        return eingabePasswortNeuWiederholen;
    }

    public static void setEingabePasswortNeuWiederholen(String eingabePasswortNeuWiederholen) {
        Registrieren.eingabePasswortNeuWiederholen = eingabePasswortNeuWiederholen;
    }


    public static Scene createRegistrierenScene(Stage stage){

        Label labelRegistrierenScene= new Label("- Registrieren- Scene - Ein neuer Mitarbeiter wird geboren");
//MA-NummerNeu----------------------------------------------------------------------------------------------------------
        Label lMANummerNeu = new Label("Neue MA.-Nummer");
        TextField txfMANummerNeu = new TextField(eingabeMANummerNeu);

        Button bMANummerNeu = new Button("MA-NummerNeuOK");
        Label lzeigeMANummerNeu = new Label();
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+getEingabeMANummer()));
        //bMANummer.setOnAction(e -> lzeigeMANummer.setText("Enthält keine Zahl!!!"+txfMANummer.getText()));
        bMANummerNeu.setOnAction(e -> {
            lzeigeMANummerNeu.setText("JUNIT-Test: Enthält keine Zahl!!!"+txfMANummerNeu.getText());
            setEingabeMANummerNeu(txfMANummerNeu.getText());
            System.out.println(getEingabeMANummerNeu());
        });
//VornameNeu------------------------------------------------------------------------------------------------------------
        Label lVornameNeu = new Label("Neuer Vorname:");
        TextField txfVornameNeu = new TextField(eingabeVornameNeu);
        Button bVornameNeuOK = new Button("VornameNeuOK");
        Label lZeigeVornameNeu = new Label();
        bVornameNeuOK.setOnAction(e -> {
            lZeigeVornameNeu.setText("Darf keine Leertaste und Sonderzeichen!!!"+txfVornameNeu.getText());
            lZeigeVornameNeu.setTextFill(Color.web("#ff0000", 0.8));
            setEingabeVornameNeu(txfVornameNeu.getText());
        });
//NachnameNeu-----------------------------------------------------------------------------------------------------------

        Label lNachnameNeu = new Label("Neuer Nachname:");
        TextField txfNachnameNeu = new TextField(eingabeNachnameNeu);
        Button bNachnameNeuOK = new Button("NachnameNeuOK");
        Label lZeigeNachnameNeu = new Label();
        bNachnameNeuOK.setOnAction(e -> {
            lZeigeNachnameNeu.setText("JUNIT Leertaste und Sonderzeichen!!!"+txfNachnameNeu.getText());
            lZeigeNachnameNeu.setTextFill(Color.web("#FFD700", 0.8));//1.8 mal schauen//dann kommt Fehler
            setEingabeNachnameNeu(txfNachnameNeu.getText());
        });
//PasswortNeuRegistrieren-----------------------------------------------------------------------------------------------
        Label lPassWortNeu = new Label("Neues Passwort:");
        TextField txfPasswortNeu = new TextField(eingabePasswortNeu);
        Button bPasswortNeuOK = new Button("PasswortNeuOK");
        Label lZeigePasswortNeu = new Label();
        bPasswortNeuOK.setOnAction(e -> {
            lZeigePasswortNeu.setText("JUNIT Leertaste und Sonderzeichen!!!"+txfPasswortNeu.getText());
            lZeigePasswortNeu.setTextFill(Color.web("#7CFC00", 0.8));//1.8 mal schauen//dann kommt Fehler
            setEingabePasswortNeu(txfPasswortNeu.getText());
        });
        //lzeigePasswortNeu
//IstChef----------------------------------------------------------------------------------------------------------------------
        Label lIstChefNeu = new Label("Chef?:");
        ComboBox comboBoxChef = new ComboBox();
        comboBoxChef.getItems().add("istChef");//0
        comboBoxChef.getItems().add("keinChef");//1
        Label lZeigeIstChefNeu = new Label("");
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
//                                sprachenZahl = 0;
//                                setSprachenZahl(0);
                                System.out.println("istChef hier muss was geschehen");
                                break;
                            case "keinChef":
                                //setSprachenZahl(1);
                                System.out.println("keinChef hier muss was geschehen");
                                break;
                        }
                    }
                };
        comboBoxChef.setOnAction(event);
//IstUnterhalt----------------------------------------------------------------------------------------------------------------
        Label lIstUnterhaltNeu = new Label("Unterhalt?:");
        ComboBox comboBoxUnterhalt = new ComboBox();
        comboBoxUnterhalt.getItems().add("istU");//0
        comboBoxUnterhalt.getItems().add("keinU");//1
        Label lZeigeIstUnterhaltNeu = new Label("");
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
//                                sprachenZahl = 0;
//                                setSprachenZahl(0);
                                System.out.println("istU hier muss was geschehen");
                                break;
                            case "keinU":
                                //setSprachenZahl(1);
                                System.out.println("keinU hier muss was geschehen");
                                break;
                        }
                    }
                };
        comboBoxUnterhalt.setOnAction(event2);
//RegistrierungAbschliessen---------------------------------------------------------------------------------------------
        Button bRegistrierungAbschliessen = new Button("Registrierung \n Abschliessen");
//ZurückSprache---------------------------------------------------------------------------------------------------------
        Button bZurueckSprache= new Button("Go to Sprache - Scene");
        bZurueckSprache.setOnAction(e -> stage.setScene(Sprache.createSpracheScene(stage)));
//LayoutZeugs-----------------------------------------------------------------------------------------------------------
        VBox layoutVR= new VBox(1);

        HBox layoutHMANummerNeu = new HBox(1);
        HBox layoutHVornameNeu = new HBox(1);
        HBox layoutHNachnameNeu = new HBox(1);
        HBox layoutPasswortNeu = new HBox(1);
        HBox layoutIstChef = new HBox(1);
        HBox layoutIstUnterhalt = new HBox(1);



        layoutHMANummerNeu.getChildren().addAll(lMANummerNeu,txfMANummerNeu,bMANummerNeu,lzeigeMANummerNeu);
        layoutHVornameNeu.getChildren().addAll(lVornameNeu,txfVornameNeu,bVornameNeuOK,lZeigeVornameNeu);
        layoutHNachnameNeu.getChildren().addAll(lNachnameNeu,txfNachnameNeu,bNachnameNeuOK,lZeigeNachnameNeu);
        layoutPasswortNeu.getChildren().addAll(lPassWortNeu,txfPasswortNeu,bPasswortNeuOK,lZeigePasswortNeu);
        layoutIstChef.getChildren().addAll(lIstChefNeu,comboBoxChef,lZeigeIstChefNeu);
        layoutIstUnterhalt.getChildren().addAll(lIstUnterhaltNeu,comboBoxUnterhalt,lZeigeIstUnterhaltNeu);

        layoutVR.getChildren().addAll(labelRegistrierenScene,layoutHMANummerNeu, layoutHVornameNeu,layoutHNachnameNeu,layoutPasswortNeu,layoutIstChef,layoutIstUnterhalt,bRegistrierungAbschliessen,bZurueckSprache,TaskLeistePane.getPane());

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
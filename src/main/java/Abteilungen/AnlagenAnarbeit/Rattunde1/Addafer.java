package Abteilungen.AnlagenAnarbeit.Rattunde1;

import Abteilungen.Anarbeit;
import DatenBank.DatenBank;
import GUI.Login;
import GUI.Sprache;
import GUI.TaskLeistePane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

/**
 * @author - John Schmidt
 * 30.12.2021, 21:11
 */
public class Addafer {
    Pane cardsPane = new StackPane();

    DatenBank dBA = new DatenBank();

    boolean istStoerMeldungButtonGedruecktWorden = false;

    static Boolean rotdb = false;

    Font fontAbsetzen = Font.font("Verdana", FontPosture.ITALIC, 20);
    Font fontAnlageGruppe = Font.font("Arial", 18);

    String einfuegKeinUnterhaltDb = "INSERT INTO stoerungMubea" +
            "(Abteilung, Anlage,  "
            + "VnameG, "
            + "NnameG, DatumG, "
            + "UhrzeitG ,ZSt, AnlageGruppe, Stoerung)" +
            "VALUES  ('"+ Anarbeit.getNameAbteilungAnarbeit() +"', '"+Rattunde1.getNameAnlageRattunde1()+"', "
            + "'" + Login.vorName+"',"
            + "'" + Login.nachName+"', '" + TaskLeistePane.getDatumStr()
            + "', '" + TaskLeistePane.getUhrzeitStr()+ "',";


    String einfuegIstUnterhaltDb333 = "INSERT INTO stoerungMubea" +
            "(VnameB, NnameB, DatumB, UhrzeitB)" +
            "VALUES  ('"+ Login.getVorName() +"', '"+ Login.getNachName() +"', "
            + "'"  + TaskLeistePane.getDatumStr()
            + "', '" + TaskLeistePane.getUhrzeitStr()+ "')";

//        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET" +
//            " VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
//                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
//                + TaskLeistePane.getUhrzeitStr() + "' WHERE STOG = 'open' AND AnlageGruppe = 'ADF/Bundlader' AND Stoerung = 'Gurte';";

    static Boolean bGurteBundladerAbgesetzt = false;
    static Boolean bLichtSchranke1BundladerAbgesetzt = false;
    static Boolean bAnschlagBundladerAbgesetzt = false;
    static Boolean bSchutzZaunBundladerAbgesetzt = false;

    static boolean bRollen_SchraegVereinzelungAbgesetzt = false;
    static boolean bStopper_Bolzen1VereinzelungAbgesetzt = false;
    static boolean bStopper_Bolzen123VereinzelungAbgesetzt = false;

    static boolean bRollen1Rollgang1Abgesetzt = false;
    static boolean bSchweissNahtErkennungRollgang1Abgesetzt = false;
    static boolean bPinchRolle12Rollgang1Abgesetzt = false;

    static boolean bUSSensorMessstationAbgesetzt = false;
    static boolean bLaserMessstationAbgesetzt = false;
    static boolean bEinstellRollenMessstationAbgesetzt = false;
    static boolean bLichtschrankenMSMessstationAbgesetzt = false;
    static boolean bPumpeRueckFuehrEmulsionMessstationAbgesetzt = false;
    static boolean bSchutzTuereMessstationAbgesetzt = false;

    static boolean bPinchRolle3Rollgang4Abgesetzt = false;
    static boolean bRollen4Rollgang4Abgesetzt = false;
    static boolean bRohrAuswerferRollgang4Abgesetzt = false;
    static boolean bSchrottGurteRollgang4Abgesetzt = false;
    static boolean bLichtSchranke2Rollgang4Abgesetzt = false;

    static boolean bWalkingBeamWalkingBeamAbgesetzt = false;
    static boolean bDrehGreiferWalkingBeamAbgesetzt = false;
    static boolean bRadRat1WalkingBeamAbgesetzt = false;

    public int zaehlerBundladerGurte = 0;
    public int zaehlerBundladerLichtSchranke1 = 0;
    public int zaehlerBundladerAnschlag = 0;
    public int zaehlerBundladerSchutzZaun = 0;

    public int zaehlerVereinzelungRollen_Schraeg = 0;
    public int zaehlerVereinzelungStopper_Bolzen1 = 0;
    public int zaehlerVereinzelungStopper_Bolzen123 = 0;

    public int zaehlerRollgang1Rollen1 = 0;
    public int zaehlerRollgang1SchweissNahtErkennung = 0;
    public int zaehlerRollgang1PinchRolle12 = 0;

    public int zaehlerMessstationUSSensor = 0;
    public int zaehlerMessstationLaser = 0;
    public int zaehlerMessstationEinstellRollen = 0;
    public int zaehlerMessstationLichtschrankenMS = 0;
    public int zaehlerMessstationPumpeRueckFuehrEmulsion = 0;
    public int zaehlerMessstationSchutzTuere = 0;

    public int zaehlerRollgang4PinchRolle3 = 0;
    public int zaehlerRollgang4Rollen4 = 0;
    public int zaehlerRollgang4RohrAuswerfer = 0;
    public int zaehlerRollgang4SchrottGurte = 0;
    public int zaehlerRollgang4LichtSchranke2 = 0;

    public int zaehlerWalkingBeamWalkingBeam = 0;
    public int zaehlerWalkingBeamDrehGreifer = 0;
    public int zaehlerWalkingBeamRadRat1 = 0;

    public int getZaehlerWalkingBeamRadRat1() {
        return zaehlerWalkingBeamRadRat1;
    }

    public void setZaehlerWalkingBeamRadRat1(int zaehlerWalkingBeamRadRat1) {
        this.zaehlerWalkingBeamRadRat1 = zaehlerWalkingBeamRadRat1;
    }

    public int getZaehlerWalkingBeamDrehGreifer() {
        return zaehlerWalkingBeamDrehGreifer;
    }

    public void setZaehlerWalkingBeamDrehGreifer(int zaehlerWalkingBeamDrehGreifer) {
        this.zaehlerWalkingBeamDrehGreifer = zaehlerWalkingBeamDrehGreifer;
    }

    public int getZaehlerWalkingBeamWalkingBeam() {
        return zaehlerWalkingBeamWalkingBeam;
    }

    public void setZaehlerWalkingBeamWalkingBeam(int zaehlerWalkingBeamWalkingBeam) {
        this.zaehlerWalkingBeamWalkingBeam = zaehlerWalkingBeamWalkingBeam;
    }

    public int getZaehlerRollgang4LichtSchranke2() {
        return zaehlerRollgang4LichtSchranke2;
    }

    public void setZaehlerRollgang4LichtSchranke2(int zaehlerRollgang4LichtSchranke2) {
        this.zaehlerRollgang4LichtSchranke2 = zaehlerRollgang4LichtSchranke2;
    }

    public int getZaehlerRollgang4SchrottGurte() {
        return zaehlerRollgang4SchrottGurte;
    }

    public void setZaehlerRollgang4SchrottGurte(int zaehlerRollgang4SchrottGurte) {
        this.zaehlerRollgang4SchrottGurte = zaehlerRollgang4SchrottGurte;
    }

    public int getZaehlerRollgang4RohrAuswerfer() {
        return zaehlerRollgang4RohrAuswerfer;
    }

    public void setZaehlerRollgang4RohrAuswerfer(int zaehlerRollgang4RohrAuswerfer) {
        this.zaehlerRollgang4RohrAuswerfer = zaehlerRollgang4RohrAuswerfer;
    }

    public int getZaehlerRollgang4Rollen4() {
        return zaehlerRollgang4Rollen4;
    }

    public void setZaehlerRollgang4Rollen4(int zaehlerRollgang4Rollen4) {
        this.zaehlerRollgang4Rollen4 = zaehlerRollgang4Rollen4;
    }

    public int getZaehlerRollgang4PinchRolle3() {
        return zaehlerRollgang4PinchRolle3;
    }

    public void setZaehlerRollgang4PinchRolle3(int zaehlerRollgang4PinchRolle3) {
        this.zaehlerRollgang4PinchRolle3 = zaehlerRollgang4PinchRolle3;
    }

    public int getZaehlerMessstationUSSensor() {
        return zaehlerMessstationUSSensor;
    }

    public void setZaehlerMessstationUSSensor(int zaehlerMessstationUSSensor) {
        this.zaehlerMessstationUSSensor = zaehlerMessstationUSSensor;
    }

    public int getZaehlerMessstationLaser() {
        return zaehlerMessstationLaser;
    }

    public void setZaehlerMessstationLaser(int zaehlerMessstationLaser) {
        this.zaehlerMessstationLaser = zaehlerMessstationLaser;
    }

    public int getZaehlerMessstationEinstellRollen() {
        return zaehlerMessstationEinstellRollen;
    }

    public void setZaehlerMessstationEinstellRollen(int zaehlerMessstationEinstellRollen) {
        this.zaehlerMessstationEinstellRollen = zaehlerMessstationEinstellRollen;
    }

    public int getZaehlerMessstationLichtschrankenMS() {
        return zaehlerMessstationLichtschrankenMS;
    }

    public void setZaehlerMessstationLichtschrankenMS(int zaehlerMessstationLichtschrankenMS) {
        this.zaehlerMessstationLichtschrankenMS = zaehlerMessstationLichtschrankenMS;
    }

    public int getZaehlerMessstationPumpeRueckFuehrEmulsion() {
        return zaehlerMessstationPumpeRueckFuehrEmulsion;
    }

    public void setZaehlerMessstationPumpeRueckFuehrEmulsion(int zaehlerMessstationPumpeRueckFuehrEmulsion) {
        this.zaehlerMessstationPumpeRueckFuehrEmulsion = zaehlerMessstationPumpeRueckFuehrEmulsion;
    }

    public int getZaehlerMessstationSchutzTuere() {
        return zaehlerMessstationSchutzTuere;
    }

    public void setZaehlerMessstationSchutzTuere(int zaehlerMessstationSchutzTuere) {
        this.zaehlerMessstationSchutzTuere = zaehlerMessstationSchutzTuere;
    }

    public int getZaehlerRollgang1PinchRolle12() {
        return zaehlerRollgang1PinchRolle12;
    }

    public void setZaehlerRollgang1PinchRolle12(int zaehlerRollgang1PinchRolle12) {
        this.zaehlerRollgang1PinchRolle12 = zaehlerRollgang1PinchRolle12;
    }

    public int getZaehlerRollgang1SchweissNahtErkennung() {
        return zaehlerRollgang1SchweissNahtErkennung;
    }

    public void setZaehlerRollgang1SchweissNahtErkennung(int zaehlerRollgang1SchweissNahtErkennung) {
        this.zaehlerRollgang1SchweissNahtErkennung = zaehlerRollgang1SchweissNahtErkennung;
    }

    public int getZaehlerRollgang1Rollen1() {
        return zaehlerRollgang1Rollen1;
    }

    public void setZaehlerRollgang1Rollen1(int zaehlerRollgang1Rollen1) {
        this.zaehlerRollgang1Rollen1 = zaehlerRollgang1Rollen1;
    }

    public int getZaehlerVereinzelungStopper_Bolzen123() {
        return zaehlerVereinzelungStopper_Bolzen123;
    }

    public void setZaehlerVereinzelungStopper_Bolzen123(int zaehlerVereinzelungStopper_Bolzen123) {
        this.zaehlerVereinzelungStopper_Bolzen123 = zaehlerVereinzelungStopper_Bolzen123;
    }

    public int getZaehlerVereinzelungStopper_Bolzen1() {
        return zaehlerVereinzelungStopper_Bolzen1;
    }

    public void setZaehlerVereinzelungStopper_Bolzen1(int zaehlerVereinzelungStopper_Bolzen1) {
        this.zaehlerVereinzelungStopper_Bolzen1 = zaehlerVereinzelungStopper_Bolzen1;
    }

    public int getZaehlerVereinzelungRollen_Schraeg() {
        return zaehlerVereinzelungRollen_Schraeg;
    }

    public void setZaehlerVereinzelungRollen_Schraeg(int zaehlerVereinzelungRollen_Schraeg) {
        this.zaehlerVereinzelungRollen_Schraeg = zaehlerVereinzelungRollen_Schraeg;
    }

    public int getZaehlerBundladerGurte() {
        return zaehlerBundladerGurte;
    }

    public void setZaehlerBundladerGurte(int zaehlerBundladerGurte) {
        this.zaehlerBundladerGurte = zaehlerBundladerGurte;
    }

    public int getZaehlerBundladerLichtSchranke1() {
        return zaehlerBundladerLichtSchranke1;
    }

    public void setZaehlerBundladerLichtSchranke1(int zaehlerBundladerLichtSchranke1) {
        this.zaehlerBundladerLichtSchranke1 = zaehlerBundladerLichtSchranke1;
    }

    public int getZaehlerBundladerAnschlag() {
        return zaehlerBundladerAnschlag;
    }

    public void setZaehlerBundladerAnschlag(int zaehlerBundladerAnschlag) {
        this.zaehlerBundladerAnschlag = zaehlerBundladerAnschlag;
    }

    public int getZaehlerBundladerSchutzZaun() {
        return zaehlerBundladerSchutzZaun;
    }

    public void setZaehlerBundladerSchutzZaun(int zaehlerBundladerSchutzZaun) {
        this.zaehlerBundladerSchutzZaun = zaehlerBundladerSchutzZaun;
    }

    public void setIstStoerMeldungButtonGedruecktWorden(Boolean istStoerMeldungButtonGedruecktWorden){
        this.istStoerMeldungButtonGedruecktWorden=istStoerMeldungButtonGedruecktWorden;
    }


    public static Boolean getRotdb() {
        return rotdb;
    }

    public static void setRotdb(Boolean rotdb) {
        Addafer.rotdb = rotdb;
    }

    public Addafer(Pane cardsPane){
        this.cardsPane=cardsPane;
    }



    public Group macheAddafer(){
        final Group cardAddafer = new Group();//new Text(25, 25, "Addafer blabvlabla")



        VBox layoutV = new VBox(30);
        Label lTitleAddafer = new Label("Rat.1/Addafer");
        lTitleAddafer.setFont(Font.font("Verdana", FontPosture.ITALIC, 30));

//Bundlader-------------------------------------------------------------------------------------------------------------
        HBox layoutHBundlader = new HBox(20);

        Label lBundlader = new Label("Bundlader");
        lBundlader.setFont(fontAnlageGruppe);



        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachGurteBundlader =
                {"Gurte", "cinghie","trake", "rripat", "kayışlar"};

        ToggleButton bGurteBundlader = new ToggleButton(sprachGurteBundlader[Sprache.getSprachenZahl()]);//"Gurte"
        if(bGurteBundladerAbgesetzt ==false) {//rotdb
            bGurteBundlader.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bGurteBundlader.setDisable(true);
            }
            bGurteBundlader.setStyle("-fx-background-color: red");//pink
        }

        bGurteBundlader.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bGurteBundladerAbgesetzt ==false){//grün//rotdb
                    if(bGurteBundlader.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bGurteBundlader.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bGurteBundlader.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bGurteBundlader.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bGurteBundlader.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bGurteBundlader.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bGurteBundlader.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bGurteBundlader.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bGurteBundlader.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bGurteBundlader.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });



        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachLichtSchranke1Bundlader =
                {"LichtSchranke 1", "Barriera fotoelettrica 1","Fotoelektrična barijera 1", "Barriera fotoelektrike 1", "fotoelektrik bariyer 1"};

        ToggleButton bLichtSchranke1Bundlader = new ToggleButton(sprachLichtSchranke1Bundlader[Sprache.getSprachenZahl()]);//"Gurte"
        if(bLichtSchranke1BundladerAbgesetzt ==false) {
            bLichtSchranke1Bundlader.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bLichtSchranke1Bundlader.setDisable(true);
            }
            bLichtSchranke1Bundlader.setStyle("-fx-background-color: red");//pink
        }

        bLichtSchranke1Bundlader.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bLichtSchranke1BundladerAbgesetzt ==false){//grün//rotdb
                    if(bLichtSchranke1Bundlader.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bLichtSchranke1Bundlader.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bLichtSchranke1Bundlader.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bLichtSchranke1Bundlader.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bLichtSchranke1Bundlader.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bLichtSchranke1Bundlader.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bLichtSchranke1Bundlader.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bLichtSchranke1Bundlader.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bLichtSchranke1Bundlader.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bLichtSchranke1Bundlader.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachAnschlagBundlader =
                {"Anschlag", "la fermata","zaustavljanje", "ndalesa", "dur"};

        ToggleButton bAnschlagBundlader = new ToggleButton(sprachAnschlagBundlader[Sprache.getSprachenZahl()]);//"Anschlag"
        if(bAnschlagBundladerAbgesetzt==false) {
            bAnschlagBundlader.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bAnschlagBundlader.setDisable(true);
            }
            bAnschlagBundlader.setStyle("-fx-background-color: red");//pink
        }

        bAnschlagBundlader.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bAnschlagBundladerAbgesetzt==false){//grün//rotdb
                    if(bAnschlagBundlader.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bAnschlagBundlader.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bAnschlagBundlader.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bAnschlagBundlader.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bAnschlagBundlader.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bAnschlagBundlader.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bAnschlagBundlader.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bAnschlagBundlader.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bAnschlagBundlader.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bAnschlagBundlader.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachSchutzZaunBundlader =
                {"SchutzZaun", "recinzione protettiva","zaštitna ograda", "gardh mbrojtës", "koruyucu çit"};

        ToggleButton bSchutzZaunBundlader = new ToggleButton(sprachSchutzZaunBundlader[Sprache.getSprachenZahl()]);//"SchutzZaun"
        if(bSchutzZaunBundladerAbgesetzt==false) {
            bSchutzZaunBundlader.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bSchutzZaunBundlader.setDisable(true);
            }
            bSchutzZaunBundlader.setStyle("-fx-background-color: red");//pink
        }

        bSchutzZaunBundlader.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bSchutzZaunBundladerAbgesetzt==false){//grün//rotdb
                    if(bSchutzZaunBundlader.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bSchutzZaunBundlader.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bSchutzZaunBundlader.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bSchutzZaunBundlader.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bSchutzZaunBundlader.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bSchutzZaunBundlader.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bSchutzZaunBundlader.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bSchutzZaunBundlader.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bSchutzZaunBundlader.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bSchutzZaunBundlader.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });

//Vereinzelung----------------------------------------------------------------------------------------------------------
        HBox layoutHVereinzelung = new HBox(20);

        Label lVereinzelung = new Label("Vereinzelung");
        lVereinzelung.setFont(fontAnlageGruppe);


       // Button bRollenSchraeg = new Button("Rollen schräg");

        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachRollen_SchraegVereinzelung =
                {"Rollen schräg", "Rotolo obliquo","roll aslant", "rrotulloj aslant", "rulo eğik"};

        ToggleButton bRollen_SchraegVereinzelung = new ToggleButton(sprachRollen_SchraegVereinzelung[Sprache.getSprachenZahl()]);//"Rollen schräg"
        if(bRollen_SchraegVereinzelungAbgesetzt==false) {
            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bRollen_SchraegVereinzelung.setDisable(true);
            }
            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: red");//pink
        }

        bRollen_SchraegVereinzelung.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bRollen_SchraegVereinzelungAbgesetzt==false){//grün//rotdb
                    if(bRollen_SchraegVereinzelung.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bRollen_SchraegVereinzelung.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRollen_SchraegVereinzelung.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });

        //Button bStopperBolzen1 = new Button("Stopper-Bolzen 1");
        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachStopper_Bolzen1Vereinzelung =
                {"Stopper-Bolzen 1", "Bullone di arresto 1","Stopper Bolt 1", "Bulon i tapës 1", "Stoper Cıvatası 1"};

        ToggleButton bStopper_Bolzen1Vereinzelung = new ToggleButton(sprachStopper_Bolzen1Vereinzelung[Sprache.getSprachenZahl()]);//"Stopper-Bolzen 1"
        if(bStopper_Bolzen1VereinzelungAbgesetzt==false) {
            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bStopper_Bolzen1Vereinzelung.setDisable(true);
            }
            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: red");//pink
        }

        bStopper_Bolzen1Vereinzelung.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bStopper_Bolzen1VereinzelungAbgesetzt==false){//grün//rotdb
                    if(bStopper_Bolzen1Vereinzelung.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bStopper_Bolzen1Vereinzelung.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachStopper_Bolzen123Vereinzelung =
                {"Stopper-Bolzen 123", "Bullone di arresto 123","Stopper Bolt 123", "Bulon i tapës 123", "Stoper Cıvatası 123"};

        ToggleButton bStopper_Bolzen123Vereinzelung = new ToggleButton(sprachStopper_Bolzen123Vereinzelung[Sprache.getSprachenZahl()]);//"Stopper-Bolzen 123"
        if(bStopper_Bolzen123VereinzelungAbgesetzt==false) {
            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bStopper_Bolzen123Vereinzelung.setDisable(true);
            }
            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: red");//pink
        }

        bStopper_Bolzen123Vereinzelung.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bStopper_Bolzen123VereinzelungAbgesetzt==false){//grün//rotdb
                    if(bStopper_Bolzen123Vereinzelung.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bStopper_Bolzen123Vereinzelung.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


//Rollgang1-------------------------------------------------------------------------------------------------------------
        HBox layoutHRollgang1 = new HBox(20);

        Label lRollgang1 = new Label("Rollgang 1");
        lRollgang1.setFont(fontAnlageGruppe);


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachRollen1Rollgang1 =
                {"Rollen 1", "ruoli 1","uloge 1", "rolet 1", "roller 1"};

        ToggleButton bRollen1Rollgang1 = new ToggleButton(sprachRollen1Rollgang1[Sprache.getSprachenZahl()]);//"Rollen 1"
        if(bRollen1Rollgang1Abgesetzt==false) {
            bRollen1Rollgang1.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bRollen1Rollgang1.setDisable(true);
            }
            bRollen1Rollgang1.setStyle("-fx-background-color: red");//pink
        }

        bRollen1Rollgang1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bRollen1Rollgang1Abgesetzt==false){//grün//rotdb
                    if(bRollen1Rollgang1.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bRollen1Rollgang1.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bRollen1Rollgang1.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRollen1Rollgang1.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRollen1Rollgang1.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bRollen1Rollgang1.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bRollen1Rollgang1.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bRollen1Rollgang1.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRollen1Rollgang1.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRollen1Rollgang1.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachSchweissNahtErkennungRollgang1 =
                {"Schweissnaht-\n Erkennung", "Saldare-\nriconoscimento","zavariti-\nprepoznavanje", "Bashkoj-\nnjohje", "Kaynak-\ntanıma"};

        ToggleButton bSchweissNahtErkennungRollgang1 = new ToggleButton(sprachSchweissNahtErkennungRollgang1[Sprache.getSprachenZahl()]);//"Schweissnaht-Erkennung"
        if(bSchweissNahtErkennungRollgang1Abgesetzt==false) {
            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bSchweissNahtErkennungRollgang1.setDisable(true);
            }
            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: red");//pink
        }

        bSchweissNahtErkennungRollgang1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bSchweissNahtErkennungRollgang1Abgesetzt==false){//grün//rotdb
                    if(bSchweissNahtErkennungRollgang1.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bSchweissNahtErkennungRollgang1.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachPinchRolle12Rollgang1 =
                {"Pinch-Rollen 1 2", "Rulli di presa 1 2","Pričvrsni valjci 1 2", "Kapni rrotullat 1 2", "Sıkıştırma silindirleri 1 2"};

        ToggleButton bPinchRolle12Rollgang1 = new ToggleButton(sprachPinchRolle12Rollgang1[Sprache.getSprachenZahl()]);//"Pinch-Rollen 1 2"
        if(bPinchRolle12Rollgang1Abgesetzt==false) {
            bPinchRolle12Rollgang1.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bPinchRolle12Rollgang1.setDisable(true);
            }
            bPinchRolle12Rollgang1.setStyle("-fx-background-color: red");//pink
        }

        bPinchRolle12Rollgang1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bPinchRolle12Rollgang1Abgesetzt==false){//grün//rotdb
                    if(bPinchRolle12Rollgang1.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bPinchRolle12Rollgang1.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bPinchRolle12Rollgang1.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bPinchRolle12Rollgang1.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bPinchRolle12Rollgang1.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bPinchRolle12Rollgang1.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bPinchRolle12Rollgang1.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bPinchRolle12Rollgang1.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bPinchRolle12Rollgang1.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bPinchRolle12Rollgang1.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });

//Messstation----------------------------------------------------------------------------------------------------------------------

        HBox layoutHMessstation = new HBox(20);

        Label lMessstation = new Label("Messstation");
        lMessstation.setFont(fontAnlageGruppe);


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachUSSensorMessstation =
                {"US-Sensor", "US-sensore","US-senzor", "US-sensor", "US-sensör"};

        ToggleButton bUSSensorMessstation = new ToggleButton(sprachUSSensorMessstation[Sprache.getSprachenZahl()]);//"US-Sensor"
        if(bUSSensorMessstationAbgesetzt==false) {
            bUSSensorMessstation.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bUSSensorMessstation.setDisable(true);
            }
            bUSSensorMessstation.setStyle("-fx-background-color: red");//pink
        }

        bUSSensorMessstation.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bUSSensorMessstationAbgesetzt==false){//grün//rotdb
                    if(bUSSensorMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bUSSensorMessstation.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bUSSensorMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bUSSensorMessstation.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bUSSensorMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bUSSensorMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bUSSensorMessstation.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bUSSensorMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bUSSensorMessstation.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bUSSensorMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachLaserMessstation =
                {"Laser", "Laser","Laser", "Lazer", "Lazer"};

        ToggleButton bLaserMessstation = new ToggleButton(sprachLaserMessstation[Sprache.getSprachenZahl()]);//"Laser"
        if(bLaserMessstationAbgesetzt==false) {
            bLaserMessstation.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bLaserMessstation.setDisable(true);
            }
            bLaserMessstation.setStyle("-fx-background-color: red");//pink
        }

        bLaserMessstation.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bLaserMessstationAbgesetzt==false){//grün//rotdb
                    if(bLaserMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bLaserMessstation.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bLaserMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bLaserMessstation.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bLaserMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bLaserMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bLaserMessstation.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bLaserMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bLaserMessstation.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bLaserMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachEinstellRollenMessstation =
                {"Einstell- Rollen", "rulli di regolazione","valjci za postavljanje", "rrotullat e vendosjes", "ayar silindirleri"};

        ToggleButton bEinstellRollenMessstation = new ToggleButton(sprachEinstellRollenMessstation[Sprache.getSprachenZahl()]);//"Einstell- Rollen"
        if(bEinstellRollenMessstationAbgesetzt==false) {
            bEinstellRollenMessstation.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bEinstellRollenMessstation.setDisable(true);
            }
            bEinstellRollenMessstation.setStyle("-fx-background-color: red");//pink
        }

        bEinstellRollenMessstation.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bEinstellRollenMessstationAbgesetzt==false){//grün//rotdb
                    if(bEinstellRollenMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bEinstellRollenMessstation.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bEinstellRollenMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bEinstellRollenMessstation.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bEinstellRollenMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bEinstellRollenMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bEinstellRollenMessstation.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bEinstellRollenMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bEinstellRollenMessstation.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bEinstellRollenMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachLichtschrankenMSMessstation =
                {"Lichtschranke MS", "Barriera fotoelettrica MS","Fotoelektrična barijera MS", "Barriera fotoelektrike MS", "fotoelektrik bariyer MS"};

        ToggleButton bLichtschrankenMSMessstation = new ToggleButton(sprachLichtschrankenMSMessstation[Sprache.getSprachenZahl()]);//"Lichtschranke MS"
        if(bLichtschrankenMSMessstationAbgesetzt==false) {
            bLichtschrankenMSMessstation.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bLichtschrankenMSMessstation.setDisable(true);
            }
            bLichtschrankenMSMessstation.setStyle("-fx-background-color: red");//pink
        }

        bLichtschrankenMSMessstation.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bLichtschrankenMSMessstationAbgesetzt==false){//grün//rotdb
                    if(bLichtschrankenMSMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bLichtschrankenMSMessstation.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bLichtschrankenMSMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bLichtschrankenMSMessstation.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bLichtschrankenMSMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bLichtschrankenMSMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bLichtschrankenMSMessstation.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bLichtschrankenMSMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bLichtschrankenMSMessstation.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bLichtschrankenMSMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachPumpeRueckFuehrEmulsionMessstation =
                {"Pumpe Emulsion", "emulsione a pompa","emulzija pumpe", "emulsioni i pompës", "pompa emülsiyonu"};

        ToggleButton bPumpeRueckFuehrEmulsionMessstation = new ToggleButton(sprachPumpeRueckFuehrEmulsionMessstation[Sprache.getSprachenZahl()]);//"Pumpe Emulsion"
        if(bPumpeRueckFuehrEmulsionMessstationAbgesetzt==false) {
            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bPumpeRueckFuehrEmulsionMessstation.setDisable(true);
            }
            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: red");//pink
        }

        bPumpeRueckFuehrEmulsionMessstation.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bPumpeRueckFuehrEmulsionMessstationAbgesetzt==false){//grün//rotdb
                    if(bPumpeRueckFuehrEmulsionMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bPumpeRueckFuehrEmulsionMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachSchutzTuereMessstation =
                {"Schutz-Türe", "porta di protezione","zaštitna vrata", "dera mbrojtëse", "koruma kapısı"};

        ToggleButton bSchutzTuereMessstation = new ToggleButton(sprachSchutzTuereMessstation[Sprache.getSprachenZahl()]);//"Pumpe Emulsion"
        if(bSchutzTuereMessstationAbgesetzt==false) {
            bSchutzTuereMessstation.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bSchutzTuereMessstation.setDisable(true);
            }
            bSchutzTuereMessstation.setStyle("-fx-background-color: red");//pink
        }

        bSchutzTuereMessstation.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bSchutzTuereMessstationAbgesetzt==false){//grün//rotdb
                    if(bSchutzTuereMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bSchutzTuereMessstation.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bSchutzTuereMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bSchutzTuereMessstation.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bSchutzTuereMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bSchutzTuereMessstation.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bSchutzTuereMessstation.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bSchutzTuereMessstation.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bSchutzTuereMessstation.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bSchutzTuereMessstation.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });

//Rollgang4----------------------------------------------------------------------------------------------------------------------
        HBox layoutHRollgang4 = new HBox(20);

        Label lRollgang4 = new Label("Rollgang 4");
        lRollgang4.setFont(fontAnlageGruppe);


        //Button bPinchRolle3 = new Button("Pinch-Rolle 3");
        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachPinchRolle3Rollgang4 =
                {"Pinch-Rolle 3", "Pizzicare il rotolo 3","Pinch roll 3", "Roll me majë 3", "Sıkıştırma rulosu 3"};

        ToggleButton bPinchRolle3Rollgang4 = new ToggleButton(sprachPinchRolle3Rollgang4[Sprache.getSprachenZahl()]);//"Pumpe Emulsion"
        if(bPinchRolle3Rollgang4Abgesetzt==false) {
            bPinchRolle3Rollgang4.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bPinchRolle3Rollgang4.setDisable(true);
            }
            bPinchRolle3Rollgang4.setStyle("-fx-background-color: red");//pink
        }

        bPinchRolle3Rollgang4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bPinchRolle3Rollgang4Abgesetzt==false){//grün//rotdb
                    if(bPinchRolle3Rollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bPinchRolle3Rollgang4.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bPinchRolle3Rollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bPinchRolle3Rollgang4.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bPinchRolle3Rollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bPinchRolle3Rollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bPinchRolle3Rollgang4.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bPinchRolle3Rollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bPinchRolle3Rollgang4.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bPinchRolle3Rollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


       // Button bRollen4 = new Button("Rollen 4");
        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachRollen4Rollgang4 =
                {"Rollen 4", "ruoli 4","uloge 4", "rolet 4", "roller 4"};

        ToggleButton bRollen4Rollgang4 = new ToggleButton(sprachRollen4Rollgang4[Sprache.getSprachenZahl()]);//"Pumpe Emulsion"
        if(bRollen4Rollgang4Abgesetzt==false) {
            bRollen4Rollgang4.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bRollen4Rollgang4.setDisable(true);
            }
            bRollen4Rollgang4.setStyle("-fx-background-color: red");//pink
        }

        bRollen4Rollgang4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bRollen4Rollgang4Abgesetzt==false){//grün//rotdb
                    if(bRollen4Rollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bRollen4Rollgang4.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bRollen4Rollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRollen4Rollgang4.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRollen4Rollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bRollen4Rollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bRollen4Rollgang4.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bRollen4Rollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRollen4Rollgang4.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRollen4Rollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachRohrAuswerferRollgang4 =
                {"Rohr- Auswerfer", "tubo eiettore","cevni ejektor", "ejektor tub", "tüp ejektörü"};

        ToggleButton bRohrAuswerferRollgang4 = new ToggleButton(sprachRohrAuswerferRollgang4[Sprache.getSprachenZahl()]);//"Rohr- Auswerfer"
        if(bRohrAuswerferRollgang4Abgesetzt==false) {
            bRohrAuswerferRollgang4.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bRohrAuswerferRollgang4.setDisable(true);
            }
            bRohrAuswerferRollgang4.setStyle("-fx-background-color: red");//pink
        }

        bRohrAuswerferRollgang4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bRohrAuswerferRollgang4Abgesetzt==false){//grün//rotdb
                    if(bRohrAuswerferRollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bRohrAuswerferRollgang4.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bRohrAuswerferRollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRohrAuswerferRollgang4.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRohrAuswerferRollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bRohrAuswerferRollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bRohrAuswerferRollgang4.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bRohrAuswerferRollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRohrAuswerferRollgang4.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRohrAuswerferRollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachSchrottGurteRollgang4 =
                {"Gurte Schrott", "rottami di cinghie","straps scrap", "rripa skrap", "kayışlar hurda"};

        ToggleButton bSchrottGurteRollgang4 = new ToggleButton(sprachSchrottGurteRollgang4[Sprache.getSprachenZahl()]);//"Gurte Schrott"
        if(bSchrottGurteRollgang4Abgesetzt==false) {
            bSchrottGurteRollgang4.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bSchrottGurteRollgang4.setDisable(true);
            }
            bSchrottGurteRollgang4.setStyle("-fx-background-color: red");//pink
        }

        bSchrottGurteRollgang4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bSchrottGurteRollgang4Abgesetzt==false){//grün//rotdb
                    if(bSchrottGurteRollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bSchrottGurteRollgang4.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bSchrottGurteRollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bSchrottGurteRollgang4.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bSchrottGurteRollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bSchrottGurteRollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bSchrottGurteRollgang4.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bSchrottGurteRollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bSchrottGurteRollgang4.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bSchrottGurteRollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachLichtSchranke2Rollgang4 =
                {"Lichtschranke 2", "Barriera fotoelettrica 2","Fotoelektrična barijera 2", "Barriera fotoelektrike 2", "fotoelektrik bariyer 2"};

        ToggleButton bLichtSchranke2Rollgang4 = new ToggleButton(sprachLichtSchranke2Rollgang4[Sprache.getSprachenZahl()]);//"Lichtschranke 2"
        if(bLichtSchranke2Rollgang4Abgesetzt==false) {
            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bLichtSchranke2Rollgang4.setDisable(true);
            }
            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: red");//pink
        }

        bLichtSchranke2Rollgang4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bLichtSchranke2Rollgang4Abgesetzt==false){//grün//rotdb
                    if(bLichtSchranke2Rollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bLichtSchranke2Rollgang4.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bLichtSchranke2Rollgang4.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


//WalkingBeam----------------------------------------------------------------------------------------------------------------------
        HBox layoutHWalkingBeam = new HBox(20);

        Label lWalkingBeam = new Label("WalkingBeam");
        lWalkingBeam.setFont(fontAnlageGruppe);


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachWalkingBeamWalkingBeam =
                {"WalkingBeam", "WalkingBeam","WalkingBeam", "WalkingBeam", "WalkingBeam"};

        ToggleButton bWalkingBeamWalkingBeam = new ToggleButton(sprachWalkingBeamWalkingBeam[Sprache.getSprachenZahl()]);//"WalkingBeam"
        if(bWalkingBeamWalkingBeamAbgesetzt==false) {
            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bWalkingBeamWalkingBeam.setDisable(true);
            }
            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: red");//pink
        }

        bWalkingBeamWalkingBeam.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bWalkingBeamWalkingBeamAbgesetzt==false){//grün//rotdb
                    if(bWalkingBeamWalkingBeam.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bWalkingBeamWalkingBeam.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bWalkingBeamWalkingBeam.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachDrehGreiferWalkingBeam =
                {"Dreh-Greifer", "pinza rotante","rotaciona hvataljka", "kapëse rrotulluese", "döner :) tutucu"};

        ToggleButton bDrehGreiferWalkingBeam = new ToggleButton(sprachDrehGreiferWalkingBeam[Sprache.getSprachenZahl()]);//"Dreh-Greifer"
        if(bDrehGreiferWalkingBeamAbgesetzt==false) {
            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bDrehGreiferWalkingBeam.setDisable(true);
            }
            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: red");//pink
        }

        bDrehGreiferWalkingBeam.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bDrehGreiferWalkingBeamAbgesetzt==false){//grün//rotdb
                    if(bDrehGreiferWalkingBeam.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bDrehGreiferWalkingBeam.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bDrehGreiferWalkingBeam.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });

        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachRadRat1WalkingBeam =
                {"Rad-Rat1", "ruota-Rat1","volan-Rat1", "rrota-Rat1", "teker-Rat1"};

        ToggleButton bRadRat1WalkingBeam = new ToggleButton(sprachRadRat1WalkingBeam[Sprache.getSprachenZahl()]);//"Rad-Rat1"
        if(bRadRat1WalkingBeamAbgesetzt==false) {
            bRadRat1WalkingBeam.setStyle("-fx-background-color: green");//blue
        }else{
            if(Login.getIstUnterhalt().equals("keinU")){
                bRadRat1WalkingBeam.setDisable(true);
            }
            bRadRat1WalkingBeam.setStyle("-fx-background-color: red");//pink
        }

        bRadRat1WalkingBeam.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bRadRat1WalkingBeamAbgesetzt==false){//grün//rotdb
                    if(bRadRat1WalkingBeam.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")){
                            bRadRat1WalkingBeam.setStyle("-fx-background-color: green");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")||Login.getIstUnterhalt().equals("Admin")){
                            bRadRat1WalkingBeam.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRadRat1WalkingBeam.setStyle("-fx-background-color: green");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRadRat1WalkingBeam.setStyle("-fx-background-color: green");
                        }
                    }
                }else {
                    if(bRadRat1WalkingBeam.isSelected()){
                        System.out.println("ist selectet erste");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            bRadRat1WalkingBeam.setStyle("-fx-background-color: pink");//pink
                            System.out.println("Bin Unterhalt pink: ");
                        }else if(Login.getIstUnterhalt().equals("keinU")){
                            bRadRat1WalkingBeam.setStyle("-fx-background-color: yellow");
                            System.out.println("Bin kein Unterhalt gelb: ");
                        }
                    }else {
                        System.out.println("Sollte jetzt deselectet sein");
                        if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                            System.out.println("Bin Unterhalt rot: ");
                            bRadRat1WalkingBeam.setStyle("-fx-background-color: red");//red
                        }
                        else if(Login.getIstUnterhalt().equals("keinU")){
                            System.out.println("Bin kein Unterhalt grün");
                            bRadRat1WalkingBeam.setStyle("-fx-background-color: green");
                        }
                    }
                }
            }
        });

//ButtonZurückRat1----------------------------------------------------------------------------------------------------------------------
        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachZurueck =
                {"Zurück", "Indietro","Nazad", "Mbrapa", "Geri"};
        Button bZurueckRat1 = new Button(sprachZurueck[Sprache.getSprachenZahl()]);//"Zurück"
        bZurueckRat1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Rattunde1(cardsPane).macheRattunde1());
            }
        });
//ButtonStörMeldungAbsetzen----------------------------------------------------------------------------------------------------------------------
//        String einfuegDbGurte = "INSERT INTO stoerungMubea" +
//                "(Abteilung, Anlage, AnlageGruppe, Stoerung, "
//                + "ZaehlerDerStoerung, VornameGemeldet, "
//                + "NachnameGemeldet, DatumGemeldet, "
//                + "UhrzeitGemeldet)" +
//                "VALUES  ('Anarbeit', 'Rattunde1', 'Addafer - Gurte', "
//                + "'"+ this.getZaehlerBundladerGurte() +"', '" + Login.vorName+"',"
//                + "'" + Login.nachName+"', '" + TaskLeistePane.getDatumStr()+"',"
//                + "', '" + TaskLeistePane.getUhrzeitStr()+ "')";
//
//        //dbk1.schreibeDB(url1,user1,password1, einfuegString1);      //Immer wenn Play, kommt natürlich wieder eine dazu
//        dBA.schreibeDB(einfuegDbGurte);

        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachStoerMeldungAbsetzen =
                {"Stör-Meldung absetzen", "Invia messaggio di errore","Pošalji poruku o grešci", "Dërgo mesazh gabimi", "Hata mesajı gönder"};
        Button bStoerMeldungAbsetzen = new Button(sprachStoerMeldungAbsetzen[Sprache.getSprachenZahl()]);//"Stör-Meldung absetzen"
        if(Login.getIstUnterhalt().equals("istU")){
            bStoerMeldungAbsetzen.setStyle("-fx-background-color: transparent");
            bStoerMeldungAbsetzen.setStyle("-fx-text-fill: transparent");
            bStoerMeldungAbsetzen.setDisable(true);
            bStoerMeldungAbsetzen.setVisible(false);
        }


        bStoerMeldungAbsetzen.setFont(fontAbsetzen);
        bStoerMeldungAbsetzen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                if(bGurteBundlader.isSelected()){
                    //lZeigeStoerMeldung.setText("Gurte sind aktiviert");
                        if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bGurteBundladerAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerBundladerGurte() +"','Adf/Bundlader' , 'Gurte')");
                        bGurteBundlader.setStyle("-fx-background-color: red");
                        bGurteBundlader.setDisable(true);
                        bGurteBundladerAbgesetzt = true;
                        setZaehlerBundladerGurte(zaehlerBundladerGurte +1);
                            setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("Gurte sind deselectet bei MeldungabsetztenSchlaufe");
                }



                if(bLichtSchranke1Bundlader.isSelected()){
                    //lZeigeStoerMeldung.setText("LichtSchranke1 ist aktiviert");
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bLichtSchranke1BundladerAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerBundladerLichtSchranke1() +"','Adf/Bundlader' , 'LichtSchranke1')");
                        bLichtSchranke1Bundlader.setStyle("-fx-background-color: red");
                        bLichtSchranke1Bundlader.setDisable(true);
                        bLichtSchranke1BundladerAbgesetzt = true;
                        setZaehlerBundladerLichtSchranke1(zaehlerBundladerLichtSchranke1 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("LichtSchranke1 deselectet bei MeldungabsetztenSchlaufe");
                }


                if(bAnschlagBundlader.isSelected()){
                    //lZeigeStoerMeldung.setText("LichtSchranke1 ist aktiviert");
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bAnschlagBundladerAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerBundladerAnschlag() +"','Adf/Bundlader' , 'Anschlag')");
                        bAnschlagBundlader.setStyle("-fx-background-color: red");
                        bAnschlagBundlader.setDisable(true);
                        bAnschlagBundladerAbgesetzt = true;
                        setZaehlerBundladerAnschlag(zaehlerBundladerAnschlag +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("Bundlader Anschlag deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bSchutzZaunBundlader.isSelected()){
                    //lZeigeStoerMeldung.setText("LichtSchranke1 ist aktiviert");
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bSchutzZaunBundladerAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerBundladerSchutzZaun() +"','Adf/Bundlader' , 'SchutzZaun')");
                        bSchutzZaunBundlader.setStyle("-fx-background-color: red");
                        bSchutzZaunBundlader.setDisable(true);
                        bSchutzZaunBundladerAbgesetzt = true;
                        setZaehlerBundladerSchutzZaun(zaehlerBundladerSchutzZaun +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("Bundlader Anschlag deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bRollen_SchraegVereinzelung.isSelected()){
                    //lZeigeStoerMeldung.setText("LichtSchranke1 ist aktiviert");
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bRollen_SchraegVereinzelungAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerVereinzelungRollen_Schraeg() +"','Adf/Vereinzelung' , 'Rollen Schräg')");
                        bRollen_SchraegVereinzelung.setStyle("-fx-background-color: red");
                        bRollen_SchraegVereinzelung.setDisable(true);
                        bRollen_SchraegVereinzelungAbgesetzt = true;
                        setZaehlerVereinzelungRollen_Schraeg(zaehlerVereinzelungRollen_Schraeg +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("Rollen_SchraegVereinzelung deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bStopper_Bolzen1Vereinzelung.isSelected()){
                    //lZeigeStoerMeldung.setText("LichtSchranke1 ist aktiviert");
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bStopper_Bolzen1VereinzelungAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerVereinzelungStopper_Bolzen1() +"','Adf/Vereinzelung' , 'Stopper-Bolzen1')");
                        bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: red");
                        bStopper_Bolzen1Vereinzelung.setDisable(true);
                        bStopper_Bolzen1VereinzelungAbgesetzt = true;
                        setZaehlerVereinzelungStopper_Bolzen1(zaehlerVereinzelungStopper_Bolzen1 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("Stopper_Bolzen1Vereinzelung deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bStopper_Bolzen123Vereinzelung.isSelected()){
                    //lZeigeStoerMeldung.setText("LichtSchranke1 ist aktiviert");
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bStopper_Bolzen1VereinzelungAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerVereinzelungStopper_Bolzen123() +"','Adf/Vereinzelung' , 'Stopper-Bolzen123')");
                        bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: red");
                        bStopper_Bolzen123Vereinzelung.setDisable(true);
                        bStopper_Bolzen123VereinzelungAbgesetzt = true;
                        setZaehlerVereinzelungStopper_Bolzen123(zaehlerVereinzelungStopper_Bolzen123 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("Stopper_Bolzen123Vereinzelung deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bRollen1Rollgang1.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bRollen1Rollgang1Abgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerRollgang1Rollen1() +"','Adf/Rollgang1' , 'Rollen1')");
                        bRollen1Rollgang1.setStyle("-fx-background-color: red");
                        bRollen1Rollgang1.setDisable(true);
                        bRollen1Rollgang1Abgesetzt = true;
                        setZaehlerRollgang1Rollen1(zaehlerRollgang1Rollen1 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("Rollen1Rollgang1 deselectet bei MeldungabsetztenSchlaufe");
                }


                if(bSchweissNahtErkennungRollgang1.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bSchweissNahtErkennungRollgang1Abgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerRollgang1SchweissNahtErkennung() +"','Adf/Rollgang1' , 'SchweissNaht-Erkennung')");
                        bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: red");
                        bSchweissNahtErkennungRollgang1.setDisable(true);
                        bSchweissNahtErkennungRollgang1Abgesetzt = true;
                        setZaehlerRollgang1SchweissNahtErkennung(zaehlerRollgang1SchweissNahtErkennung +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("SchweissNahtErkennungRollgang1 deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bPinchRolle12Rollgang1.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bPinchRolle12Rollgang1Abgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerRollgang1PinchRolle12() +"','Adf/Rollgang1' , 'PinchRolle 1 2')");
                        bPinchRolle12Rollgang1.setStyle("-fx-background-color: red");
                        bPinchRolle12Rollgang1.setDisable(true);
                        bPinchRolle12Rollgang1Abgesetzt = true;
                        setZaehlerRollgang1PinchRolle12(zaehlerRollgang1PinchRolle12 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("PinchRolle12Rollgang1 deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bUSSensorMessstation.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bUSSensorMessstationAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerMessstationUSSensor() +"','Adf/Messstation' , 'US-Sensor')");
                        bUSSensorMessstation.setStyle("-fx-background-color: red");
                        bUSSensorMessstation.setDisable(true);
                        bUSSensorMessstationAbgesetzt = true;
                        setZaehlerMessstationUSSensor(zaehlerMessstationUSSensor +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("USSensorMessstation deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bLaserMessstation.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bLaserMessstationAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerMessstationLaser() +"','Adf/Messstation' , 'Laser')");
                        bLaserMessstation.setStyle("-fx-background-color: red");
                        bLaserMessstation.setDisable(true);
                        bLaserMessstationAbgesetzt = true;
                        setZaehlerMessstationLaser(zaehlerMessstationLaser +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("LaserMessstation deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bEinstellRollenMessstation.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bEinstellRollenMessstationAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerMessstationEinstellRollen() +"','Adf/Messstation' , 'Einstell-Rollen')");
                        bEinstellRollenMessstation.setStyle("-fx-background-color: red");
                        bEinstellRollenMessstation.setDisable(true);
                        bEinstellRollenMessstationAbgesetzt = true;
                        setZaehlerMessstationEinstellRollen(zaehlerMessstationEinstellRollen +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("EinstellRollenMessstation deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bLichtschrankenMSMessstation.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bLichtschrankenMSMessstationAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerMessstationLichtschrankenMS() +"','Adf/Messstation' , 'Lichtschranken MS')");
                        bLichtschrankenMSMessstation.setStyle("-fx-background-color: red");
                        bLichtschrankenMSMessstation.setDisable(true);
                        bLichtschrankenMSMessstationAbgesetzt = true;
                        setZaehlerMessstationLichtschrankenMS(zaehlerMessstationLichtschrankenMS +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("LichtschrankenMSMessstation deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bPumpeRueckFuehrEmulsionMessstation.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bPumpeRueckFuehrEmulsionMessstationAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerMessstationPumpeRueckFuehrEmulsion() +"','Adf/Messstation' , 'Pumpe Emulsion')");
                        bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: red");
                        bPumpeRueckFuehrEmulsionMessstation.setDisable(true);
                        bPumpeRueckFuehrEmulsionMessstationAbgesetzt = true;
                        setZaehlerMessstationPumpeRueckFuehrEmulsion(zaehlerMessstationPumpeRueckFuehrEmulsion +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("PumpeRueckFuehrEmulsionMessstation deselectet bei MeldungabsetztenSchlaufe");
                }


                if(bSchutzTuereMessstation.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bSchutzTuereMessstationAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerMessstationSchutzTuere() +"','Adf/Messstation' , 'Schutz-Türe')");
                        bSchutzTuereMessstation.setStyle("-fx-background-color: red");
                        bSchutzTuereMessstation.setDisable(true);
                        bSchutzTuereMessstationAbgesetzt = true;
                        setZaehlerMessstationSchutzTuere(zaehlerMessstationSchutzTuere +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("SchutzTuereMessstation deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bPinchRolle3Rollgang4.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bPinchRolle3Rollgang4Abgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerRollgang4PinchRolle3() +"','Adf/Rollgang4' , 'PinchRolle3')");
                        bPinchRolle3Rollgang4.setStyle("-fx-background-color: red");
                        bPinchRolle3Rollgang4.setDisable(true);
                        bPinchRolle3Rollgang4Abgesetzt = true;
                        setZaehlerRollgang4PinchRolle3(zaehlerRollgang4PinchRolle3 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("PinchRolle3Rollgang4 deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bRollen4Rollgang4.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bRollen4Rollgang4Abgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerRollgang4Rollen4() +"','Adf/Rollgang4' , 'Rollen4')");
                        bRollen4Rollgang4.setStyle("-fx-background-color: red");
                        bRollen4Rollgang4.setDisable(true);
                        bRollen4Rollgang4Abgesetzt = true;
                        setZaehlerRollgang4Rollen4(zaehlerRollgang4Rollen4 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("Rollen4Rollgang4 deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bRohrAuswerferRollgang4.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bRohrAuswerferRollgang4Abgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerRollgang4RohrAuswerfer() +"','Adf/Rollgang4' , 'Rohr-Auswerfer')");
                        bRohrAuswerferRollgang4.setStyle("-fx-background-color: red");
                        bRohrAuswerferRollgang4.setDisable(true);
                        bRohrAuswerferRollgang4Abgesetzt = true;
                        setZaehlerRollgang4RohrAuswerfer(zaehlerRollgang4RohrAuswerfer +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("RohrAuswerferRollgang4 deselectet bei MeldungabsetztenSchlaufe");
                }


                if(bSchrottGurteRollgang4.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bSchrottGurteRollgang4Abgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerRollgang4SchrottGurte() +"','Adf/Rollgang4' , 'Gurte-Schrott')");
                        bSchrottGurteRollgang4.setStyle("-fx-background-color: red");
                        bSchrottGurteRollgang4.setDisable(true);
                        bSchrottGurteRollgang4Abgesetzt = true;
                        setZaehlerRollgang4SchrottGurte(zaehlerRollgang4SchrottGurte +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("SchrottGurteRollgang4 deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bLichtSchranke2Rollgang4.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bLichtSchranke2Rollgang4Abgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerRollgang4LichtSchranke2() +"','Adf/Rollgang4' , 'LichtSchranke2')");
                        bLichtSchranke2Rollgang4.setStyle("-fx-background-color: red");
                        bLichtSchranke2Rollgang4.setDisable(true);
                        bLichtSchranke2Rollgang4Abgesetzt = true;
                        setZaehlerRollgang4LichtSchranke2(zaehlerRollgang4LichtSchranke2 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("LichtSchranke2Rollgang4 deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bWalkingBeamWalkingBeam.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bWalkingBeamWalkingBeamAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerWalkingBeamWalkingBeam() +"','Adf/WalkingBeam' , 'WalkingBeam')");
                        bWalkingBeamWalkingBeam.setStyle("-fx-background-color: red");
                        bWalkingBeamWalkingBeam.setDisable(true);
                        bWalkingBeamWalkingBeamAbgesetzt = true;
                        setZaehlerWalkingBeamWalkingBeam(zaehlerWalkingBeamWalkingBeam +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("WalkingBeamWalkingBeam deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bDrehGreiferWalkingBeam.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bDrehGreiferWalkingBeamAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerWalkingBeamDrehGreifer() +"','Adf/WalkingBeam' , 'Dreh-Greifer')");
                        bDrehGreiferWalkingBeam.setStyle("-fx-background-color: red");
                        bDrehGreiferWalkingBeam.setDisable(true);
                        bDrehGreiferWalkingBeamAbgesetzt = true;
                        setZaehlerWalkingBeamDrehGreifer(zaehlerWalkingBeamDrehGreifer +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("DrehGreiferWalkingBeam deselectet bei MeldungabsetztenSchlaufe");
                }

                if(bRadRat1WalkingBeam.isSelected()){
                    if((Login.getIstChef().equals("istChef")||Login.getIstChef().equals("keinChef")||Login.getIstChef().equals("Admin"))&& bRadRat1WalkingBeamAbgesetzt ==false){//istChef
                        dBA.schreibeDB(einfuegKeinUnterhaltDb+"'"+ getZaehlerWalkingBeamRadRat1() +"','Adf/WalkingBeam' , 'Rad-Rat.1')");
                        bRadRat1WalkingBeam.setStyle("-fx-background-color: red");
                        bRadRat1WalkingBeam.setDisable(true);
                        bRadRat1WalkingBeamAbgesetzt = true;
                        setZaehlerWalkingBeamRadRat1(zaehlerWalkingBeamRadRat1 +1);
                        setRotdb(true);
                        //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                    }
                    //lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
                }else{
                    System.out.println("RadRat1WalkingBeam deselectet bei MeldungabsetztenSchlaufe");
                }


            }
        });




//Stoerung Aufheben-----------------------------------------------------------------------------------------------------------------------
        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachStoerMeldungAufheben =
                {"Stör-Meldung Aufheben", "Annulla messaggio di errore","Otkažite poruku o grešci", "Anulo mesazhin e defektit", "Arıza mesajını iptal et"};
        Button bStoerMeldungAufheben = new Button(sprachStoerMeldungAufheben[Sprache.getSprachenZahl()]);//"Stör-Meldung Aufheben"
        if(Login.getIstUnterhalt().equals("keinU")){
            bStoerMeldungAufheben.setStyle("-fx-background-color: transparent");
            bStoerMeldungAufheben.setStyle("-fx-text-fill: transparent");
            bStoerMeldungAufheben.setDisable(true);
            bStoerMeldungAufheben.setVisible(false);
        }

        bStoerMeldungAufheben.setFont(fontAbsetzen);
        bStoerMeldungAufheben.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                if(bGurteBundlader.isSelected()){
                    System.out.println("Gurte selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Bundlader' AND Stoerung = 'Gurte';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bGurteBundlader.setStyle("-fx-background-color: green");
                        bGurteBundlader.setDisable(false);
                        setRotdb(false);
                        bGurteBundladerAbgesetzt = false;
                    }
                    else{
                        bGurteBundlader.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("Gurte deselectet in Störmeldung");
                }



                if(bLichtSchranke1Bundlader.isSelected()){
                    System.out.println("LichtSchranke1 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Bundlader' AND Stoerung = 'LichtSchranke1';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bLichtSchranke1Bundlader.setStyle("-fx-background-color: green");
                        bLichtSchranke1Bundlader.setDisable(false);
                        setRotdb(false);
                        bLichtSchranke1BundladerAbgesetzt = false;
                    }
                    else{
                        bLichtSchranke1Bundlader.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("LichtSchranke1 deselectet in Störmeldung");
                }


                if(bAnschlagBundlader.isSelected()){
                    System.out.println("AnschlagBundlader selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Bundlader' AND Stoerung = 'Anschlag';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bAnschlagBundlader.setStyle("-fx-background-color: green");
                        bAnschlagBundlader.setDisable(false);
                        setRotdb(false);
                        bAnschlagBundladerAbgesetzt = false;
                    }
                    else{
                        bAnschlagBundlader.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("AnschlagBundlader deselectet in Störmeldung");
                }



                if(bSchutzZaunBundlader.isSelected()){
                    System.out.println("SchutzZaunBundlader selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Bundlader' AND Stoerung = 'SchutzZaun';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bSchutzZaunBundlader.setStyle("-fx-background-color: green");
                        bSchutzZaunBundlader.setDisable(false);
                        setRotdb(false);
                        bSchutzZaunBundladerAbgesetzt = false;
                    }
                    else{
                        bSchutzZaunBundlader.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("SchutzZaunBundlader deselectet in Störmeldung");
                }


                if(bRollen_SchraegVereinzelung.isSelected()){
                    System.out.println("Rollen_SchraegVereinzelung selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Vereinzelung' AND Stoerung = 'Rollen Schräg';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bRollen_SchraegVereinzelung.setStyle("-fx-background-color: green");
                        bRollen_SchraegVereinzelung.setDisable(false);
                        setRotdb(false);
                        bRollen_SchraegVereinzelungAbgesetzt = false;
                    }
                    else{
                        bRollen_SchraegVereinzelung.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("bRollen_SchraegVereinzelung deselectet in Störmeldung");
                }

                if(bStopper_Bolzen1Vereinzelung.isSelected()){
                    System.out.println("Stopper_Bolzen1Vereinzelung selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Vereinzelung' AND Stoerung = 'Stopper-Bolzen1';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: green");
                        bStopper_Bolzen1Vereinzelung.setDisable(false);
                        setRotdb(false);
                        bStopper_Bolzen1VereinzelungAbgesetzt = false;
                    }
                    else{
                        bStopper_Bolzen1Vereinzelung.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("Stopper_Bolzen1Vereinzelung deselectet in Störmeldung");
                }

                if(bStopper_Bolzen123Vereinzelung.isSelected()){
                    System.out.println("Stopper_Bolzen123Vereinzelung selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Vereinzelung' AND Stoerung = 'Stopper-Bolzen123';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: green");
                        bStopper_Bolzen123Vereinzelung.setDisable(false);
                        setRotdb(false);
                        bStopper_Bolzen123VereinzelungAbgesetzt = false;
                    }
                    else{
                        bStopper_Bolzen123Vereinzelung.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("Stopper_Bolzen123Vereinzelung deselectet in Störmeldung");
                }

                if(bRollen1Rollgang1.isSelected()){
                    System.out.println("Rollen1Rollgang1 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Rollgang1' AND Stoerung = 'Rollen1';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bRollen1Rollgang1.setStyle("-fx-background-color: green");
                        bRollen1Rollgang1.setDisable(false);
                        setRotdb(false);
                        bRollen1Rollgang1Abgesetzt = false;
                    }
                    else{
                        bRollen1Rollgang1.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("Rollen1Rollgang1 deselectet in Störmeldung");
                }


                if(bSchweissNahtErkennungRollgang1.isSelected()){
                    System.out.println("SchweissNahtErkennungRollgang1 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Rollgang1' AND Stoerung = 'SchweissNaht-Erkennung';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: green");
                        bSchweissNahtErkennungRollgang1.setDisable(false);
                        setRotdb(false);
                        bSchweissNahtErkennungRollgang1Abgesetzt = false;
                    }
                    else{
                        bSchweissNahtErkennungRollgang1.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("SchweissNahtErkennungRollgang1 deselectet in Störmeldung");
                }

                if(bPinchRolle12Rollgang1.isSelected()){
                    System.out.println("PinchRolle12Rollgang1 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Rollgang1' AND Stoerung = 'PinchRolle 1 2';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bPinchRolle12Rollgang1.setStyle("-fx-background-color: green");
                        bPinchRolle12Rollgang1.setDisable(false);
                        setRotdb(false);
                        bPinchRolle12Rollgang1Abgesetzt = false;
                    }
                    else{
                        bPinchRolle12Rollgang1.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("PinchRolle12Rollgang1 deselectet in Störmeldung");
                }

                if(bUSSensorMessstation.isSelected()){
                    System.out.println("USSensorMessstation selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Messstation' AND Stoerung = 'US-Sensor';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bUSSensorMessstation.setStyle("-fx-background-color: green");
                        bUSSensorMessstation.setDisable(false);
                        setRotdb(false);
                        bUSSensorMessstationAbgesetzt = false;
                    }
                    else{
                        bUSSensorMessstation.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("USSensorMessstation deselectet in Störmeldung");
                }

                if(bLaserMessstation.isSelected()){
                    System.out.println("LaserMessstation selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Messstation' AND Stoerung = 'Laser';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bLaserMessstation.setStyle("-fx-background-color: green");
                        bLaserMessstation.setDisable(false);
                        setRotdb(false);
                        bLaserMessstationAbgesetzt = false;
                    }
                    else{
                        bLaserMessstation.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("LaserMessstation deselectet in Störmeldung");
                }

                if(bEinstellRollenMessstation.isSelected()){
                    System.out.println("EinstellRollenMessstation selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Messstation' AND Stoerung = 'Einstell-Rollen';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bEinstellRollenMessstation.setStyle("-fx-background-color: green");
                        bEinstellRollenMessstation.setDisable(false);
                        setRotdb(false);
                        bEinstellRollenMessstationAbgesetzt = false;
                    }
                    else{
                        bEinstellRollenMessstation.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("EinstellRollenMessstation deselectet in Störmeldung");
                }

                if(bLichtschrankenMSMessstation.isSelected()){
                    System.out.println("LichtschrankenMSMessstation selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Messstation' AND Stoerung = 'Lichtschranken MS';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bLichtschrankenMSMessstation.setStyle("-fx-background-color: green");
                        bLichtschrankenMSMessstation.setDisable(false);
                        setRotdb(false);
                        bLichtschrankenMSMessstationAbgesetzt = false;
                    }
                    else{
                        bLichtschrankenMSMessstation.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("LichtschrankenMSMessstation deselectet in Störmeldung");
                }

                if(bPumpeRueckFuehrEmulsionMessstation.isSelected()){
                    System.out.println("PumpeRueckFuehrEmulsionMessstation selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Messstation' AND Stoerung = 'Pumpe Emulsion';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: green");
                        bPumpeRueckFuehrEmulsionMessstation.setDisable(false);
                        setRotdb(false);
                        bPumpeRueckFuehrEmulsionMessstationAbgesetzt = false;
                    }
                    else{
                        bPumpeRueckFuehrEmulsionMessstation.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("PumpeRueckFuehrEmulsionMessstation deselectet in Störmeldung");
                }

                if(bSchutzTuereMessstation.isSelected()){
                    System.out.println("SchutzTuereMessstation selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Messstation' AND Stoerung = 'Schutz-Türe';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bSchutzTuereMessstation.setStyle("-fx-background-color: green");
                        bSchutzTuereMessstation.setDisable(false);
                        setRotdb(false);
                        bSchutzTuereMessstationAbgesetzt = false;
                    }
                    else{
                        bSchutzTuereMessstation.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("SchutzTuereMessstation deselectet in Störmeldung");
                }


                if(bPinchRolle3Rollgang4.isSelected()){
                    System.out.println("PinchRolle3Rollgang4 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Rollgang4' AND Stoerung = 'PinchRolle3';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bPinchRolle3Rollgang4.setStyle("-fx-background-color: green");
                        bPinchRolle3Rollgang4.setDisable(false);
                        setRotdb(false);
                        bPinchRolle3Rollgang4Abgesetzt = false;
                    }
                    else{
                        bPinchRolle3Rollgang4.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("PinchRolle3Rollgang4 deselectet in Störmeldung");
                }

                if(bRollen4Rollgang4.isSelected()){
                    System.out.println("Rollen4Rollgang4 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Rollgang4' AND Stoerung = 'Rollen4';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bRollen4Rollgang4.setStyle("-fx-background-color: green");
                        bRollen4Rollgang4.setDisable(false);
                        setRotdb(false);
                        bRollen4Rollgang4Abgesetzt = false;
                    }
                    else{
                        bRollen4Rollgang4.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("Rollen4Rollgang4 deselectet in Störmeldung");
                }

                if(bRohrAuswerferRollgang4.isSelected()){
                    System.out.println("RohrAuswerferRollgang4 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Rollgang4' AND Stoerung = 'Rohr-Auswerfer';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bRohrAuswerferRollgang4.setStyle("-fx-background-color: green");
                        bRohrAuswerferRollgang4.setDisable(false);
                        setRotdb(false);
                        bRohrAuswerferRollgang4Abgesetzt = false;
                    }
                    else{
                        bRohrAuswerferRollgang4.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("RohrAuswerferRollgang4 deselectet in Störmeldung");
                }

                if(bSchrottGurteRollgang4.isSelected()){
                    System.out.println("SchrottGurteRollgang4 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Rollgang4' AND Stoerung = 'Gurte-Schrott';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bSchrottGurteRollgang4.setStyle("-fx-background-color: green");
                        bSchrottGurteRollgang4.setDisable(false);
                        setRotdb(false);
                        bSchrottGurteRollgang4Abgesetzt = false;
                    }
                    else{
                        bSchrottGurteRollgang4.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("SchrottGurteRollgang4 deselectet in Störmeldung");
                }


                if(bLichtSchranke2Rollgang4.isSelected()){
                    System.out.println("LichtSchranke2Rollgang4 selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/Rollgang4' AND Stoerung = 'LichtSchranke2';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bLichtSchranke2Rollgang4.setStyle("-fx-background-color: green");
                        bLichtSchranke2Rollgang4.setDisable(false);
                        setRotdb(false);
                        bLichtSchranke2Rollgang4Abgesetzt = false;
                    }
                    else{
                        bLichtSchranke2Rollgang4.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("LichtSchranke2Rollgang4 deselectet in Störmeldung");
                }


                if(bWalkingBeamWalkingBeam.isSelected()){
                    System.out.println("WalkingBeamWalkingBeam selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/WalkingBeam' AND Stoerung = 'WalkingBeam';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bWalkingBeamWalkingBeam.setStyle("-fx-background-color: green");
                        bWalkingBeamWalkingBeam.setDisable(false);
                        setRotdb(false);
                        bWalkingBeamWalkingBeamAbgesetzt = false;
                    }
                    else{
                        bWalkingBeamWalkingBeam.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("WalkingBeamWalkingBeam deselectet in Störmeldung");
                }

                if(bDrehGreiferWalkingBeam.isSelected()){
                    System.out.println("DrehGreiferWalkingBeam selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/WalkingBeam' AND Stoerung = 'Dreh-Greifer';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bDrehGreiferWalkingBeam.setStyle("-fx-background-color: green");
                        bDrehGreiferWalkingBeam.setDisable(false);
                        setRotdb(false);
                        bDrehGreiferWalkingBeamAbgesetzt = false;
                    }
                    else{
                        bDrehGreiferWalkingBeam.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("DrehGreiferWalkingBeam deselectet in Störmeldung");
                }

                if(bRadRat1WalkingBeam.isSelected()){
                    System.out.println("RadRat1WalkingBeam selectet in Stoermeldung");
                    if(Login.getIstUnterhalt().equals("istU")||Login.getIstUnterhalt().equals("Admin")){
                        String einfuegIstUnterhaltDb = "UPDATE stoerungMubea SET " +
                                "VnameB = '"+ Login.getVorName() +"', NnameB ='"+ Login.getNachName() +"', "
                                + "DatumB = '" + TaskLeistePane.getDatumStr() + "', UhrzeitB = '"
                                + TaskLeistePane.getUhrzeitStr() + "', StOG = 'close' WHERE StOG = 'open' AND Anlage = '"+ Rattunde1.getNameAnlageRattunde1() +"' AND AnlageGruppe = 'ADF/WalkingBeam' AND Stoerung = 'Rad-Rat.1';";
                        dBA.schreibeDB(einfuegIstUnterhaltDb);
                        bRadRat1WalkingBeam.setStyle("-fx-background-color: green");
                        bRadRat1WalkingBeam.setDisable(false);
                        setRotdb(false);
                        bRadRat1WalkingBeamAbgesetzt = false;
                    }
                    else{
                        bRadRat1WalkingBeam.setStyle("-fx-background-color: red");
                        System.out.println("Ich arbeite nicht im Unterhalt!");
                    }
                }
                else{
                    System.out.println("RadRat1WalkingBeam deselectet in Störmeldung");
                }


            }
        });

//LayoutZeugs----------------------------------------------------------------------------------------------------------------------

        layoutHBundlader.getChildren().addAll(lBundlader,bGurteBundlader,bLichtSchranke1Bundlader,bAnschlagBundlader,bSchutzZaunBundlader);
        layoutHVereinzelung.getChildren().addAll(lVereinzelung,bRollen_SchraegVereinzelung,bStopper_Bolzen1Vereinzelung,bStopper_Bolzen123Vereinzelung);
        layoutHRollgang1.getChildren().addAll(lRollgang1,bRollen1Rollgang1,bSchweissNahtErkennungRollgang1,bPinchRolle12Rollgang1);
        layoutHMessstation.getChildren().addAll(lMessstation,bUSSensorMessstation,bLaserMessstation,bEinstellRollenMessstation,bLichtschrankenMSMessstation,bPumpeRueckFuehrEmulsionMessstation,bSchutzTuereMessstation);
        layoutHRollgang4.getChildren().addAll(lRollgang4,bPinchRolle3Rollgang4,bRollen4Rollgang4,bRohrAuswerferRollgang4,bSchrottGurteRollgang4,bLichtSchranke2Rollgang4);
        layoutHWalkingBeam.getChildren().addAll(lWalkingBeam,bWalkingBeamWalkingBeam,bDrehGreiferWalkingBeam,bRadRat1WalkingBeam);
        HBox layoutHAbsetzenAufhebenZurueckR1A = new HBox(60);
        layoutHAbsetzenAufhebenZurueckR1A.getChildren().addAll(bStoerMeldungAbsetzen,bStoerMeldungAufheben,bZurueckRat1);
        layoutV.getChildren().addAll(lTitleAddafer,layoutHBundlader,layoutHVereinzelung,layoutHRollgang1,layoutHMessstation,layoutHRollgang4,layoutHWalkingBeam,layoutHAbsetzenAufhebenZurueckR1A);
        cardAddafer.getChildren().addAll(layoutV);

//        cardAddafer.minHeight(500);
//        cardAddafer.minWidth(400);
        return cardAddafer;
    }


}





//Sicherheit------------------------------------------------------------------------------------------------------------
////                    String einfuegDbGurte = "INSERT INTO stoerungMubea" +
////                            "(Abteilung, Anlage, AnlageGruppe, Stoerung, "
////                            + "ZaehlerDerStoerung, VornameGemeldet, "
////                            + "NachnameGemeldet, DatumGemeldet, "
////                            + "UhrzeitGemeldet)" +
////                            "VALUES  ('Anarbeit', 'Rattunde1', 'Addafer' , 'Gurte', "
////                            + "'"+ getZaehlerBundladerGurte() +"', '" + Login.vorName+"',"
////                            + "'" + Login.nachName+"', '" + TaskLeistePane.getDatumStr()
////                            + "', '" + TaskLeistePane.getUhrzeitStr()+ "')";
//
////                    String einfuegDbGurte = "INSERT INTO stoerungMubea" +
////                            "(Abteilung, Anlage, AnlageGruppe, Stoerung, "
////                            + "ZSt, VnameG, "
////                            + "NnameG, DatumG, "
////                            + "UhrzeitG)" +
////                            "VALUES  ('"+ Anarbeit.getNameAbteilungAnarbeit() +"', '"+Rattunde1.getNameAnlageRattunde1()+"', 'Adf/Bundlader' , 'Gurte', "
////                            + "'"+ getZaehlerBundladerGurte() +"', '" + Login.vorName+"',"
////                            + "'" + Login.nachName+"', '" + TaskLeistePane.getDatumStr()
////                            + "', '" + TaskLeistePane.getUhrzeitStr()+ "')";
////
////                    //dbk1.schreibeDB(url1,user1,password1, einfuegString1);      //Immer wenn Play, kommt natürlich wieder eine dazu
////                    dBA.schreibeDB(einfuegDbGurte);
//
//    String einfuegKeinChefDb = "INSERT INTO stoerungMubea" +
//            "(Abteilung, Anlage,  "
//            + "ZSt, VnameG, "
//            + "NnameG, DatumG, "
//            + "UhrzeitG ,AnlageGruppe, Stoerung)" +
//            "VALUES  ('"+ Anarbeit.getNameAbteilungAnarbeit() +"', '"+Rattunde1.getNameAnlageRattunde1()+"', "
//            + "'"+ getZaehlerBundladerGurte() +"', '" + Login.vorName+"',"
//            + "'" + Login.nachName+"', '" + TaskLeistePane.getDatumStr()
//            + "', '" + TaskLeistePane.getUhrzeitStr()+ "',";
//
////dbk1.schreibeDB(url1,user1,password1, einfuegString1);      //Immer wenn Play, kommt natürlich wieder eine dazu
//                    dBA.schreibeDB(einfuegKeinChefDb+"'Adf/Bundlader' , 'Gurte')");
////TOoDO dBA.schreibeDB(einfuegDbGurte + "'Adf/Bundlader' , 'Gurte',");Ziel





//**********************************************************************************************************************
//public class Addafer {
//    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben
//
//    boolean istStoerMeldungButtonGedruecktWorden = false;//irgendwie wurde der halt so, weil in Button
//
//    static Boolean rotdb = false;
//
//    public static Boolean getRotdb() {
//        return rotdb;
//    }
//
//    public static void setRotdb(Boolean rotdb) {
//        Addafer.rotdb = rotdb;
//    }
//
//    public Addafer(Pane cardsPane){
//        this.cardsPane=cardsPane;
//    }
//
//    public Group macheAddafer(){
//        final Group cardAddafer = new Group(new Text(25, 25, "Addafer blabvlabla"));
//
//        VBox layoutV = new VBox(20);
//        HBox layoutHBundlader = new HBox(20);
//
//
//
//        Label lBundlader = new Label("Bundlader");
//
//        //Todo, booleanWert von DB kommt, dann button rot oder grün
//        //Todo wenn grün, bei klick gelb, bei absetzen rot, und nicht mehr veränderbar
//
//
//
//
//
//
//
//
//
//
//
//
//        Label lZeigeGurteWerUHRDatumA = new Label();
//
//
//        //   0          1            2                  3             4
//        //Deutsch, Italienisch,SerboKroatisch,albanischmazedonisch,Türkisch
//        String[] sprachGurte =
//                {"Gurte", "cinghie","траке", "rripat", "kayışlar"};
//
//        ToggleButton bGurte = new ToggleButton(sprachGurte[Sprache.getSprachenZahl()]);//"Gurte"
//        //Button bGurte = new Button("Gurte");
//        if(rotdb==false) {
//            bGurte.setStyle("-fx-background-color: green");//blue
//        }else{
//            bGurte.setStyle("-fx-background-color: pink");//pink
//        }
//        //bGurte.setStyle("-fx-background-color: #ff0000; ");
//        bGurte.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                //ToDo ev normaler button und heraus finden, ob es isSelected gibt
//                if(rotdb==false){//grün
//                    System.out.println("bin erster");
//                    if(bGurte.isSelected()){
//                        System.out.println("ist selectet erste");
//                        if(rotdb==true){
//                            bGurte.setStyle("-fx-background-color: orange");
//                        }else {
//                            bGurte.setStyle("-fx-background-color: yellow");
//                            lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());
//                        }
//                    }else{
//                        System.out.println("werde wieder grün");
//                        bGurte.setStyle("-fx-background-color: green");
//                    }
//                }else{
//                    System.out.println("bin in zweite");
//                    bGurte.setStyle("-fx-background-color: red");
//                    if(bGurte.isSelected()){
//                        System.out.println("ist selected zweite");
//                        bGurte.setStyle("-fx-background-color: darkred");
//                    }else{
//                        System.out.println("muss irgend was sein");
//                        bGurte.setStyle("-fx-background-color: darkorange");
//                    }
//                }
//
//
//                // if(istStoerMeldungButtonGedruecktWorden=false){
//                //  bGurte.setStyle("-fx-background-color: yellow");
//                // }else{
////                    bGurte.setStyle("-fx-background-color: red");
////                }
//
////                if(bGurte.isSelected() && rotdb==false) {
////                    System.out.println("is selected");
////                    bGurte.setStyle("-fx-background-color: yellow");
////                }
////                if(bGurte.isSelected() && rotdb==true) {
////                    System.out.println("is selected");
////                    bGurte.setStyle("-fx-background-color: white");
////                }
//
////                else {
////                    System.out.println("is deselected");
////                    bGurte.setStyle("-fx-background-color: green");
////                }
////                if(bGurte.isSelected() && rotdb==true) {
////                    System.out.println("is selected");
////                    bGurte.setStyle("-fx-background-color: white");
////                }
//
//
////                else  if(bGurte.isDisabled()&&rotdb==false){
////                    System.out.println("is deselected");
////                    bGurte.setStyle("-fx-background-color: orange");
////                }
//                //bGurte.setStyle("-fx-background-color: orange");
////                else{
////                    bGurte.setStyle("-fx-background-color: orange");
////                }
////                else  if(bGurte.isDisabled()&&rotdb==true){
////                    System.out.println("is deselected");
////                    bGurte.setStyle("-fx-background-color: orange");
////                }
//
////                if(bGurte.isSelected() && rotdb==false) {
////                    System.out.println("is selected");
////                    bGurte.setStyle("-fx-background-color: yellow");
////                }
////                else if(bGurte.isDisabled() && rotdb==false) {
////                    System.out.println("is deselected");
////                    bGurte.setStyle("-fx-background-color: green");
////                }
//
////            }else if(bGurte.isSelected() && rotdb==true) {
////                System.out.println("is deselected");
////                bGurte.setStyle("-fx-background-color: red");
////            }
////                else if(bGurte.isSelected() && rotdb==true){
////                    System.out.println("is deselected");
////                    bGurte.setStyle("-fx-background-color: red");
////                }else if(bGurte.isDisabled() && rotdb==false){
////                    System.out.println("is deselected");
////                bGurte.setStyle("-fx-background-color: darkred");
////                }
//
////                if(rotdb==false) {
////                    bGurte.setStyle("-fx-background-color: yellow");
////                }else{
////                    bGurte.setStyle("-fx-background-color: darkred");
////                }
//            }
//        });
//
//
//        Button bHalteZeitAn = new Button("Zeit anhalten");
//        Label lZeigeZeitHaltA = new Label();
//
//        bHalteZeitAn.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                lZeigeZeitHaltA.setText(TaskLeistePane.getDatumStr() + "\n"+TaskLeistePane.getUhrzeitStr());
//            }
//        });
//
//
//
//
//        Button bLichtSchranke1 = new Button("Lichtschranke 1");
//        bLichtSchranke1.setStyle("-fx-background-color: green");
//
//        Button bAnschlag = new Button("Anschlag");
//        bAnschlag.setStyle("-fx-background-color: green");
//
//        Button bSchutzZaun = new Button("Schutz- Zaun");
//        bSchutzZaun.setStyle("-fx-background-color: green");
//
//
////Vereinzelung----------------------------------------------------------------------------------------------------------
//        HBox layoutHVereinzelung = new HBox(20);
//        Label lVereinzelung = new Label("Vereinzelung");
//        Button bRollenSchraeg = new Button("Rollen schräg");
//        Button bStopperBolzen1 = new Button("Stopper-Bolzen 1");
//        Button bStopperBolzen123 = new Button("Stopper- Bolzen 123");
//
//        bRollenSchraeg.setStyle("-fx-background-color: green");
//        bStopperBolzen1.setStyle("-fx-background-color: green");
//        bStopperBolzen123.setStyle("-fx-background-color: green");
//
//
//
//        HBox layoutHRollgang1 = new HBox(20);
//        Label lRollgang1 = new Label("Rollgang 1");
//        Button bRollen1 = new Button("Rollen 1");
//        Button bSchweissNahtErkennung = new Button("Schweissnaht-\n Erkennung");
//        Button bPinchRolle12 = new Button("Pinch-Rollen 1 2");
//
//        bRollen1.setStyle("-fx-background-color: green");
//        bSchweissNahtErkennung.setStyle("-fx-background-color: green");
//        bPinchRolle12.setStyle("-fx-background-color: green");
////Messstation----------------------------------------------------------------------------------------------------------------------
//
//        HBox layoutHMessstation = new HBox(20);
//        Label lMessstation = new Label("Messstation");
//        lMessstation.setFont(Font.font("Arial", 18));
//        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
//        Button bUSSensor = new Button("US-Sensor");
//        Button bLaser = new Button("Laserg");
//        Button bEinstellRollen = new Button("Einstell- Rollen");
//        Button bLichtSchrankeM = new Button("Lichtschranke MS");
//        Button bPumpeRueckFuehr = new Button("Pumpe Emulsion");
//        Button bSchutzTuereM = new Button("Schutz-Türe");
//
//        bUSSensor.setStyle("-fx-background-color: green");
//        bLaser.setStyle("-fx-background-color: green");
//        bEinstellRollen.setStyle("-fx-background-color: green");
//        bLichtSchrankeM.setStyle("-fx-background-color: green");
//        bPumpeRueckFuehr.setStyle("-fx-background-color: green");
//        bSchutzTuereM.setStyle("-fx-background-color: green");
//
////Rollgang4----------------------------------------------------------------------------------------------------------------------
//        HBox layoutHRollgang4 = new HBox(20);
//        Label lRollgang4 = new Label("Rollgang 4");
//        lRollgang4.setFont(Font.font("Arial", 18));
//        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
//        Button bPinchRolle3 = new Button("Pinch-Rolle 3");
//        Button bRollen4 = new Button("Rollen 4");
//        Button bRohrAuswerfer = new Button("Rohr- Auswerfer");
//        Button bSchrottGurte = new Button("Gurte Schrott");
//        Button bLichtSchranke2 = new Button("Lichtschranke 2");
//
//        bPinchRolle3.setStyle("-fx-background-color: green");
//        bRollen4.setStyle("-fx-background-color: green");
//        bRohrAuswerfer.setStyle("-fx-background-color: green");
//        bSchrottGurte.setStyle("-fx-background-color: green");
//        bLichtSchranke2.setStyle("-fx-background-color: green");
//
////WalkingBeam----------------------------------------------------------------------------------------------------------------------
//        HBox layoutHWalkingBeam = new HBox(20);
//        Label lWalkingBeam = new Label("WalkingBeam");
//        lWalkingBeam.setFont(Font.font("Arial", 18));
//        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
//        Button bWalkingBeam = new Button("WalkingBeam");
//        Button bDrehGreifer = new Button("Dreh-Greifer");
//        Button bRadRat1 = new Button("Rad-Rat1");
//
//
//        bWalkingBeam.setStyle("-fx-background-color: green");
//        bDrehGreifer.setStyle("-fx-background-color: green");
//        bRadRat1.setStyle("-fx-background-color: green");
//
////ButtonZurückRat1----------------------------------------------------------------------------------------------------------------------
//        Button bZurueckRat1 = new Button("Zurück");
//        bZurueckRat1.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                cardsPane.getChildren().clear();
//                cardsPane.getChildren().add(new Rattunde1(cardsPane).macheRattunde1());
//            }
//        });
////ButtonStörMeldungAbsetzen----------------------------------------------------------------------------------------------------------------------
//
//        Button bStoerMeldungAbsetzen = new Button("Stör-Meldung absetzen");
//        bStoerMeldungAbsetzen.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
//        bStoerMeldungAbsetzen.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                //istStoerMeldungButtonGedruecktWorden =true;
//                //this.
//                //ToDo
//                //hier kommt eine ifschleife rein, damit button sofern gelb geklickt, rot wird,
//                //darf sich nicht mehr verändern, muss wie gesperrt sein
//                setRotdb(true);//=true;
//                //bGurte.setStyle("-fx-background-color: red");//darkred
//                //bGurte.setDefaultButton(true);//ist es das vielleicht????????
//            }
//        });
//
//
//
//
//        Button bStoerMeldungAufheben = new Button("Stör-Meldung Aufheben");
//        bStoerMeldungAufheben.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
//        bStoerMeldungAufheben.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                //istStoerMeldungButtonGedruecktWorden =true;
//                //this.
//                //ToDo
//                //hier kommt eine ifschleife rein, damit button sofern gelb geklickt, rot wird,
//                //darf sich nicht mehr verändern, muss wie gesperrt sein
//                //setRotdb(false);//=true;
//                //bGurte.setStyle("-fx-background-color: red");//darkred
//                //bGurte.setDefaultButton(true);//ist es das vielleicht????????
//
//            }
//        });
//        ToggleButton bDB = new ToggleButton("Bin die DB \n Gurte setzen \nicht setzen");
//        //Button bDB = new Button("Bin die DB \n Gurte setzen \nicht setzen");
//        bDB.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
//        bDB.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent t) {
//                if(bDB.isSelected()){
//                    bDB.setStyle("-fx-background-color: red");
//                    setRotdb(true);
//                    System.out.println("bDB is selected");
//                    //Todo du kannst schon eigene seite sich selber laden, aber bei einem toggel lädt dan nur die eine seite
//                    //todo besser zum dies testen, den toggelbutton nicht in das pane stecken, sondern ev. in die taskleiste
//                    //todo, wenn toggle nicht im gleichen pane, ev probleme weil dan db nicht weiss, von welcher anlage geschriebven wird
////                    cardsPane.getChildren().clear();
////                    cardsPane.getChildren().add(new Addafer(cardsPane).macheAddafer());//sich selber neu laden
//                }else{
//                    bDB.setStyle("-fx-background-color: green");
//                    setRotdb(false);
//                    System.out.println("bDB is deselected");
//                    cardsPane.getChildren().clear();
//                    cardsPane.getChildren().add(new Addafer(cardsPane).macheAddafer());//sich selber neu laden
//                }
//                //bGurte.setStyle("-fx-background-color: red");//darkred
//                //bGurte.setDefaultButton(true);//ist es das vielleicht????????
//            }
//        });
////LayoutZeugs----------------------------------------------------------------------------------------------------------------------
//        layoutHBundlader.getChildren().addAll(lBundlader,bGurte,lZeigeGurteWerUHRDatumA,bDB,bHalteZeitAn,lZeigeZeitHaltA,bLichtSchranke1,bAnschlag,bSchutzZaun);
//        layoutHVereinzelung.getChildren().addAll(lVereinzelung,bRollenSchraeg,bStopperBolzen1,bStopperBolzen123);
//        layoutHRollgang1.getChildren().addAll(lRollgang1,bRollen1,bSchweissNahtErkennung,bPinchRolle12);
//        layoutHMessstation.getChildren().addAll(lMessstation,bUSSensor,bLaser,bEinstellRollen,bLichtSchrankeM,bPumpeRueckFuehr,bSchutzTuereM);
//        layoutHRollgang4.getChildren().addAll(lRollgang4,bPinchRolle3,bRollen4,bRohrAuswerfer,bSchrottGurte,bLichtSchranke2);
//        layoutHWalkingBeam.getChildren().addAll(lWalkingBeam,bWalkingBeam,bDrehGreifer,bRadRat1);
//        layoutV.getChildren().addAll(layoutHBundlader,layoutHVereinzelung,layoutHRollgang1,layoutHMessstation,layoutHRollgang4,layoutHWalkingBeam,bZurueckRat1,bStoerMeldungAbsetzen,bStoerMeldungAufheben);
//        cardAddafer.getChildren().addAll(layoutV);
//        //ToDo ev ein retour button
//        return cardAddafer;
//    }
//
//    public void setIstStoerMeldungButtonGedruecktWorden(Boolean istStoerMeldungButtonGedruecktWorden){
//        this.istStoerMeldungButtonGedruecktWorden=istStoerMeldungButtonGedruecktWorden;
//    }
//
//}
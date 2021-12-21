package Abteilungen.AnlagenAnarbeit.Rattunde1;

import Abteilungen.Anarbeit;
import DatenBank.DatenBank;
import GUI.Login;
import GUI.Sprache;
import GUI.TaskLeistePane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 13.12.2021, 21:11
 */
public class Addafer {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    int zaehlerBundladerGurte = 0;
    String einfuegKeinChefDb = "INSERT INTO stoerungMubea" +
            "(Abteilung, Anlage,  "
            + "VnameG, "
            + "NnameG, DatumG, "
            + "UhrzeitG ,ZSt, AnlageGruppe, Stoerung)" +
            "VALUES  ('"+ Anarbeit.getNameAbteilungAnarbeit() +"', '"+Rattunde1.getNameAnlageRattunde1()+"', "
            + "'" + Login.vorName+"',"
            + "'" + Login.nachName+"', '" + TaskLeistePane.getDatumStr()
            + "', '" + TaskLeistePane.getUhrzeitStr()+ "',";

    public int getZaehlerBundladerGurte() {
        return zaehlerBundladerGurte;
    }

    public void setZaehlerBundladerGurte(int zaehlerBundladerGurte) {
        this.zaehlerBundladerGurte = zaehlerBundladerGurte;
    }


    DatenBank dBA = new DatenBank();

    boolean istStoerMeldungButtonGedruecktWorden = false;//irgendwie wurde der halt so, weil in Button

    static Boolean rotdb = false;

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
        final Group cardAddafer = new Group(new Text(25, 25, "Addafer blabvlabla"));

        VBox layoutV = new VBox(20);
        HBox layoutHBundlader = new HBox(20);


        String[] arrStrButton = new String[100];




        Label lBundlader = new Label("Bundlader"+ Sprache.getSprachenZahl());

        //Todo, booleanWert von DB kommt, dann button rot oder grün
        //Todo wenn grün, bei klick gelb, bei absetzen rot, und nicht mehr veränderbar




        //   0          1            2                  3             4
        //Deutsch, Italienisch,SerboKroatisch,albanischmazedonisch,Türkisch
        String[] sprachGurte =
                {"Gurte", "cinghie","траке", "rripat", "kayışlar"};

        System.out.println("in Addafer getsprachenZahl" + Sprache.getSprachenZahl());

        Label lZeigeGurteWerUHRDatumA = new Label();

        ToggleButton bGurte = new ToggleButton(sprachGurte[Sprache.getSprachenZahl()]);//"Gurte"
        //Button bGurte = new Button("Gurte");
        if(rotdb==false) {
            bGurte.setStyle("-fx-background-color: green");//blue
        }else{
            bGurte.setStyle("-fx-background-color: pink");//pink
        }
        //bGurte.setStyle("-fx-background-color: #ff0000; ");
        bGurte.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                //ToDo ev normaler button und heraus finden, ob es isSelected gibt


                lZeigeGurteWerUHRDatumA.setText(Login.vorName + " / "+Login.nachName + "\n" + TaskLeistePane.getDatumStr()+" / "+TaskLeistePane.getUhrzeitStr());


                if(rotdb==false){//grün
                    System.out.println("bin erster");
                    if(bGurte.isSelected()){
                        System.out.println("ist selectet erste");
                        if(rotdb==true){
                            bGurte.setStyle("-fx-background-color: orange");
                            arrStrButton[0] = "";
                        }else {
                            bGurte.setStyle("-fx-background-color: yellow");
                            System.out.println("in Addafer getsprachenZahl" + Sprache.getSprachenZahl());
                            arrStrButton[0] = "Gurte";
                        }
                    }else{
                        System.out.println("werde wieder grün");
                        bGurte.setStyle("-fx-background-color: green");
                    }
                }else{
                    System.out.println("bin in zweite");
                    bGurte.setStyle("-fx-background-color: red");
                    if(bGurte.isSelected()){
                        System.out.println("ist selected zweite");
                        bGurte.setStyle("-fx-background-color: darkred");
                    }else{
                        System.out.println("muss irgend was sein");
                        bGurte.setStyle("-fx-background-color: darkorange");
                    }
                }


                // if(istStoerMeldungButtonGedruecktWorden=false){
                //  bGurte.setStyle("-fx-background-color: yellow");
                // }else{
//                    bGurte.setStyle("-fx-background-color: red");
//                }

//                if(bGurte.isSelected() && rotdb==false) {
//                    System.out.println("is selected");
//                    bGurte.setStyle("-fx-background-color: yellow");
//                }
//                if(bGurte.isSelected() && rotdb==true) {
//                    System.out.println("is selected");
//                    bGurte.setStyle("-fx-background-color: white");
//                }

//                else {
//                    System.out.println("is deselected");
//                    bGurte.setStyle("-fx-background-color: green");
//                }
//                if(bGurte.isSelected() && rotdb==true) {
//                    System.out.println("is selected");
//                    bGurte.setStyle("-fx-background-color: white");
//                }


//                else  if(bGurte.isDisabled()&&rotdb==false){
//                    System.out.println("is deselected");
//                    bGurte.setStyle("-fx-background-color: orange");
//                }
                //bGurte.setStyle("-fx-background-color: orange");
//                else{
//                    bGurte.setStyle("-fx-background-color: orange");
//                }
//                else  if(bGurte.isDisabled()&&rotdb==true){
//                    System.out.println("is deselected");
//                    bGurte.setStyle("-fx-background-color: orange");
//                }

//                if(bGurte.isSelected() && rotdb==false) {
//                    System.out.println("is selected");
//                    bGurte.setStyle("-fx-background-color: yellow");
//                }
//                else if(bGurte.isDisabled() && rotdb==false) {
//                    System.out.println("is deselected");
//                    bGurte.setStyle("-fx-background-color: green");
//                }

//            }else if(bGurte.isSelected() && rotdb==true) {
//                System.out.println("is deselected");
//                bGurte.setStyle("-fx-background-color: red");
//            }
//                else if(bGurte.isSelected() && rotdb==true){
//                    System.out.println("is deselected");
//                    bGurte.setStyle("-fx-background-color: red");
//                }else if(bGurte.isDisabled() && rotdb==false){
//                    System.out.println("is deselected");
//                bGurte.setStyle("-fx-background-color: darkred");
//                }

//                if(rotdb==false) {
//                    bGurte.setStyle("-fx-background-color: yellow");
//                }else{
//                    bGurte.setStyle("-fx-background-color: darkred");
//                }
            }
        });




        Button bHalteZeitAn = new Button("Zeit anhalten");
        Label lZeigeZeitHaltA = new Label();

        bHalteZeitAn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                lZeigeZeitHaltA.setText(TaskLeistePane.getDatumStr() + "\n"+TaskLeistePane.getUhrzeitStr());
            }
        });


        Button bLichtSchranke1 = new Button("Lichtschranke 1");
        bLichtSchranke1.setStyle("-fx-background-color: green");

        Button bAnschlag = new Button("Anschlag");
        bAnschlag.setStyle("-fx-background-color: green");

        Button bSchutzZaun = new Button("Schutz- Zaun");
        bSchutzZaun.setStyle("-fx-background-color: green");


//Vereinzelung----------------------------------------------------------------------------------------------------------
        HBox layoutHVereinzelung = new HBox(20);
        Label lVereinzelung = new Label("Vereinzelung");
        Button bRollenSchraeg = new Button("Rollen schräg");
        Button bStopperBolzen1 = new Button("Stopper-Bolzen 1");
        Button bStopperBolzen123 = new Button("Stopper- Bolzen 123");

        bRollenSchraeg.setStyle("-fx-background-color: green");
        bStopperBolzen1.setStyle("-fx-background-color: green");
        bStopperBolzen123.setStyle("-fx-background-color: green");



        HBox layoutHRollgang1 = new HBox(20);
        Label lRollgang1 = new Label("Rollgang 1");
        Button bRollen1 = new Button("Rollen 1");
        Button bSchweissNahtErkennung = new Button("Schweissnaht-\n Erkennung");
        Button bPinchRolle12 = new Button("Pinch-Rollen 1 2");

        bRollen1.setStyle("-fx-background-color: green");
        bSchweissNahtErkennung.setStyle("-fx-background-color: green");
        bPinchRolle12.setStyle("-fx-background-color: green");
//Messstation----------------------------------------------------------------------------------------------------------------------

        HBox layoutHMessstation = new HBox(20);
        Label lMessstation = new Label("Messstation");
        lMessstation.setFont(Font.font("Arial", 18));
        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
        Button bUSSensor = new Button("US-Sensor");
        Button bLaser = new Button("Laserg");
        Button bEinstellRollen = new Button("Einstell- Rollen");
        Button bLichtSchrankeM = new Button("Lichtschranke MS");
        Button bPumpeRueckFuehr = new Button("Pumpe Emulsion");
        Button bSchutzTuereM = new Button("Schutz-Türe");

        bUSSensor.setStyle("-fx-background-color: green");
        bLaser.setStyle("-fx-background-color: green");
        bEinstellRollen.setStyle("-fx-background-color: green");
        bLichtSchrankeM.setStyle("-fx-background-color: green");
        bPumpeRueckFuehr.setStyle("-fx-background-color: green");
        bSchutzTuereM.setStyle("-fx-background-color: green");

//Rollgang4----------------------------------------------------------------------------------------------------------------------
        HBox layoutHRollgang4 = new HBox(20);
        Label lRollgang4 = new Label("Rollgang 4");
        lRollgang4.setFont(Font.font("Arial", 18));
        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
        Button bPinchRolle3 = new Button("Pinch-Rolle 3");
        Button bRollen4 = new Button("Rollen 4");
        Button bRohrAuswerfer = new Button("Rohr- Auswerfer");
        Button bSchrottGurte = new Button("Gurte Schrott");
        Button bLichtSchranke2 = new Button("Lichtschranke 2");

        bPinchRolle3.setStyle("-fx-background-color: green");
        bRollen4.setStyle("-fx-background-color: green");
        bRohrAuswerfer.setStyle("-fx-background-color: green");
        bSchrottGurte.setStyle("-fx-background-color: green");
        bLichtSchranke2.setStyle("-fx-background-color: green");

//WalkingBeam----------------------------------------------------------------------------------------------------------------------
        HBox layoutHWalkingBeam = new HBox(20);
        Label lWalkingBeam = new Label("WalkingBeam");
        lWalkingBeam.setFont(Font.font("Arial", 18));
        //lMessstation.setAlignment(Pos.BASELINE_CENTER);// hmmmmmm ...
        Button bWalkingBeam = new Button("WalkingBeam");
        Button bDrehGreifer = new Button("Dreh-Greifer");
        Button bRadRat1 = new Button("Rad-Rat1");


        bWalkingBeam.setStyle("-fx-background-color: green");
        bDrehGreifer.setStyle("-fx-background-color: green");
        bRadRat1.setStyle("-fx-background-color: green");

//ButtonZurückRat1----------------------------------------------------------------------------------------------------------------------
        Button bZurueckRat1 = new Button("Zurück");
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




        Label lZeigeStoerMeldung = new Label();

        Button bStoerMeldungAbsetzen = new Button("Stör-Meldung absetzen");
        bStoerMeldungAbsetzen.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        bStoerMeldungAbsetzen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bGurte.isSelected()){
                    lZeigeStoerMeldung.setText("Gurte sind aktiviert");
                    System.out.println("Zähler vor set: "+getZaehlerBundladerGurte());
                    setZaehlerBundladerGurte(getZaehlerBundladerGurte() +1);
                    System.out.println("Zähler nach set: "+getZaehlerBundladerGurte());
                    if(Login.getIstChef().equals("keinChef")){//ACHTUNG - WENN IstCHEF, dann schreibt er nicht, sollte vielleicht aber
                        System.out.println("Zähler in schreibe: "+getZaehlerBundladerGurte());
                        dBA.schreibeDB(einfuegKeinChefDb+"'"+ getZaehlerBundladerGurte() +"','Adf/Bundlader' , 'Gurte')");
                    }else{//istChef
                        dBA.schreibeDB(einfuegKeinChefDb+"'"+ getZaehlerBundladerGurte() +"','Adf/Bundlader' , 'Gurte')");
                        System.out.println("Hello Kitty das CHEFE");
                    }


                }else{
                    System.out.println("Gurte sind deselectet bei MeldungabsetztenSchlaufe");
                }
                //istStoerMeldungButtonGedruecktWorden =true;
                //this.
                //ToDo
                //hier kommt eine ifschleife rein, damit button sofern gelb geklickt, rot wird,
                //darf sich nicht mehr verändern, muss wie gesperrt sein
                setRotdb(true);//=true;
                //bGurte.setStyle("-fx-background-color: red");//darkred
                //bGurte.setDefaultButton(true);//ist es das vielleicht????????
            }
        });




        Button bStoerMeldungAufheben = new Button("Stör-Meldung Aufheben");
        bStoerMeldungAufheben.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        bStoerMeldungAufheben.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                //istStoerMeldungButtonGedruecktWorden =true;
                //this.
                System.out.println("getZähler ind Aufheben "+getZaehlerBundladerGurte());
                //ToDo
                //hier kommt eine ifschleife rein, damit button sofern gelb geklickt, rot wird,
                //darf sich nicht mehr verändern, muss wie gesperrt sein
                //setRotdb(false);//=true;
                //bGurte.setStyle("-fx-background-color: red");//darkred
                //bGurte.setDefaultButton(true);//ist es das vielleicht????????

            }
        });
        ToggleButton bDB = new ToggleButton("Bin die DB \n Gurte setzen \nicht setzen");
        //Button bDB = new Button("Bin die DB \n Gurte setzen \nicht setzen");
        bDB.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));


//        if(getRotdb() == true){
//            bDB.setStyle("-fx-background-color: red");
//        }else{
//            bDB.setStyle("-fx-background-color: green");
//        }
//

        bDB.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(bDB.isSelected()){
                    bDB.setStyle("-fx-background-color: red");
                    setRotdb(true);
                    System.out.println("bDB is selected");

                    //Todo du kannst schon eigene seite sich selber laden, aber bei einem toggel lädt dan nur die eine seite
                    //todo besser zum dies testen, den toggelbutton nicht in das pane stecken, sondern ev. in die taskleiste
                    //todo, wenn toggle nicht im gleichen pane, ev probleme weil dan db nicht weiss, von welcher anlage geschriebven wird
//                    cardsPane.getChildren().clear();
//                    cardsPane.getChildren().add(new Addafer(cardsPane).macheAddafer());//sich selber neu laden
                }else{
                    bDB.setStyle("-fx-background-color: green");
                    setRotdb(false);
                    System.out.println("bDB is deselected");
                    cardsPane.getChildren().clear();
                    cardsPane.getChildren().add(new Addafer(cardsPane).macheAddafer());//sich selber neu laden
                }
                //bGurte.setStyle("-fx-background-color: red");//darkred
                //bGurte.setDefaultButton(true);//ist es das vielleicht????????
            }
        });
//LayoutZeugs----------------------------------------------------------------------------------------------------------------------
        layoutHBundlader.getChildren().addAll(lBundlader,bGurte,lZeigeGurteWerUHRDatumA,bDB, bHalteZeitAn, lZeigeZeitHaltA,bLichtSchranke1,bAnschlag,bSchutzZaun);
        layoutHVereinzelung.getChildren().addAll(lVereinzelung,bRollenSchraeg,bStopperBolzen1,bStopperBolzen123);
        layoutHRollgang1.getChildren().addAll(lRollgang1,bRollen1,bSchweissNahtErkennung,bPinchRolle12);
        layoutHMessstation.getChildren().addAll(lMessstation,bUSSensor,bLaser,bEinstellRollen,bLichtSchrankeM,bPumpeRueckFuehr,bSchutzTuereM);
        layoutHRollgang4.getChildren().addAll(lRollgang4,bPinchRolle3,bRollen4,bRohrAuswerfer,bSchrottGurte,bLichtSchranke2);
        layoutHWalkingBeam.getChildren().addAll(lWalkingBeam,bWalkingBeam,bDrehGreifer,bRadRat1);
        layoutV.getChildren().addAll(layoutHBundlader,layoutHVereinzelung,layoutHRollgang1,layoutHMessstation,layoutHRollgang4,layoutHWalkingBeam,bZurueckRat1,bStoerMeldungAbsetzen,bStoerMeldungAufheben);
        cardAddafer.getChildren().addAll(layoutV);
        //ToDo ev ein retour button
        return cardAddafer;
    }

    public void setIstStoerMeldungButtonGedruecktWorden(Boolean istStoerMeldungButtonGedruecktWorden){
        this.istStoerMeldungButtonGedruecktWorden=istStoerMeldungButtonGedruecktWorden;
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
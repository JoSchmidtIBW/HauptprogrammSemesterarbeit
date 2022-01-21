package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author - John Schmidt
 * 28.12.2021, 22:41
 */
public class Sprache {

    //private static String[] sprachen = {"Deutsch", "English", "France","Turky","Chinesisch"};
   //String[] sprachen = {"Deutsch", "English", "France","Turky","Chinesisch"};
    //Deutsch
    //serbisch
    //bosnisch
    //Albanisch
    //Türkisch

    //Deutsch
    //Albanisch
    //bosnisch
  //italienisch
    //kroatisch
   // mazedonisch
    //serbisch
    //Türkisch

    private static int sprachenZahl;

    public static int getSprachenZahl() {
        return sprachenZahl;
    }

    private static void setSprachenZahl(int sprachenZahl) {
        Sprache.sprachenZahl = sprachenZahl;
    }
    //ComboBox
    public static Scene createSpracheScene(Stage stage){
        Label lSpracheScene1= new Label("- Bin die Sprach- Auswahl- Scene -");

        Label lSprachAuswahl = new Label("Sprache auswählen:");
        //TextField txfLoginBenutzername = new TextField();
        //Button bLoginBenutzerNameOK = new Button("LoginBenutzerNameOK");

       // String[] sprachen = {"Deutsch", "English", "France","Turky","Chinesisch"};

        //ComboBox comboBox1 = new ComboBox(sprachen);
        ComboBox comboBox1 = new ComboBox();

        comboBox1.getItems().add("Deutsch");//0
        comboBox1.getItems().add("Italienisch");//1
        comboBox1.getItems().add("Bosnisch");//2 //serbo-koratisch
        comboBox1.getItems().add("Albanisch");//3 //albanisch mazedonisch Shkumbin
        comboBox1.getItems().add("Türkisch");//4

        //comboBox1.setItems(getSprachenZahl("Deutsch"));

        Label lZeigeSprachAuswahl = new Label("Noch keine Sprache ausgewählt!");//No language selected yet!

        //System.out.println("blablbla  "+comboBox1.getValue());

        /*Event handler for getting selected country*/




        EventHandler<ActionEvent> event =
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        lZeigeSprachAuswahl.setTextFill(Color.rgb(21, 117, 84));
                        lZeigeSprachAuswahl.setText("Sie haben die Sprache gewählt: " + comboBox1.getValue());
                        System.out.println("Die Sprache wurde gewählt: " + comboBox1.getValue());

                        String strComboBoxGewaehlt = (String) comboBox1.getValue();
                        System.out.println("strComboBoxGewaehlt: " + strComboBoxGewaehlt);

                        switch (strComboBoxGewaehlt) {
                            case "Deutsch":
                                sprachenZahl = 0;
                                setSprachenZahl(0);
                                //  spracheInt = 1;
//                                l2.setText(EnumY.Deutsch.getHallo());
                                //EnumY.Chinesisch.
                                //lX.setText(EnumY.);
//                                l5.setText(sprachGurte[0]);
//                                //lX.getS.getS
//                                String bla = "";
                                System.out.println("Deutsch getSprachenZahl() "+getSprachenZahl());
//                        //EnumY
//                        System.out.println(str);
                                break;
                            case "Italienisch":
                                setSprachenZahl(1);
                                System.out.println("Italienisch getSprachenZahl() "+getSprachenZahl());
                                break;
                            case "Bosnisch":
                                setSprachenZahl(2);
                                System.out.println("serbo-koratisch getSprachenZahl() "+getSprachenZahl());
                                break;
                            case "Albanisch":
                                setSprachenZahl(3);
                                System.out.println("albanisch getSprachenZahl() "+getSprachenZahl());
                                break;
                            case "Türkisch":
                                setSprachenZahl(4);
                                System.out.println("Türkisch getSprachenZahl() "+getSprachenZahl());
                                break;
                        }

                    }
                };
        comboBox1.setOnAction(event);


//        comboBox.addEventFilter(KeyEvent.KEY_PRESSED, (event) -> {
//            // do stuff
//        });


        //Label lzeigeSprache
        Button buttonHauptGUI = new Button("Weiter");
        buttonHauptGUI.setOnAction(e -> {
            if (comboBox1.getValue() == null) {
                System.out.println("\nSprache ist null, muss erst ausgewählt werden!");
                lZeigeSprachAuswahl.setText("Erst muss eine Sprache ausgewählt werden!");
                lZeigeSprachAuswahl.setTextFill(Color.rgb(210, 39, 30));
            } else {
                System.out.println("Sprache ist gewählt");
                stage.setScene(HauptGUIScene.createGetHauptScene(stage));
            }
        });




        Button bZuruekLoginS = new Button("Abmelden");
        //bZuruekLogin.setOnAction(e -> stage.setScene(Login.createLoginScene(stage)));
        bZuruekLoginS.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                Login.setIsFoundInDbAndPasswortCorrect(false);
                Login.isFoundInDB=false;
                stage.setScene(Login.createLoginScene(stage));
            }
        });



//        HBox layoutHAbmeldenTaskLeiste = new HBox(1);
//        layoutHAbmeldenTaskLeiste.getChildren().addAll(TaskLeistePane.getPane());

        Button bRegistrierenScene= new Button("Registrieren");
        if(!Login.getIstUnterhalt().equals("Admin")){
            bRegistrierenScene.setStyle("-fx-background-color: transparent");
            bRegistrierenScene.setStyle("-fx-text-fill: transparent");
            bRegistrierenScene.setDisable(true);
            bRegistrierenScene.setVisible(false);
        }
        //button1.setOnAction(e -> primaryStage.setScene(scene2));
        bRegistrierenScene.setOnAction(e -> {
            if(Login.getIstChef().equals("Admin")){
                stage.setScene(Registrieren.createRegistrierenScene(stage));
            }else {
                System.out.println("Sie sind kein Admin");
            }
        });

        Button bMADeleteScene= new Button("Löschen");
        if(!Login.getIstUnterhalt().equals("Admin")){
            bMADeleteScene.setStyle("-fx-background-color: transparent");
            bMADeleteScene.setStyle("-fx-text-fill: transparent");
            bMADeleteScene.setDisable(true);
            bMADeleteScene.setVisible(false);
        }
        //button1.setOnAction(e -> primaryStage.setScene(scene2));
        bMADeleteScene.setOnAction(e -> {
            if(Login.getIstChef().equals("Admin")){
                stage.setScene(MADelete.createMADeleteScene(stage));
            }else {
                System.out.println("Sie sind kein Admin");
            }
        });


        Button bPasswortAendern = new Button("Passwort \nändern?");
        bPasswortAendern.setOnAction(e -> stage.setScene(PasswortChange.createPasswortChangeScene(stage)));
//------------------test xml-------------------------------------------------------------------------------------------
        Button bPasswortFinder = new Button("Passwort \nfinden");

        if(!Login.getIstUnterhalt().equals("Admin")){
            bPasswortFinder.setStyle("-fx-background-color: transparent");
            bPasswortFinder.setStyle("-fx-text-fill: transparent");
            bPasswortFinder.setDisable(true);
            bPasswortFinder.setVisible(false);
        }


        try {
            bPasswortFinder.setOnAction(e -> {
                //if(Login.getIstChef().equals("Admin")){
                    try {
                        stage.setScene(PasswortFinderXML.createPasswortFinderScene(stage));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
//                }
//                else {
//                    System.out.println("Sie sind kein Admin");
//                }
            });
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Etwas mit XML ging schief...");
            ex.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------------
        VBox layoutV1 = new VBox(39);
        HBox layoutHSprachAuswahl = new HBox(20);

        layoutHSprachAuswahl.getChildren().addAll(lSprachAuswahl,comboBox1,lZeigeSprachAuswahl);//muss addAll sein


        HBox layoutHLabelSprachenScenePasswortAendern = new HBox(269);
        HBox layoutHAbmeldenPW = new HBox(1);
        layoutHAbmeldenPW.getChildren().addAll(bRegistrierenScene,bMADeleteScene,bZuruekLoginS,bPasswortFinder,bPasswortAendern);
        layoutHLabelSprachenScenePasswortAendern.getChildren().addAll(lSpracheScene1,layoutHAbmeldenPW);

        layoutV1.getChildren().addAll(layoutHLabelSprachenScenePasswortAendern,layoutHSprachAuswahl,buttonHauptGUI,TaskLeistePane.getPane());//layoutHAbmeldenTaskLeiste



        Scene sceneSprache = new Scene(new ScrollPane(layoutV1),800,250);//scene braucht ein Layout, hat scrollpane drin
        //Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        //scene1 = new Scene(layoutV1, 800, 400);
        //scene1.setFill(Color.YELLOWGREEN);
        return sceneSprache;
    }

}





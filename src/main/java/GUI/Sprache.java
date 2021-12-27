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
 * 15.12.2021, 22:41
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
        comboBox1.getItems().add("serbo-koratisch");//2 //serbo-koratisch
        comboBox1.getItems().add("albanisch mazedonisch Shkumbin");//3 //albanisch mazedonisch Shkumbin
        comboBox1.getItems().add("Türkisch");//4

        //comboBox1.setItems(getSprachenZahl("Deutsch"));

        Label lZeigeSprachAuswahl = new Label("No language selected yet!");

        System.out.println("blablbla  "+comboBox1.getValue());

        /*Event handler for getting selected country*/




        EventHandler<ActionEvent> event =
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        lZeigeSprachAuswahl.setTextFill(Color.rgb(21, 117, 84));
                        lZeigeSprachAuswahl.setText("You selected \"" + comboBox1.getValue());
                        System.out.println("bbbnubjnnsij " + comboBox1.getValue());

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
                            case "serbo-koratisch":
                                setSprachenZahl(2);
                                System.out.println("serbo-koratisch getSprachenZahl() "+getSprachenZahl());
                                break;
                            case "albanisch mazedonisch Shkumbin":
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
        Button buttonHauptGUI = new Button("Go to HauptGui wenn Sprache gewählt oder standart deutsch");
        buttonHauptGUI.setOnAction(e -> {
            if (comboBox1.getValue() == null) {
                System.out.println("Sprache ist null");
                lZeigeSprachAuswahl.setTextFill(Color.rgb(210, 39, 30));
            } else {
                System.out.println("Sprache ist gewählt");
                stage.setScene(HauptGUIScene.createGetHauptScene(stage));
            }
        });


        VBox layoutV1 = new VBox(1);
        HBox layoutHSprachAuswahl = new HBox(20);

        layoutHSprachAuswahl.getChildren().addAll(lSprachAuswahl,comboBox1,lZeigeSprachAuswahl);//muss addAll sein

        Button bZuruekLoginS = new Button("Abmelden");
        //bZuruekLogin.setOnAction(e -> stage.setScene(Login.createLoginScene(stage)));
        bZuruekLoginS.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                Login.setIsFoundInDbAndPasswortCorrect(false);
                stage.setScene(Login.createLoginScene(stage));
            }
        });



//        HBox layoutHAbmeldenTaskLeiste = new HBox(1);
//        layoutHAbmeldenTaskLeiste.getChildren().addAll(TaskLeistePane.getPane());

        Button bRegistrierenScene= new Button("Go to Registrieren- Scene");
        //button1.setOnAction(e -> primaryStage.setScene(scene2));

//        if(Login.getIstChef().equals("Admin")) {
//            bRegistrierenScene.setOnAction(e -> stage.setScene(Registrieren.createRegistrierenScene(stage)));
//        }
//        else{
//            System.out.println("Sie sind kein Admin");
//        }

        bRegistrierenScene.setOnAction(e -> {
            if(Login.getIstChef().equals("Admin")){
                stage.setScene(Registrieren.createRegistrierenScene(stage));
            }else {
                System.out.println("Sie sind kein Admin");
            }
        });

        HBox layoutHLabelSprachenScenePasswortAendern = new HBox(180);
        Button bPasswortAendern = new Button("Passwort \n ändern?");
        HBox layoutHAbmeldenPW = new HBox(1);
        layoutHAbmeldenPW.getChildren().addAll(bRegistrierenScene,bZuruekLoginS,bPasswortAendern);
        layoutHLabelSprachenScenePasswortAendern.getChildren().addAll(lSpracheScene1,layoutHAbmeldenPW);

        layoutV1.getChildren().addAll(layoutHLabelSprachenScenePasswortAendern,layoutHSprachAuswahl,buttonHauptGUI,TaskLeistePane.getPane());//layoutHAbmeldenTaskLeiste



        Scene sceneSprache = new Scene(new ScrollPane(layoutV1),650,200);//scene braucht ein Layout, hat scrollpane drin
        //Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        //scene1 = new Scene(layoutV1, 800, 400);
        //scene1.setFill(Color.YELLOWGREEN);
        return sceneSprache;
    }

}





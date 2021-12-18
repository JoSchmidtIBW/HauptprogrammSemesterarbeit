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

    //ComboBox
    public static Scene createSpracheScene(Stage stage){
        Label lSpracheScene1= new Label("- Bin die Sprach- Auswahl- Scene -");

        Label lSprachAuswahl = new Label("Sprache auswählen:");
        //TextField txfLoginBenutzername = new TextField();
        //Button bLoginBenutzerNameOK = new Button("LoginBenutzerNameOK");

       // String[] sprachen = {"Deutsch", "English", "France","Turky","Chinesisch"};

        //ComboBox comboBox1 = new ComboBox(sprachen);
        ComboBox comboBox1 = new ComboBox();

        comboBox1.getItems().add("Deutsch");
        comboBox1.getItems().add("Italienisch");
        comboBox1.getItems().add("serbo-koratisch");//serbo-koratisch
        comboBox1.getItems().add("Bosnisch");
        comboBox1.getItems().add("albanisch mazedonisch Shkumbin");//albanisch mazedonisch Shkumbin
        comboBox1.getItems().add("Türkisch");

        Label lZeigeSprachAuswahl = new Label("No language selected yet!");

        System.out.println("blablbla  "+comboBox1.getValue());

        /*Event handler for getting selected country*/




        EventHandler<ActionEvent> event =
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e)
                    {
                        lZeigeSprachAuswahl.setTextFill(Color.rgb(21, 117, 84));
                        lZeigeSprachAuswahl.setText("You selected \"" + comboBox1.getValue());
                    }
                };
        comboBox1.setOnAction(event);





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
        HBox layoutHSprachAuswahl = new HBox(1);

        layoutHSprachAuswahl.getChildren().addAll(lSprachAuswahl,comboBox1,lZeigeSprachAuswahl);//muss addAll sein

        layoutV1.getChildren().addAll(lSpracheScene1,layoutHSprachAuswahl,buttonHauptGUI);

        Scene sceneSprache = new Scene(new ScrollPane(layoutV1),400,200);//scene braucht ein Layout, hat scrollpane drin
        //Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        //scene1 = new Scene(layoutV1, 800, 400);
        //scene1.setFill(Color.YELLOWGREEN);
        return sceneSprache;
    }

}

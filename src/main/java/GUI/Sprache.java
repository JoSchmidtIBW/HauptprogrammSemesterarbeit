package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 15.12.2021, 22:41
 */
public class Sprache {

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

        ComboBox comboBox1 = new ComboBox();

        comboBox1.getItems().add("Deutsch");
        comboBox1.getItems().add("Serbisch");
        comboBox1.getItems().add("Bosnisch");
        comboBox1.getItems().add("Albanisch");
        comboBox1.getItems().add("Türkisch");

        Label lZeigeSprachAuswahl = new Label("No country selected yet!");


        /*Event handler for getting selected country*/
        EventHandler<ActionEvent> event =
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e)
                    {
                        lZeigeSprachAuswahl.setText("You selected \"" + comboBox1.getValue() + "\" country");
                    }
                };
        comboBox1.setOnAction(event);


        Button buttonHauptGUI = new Button("Go to HauptGui wenn Sprache gewählt oder standart deutsch");
        buttonHauptGUI.setOnAction(e -> stage.setScene(HauptGUIScene.createGetHauptScene(stage)));

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

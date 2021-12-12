package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 12.12.2021, 00:34
 */
public class Registrieren {

    public static Scene createRegistrierenScene(Stage stage){

      //  HBox hbox = new HBox();


    Label labelRegistrierenScene= new Label("This is the second scene Registrieren-Scene");

    Label lRegistrierenVorname = new Label("LRegistrierenVorname");
    TextField txfRegistrierenVorname = new TextField("Vorname Eingen:");
    Button bRegistrierenVornameOK = new Button("RegistrierenVornameOK");

    Button bRegistrierenZurueckLogin= new Button("Go to scene 1 - Zurück zum Login");


        bRegistrierenZurueckLogin.setOnAction(e -> stage.setScene(Login.createLoginScene(stage)));//primaryStage
    VBox layoutVR= new VBox(1);
    HBox layoutHR1 = new HBox(1);

        layoutHR1.getChildren().addAll(lRegistrierenVorname,txfRegistrierenVorname,bRegistrierenVornameOK);
        layoutVR.getChildren().addAll(labelRegistrierenScene, layoutHR1,bRegistrierenZurueckLogin);

        //Scene sceneRegistrieren = new Scene(layoutVR);
        Scene sceneRegistrieren = new Scene(new ScrollPane(layoutVR));//hat scrollpane drin
        return sceneRegistrieren;
    }

}

//    scene2= new Scene(layoutVR,300,250);// scene2= new Scene(layout2,300,250,Color.BISQUE);
//    //scene2.setFill(Color.BISQUE);
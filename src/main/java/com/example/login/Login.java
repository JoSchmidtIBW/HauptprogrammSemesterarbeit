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
 * 12.12.2021, 13:52
 */
public class Login {
    //Scene scene1, scene2;//muss noch angeschaut werden

    public static Scene createLoginScene(Stage stage){
        Label lLoginScene1= new Label("This is the first scene Login-Scene");
        Label lLoginBenutzername = new Label("Benutzername");
        TextField txfLoginBenutzername = new TextField();
        Button bLoginBenutzerNameOK = new Button("LoginBenutzerNameOK");

        Label lLoginPasswort = new Label("Passwort:");
        TextField txfLoginPasswort = new TextField();
        Button bLoginPasswortOK = new Button("LoginPasswortOK");

        Label lLoginRegistrieren = new Label("Registrieren");
        Button bLoginRegistrieren = new Button("Go to Registrieren-Scene - OK");
        Button button1= new Button("Go to scene 2");
        //button1.setOnAction(e -> primaryStage.setScene(scene2));
        button1.setOnAction(e -> stage.setScene(Registrieren.createRegistrierenScene(stage)));

        Button buttonRegistrierenKlasse = new Button("KlasseRegistrieren");
//        buttonRegistrierenKlasse.setOnAction(event -> {
//            Scene newSceneRegistrieren = new Registrieren();// ... commands which define the new scene.
//                   // Stage stage = ((Node) event.getTarget()).getScene().getStage();
//            // or alternatively, just:
//             Stage stage =  buttonRegistrierenKlasse.getScene().getStage();
//            stage.setScene(newSceneRegistrieren);
//        });
     //   scene.setOnMouseClicked(e -> changeScene(scene2));

        VBox layoutV1 = new VBox(1);
        HBox layoutHBenutzername = new HBox(1);
        HBox layoutHPasswort = new HBox(1);

        layoutHBenutzername.getChildren().addAll(lLoginBenutzername,txfLoginBenutzername,bLoginBenutzerNameOK);//muss addAll sein
        layoutHPasswort.getChildren().addAll(lLoginPasswort,txfLoginPasswort,bLoginPasswortOK);

        layoutV1.getChildren().addAll(lLoginScene1,layoutHBenutzername,layoutHPasswort,bLoginRegistrieren,button1,buttonRegistrierenKlasse);

        //Scene sceneLogin = new Scene(layoutV1);//scene braucht ein Layout
        Scene sceneLogin = new Scene(new ScrollPane(layoutV1));//scene braucht ein Layout, hat scrollpane drin
        //scene1 = new Scene(layoutV1, 800, 400);
        //scene1.setFill(Color.YELLOWGREEN);
        return sceneLogin;
    }
}


//scene1= new Scene(layoutV1, 350, 250);
//final Scene scene = new Scene(root, 800, 400, Color.BEIGE);
//scene1 = new Scene(layoutV1, 800, 400, Color.TOMATO);
//scene1.setStyle("-fx-background-color: #FFFFFF;");
//scene1.setFill(Color.YELLOW);
package com.example.login;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;

public class FirstGUI extends Application {

    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("My First JavaFX GUI - Mubea");

//Scene 1
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
        button1.setOnAction(e -> primaryStage.setScene(scene2));

        Button buttonRegistrierenKlasse = new Button("KlasseRegistrieren");
//        buttonRegistrierenKlasse.setOnAction(event -> {
//            Scene newSceneRegistrieren = new Registrieren();// ... commands which define the new scene.
//                   // Stage stage = ((Node) event.getTarget()).getScene().getStage();
//            // or alternatively, just:
//             Stage stage =  buttonRegistrierenKlasse.getScene().getStage();
//            stage.setScene(newSceneRegistrieren);
//        });


        VBox layoutV1 = new VBox(1);
        HBox layoutHBenutzername = new HBox(1);
        HBox layoutHPasswort = new HBox(1);

        layoutHBenutzername.getChildren().addAll(lLoginBenutzername,txfLoginBenutzername,bLoginBenutzerNameOK);//muss addAll sein
        layoutHPasswort.getChildren().addAll(lLoginPasswort,txfLoginPasswort,bLoginPasswortOK);

        layoutV1.getChildren().addAll(lLoginScene1,layoutHBenutzername,layoutHPasswort,bLoginRegistrieren,button1,buttonRegistrierenKlasse);
//        layoutV1.getChildren().addAll(lLoginScene1,lLoginBenutzername,txfLoginBenutzername,bLoginBenutzerNameOK,//txfLoginBenutzername,
//                lLoginPasswort,txfLoginPasswort,bLoginPasswortOK,bLoginRegistrieren, button1);//txfLoginPasswort,

        //scene1= new Scene(layoutV1, 350, 250);
        //final Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        //scene1 = new Scene(layoutV1, 800, 400, Color.TOMATO);
        //scene1.setStyle("-fx-background-color: #FFFFFF;");
        //scene1.setFill(Color.YELLOW);
        scene1 = new Scene(layoutV1, 800, 400);
        //scene1.setFill(Color.YELLOWGREEN);

        //-------------------------------------------------------------------------------------------
//Scene 2
//        Label labelRegistrierenScene= new Label("This is the second scene Registrieren-Scene");
//
//        Label lRegistrierenVorname = new Label("LRegistrierenVorname");
//        TextField txfRegistrierenVorname = new TextField("Vorname Eingen:");
//        Button bRegistrierenVornameOK = new Button("RegistrierenVornameOK");
//
//        Button bRegistrierenZurueckLogin= new Button("Go to scene 1 - Zurück zum Login");
//
//
//        bRegistrierenZurueckLogin.setOnAction(e -> primaryStage.setScene(scene1));
//        VBox layoutVR= new VBox(1);
//        HBox layoutHR1 = new HBox(1);
//
//        layoutHR1.getChildren().addAll(lRegistrierenVorname,txfRegistrierenVorname,bRegistrierenVornameOK);
//        layoutVR.getChildren().addAll(labelRegistrierenScene, layoutHR1,bRegistrierenZurueckLogin);
//        scene2= new Scene(layoutVR,300,250);// scene2= new Scene(layout2,300,250,Color.BISQUE);
//        //scene2.setFill(Color.BISQUE);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}


//    If you want to have different classes to represent different scenes/windows:
//        (I tried this and it worked).
//
//        This is a class for the second scene. Notice that the class extends Application, but there's no main method. Also notice that the start method (could have named it anything else) receives a Stage type argument.
//
//public class SecondWindow extends Application
//{
//    // This method, when called, will receive the original primary stage
//// on which a new scene will then be attached
//    public void start(Stage stage)
//    {
//        Label lbl = new Label("This is a new window.");
//        BorderPane bp = new BorderPane();
//        bp.setCenter(lbl);
//
//        Scene scene = new Scene(bp, 500, 500);
//        stage.setScene(scene);
//        stage.show();
//
//    }
//}
//
//// From the main method in the first class:
//
//btnSubmit.setOnAction(e-> {
//// Instantiate the class that creates a new scene
//// Call method in newly instantiated class, passing primaryStage to it
//        SecondWindow secondWindow = new SecondWindow();
//        secondWindow.start(primaryStage);
//        });

//        Conclusion:
//        The primaryStage cannot change, but the scene can, so after instantiating the secondWindow class, call the start method, passing the primaryStage as argument. You can then set the new scene created in this secondWindow class to the original stage.
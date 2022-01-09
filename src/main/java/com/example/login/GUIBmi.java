package com.example.login;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 07.01.2022, 08:38
 */
public class GUIBmi extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Welcome");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        //grid.setGridLinesVisible(true);
        grid.setPadding(new Insets(25, 25, 25, 25));
        //                                          unten


        Text textSceneTitle = new Text("BMI-Rechner");
        textSceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//Schriftart
        grid.add(textSceneTitle, 0, 0, 2, 1);



        Label lMasse = new Label("Masse:");
        TextField txfMasse = new TextField();//masse

        Label lLaenge = new Label("Länge:");
        PasswordField pwBoxLaenge = new PasswordField();//länge
        //TextField passwortTextField = new TextField();//masse




        Button bBerechne = new Button("Berechne");
        final Text textZeigeAusgabe = new Text();
        bBerechne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textZeigeAusgabe.setFill(Color.FIREBRICK);
                //-------------------------------berechne
                //--> Formel zum berechnenbmi = masse/Länge
                //textZeigeAusgabe.setText("Sign in button pressed");
                textZeigeAusgabe.setText("Ausgabe: " + txfMasse.getText());//hier kommt resultat von masse und Länge.
            }
        });

        //-----------AUSWAHL COMBOBOx vielleicht
        ChoiceBox comboBox1 = new ChoiceBox(FXCollections.observableArrayList(
                "First", "Second", "Third")
        );

        //auswahlbox mit Seperator irgendwas
        ChoiceBox comboBox2 = new ChoiceBox();
        comboBox2.setItems(FXCollections.observableArrayList(
                "New Document", "Open ",
                new Separator(), "Save", "Save as")
        );


        //Separator separator = new Separator(Orientation.HORIZONTAL);
        //grid.add(separator, col, row, 1, GridPane.REMAINING);
        //grid.add(separator, 1, GridPane.REMAINING);

        grid.add(comboBox2,0,1);
        grid.add(lMasse, 0, 2);
        grid.add(txfMasse, 1, 2);
        grid.add(lLaenge, 0, 3);
        grid.add(pwBoxLaenge, 1, 3);
        grid.add(textZeigeAusgabe,1,4);


//        grid.setGridLinesVisible(false);
//        grid.getColumnConstraints().clear();
//        grid.getRowConstraints().clear();
//        grid.getChildren().clear();
//        grid.setGridLinesVisible(true);

//grid.setGridLinesVisible(true);

        Button bRegistrieren = new Button("User anlegen");
        Button bSchreibeBMIinDB = new Button("Schreibe BMI in DB");

        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(bBerechne);
        grid.add(hbBtn, 1, 5);

        HBox hlayout2 = new HBox(2);
        hlayout2.getChildren().addAll(bSchreibeBMIinDB,bRegistrieren);
        grid.add(hlayout2,1,6);



        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        DBMethodenKlasse dbk1 = new DBMethodenKlasse();
        //String url = "'jdbc:mysql://localhost:3306/mysql";
        String url1 = "jdbc:mariadb://localhost:3306/mubeaDataBase";//name von "database liste"
        String user1 = "root";
        String password1 = "Mubea2020!";

//        String einfuegString1 = "INSERT INTO listlaender" +
//                "(landgeo, officialname, capitalcity, largestcity, areakm, population, callingcode, iso, waehrung)" +
//                "VALUES  ('Malrrrta', 'VWWW', 'Irgend', 'jijin', '81', '8857', '+4dd3', 'AfffffT', 'Eo');";
//
//        dbk1.schreibeDB(url1,user1,password1, einfuegString1);      //Immer wenn Play, kommt natürlich wieder eine dazu

        String ausgabeGesamtString = "SELECT * FROM userMubea";
        dbk1.ausgebenGesamtDB(url1,user1,password1, ausgabeGesamtString);

//        String ausgabeNurEineSpalte = "largestcity";
        //dbk1.ausgabeNurEineSpalteDB(url1,user1,password1,ausgabeNurEineSpalte);

        System.out.println("Bin die Main Methode in GUI-BMI");
        launch();
    }






}

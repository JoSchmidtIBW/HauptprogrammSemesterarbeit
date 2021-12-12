package com.example.login;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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

public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }
@Override
public void start(Stage primaryStage) {
    primaryStage.setTitle("JavaFX Welcome");

    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(25, 25, 25, 25));

    //textcontrolFeld
    final Text actiontarget = new Text();
    grid.add(actiontarget, 1, 6);

    //-----------AUSWAHL COMBOBOx vielleicht
    ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
            "First", "Second", "Third")
    );
    //auswahlbox mit Seperator irgendwas
    ChoiceBox cb1 = new ChoiceBox();
    cb1.setItems(FXCollections.observableArrayList(
            "New Document", "Open ",
            new Separator(), "Save", "Save as")
    );


    Scene scene = new Scene(grid, 300, 275);

    primaryStage.setScene(scene);

    Text scenetitle = new Text("BMI-Rechner");
    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//Schriftart
    grid.add(scenetitle, 0, 0, 2, 1);
    Label userName = new Label("Masse:");
    grid.add(userName, 0, 1);
    TextField userTextField = new TextField();//masse
    grid.add(userTextField, 1, 1);
    Label pw = new Label("Länge:");
    grid.add(pw, 0, 2);
    PasswordField pwBox = new PasswordField();//länge
    //TextField passwortTextField = new TextField();//masse
    grid.add(pwBox, 1, 2);


    //button
    Button btn = new Button("Berechne");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btn);
    grid.add(hbBtn, 1, 4);

    //-------------------------------berechne
    //bmi = masse/Länge

    btn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            actiontarget.setFill(Color.FIREBRICK);
            //actiontarget.setText("Sign in button pressed");
            actiontarget.setText("Ausgabe: "+userTextField.getText());//hier kommt resultat von masse und Länge.
        }
    });


    primaryStage.show();
}
    public static void main(String[] args) {

DBMethodenKlasse dbk1 = new DBMethodenKlasse();
        //String url = "'jdbc:mysql://localhost:3306/mysql";
    String url1 = "jdbc:mariadb://localhost:3306/databaseliste";//name von "database liste"
    String user1 = "root";
    String password1 = "Mubea2020!";

    String einfuegString1 = "INSERT INTO listlaender" +
            "(landgeo, officialname, capitalcity, largestcity, areakm, population, callingcode, iso, waehrung)" +
            "VALUES  ('Malrrrta', 'VWWW', 'Irgend', 'jijin', '81', '8857', '+4dd3', 'AfffffT', 'Eo');";

        dbk1.schreibeDB(url1,user1,password1, einfuegString1);      //Immer wenn Play, kommt natürlich wieder eine dazu

    String ausgabeGesamtString = "SELECT * FROM listlaender";
        dbk1.ausgebenGesamtDB(url1,user1,password1, ausgabeGesamtString);

    String ausgabeNurEineSpalte = "largestcity";
    //dbk1.ausgabeNurEineSpalteDB(url1,user1,password1,ausgabeNurEineSpalte);


        launch();
   }
}
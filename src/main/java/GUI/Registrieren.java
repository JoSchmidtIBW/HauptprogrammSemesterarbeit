package GUI;

import GUI.Login;
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


        Label labelRegistrierenScene= new Label("- Registrieren- Scene -");

        Label lRegistrierenVorname = new Label("LRegistrierenVorname");
        TextField txfRegistrierenVorname = new TextField("Vorname Eingen:");
        Button bRegistrierenVornameOK = new Button("RegistrierenVornameOK");

        Label lRegistrierenNachname = new Label("LRegistrierenNachname");
        TextField txfRegistrierenNachname = new TextField("Nachname Eingen:");
        Button bRegistrierenNachnameOK = new Button("RegistrierenNachnameOK");

        Label lRegistrierenPassWortGegeben = new Label("LRegistrierenPassWortGegeben");
        TextField txfRegistrierenPasswortGegeben = new TextField("PasswortGegeben Eingen:");
        Button bRegistrierenPasswortGegebenOK = new Button("RegistrierenPasswortGegebenOK");

        Label lRegistrierenPassWortNeu = new Label("LRegistrierenPassWortNeu");
        TextField txfRegistrierenPasswortNeu = new TextField("PasswortNeu Eingen:");
        Button bRegistrierenPasswortNeuOK = new Button("RegistrierenPasswortNeuOK");

        Label lRegistrierenPasswortNeuWiederholen = new Label("LRegistrierePasswortNeuWiederholen");
        TextField txfRegistrierenPasswortNeuWiederholen = new TextField("PasswortNeuWiederholen Eingen:");
        Button bRegistrierenPasswortNeuWiederholenOK = new Button("RegistrierenPasswortNeuWiederholenOK");


        Button bRegistrierenZurueckLogin= new Button("Go to scene 1 - Zurück zum Login");


        bRegistrierenZurueckLogin.setOnAction(e -> stage.setScene(Login.createLoginScene(stage)));//primaryStage
        VBox layoutVR= new VBox(1);
        HBox layoutHVorname1 = new HBox(1);
        HBox layoutHNachname1 = new HBox(1);
        HBox layoutPasswortGegeben = new HBox(1);
        HBox layoutPasswortNeu = new HBox(1);
        HBox layoutPasswortwiderholen = new HBox(1);

        Label lPWVergessen = new Label("Passwort vergessen?");

        layoutHVorname1.getChildren().addAll(lRegistrierenVorname,txfRegistrierenVorname,bRegistrierenVornameOK);
        layoutHNachname1.getChildren().addAll(lRegistrierenNachname,txfRegistrierenNachname,bRegistrierenNachnameOK);

        layoutPasswortGegeben.getChildren().addAll(lRegistrierenPassWortGegeben,txfRegistrierenPasswortGegeben,bRegistrierenPasswortGegebenOK);
        layoutPasswortNeu.getChildren().addAll(lRegistrierenPassWortNeu,txfRegistrierenPasswortNeu,bRegistrierenPasswortNeuOK);
        layoutPasswortwiderholen.getChildren().addAll(lRegistrierenPasswortNeuWiederholen,txfRegistrierenPasswortNeuWiederholen,bRegistrierenPasswortNeuWiederholenOK);

        layoutVR.getChildren().addAll(labelRegistrierenScene, layoutHVorname1,layoutHNachname1,
                layoutPasswortGegeben,layoutPasswortNeu,layoutPasswortwiderholen,bRegistrierenZurueckLogin,lPWVergessen);

        //Scene sceneRegistrieren = new Scene(layoutVR);
        Scene sceneRegistrieren = new Scene(new ScrollPane(layoutVR),400,200);//hat scrollpane drin
        return sceneRegistrieren;
    }

}

//    scene2= new Scene(layoutVR,300,250);// scene2= new Scene(layout2,300,250,Color.BISQUE);
//    //scene2.setFill(Color.BISQUE);
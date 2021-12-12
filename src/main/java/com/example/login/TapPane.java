package com.example.login;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.ColorInput;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author - John Schmidt
 * 09.12.2021, 23:13
 */
/**
 * @author - John Schmidt
 * 09.12.2021, 23:40
 */
public class TapPane  extends Application {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        launch();//lauch //anzeigen Fenster
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox(5);



        Label  labelTaskleiste = new Label("LabelTaskleiste");
        labelTaskleiste.setStyle("-fx-background-color: blue;");
        //JPanel jpanel1 = new JPanel();//Instead of a JPanel set to BoderLayout, use BorderPane
        BorderPane bpanel = new BorderPane();
        //Instead of a JPanel set to GridLayout, use GridPane
        Pane maxpane = new Pane();
        maxpane.setStyle("-fx-background-color: black;");
       // maxpane.setBackground(RED);
        Label lirgendwas = new Label("lirgendwas");
        lirgendwas.setStyle("-fx-background-color: red;");
        //bpanel.getChildren().add(lirgendwas);

        Label fuckLabel = new Label("Fucklabel im FuckPanel von Fuckyou");
        Pane fuckyou = new Pane(fuckLabel);
        //Pane hauptOberflaechenPaneTaskleiste = new Pane();

        Button btn = new Button("1");
        Button btn2 = new Button("2");

        final Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben
        final Group card1 = new Group(new Text(25, 25, "Card 1"));
        final Group card2 = new Group(new Text(25, 25, "Card 2"));
        //card2.setStyle("-fx-background-color: blue;");

        //final Group card3 = new Group(new Text(30, 30, "Card 3"));

        ColorInput ci = new ColorInput(card2.getLayoutX(),
                card2.getLayoutY(),
                card2.getLayoutBounds().getWidth(),
                card2.getLayoutBounds().getHeight(),
                Color.RED);
        card2.setEffect(ci);

//        ColorInput ci = new ColorInput(
//                Color.RED);
//        card2.setEffect(Color.RED);


        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(card1);
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                //cardsPane.getChildren().add(card2);
                cardsPane.getChildren().add(new GroupStack(cardsPane).macheGroup());
            }
        });

        //hauptOberflaechenPaneTskleiste..add(new TaskLeiste(anzeigePanel, cardLayout));
        //hauptOberflaechenPaneTskleiste(new TaskLeiste(hauptOberflaechenPaneTskleiste, cardLayout));
        //hauptOberflaechenPaneTaskleiste(new TaskLeiste(hauptOberflaechenPaneTaskleiste));
        //HBox hBox=new HBox();
//        TaskLeiste taskLeiste = new TaskLeiste();
//        Pane pt = new Pane();
        //pt(taskLeiste);
      //  pt.getChildren().add(taskLeiste);
        //hauptOberflaechenPaneTaskleiste(new TaskLeiste());
        //hauptOberflaechePanel.add(new TaskLeiste(anzeigePanel, cardLayout));
        //hauptOberflaechenPaneTaskleiste(taskLeiste);

        vbox.getChildren().addAll(fuckyou,btn, btn2, cardsPane,labelTaskleiste,  bpanel,maxpane,lirgendwas, TastLeistePane.getPane());
        //,TaskPane.getPane(vbox)
        //final Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        final Scene scene = new Scene(new ScrollPane(vbox));
        //stage.setScene(new Scene(new ScrollPane(vbox)));//mit scrollpane drin (youtube)
        stage.setScene(scene);
        stage.setWidth(200);
        stage.setHeight(200);
        stage.show();
    }
}

class GroupStack{
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public GroupStack(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheGroup(){
        final Group card2 = new Group(new Text(25, 25, "Card 2"));
        return card2;
    }

}


class TastLeistePane {

    private static String uhrzeitText;
    //String uhrzeitText = "";
    private static String datumText;

    //public static Node getPane;
    public static Pane getPane(){//es mue fucking statig siii
//        final java.util.Timer clockTimer = new java.util.Timer(true);
//        final java.text.SimpleDateFormat zeitFormat = new java.text.SimpleDateFormat("HH:mm:ss");
//        final java.text.SimpleDateFormat datumFormat = new java.text.SimpleDateFormat("dd.MM.yyyy");
//        final Label labelUhrzeit = new Label();
//        final Label labelDatum = new Label();
//        clockTimer.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                String uhrzeitText = zeitFormat.format(new Date());
//                String datumText = datumFormat.format(new Date());
//                System.out.println(uhrzeitText);
////                uhrzeitText = zeitFormat.format(new Date());
////                datumText = datumFormat.format(new Date());
//                labelUhrzeit.setText(uhrzeitText);
//                labelDatum.setText(datumText);
//            }
//        }, 0, 1000);

        final Label clock = new Label();
        final DateFormat format = DateFormat.getInstance();
        final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                final Calendar cal = Calendar.getInstance();
                clock.setText(format.format(cal.getTime()));
            }
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

        HBox hbox = new HBox();
        Label lt = new Label("Mia");
        Label lt2 = new Label("Mia2222");
        hbox.getChildren().addAll(lt,lt2,clock);//labelDatum,labelUhrzeit);//);//
        //Pane pane = new Pane(lt,lt2);//funktioniert
        Pane pane = new Pane(hbox);
        //pane.getChildren().add(lt);

        return pane;
    }
//    public Pane getPane(VBox vox){
//
//
//        Label lt = new Label("Mia");
//        Pane pane = new Pane(lt);
//       //pane.getChildren().add(lt);
//
//        return pane;
//    }
    //final Group card1 = new Group(new Text(25, 25, "Card 2"));

}
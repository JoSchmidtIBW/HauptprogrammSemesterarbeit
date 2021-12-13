package GUI;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author - John Schmidt
 * 10.12.2021, 01:09
 */
public class TaskLeistePane {

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

//        final javafx.scene.control.Label clock = new javafx.scene.control.Label();
//        final DateFormat format = DateFormat.getInstance();
//        final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                final Calendar cal = Calendar.getInstance();
//                clock.setText(format.format(cal.getTime()));
//            }
//        }));
//        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.play();

        Label main_clock_lb = new Label();
        Thread timerThread = new Thread(() -> {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy   HH:mm:ss");
            while (true) {
                try {
                    Thread.sleep(1000); //1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final String time = simpleDateFormat.format(new Date());
                Platform.runLater(() -> {
                    main_clock_lb.setText(time);
                });
            }
        });   timerThread.start();//start the thread and its ok

        HBox hbox = new HBox();
        javafx.scene.control.Label lt = new javafx.scene.control.Label("Bin ein Label");
        javafx.scene.control.Label lt2 = new Label("Taskleiste- Label");
        hbox.getChildren().addAll(lt,lt2,main_clock_lb);//labelDatum,labelUhrzeit);//);//
        //Pane pane = new Pane(lt,lt2);//funktioniert
        Pane pane = new Pane(hbox);
        //pane.getChildren().add(lt);

        return pane;
    }
}
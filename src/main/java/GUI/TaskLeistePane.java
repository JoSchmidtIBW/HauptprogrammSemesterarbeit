package GUI;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.AnchorPane;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author - John Schmidt
 * 28.12.2021, 01:09
 */
public class TaskLeistePane {

    private static String uhrzeitStr;
    private static String datumStr;


    public static String getUhrzeitStr() {
        return uhrzeitStr;
    }

    public static void setUhrzeitStr(String uhrzeitStr) {
        TaskLeistePane.uhrzeitStr = uhrzeitStr;
    }

    public static String getDatumStr() {
        return datumStr;
    }

    public static void setDatumStr(String datumStr) {
        TaskLeistePane.datumStr = datumStr;
    }


    public static Pane getPane(){
//Hier eigener Pfad eingeben (ev. in der Klasse Main, wegen Windowevent, ev. wegen Mac, ev. anderes Zeugs machen)
//**********************************************************************************************************************
        ImageView myImageView = new ImageView("file:///D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG");
//**********************************************************************************************************************

        Label lDatum = new Label();
        //Label lZwischenDatumUhrzeit = new Label("  ");
        Label lUhrzeit = new Label();
        Thread timerThread1 = new Thread(() -> {
            SimpleDateFormat simpleDateFormatDatum = new SimpleDateFormat("dd.MM.yyyy");//   HH:mm:ss
            SimpleDateFormat simpleDateFormatUhrzeit = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                try {
                    Thread.sleep(1000); //1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //final String timeStr = simpleDateFormat.format(new Date());
                setDatumStr(simpleDateFormatDatum.format(new Date()));
                setUhrzeitStr(simpleDateFormatUhrzeit.format(new Date()));
                Platform.runLater(() -> {
                    lDatum.setText(getDatumStr());
                    lUhrzeit.setText(getUhrzeitStr());
                });
            }
        });   timerThread1.start();
//----------------------------------------------------------------------------------------------------------------------

        Label lTaskLeisteAngemeldetT = new javafx.scene.control.Label(" Angemeldet:   "+Login.getVorName()+" / " +
                Login.getNachName());

        if(Login.getIstUnterhalt().equals("keinU")){
            lTaskLeisteAngemeldetT.setTextFill(Color.BLUE);
        }else if(Login.getIstUnterhalt().equals("istU")){
            lTaskLeisteAngemeldetT.setTextFill(Color.DEEPPINK);//ist tatsächlich so in Firma, Unterhalt schreipt mit Pinkt zB. auf den Fahrtenschreiber
        }else if(Login.getIstUnterhalt().equals("Admin")){
            lTaskLeisteAngemeldetT.setTextFill(Color.RED);
        }



//        try {
        //myImageView.setFitHeight(50);
        //myImageView.setFitWidth(100);
        //myImageView.
            // Create a label that contains both an image and text.
            Label lLogo = new Label("", myImageView);
            //lLogo.setGraphic("", myImageView);
//        }
//catch (Exception ex){
//    System.out.println("äääähmm Bild");
//}



        BorderPane borderPaneHauptTLP = new BorderPane();
        HBox layoutHHauptTLP = new HBox();
        HBox layoutHUhrDatum = new HBox(20);
        layoutHUhrDatum.getChildren().addAll(lDatum,lUhrzeit,lLogo);
        HBox layoutHDatumUhrLogo = new HBox(40);
        layoutHDatumUhrLogo.getChildren().addAll(layoutHUhrDatum,lLogo);
        borderPaneHauptTLP.setBottom(layoutHHauptTLP);



        AnchorPane anchorPaneLeft = new AnchorPane();
        HBox.setHgrow(anchorPaneLeft, Priority.ALWAYS);//Make AnchorPane anchorPaneLeft grow horizontally
        AnchorPane anchorPaneRight = new AnchorPane();
        layoutHHauptTLP.getChildren().add(anchorPaneLeft);
        layoutHHauptTLP.getChildren().add(anchorPaneRight);

        anchorPaneLeft.getChildren().add(lTaskLeisteAngemeldetT);
        anchorPaneRight.getChildren().add(layoutHDatumUhrLogo);
        ///AnchorPane.setBottomAnchor(layoutHHauptTLP,0d);
        return borderPaneHauptTLP;
    }
}

//    AnchorPane anchorPane1 = new AnchorPane();
//
//    HBox layoutHHauptTLP = new HBox(100);
//    HBox layoutHUhrDatum = new HBox(10);
//        layoutHUhrDatum.getChildren().addAll(lDatum,lUhrzeit);
//                layoutHHauptTLP.getChildren().addAll(lTaskLeisteAngemeldetT,layoutHUhrDatum,lLogo);////labelDatum,labelUhrzeit);//);//buttonHauptGUIzuruekLogin,lLogo
//
//
//                anchorPane1.getChildren().addAll(layoutHHauptTLP);
//                AnchorPane.setRightAnchor(layoutHHauptTLP,0d);
//                AnchorPane.setBottomAnchor(layoutHHauptTLP,0d);
//
//                return anchorPane1;

//Sicherheit-----------------------------------------------------------------------------------
//public class TaskLeistePane {
//
//    private static String uhrzeitText;
//    //String uhrzeitText = "";
//    private static String datumText;
//
//    //public static Node getPane;
//    public static Pane getPane(){//es mue fucking statig siii
////        final java.util.Timer clockTimer = new java.util.Timer(true);
////        final java.text.SimpleDateFormat zeitFormat = new java.text.SimpleDateFormat("HH:mm:ss");
////        final java.text.SimpleDateFormat datumFormat = new java.text.SimpleDateFormat("dd.MM.yyyy");
////        final Label labelUhrzeit = new Label();
////        final Label labelDatum = new Label();
////        clockTimer.scheduleAtFixedRate(new TimerTask() {
////            @Override
////            public void run() {
////                String uhrzeitText = zeitFormat.format(new Date());
////                String datumText = datumFormat.format(new Date());
////                System.out.println(uhrzeitText);
//////                uhrzeitText = zeitFormat.format(new Date());
//////                datumText = datumFormat.format(new Date());
////                labelUhrzeit.setText(uhrzeitText);
////                labelDatum.setText(datumText);
////            }
////        }, 0, 1000);
//
////        final javafx.scene.control.Label clock = new javafx.scene.control.Label();
////        final DateFormat format = DateFormat.getInstance();
////        final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
////            @Override
////            public void handle(ActionEvent event) {
////                final Calendar cal = Calendar.getInstance();
////                clock.setText(format.format(cal.getTime()));
////            }
////        }));
////        timeline.setCycleCount(Animation.INDEFINITE);
////        timeline.play();
//
//        Label main_clock_lb = new Label();
//        Thread timerThread = new Thread(() -> {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy   HH:mm:ss");
//            while (true) {
//                try {
//                    Thread.sleep(1000); //1 second
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                final String time = simpleDateFormat.format(new Date());
//                Platform.runLater(() -> {
//                    main_clock_lb.setText(time);
//                });
//            }
//        });   timerThread.start();//start the thread and its ok
//
//        HBox hbox = new HBox();
//        Label lTaskLeisteAngemeldetT = new javafx.scene.control.Label("Angemeldet: "+Login.getVorName()+" / " +
//                Login.getNachName());
//        lTaskLeisteAngemeldetT.setTextFill(Color.BLUE);
//        javafx.scene.control.Label lt2 = new Label("Taskleiste- Label");
//
////        Button buttonHauptGUIzuruekLogin = new Button("zuruekLogin");
////        buttonHauptGUIzuruekLogin.setOnAction(e -> {
////
////            stage.setScene(Login.createLoginScene(stage));
////        });
//
////labelLogo = new JLabel(new ImageIcon("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG"));
//        //Image img = new Image("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG");
////
//        //ImageView view = new ImageView(img);
////        view.setFitHeight(80);
////        view.setPreserveRatio(true);
////        Image img = new Image(TaskLeistePane.class.getResourceAsStream("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG"));
////        ImageView view = new ImageView(img);
//        //Label lLogo = new Label();
////        lLogo.setGraphic(new Image("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG"));
////        try {
//        ImageView myImageView = new ImageView("file:///D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG");
//        // Create a label that contains both an image and text.
//        Label lLogo = new Label("", myImageView);
//        //lLogo.setGraphic("", myImageView);
////        }
////catch (Exception ex){
////    System.out.println("äääähmm Bild");
////}
//        //Label lLogo = new Label("", myImageView);
//        //lLogo.setGraphic(view);
//        //lLogo.setGraphic(new ImageView(new Image(TaskLeistePane.class.getResourceAsStream("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG"))));
//
////        lLogo.setGraphic(view);
//
//        hbox.getChildren().addAll(lTaskLeisteAngemeldetT,lt2,main_clock_lb,lLogo);//labelDatum,labelUhrzeit);//);//buttonHauptGUIzuruekLogin,lLogo
//        //Pane pane = new Pane(lt,lt2);//funktioniert
//        Pane pane = new Pane(hbox);
//        //pane.getChildren().add(lt);
//
//        return pane;
//    }
//}




//        Button buttonHauptGUIzuruekLogin = new Button("zuruekLogin");
//        buttonHauptGUIzuruekLogin.setOnAction(e -> {
//
//            stage.setScene(Login.createLoginScene(stage));
//        });

//labelLogo = new JLabel(new ImageIcon("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG"));
//Image img = new Image("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG");
//
//ImageView view = new ImageView(img);
//        view.setFitHeight(80);
//        view.setPreserveRatio(true);
//        Image img = new Image(TaskLeistePane.class.getResourceAsStream("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG"));
//        ImageView view = new ImageView(img);
//Label lLogo = new Label();
//        lLogo.setGraphic(new Image("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG"));

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

//        Label main_clock_lb = new Label();
//        Thread timerThread = new Thread(() -> {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy   HH:mm:ss");
//            while (true) {
//                try {
//                    Thread.sleep(1000); //1 second
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //final String timeStr = simpleDateFormat.format(new Date());
//                setTimeStr(simpleDateFormat.format(new Date()));
//                Platform.runLater(() -> {
//                    main_clock_lb.setText(getTimeStr());
//                });
//            }
//        });   timerThread.start();//start the thread and its ok
//******************************************************************************
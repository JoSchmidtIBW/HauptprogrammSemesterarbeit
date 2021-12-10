package com.example.login;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author - John Schmidt
 * 10.12.2021, 01:09
 */
public class TaskLeiste {
    //final private CardLayout cardManager;
    //final private JPanel cardPanel;
    final private Pane hauptOberflaechenPaneTskleiste;
    String uhrzeitText = "";
    String datumText = "";

    String stringSchriftArtCALIBRI = "Calibri";

//    public TaskLeiste(JPanel cardPanel, CardLayout cardManager) throws IOException {
//        this.cardManager = cardManager;
//        this.cardPanel = cardPanel;
//        initTaskPanel();
//    }

    //final Pane cardsPane = new StackPane();
//    public TaskLeiste(Pane hauptOberflaechenPaneTskleiste, CardLayout cardManager) throws IOException {
//        this.cardManager = cardManager;
//        this.hauptOberflaechenPaneTskleiste = hauptOberflaechenPaneTskleiste;
//        initTaskPane();
//    }
    public TaskLeiste(Pane hauptOberflaechenPaneTskleiste) throws IOException {
        //this.cardManager = cardManager;
        this.hauptOberflaechenPaneTskleiste = hauptOberflaechenPaneTskleiste;
        initTaskPane();
    }

    public void initTaskPane() throws IOException {

        setBorder(BorderFactory.createEtchedBorder());
        //setLayout(new FlowLayout(0, 10, 30));//(0, 10, 30)
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

        final java.util.Timer clockTimer = new java.util.Timer(true);
        final java.text.SimpleDateFormat zeitFormat = new java.text.SimpleDateFormat("HH:mm:ss");
        final java.text.SimpleDateFormat datumFormat = new java.text.SimpleDateFormat("dd.MM.yyyy");
        final JLabel labelUhrzeit = new JLabel();
        final JLabel labelDatum = new JLabel();
        clockTimer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
//                String uhrzeitText = zeitFormat.format(new Date());
//                String datumText = datumFormat.format(new Date());
                uhrzeitText = zeitFormat.format(new Date());
                datumText = datumFormat.format(new Date());
                labelUhrzeit.setText(uhrzeitText);
                labelDatum.setText(datumText);
            }
        }, 0, 1000);

        labelDatum.setBorder(BorderFactory.createEtchedBorder());
        labelDatum.setHorizontalAlignment(JLabel.CENTER);
        labelDatum.setVerticalAlignment(JLabel.CENTER);//.CENTER
        labelDatum.setPreferredSize(new Dimension(100, 30));
        labelDatum.setFont(new Font("Arial", Font.ITALIC, 16));

        labelUhrzeit.setBorder(BorderFactory.createEtchedBorder());
        labelUhrzeit.setHorizontalAlignment(JLabel.CENTER);
        labelUhrzeit.setVerticalAlignment(JLabel.CENTER);
        labelUhrzeit.setPreferredSize(new Dimension(100, 30));
        labelUhrzeit.setFont(new Font("Arial", Font.ITALIC, 16));

        add(labelDatum);
        add(labelUhrzeit);
        //hauptOberflaechenPaneTskleiste.getChildren().add(labelDatum);
        //hauptOberflaechenPaneTskleiste(labelDatum);

        JLabel labelLogo = new JLabel(new ImageIcon("D:/GitDownloadSemesterArbeit/MubeaLogoBild.PNG"));
        labelLogo.setPreferredSize(new Dimension(150, 50));
        add(labelLogo);
}

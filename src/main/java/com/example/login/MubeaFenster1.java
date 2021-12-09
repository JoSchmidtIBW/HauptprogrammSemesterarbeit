package com.example.login;/**
 * @author - John Schmidt
 * 06.12.2021, 23:49
 */

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class MubeaFenster1 extends Application {

    public static void main(String[] args) {
        //launch(args);
        //launch();
        JFrame Fenster1 = new JFrame();
        // Erzeuge ein Fenster-Objekt
        Frame fenster = new Frame();
        // Setze den Titel des Fensters
        fenster.setTitle("Mein erstes AWT-Fenster");
        // Setze die Groesse des Fensters
        fenster.setSize(300,150);
        // Stelle das Fenster dar
        fenster.setVisible(true);
    }

    @Override
    public void start(Stage primaryStage) {

    }




}

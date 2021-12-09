package com.example.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 09.12.2021, 23:13
 */
public class FXDemoMain2222 extends Application {
    public static void main(String[] args) {
    System.out.println("HelloWorld");
    launch();//lauch //anzeigen Fenster
}

        @Override
        public void start(Stage s) throws Exception {
            VBox parent = new VBox();
            VBox parent2 = new VBox();
            //StackPane parent2 = new StackPane();

            //parent.setFill(Color.GREEN);
            //szene erstellen
            Scene scene = new Scene(parent);//muss parent drin sein sonst rot
            scene.setFill(Color.GREEN);

            Label label = new Label("Hallo I Bims a Label");//damit man sieht muss dies dfem Parent hinzugefügt werden
            parent.getChildren().add(label);

            Button button = new Button();
            parent.getChildren().add(button);

            TextField textfield = new TextField("i bin Textfield");
            parent.getChildren().add(textfield);

            Slider slider = new Slider();
            parent.getChildren().add(slider);


            Scene scene2 = new Scene(parent2);//muss parent drin sein sonst rot
            scene.setFill(Color.YELLOW);


            s.setScene(scene);
            s.setScene(scene2);

            s.show();//s = stage = Fenster mit X...
            //dort drin ist die szene, mit note
            //parent gleich mehrere note
        }
}
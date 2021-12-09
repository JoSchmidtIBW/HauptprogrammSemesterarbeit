package com.example.login;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 07.12.2021, 23:01
 */
public class FXDemoMain extends Application{//erbt von import, muss darum automatisch start methode haben
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        launch();//lauch //anzeigen Fenster
    }

    @Override
    public void start(Stage s) throws Exception {
        VBox parent = new VBox();
        //szene erstellen
        Scene scene = new Scene(parent);//muss parent drin sein sonst rot

        Label label = new Label("Hallo I Bims a Label");//damit man sieht muss dies dfem Parent hinzugefügt werden
        parent.getChildren().add(label);

        Button button = new Button();
        parent.getChildren().add(button);

        TextField textfield = new TextField("i bin Textfield");
        parent.getChildren().add(textfield);

        Slider slider = new Slider();
        parent.getChildren().add(slider);

        s.setScene(scene);

        s.show();//s = stage = Fenster mit X...
        //dort drin ist die szene, mit note
        //parent gleich mehrere note
    }
}

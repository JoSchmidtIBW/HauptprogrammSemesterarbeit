package GUI;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 12.12.2021, 17:30
 */
public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Bin die Main- Methode");
        launch();

    }

    @Override
    public void start(Stage primaryStageHauptfenster) throws Exception {
        primaryStageHauptfenster.setTitle("JavaFX GUI - Mubea(Noch keine Namen - Anlagenspezifischer Stör-Meldungs-Absetzer)");
        primaryStageHauptfenster.setScene(Login.createLoginScene(primaryStageHauptfenster));
        //primaryStageHauptfenster.setScene(Login.createLoginScene(new ScrollPane(primaryStageHauptfenster)));
        //primaryStageHauptfenster.setScene(new ScrollPane(Login.createLoginScene(primaryStageHauptfenster)));
        //stage.setScene(new Scene(new ScrollPane(vbox)));//mit scrollpane drin (youtube)
        primaryStageHauptfenster.show();
    }
}

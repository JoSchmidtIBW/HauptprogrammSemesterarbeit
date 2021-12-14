package GUI;

import DatenBank.DatenBank;
import com.example.login.DBMethodenKlasse;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author - John Schmidt
 * 12.12.2021, 17:30
 */
public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Bin die Main- Methode");
//DatenbankTest*********************************************************************************************************

        DatenBank dbk1 = new DatenBank();
//        //String url = "'jdbc:mysql://localhost:3306/mysql";
//        String url1 = "jdbc:mariadb://localhost:3306/databaseliste";//name von "database liste"
//        String user1 = "root";
//        String password1 = "Mubea2020!";

        String einfuegString1 = "INSERT INTO listlaender" +
                "(landgeo, officialname, capitalcity, largestcity, areakm, population, callingcode, iso, waehrung)" +
                "VALUES  ('Malrrrta', 'VWWW', 'Irgend', 'jijin', '81', '8857', '+4dd3', 'AfffffT', 'Eo');";

        //dbk1.schreibeDB(url1,user1,password1, einfuegString1);      //Immer wenn Play, kommt natürlich wieder eine dazu
        dbk1.schreibeDB(einfuegString1);

        String ausgabeGesamtString = "SELECT * FROM listlaender";
        dbk1.ausgebenGesamtDB(ausgabeGesamtString);

        String ausgabeNurEineSpalte = "largestcity";
        //dbk1.ausgabeNurEineSpalteDB(ausgabeNurEineSpalte);


//**********************************************************************************************************************
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

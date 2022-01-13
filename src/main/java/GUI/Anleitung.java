package GUI;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 31.12.2021, 01:23
 */
public class Anleitung {
    Pane cardsPane = new StackPane();

    public Anleitung(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheAnleitung(){

        //final Group cardAnleitung = new Group(new Text(25, 25, "Anleitung blablabla..."));
        final Group cardAnleitung = new Group();

       // Text text1 = new Text(25,99,"Heeeellllooo");


        //   0          1            2                  3             4
        //Deutsch, Italienisch,SerboKroatisch,albanischmazedonisch,Türkisch
        String[] sprachTextNichtUnterhalt =
                {"Wählen Sie Ihre Abteilung aus, und Ihre Anlage.\n Bei Störung, suchen Sie unter der Anlage-Unter-Gruppe " +
                        "die passende Störung aus, \nwählen diese an, und setzen Sie eine Störmeldung ab.\n" +
                        "Bsp. Rattunde hat eine Störung mit der Lichtschranke des Bundladers",
                        "Seleziona il tuo reparto e il tuo stabilimento.\n" +
                                "In caso di malfunzionamento, guardare sotto il sottogruppo del sistema\n" +
                                "selezionare l'errore appropriato, selezionarlo e inviare un messaggio di errore.\n" +
                                "Esempio: Rattunde ha un problema con la barriera fotoelettrica del caricatore di pacchi ",
                        "Изаберите своје одељење и своју биљку.\n" +
                                "У случају квара, погледајте подгрупу система\n" +
                                "изаберите одговарајућу грешку, изаберите је и пошаљите поруку о грешци.\n" +
                                "Пример: Раттунде има проблем са светлосном баријером утоваривача снопова ",
                        "Zgjidhni departamentin tuaj dhe fabrikën tuaj.\n" +
                                "Në rast të një mosfunksionimi, shikoni nën nëngrupin e sistemit\n" +
                                "zgjidhni defektin e duhur, zgjidhni atë dhe dërgoni një mesazh defekti.\n" +
                                "Shembull: Rattunde ka një problem me pengesën e dritës së ngarkuesit të paketave ",
                        "Departmanınızı ve fabrikanızı seçin.\n" +
                                "Arıza durumunda sistem alt grubuna bakın\n" +
                                "uygun arızayı seçin, seçin ve bir arıza mesajı gönderin.\n" +
                                "Örnek: Rattunde, paket yükleyicinin ışık bariyeriyle ilgili bir sorun yaşıyor "};

        Label lAnleitung = new Label(sprachTextNichtUnterhalt[Sprache.getSprachenZahl()]);

        //todo spracheAnleitungUnterhalt

        VBox layoutV = new VBox(1);
        layoutV.getChildren().addAll(lAnleitung);//,text1
        cardAnleitung.getChildren().addAll(layoutV);
        return cardAnleitung;
    }
}

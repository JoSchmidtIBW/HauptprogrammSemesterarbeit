package GUI;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author - John Schmidt
 * 31.12.2021, 01:23
 */
public class Anleitung {
    Pane cardsPane = new StackPane();

    public Anleitung(Pane cardsPane) {
        this.cardsPane = cardsPane;
    }

    public Group macheAnleitung() {

        //final Group cardAnleitung = new Group(new Text(25, 25, "Anleitung blablabla..."));
        final Group cardAnleitung = new Group();


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachTextNichtUnterhalt =
                {"Wählen Sie Ihre Abteilung aus, und Ihre Anlage. \nBei Störung, suchen Sie unter der Anlage-Unter-Gruppe " +
                        "die passende Störung aus, \nwählen diese an, und setzen Sie eine Störmeldung ab.\n" +
                        "Bsp. Rattunde hat eine Störung mit der Lichtschranke des Bundladers. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",
                        "Seleziona il tuo reparto e il tuo stabilimento.\n" +
                                "In caso di malfunzionamento, guardare sotto il sottogruppo del sistema\n" +
                                "selezionare l'errore appropriato, selezionarlo e inviare un messaggio di errore.\n" +
                                "Esempio: Rattunde ha un problema con la barriera fotoelettrica del caricatore di pacchi. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",
                        "Odaberite svoj odjel i svoj objekat. \nU slučaju kvara, potražite odgovarajuću grešku pod sistemskom podgrupom, \nodaberite je i pošaljite poruku o grešci.\n" +
                                "Na primjer, Rattunde ima grešku sa svjetlosnom barijerom utovarivača snopova. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",
                        "Zgjidhni departamentin tuaj dhe objektin tuaj. \nNë rast të një defekti, kërkoni për defektin e duhur nën nëngrupin e sistemit, \nzgjidhni atë dhe dërgoni një mesazh defekti.\n" +
                                "Për shembull, Rattunde ka një defekt me barrierën e dritës së ngarkuesit të paketave. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",
                        "Departmanınızı ve tesisinizi seçin. \nArıza durumunda sistem alt grubu altında uygun arızayı arayın, \nseçin ve arıza mesajı gönderin.\n" +
                                "Örneğin Rattunde, demet yükleyicinin ışık bariyerinde bir arıza var.  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"};


        //   0          1         2         3       4
        //Deutsch, Italienisch,Bosnisch,Albanisch,Türkisch
        String[] sprachTextIstUnterhalt =
                {"Wählen Sie in der Abteilung die Anlage aus, \nauf welcher sich die Störmeldung befindet, welche repariert wurde.\n" +
                        "Wählen Sie diese an, und heben Sie die Störmeldung auf. \n  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",
                        "Nel reparto, seleziona il sistema su cui si trova il messaggio di errore che è stato riparato.\n" +
                                "Seleziona questo e annulla il messaggio di errore. \n \n  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",
                        "U odjeljenju izaberite sistem na kojem se nalazi poruka o grešci koja je popravljena.\n" +
                                "Odaberite ovo i otkažite poruku o grešci.\n \n  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",
                        "Në departament, zgjidhni sistemin në të cilin ndodhet mesazhi i gabimit që u riparua.\n" +
                                "Zgjidhni këtë dhe anuloni mesazhin e gabimit. \n \n  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",
                        "Bölümde, onarılan hata mesajının bulunduğu sistemi seçin.\n" +
                                "Bunu seçin ve hata mesajını iptal edin. \n \n  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"};


        Label lAnleitung = new Label();

        if (Login.getIstUnterhalt().equals("istU")) {
            lAnleitung.setText(sprachTextIstUnterhalt[Sprache.getSprachenZahl()]);
        } else if (Login.getIstUnterhalt().equals("keinU")) {
            lAnleitung.setText(sprachTextNichtUnterhalt[Sprache.getSprachenZahl()]);
        } else if (Login.getIstUnterhalt().equals("Admin")) {
            lAnleitung.setText("Alter, du bisch Admin, du bruchsch kei Aleitig...(chasch nur Dütsch)\n" +
                    "Jedoch, da der Admin Absetzen und Aufheben beides gleichzeitig kann, \nmuss er nach jeglicher Betätigung die Seite neu laden" +
                    "\nman könnte dies jedoch implementieren. \n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }


        VBox layoutV = new VBox(1);
        layoutV.getChildren().addAll(lAnleitung);//,text1

        cardAnleitung.getChildren().addAll(layoutV);
//        cardAnleitung.setScaleX(300d);
//        cardAnleitung.setScaleY(200d);
        return cardAnleitung;
    }
}

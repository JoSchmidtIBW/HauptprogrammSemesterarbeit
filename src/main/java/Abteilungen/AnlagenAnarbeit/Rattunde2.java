package Abteilungen.AnlagenAnarbeit;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 16:23
 */
public class Rattunde2 {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Rattunde2(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRattunde2(){
        final Group cardRattunde2 = new Group(new Text(25, 25, "Rattunde 2 - Wurde noch nicht implementiert"));
        return cardRattunde2;
    }
}

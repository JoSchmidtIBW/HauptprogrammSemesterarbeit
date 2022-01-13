package Abteilungen.AnlagenAnarbeit;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 20:44
 */
public class Rattunde4 {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Rattunde4(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRattunde4(){
        final Group cardRattunde4 = new Group(new Text(25, 25, "Rattunde 4 - Wurde noch nicht implementiert"));
        return cardRattunde4;
    }
}

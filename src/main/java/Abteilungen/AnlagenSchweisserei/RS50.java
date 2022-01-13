package Abteilungen.AnlagenSchweisserei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 21:10
 */
public class RS50 {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public RS50(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRS50(){
        final Group cardRS50 = new Group(new Text(25, 25, "RS50 - Wurde noch nicht implementiert"));
        return cardRS50;
    }
}

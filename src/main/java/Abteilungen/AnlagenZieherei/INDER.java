package Abteilungen.AnlagenZieherei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 20:53
 */
public class INDER {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public INDER(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheInder(){
        final Group cardInder = new Group(new Text(25, 25, "Inder"));
        return cardInder;
    }
}

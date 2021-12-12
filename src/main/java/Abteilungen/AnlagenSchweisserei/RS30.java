package Abteilungen.AnlagenSchweisserei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 21:11
 */
public class RS30 {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public RS30(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRS30(){
        final Group cardRS30 = new Group(new Text(25, 25, "RS30 a"));
        return cardRS30;
    }
}

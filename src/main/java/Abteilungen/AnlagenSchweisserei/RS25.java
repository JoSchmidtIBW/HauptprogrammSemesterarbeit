package Abteilungen.AnlagenSchweisserei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 21:11
 */
public class RS25 {
    Pane cardsPane = new StackPane();

    public RS25(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRS25(){
        final Group cardRS25 = new Group(new Text(25, 25, "RS25 - Wurde noch nicht implementiert"));
        return cardRS25;
    }
}

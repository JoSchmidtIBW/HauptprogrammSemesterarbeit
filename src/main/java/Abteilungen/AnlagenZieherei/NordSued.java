package Abteilungen.AnlagenZieherei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 20:54
 */
public class NordSued {
    Pane cardsPane = new StackPane();

    public NordSued(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheNordSued(){
        final Group cardNordSued = new Group(new Text(25, 25, "NordSued - Wurde noch nicht implementiert"));
        return cardNordSued;
    }
}

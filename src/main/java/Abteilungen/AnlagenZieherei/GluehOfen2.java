package Abteilungen.AnlagenZieherei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 21:12
 */
public class GluehOfen2 {
    Pane cardsPane = new StackPane();

    public GluehOfen2(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheGluehOfen2(){
        final Group cardGluehOfen2 = new Group(new Text(25, 25, "GluehOfen2 - Wurde noch nicht implementiert"));
        return cardGluehOfen2;
    }
}

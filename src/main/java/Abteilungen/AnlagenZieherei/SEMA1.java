package Abteilungen.AnlagenZieherei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 21:11
 */
public class SEMA1 {
    Pane cardsPane = new StackPane();

    public SEMA1(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheSema1(){
        final Group cardSema1 = new Group(new Text(25, 25, "Sema1 - Wurde noch nicht implementiert"));
        return cardSema1;
    }
}

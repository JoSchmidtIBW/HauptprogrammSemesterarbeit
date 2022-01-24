package Abteilungen.AnlagenSchweisserei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 21:11
 */
public class SpaltAnlage {
    Pane cardsPane = new StackPane();

    public SpaltAnlage(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheSpaltAnlage(){
        final Group cardSpaltAnlage = new Group(new Text(25, 25, "SpaltAnlage - Wurde noch nicht implementiert"));
        return cardSpaltAnlage;
    }
}

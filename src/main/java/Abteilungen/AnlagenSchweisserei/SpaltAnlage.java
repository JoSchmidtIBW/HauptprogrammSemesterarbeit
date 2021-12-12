package Abteilungen.AnlagenSchweisserei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 21:11
 */
public class SpaltAnlage {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public SpaltAnlage(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheSpaltAnlage(){
        final Group cardSpaltAnlage = new Group(new Text(25, 25, "SpaltAnlage a"));
        return cardSpaltAnlage;
    }
}

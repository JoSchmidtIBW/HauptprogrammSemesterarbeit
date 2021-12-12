package Abteilungen.AnlagenZieherei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 21:11
 */
public class SEMA2 {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public SEMA2(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheSema2(){
        final Group cardSema2 = new Group(new Text(25, 25, "Sema2 a"));
        return cardSema2;
    }
}

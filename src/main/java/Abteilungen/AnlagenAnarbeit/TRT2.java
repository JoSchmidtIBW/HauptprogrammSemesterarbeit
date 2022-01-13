package Abteilungen.AnlagenAnarbeit;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 20:45
 */
public class TRT2 {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public TRT2(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheTRT2(){
        final Group cardTRT2 = new Group(new Text(25, 25, "TRT2 - Wurde noch nicht implementiert"));
        return cardTRT2;
    }
}

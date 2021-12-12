package Abteilungen.AnlagenAnarbeit;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 15:33
 */
public class Rattunde1 {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Rattunde1(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRattunde1(){
        final Group cardRattunde1 = new Group(new Text(25, 25, "Rattunde 1 blabvlabla"));
        return cardRattunde1;
    }
}

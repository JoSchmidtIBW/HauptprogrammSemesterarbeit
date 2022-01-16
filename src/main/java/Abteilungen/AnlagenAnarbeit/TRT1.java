package Abteilungen.AnlagenAnarbeit;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 20:45
 */
public class TRT1 {
    Pane cardsPane = new StackPane();

    public TRT1(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheTRT1(){
        final Group cardTRT1 = new Group(new Text(25, 25, "TRT1 - Wurde noch nicht implementiert"));
        return cardTRT1;
    }
}

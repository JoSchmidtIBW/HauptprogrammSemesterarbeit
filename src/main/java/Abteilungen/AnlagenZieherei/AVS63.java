package Abteilungen.AnlagenZieherei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 20:46
 */
public class AVS63 {
    Pane cardsPane = new StackPane();

    public AVS63(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheAVS63(){
        final Group cardAVS63 = new Group(new Text(25, 25, "AVS63 - Wurde noch nicht implementiert"));
        return cardAVS63;
    }
}

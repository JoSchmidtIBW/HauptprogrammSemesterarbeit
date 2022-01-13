package Abteilungen.AnlagenZieherei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 20:53
 */
public class ASMAG {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public ASMAG(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheAsmag(){
        final Group cardAsmag = new Group(new Text(25, 25, "ASMAG - Wurde noch nicht implementiert"));
        return cardAsmag;
    }
}

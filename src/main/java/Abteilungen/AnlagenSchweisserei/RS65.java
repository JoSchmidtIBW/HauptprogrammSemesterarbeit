package Abteilungen.AnlagenSchweisserei;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 30.12.2021, 21:10
 */
public class RS65 {
    Pane cardsPane = new StackPane();

    public RS65(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRS65(){
        final Group cardRS65 = new Group(new Text(25, 25, "RS65 - Wurde noch nicht implementiert"));
        return cardRS65;
    }
}

import GUI.Login;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author - John Schmidt
 * 09.01.2022, 17:46
 */
public class KlasseTest {
    @Test
    void returnsFalseIf_String_Login_Eingabe_MA_Nummer_HasSomethingElseAsNumbers() {

        Assertions.assertEquals("leer",Login.ueberpruefungEingabeMANummerLogin(""));
        Assertions.assertEquals("ist richtig",Login.ueberpruefungEingabeMANummerLogin("555"));
        Assertions.assertEquals("Enthält keine Zahl",Login.ueberpruefungEingabeMANummerLogin("5x55"));

    }
}

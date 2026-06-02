package fr.epsi;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommandeServiceTest {

    @Test
    public void testRemise() {
        CommandeService cs = new CommandeService();
        double resultat = cs.appliquerRemise(100, 10);
        assertEquals(90.0, resultat, 0.001);
    }
}

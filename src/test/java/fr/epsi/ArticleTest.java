package fr.epsi;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArticleTest {

    @Test
    public void testArticle() {
        Article a = new Article("Livre", 10.0);
        assertEquals("Livre", a.getNom());
        assertEquals(10.0, a.getPrix(), 0.001);
    }
}

package fr.epsi;

import org.junit.Test;
import static org.junit.Assert.*;

public class PanierTest {

    @Test
    public void testAjouterArticle() {
        Panier p = new Panier();
        p.ajouterArticle(new Article("Stylo", 2.0));
        assertEquals(1, p.getNombreArticles());
    }

    @Test
    public void testTotal() {
        Panier p = new Panier();
        p.ajouterArticle(new Article("Stylo", 2.0));
        p.ajouterArticle(new Article("Cahier", 3.0));
        assertEquals(5.0, p.getTotal(), 0.001);
    }
}

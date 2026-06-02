package fr.epsi;

import java.util.ArrayList;
import java.util.List;

public class Panier {

    private List<Article> articles = new ArrayList<>();

    public void ajouterArticle(Article article) {
        articles.add(article);
    }

    public int getNombreArticles() {
        return articles.size();
    }

    public double getTotal() {
        return articles.stream()
                .mapToDouble(Article::getPrix)
                .sum();
    }
}

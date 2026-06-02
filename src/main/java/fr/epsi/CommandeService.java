package fr.epsi;

public class CommandeService {

    public double appliquerRemise(double montant, double remisePourcent) {
        if (remisePourcent < 0 || remisePourcent > 100) {
            throw new IllegalArgumentException("Remise invalide");
        }
        return montant - (montant * remisePourcent / 100);
    }
}

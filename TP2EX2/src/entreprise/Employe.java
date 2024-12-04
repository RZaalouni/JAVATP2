package entreprise;

public abstract class Employe {
    private final String nom;

    // Constructeurs
    public Employe(String nom) {
        this.nom = nom;
    }

    // Méthodes
    public String getNom() {
        return nom;
    }

    public abstract double getSalaire();
}

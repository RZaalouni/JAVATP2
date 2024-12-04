public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    // Constructeur
    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    // Méthode pour calculer les intérêts
    public void calculInteret() {
        this.solde += this.solde * (tauxInteret / 100);
    }
}

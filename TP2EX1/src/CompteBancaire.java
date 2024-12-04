public class CompteBancaire {
    private static int compteur = 0;
    private int code;
    protected double solde;

    // Constructeurs
    public CompteBancaire() {
        this.code = ++compteur;
        this.solde = 0.0;
    }

    public CompteBancaire(double soldeInitial) {
        this.code = ++compteur;
        this.solde = soldeInitial;
    }

    // Méthode pour déposer de l'argent
    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
        }
    }

    // Méthode pour retirer de l'argent
    public void retirer(double montant) {
        if (montant > 0 && this.solde >= montant) {
            this.solde -= montant;
        }
    }

    // Méthode pour consulter le solde
    @Override
    public String toString() {
        return "CompteBancaire{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}

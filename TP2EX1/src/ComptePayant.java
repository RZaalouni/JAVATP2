public class ComptePayant extends CompteBancaire {
    private static final double FRAIS = 5.0;

    // Constructeur
    public ComptePayant(double soldeInitial) {
        super(soldeInitial);
    }

    // Redéfinir la méthode deposer
    @Override
    public void deposer(double montant) {
        if (montant > FRAIS) {
            super.deposer(montant - FRAIS);
        }
    }

    // Redéfinir la méthode retirer
    @Override
    public void retirer(double montant) {
        if (montant + FRAIS <= this.solde) {
            super.retirer(montant + FRAIS);
        }
    }
}

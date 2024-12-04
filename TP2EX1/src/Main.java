public class Main {
    public static void main(String[] args) {
        // Création des comptes
        CompteBancaire compte1 = new CompteBancaire(1000);
        CompteEpargne compte2 = new CompteEpargne(2000, 4);
        ComptePayant compte3 = new ComptePayant(1500);

        // Dépôts
        compte1.deposer(500);
        compte2.deposer(500);
        compte3.deposer(500);

        // Retraits
        compte1.retirer(300);
        compte2.retirer(300);
        compte3.retirer(300);

        // Calcul des intérêts pour le compte épargne
        compte2.calculInteret();

        // Affichage des soldes
        System.out.println(compte1.toString());
        System.out.println(compte2.toString());
        System.out.println(compte3.toString());
    }
}

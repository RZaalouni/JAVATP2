package entreprise;

public class Paie {
    public static void main(String[] args) {
        // Création d'employés
        Employe[] employes = new Employe[5];
        employes[0] = new EmployeHoraire("Ali", 10, 45); // 45 heures travaillées, 10 DT/h
        employes[1] = new EmployeHoraire50("Sara", 12, 50); // 50 heures travaillées, 12 DT/h
        employes[2] = new Commercial("Rami", 500, 10000); // Salaire fixe : 500, CA : 10000
        employes[3] = new Commercial("Maha"); // Salaire à définir
        employes[4] = new Commercial("Hedi", 600, 15000); // Salaire fixe : 600, CA : 15000

        // Utilisation de setInfosSalaire pour Maha
        ((Commercial) employes[3]).setInfosSalaire(400, 8000);

        // Affichage des salaires
        for (Employe employe : employes) {
            System.out.println(employe.getNom() + " gagne " + employe.getSalaire() + " DT");
        }
    }
}

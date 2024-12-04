package entreprise;

public class EmployeHoraire extends Employe {
    private double tarifHoraire;
    private int heuresTravaillees;

    // Constructeurs
    public EmployeHoraire(String nom) {
        super(nom);
    }

    public double getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(double tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public int getHeuresTravaillees() {
        return heuresTravaillees;
    }

    public void setHeuresTravaillees(int heuresTravaillees) {
        this.heuresTravaillees = heuresTravaillees;
    }

    public EmployeHoraire(String nom, double tarifHoraire, int heuresTravaillees) {
        super(nom);
        this.tarifHoraire = tarifHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    // Modificateur d'informations sur le salaire
    public void setInfosSalaire(double tarifHoraire, int heuresTravaillees) {
        this.tarifHoraire = tarifHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    @Override
    public double getSalaire() {
        int heuresNormales = Math.min(40, heuresTravaillees);
        int heuresSup = Math.max(0, heuresTravaillees - 40);
        return (heuresNormales * tarifHoraire) + (heuresSup * tarifHoraire * 1.3);
    }
}

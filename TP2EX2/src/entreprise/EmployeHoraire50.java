package entreprise;

public class EmployeHoraire50 extends EmployeHoraire {

    // Constructeurs
    public EmployeHoraire50(String nom) {
        super(nom);
    }

    public EmployeHoraire50(String nom, double tarifHoraire, int heuresTravaillees) {
        super(nom, tarifHoraire, heuresTravaillees);
    }

    @Override
    public double getSalaire() {
        int heuresNormales = Math.min(40, super.getHeuresTravaillees());
        int heuresSup = Math.max(0, super.getHeuresTravaillees() - 40);
        return (heuresNormales * super.getTarifHoraire()) + (heuresSup * super.getTarifHoraire() * 1.5);
    }
}

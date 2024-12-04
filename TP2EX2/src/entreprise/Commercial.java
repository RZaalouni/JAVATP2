package entreprise;

public class Commercial extends Employe {
    private double salaireFixe;
    private double chiffreAffaire;

    // Constructeurs
    public Commercial(String nom) {
        super(nom);
    }

    public Commercial(String nom, double salaireFixe, double chiffreAffaire) {
        super(nom);
        this.salaireFixe = salaireFixe;
        this.chiffreAffaire = chiffreAffaire;
    }

    // Modificateur d'informations sur le salaire
    public void setInfosSalaire(double salaireFixe, double chiffreAffaire) {
        this.salaireFixe = salaireFixe;
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double getSalaire() {
        return salaireFixe + (chiffreAffaire * 0.01);
    }
}

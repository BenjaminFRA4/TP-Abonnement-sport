package sallesport;

import java.time.LocalDate;

public class AbonnementEtudiant extends Abonnement {
    private final double reductionPourcent;

    public AbonnementEtudiant(String reference, LocalDate dateDebut, int dureeMois, double prixMensuel, double reductionPourcent) {
        super(reference, dateDebut, dureeMois, prixMensuel);
        this.reductionPourcent = reductionPourcent;
    }

    @Override
    public boolean permetAccesSauna() {
        return false;
    }

    @Override
    public int creditsCoachInclus() {
        return 0;
    }

    @Override
    public double coutTotal() {
        double base = super.coutTotal();
        return base * (1 - (reductionPourcent / 100.0));
    }
}

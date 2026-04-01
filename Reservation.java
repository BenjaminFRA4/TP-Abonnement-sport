package sallesport;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private final Seance seance;
    private final List<Prestation> prestations;
    private StatutReservation statut;

    public Reservation(Seance seance) {
        this.seance = seance;
        this.prestations = new ArrayList<>();
        this.statut = StatutReservation.CONFIRMEE;
    }

    public Seance getSeance() {
        return seance;
    }

    public StatutReservation getStatut() {
        return statut;
    }

    public void ajouterPrestation(Prestation p) {
        prestations.add(p);
    }

    public double coutPrestations() {
        double total = 0.0;
        for (Prestation prestation : prestations) {
            total += prestation.getPrix();
        }
        return total;
    }

    public void annuler() {
        this.statut = StatutReservation.ANNULEE;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "seance=" + seance +
                ", prestations=" + prestations +
                ", statut=" + statut +
                '}';
    }
}

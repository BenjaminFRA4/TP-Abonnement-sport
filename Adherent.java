package sallesport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Adherent {
    private final int id;
    private final String nom;
    private final Abonnement abonnement;
    private final List<Reservation> reservations;

    public Adherent(int id, String nom, Abonnement abonnement) {
        this.id = id;
        this.nom = nom;
        this.abonnement = abonnement;
        this.reservations = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public Reservation reserver(Seance s) {
        Reservation reservation = new Reservation(s);
        reservations.add(reservation);
        return reservation;
    }

    public double depensesTotales() {
        double total = 0.0;
        for (Reservation reservation : reservations) {
            if (reservation.getStatut() == StatutReservation.CONFIRMEE) {
                total += reservation.coutPrestations();
            }
        }
        return total;
    }

    public List<Reservation> reservationsFutures() {
        List<Reservation> result = new ArrayList<>();
        LocalDateTime maintenant = LocalDateTime.now();

        for (Reservation reservation : reservations) {
            if (reservation.getStatut() == StatutReservation.CONFIRMEE
                    && reservation.getSeance().getDateHeure().isAfter(maintenant)) {
                result.add(reservation);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", abonnement=" + abonnement +
                ", nbReservations=" + reservations.size() +
                '}';
    }
}

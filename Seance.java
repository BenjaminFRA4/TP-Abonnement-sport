package sallesport;

import java.time.LocalDateTime;

public class Seance {
    private final int id;
    private final String nom;
    private final LocalDateTime dateHeure;
    private final int capaciteMax;

    public Seance(int id, String nom, LocalDateTime dateHeure, int capaciteMax) {
        this.id = id;
        this.nom = nom;
        this.dateHeure = dateHeure;
        this.capaciteMax = capaciteMax;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateHeure=" + dateHeure +
                ", capaciteMax=" + capaciteMax +
                '}';
    }
}

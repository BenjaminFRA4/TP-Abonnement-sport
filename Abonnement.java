package sallesport;

import java.time.LocalDate;

public abstract class Abonnement {
    private final String reference;
    private final LocalDate dateDebut;
    private final int dureeMois;
    private final double prixMensuel;

    public Abonnement(String reference, LocalDate dateDebut, int dureeMois, double prixMensuel) {
        this.reference = reference;
        this.dateDebut = dateDebut;
        this.dureeMois = dureeMois;
        this.prixMensuel = prixMensuel;
    }

    public String getReference() {
        return reference;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public int getDureeMois() {
        return dureeMois;
    }

    public double getPrixMensuel() {
        return prixMensuel;
    }

    public LocalDate dateFin() {
        return dateDebut.plusMonths(dureeMois);
    }

    public double coutTotal() {
        return prixMensuel * dureeMois;
    }

    public abstract boolean permetAccesSauna();

    public abstract int creditsCoachInclus();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "reference='" + reference + '\'' +
                ", dateDebut=" + dateDebut +
                ", dureeMois=" + dureeMois +
                ", prixMensuel=" + prixMensuel +
                ", dateFin=" + dateFin() +
                ", coutTotal=" + coutTotal() +
                ", accesSauna=" + permetAccesSauna() +
                ", creditsCoachInclus=" + creditsCoachInclus() +
                '}';
    }
}

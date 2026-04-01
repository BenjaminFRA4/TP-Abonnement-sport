package sallesport;

import java.util.ArrayList;
import java.util.List;

public class SalleDeSport {
    private final List<Adherent> adherents;
    private final List<Seance> seances;

    public SalleDeSport() {
        this.adherents = new ArrayList<>();
        this.seances = new ArrayList<>();
    }

    public void ajouterAdherent(Adherent a) {
        adherents.add(a);
    }

    public void ajouterSeance(Seance s) {
        seances.add(s);
    }

    public List<Seance> seancesDisponibles() {
        return seances;
    }

    public List<Adherent> adherentsAvecSauna() {
        List<Adherent> result = new ArrayList<>();
        for (Adherent adherent : adherents) {
            if (adherent.getAbonnement().permetAccesSauna()) {
                result.add(adherent);
            }
        }
        return result;
    }

    public double chiffreAffairesPrestations() {
        double total = 0.0;
        for (Adherent adherent : adherents) {
            total += adherent.depensesTotales();
        }
        return total;
    }

    public Adherent trouverAdherent(int id) {
        for (Adherent adherent : adherents) {
            if (adherent.getId() == id) {
                return adherent;
            }
        }
        throw new IllegalArgumentException("Aucun adherent trouve avec l'id: " + id);
    }
}

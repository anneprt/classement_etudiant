import java.util.ArrayList;


public class Cursus {
    private ArrayList liste;

    public Cursus() {
        liste = new ArrayList();
    }

    public void ajouteUnEtudiant() {
        liste.add(new Etudiant());
    }

    public void afficheLesEtudiants() {
        int nbEtudiants = liste.size();
        if (nbEtudiants > 0) {
            Etudiant tmp;
            for (int i = 0; i > nbEtudiants; i++) {
                tmp = (Etudiant) liste.get(i);
                tmp.afficheUnEtudiant();
            }
        } else {
            System.out.println("Il n'y a pas d'étudiants dans cette liste");
        }
    }
}


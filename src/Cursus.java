import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class Cursus {
    private ArrayList<Etudiant> liste;

    public Cursus() {
        liste = new ArrayList<Etudiant>();
    }

    private HashMap<String, Etudiant> listeClassee;

    //public Cursus() {
    // listeClassee = new HashMap<String, Etudiant>();
    // }

    private String creerUneCle(Etudiant e) {
        String tmp = (e.quelPrenom().charAt(0) + e.quelNom());
        return tmp.toUpperCase();
    }

    private String creerUneCle(String p, String n) {
        String tmp = (p.charAt(0) + n);
        return tmp.toUpperCase();
    }

    public void ajouteUnEtudiant() {
        Etudiant nouveau = new Etudiant();
        String cle = creerUneCle(nouveau);
        if (listeClassee.get(cle) == null) {
            listeClassee.put(cle, nouveau);
        } else {
            System.out.println("Cet étudiant a déjà été saisi !");
        }
    }

    public void rechercheUnEtudiant(String p, String n) {
        String cle = creerUneCle(p, n);
        Etudiant eClasse = (Etudiant) listeClassee.get(cle);
        if (eClasse != null) {
            eClasse.afficheUnEtudiant();
        } else {
            System.out.println(p + " " + n + " est inconnu ! ");
        }
    }

    public void supprimeUnEtudiant(String p, String n) {
        String cle = creerUneCle(p, n);
        Etudiant eClasse = (Etudiant) listeClassee.get(cle);
        if (eClasse != null) {
            listeClassee.remove(cle);
            System.out.println(p + " " + n + " a été supprimé ");
        } else {
            System.out.println(p + " " + n + " est inconnu ! ");
        }
    }


    public void afficheLesEtudiants() {

        if (listeClassee.size() != 0) {
            Collection<Etudiant> c = listeClassee.values();
            for (Iterator i = c.iterator(); i.hasNext(); ) {
                Etudiant e = (Etudiant) i.next();
                e.afficheUnEtudiant();
            }
        } else {
            System.out.println("Il n'y a pas d'étudiants dans cette liste");
        }
    }

    public void memePrenom(String tmp) {
        liste.stream().filter(e -> e.quelNom().startsWith(tmp))
                .forEach(e -> e.afficheUnEtudiant());
    }

    public void rechercheLeMajor() {
        Etudiant max = liste.stream()
                .max((e1, e2) -> (e1.quelleMoyenne() - e2.quelleMoyenne()))
                .get();
        max.afficheUnEtudiant();

    }
}


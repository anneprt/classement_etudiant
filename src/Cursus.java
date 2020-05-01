import java.util.Scanner;

public class Cursus {
    private Etudiant[] liste;

    public void Classe() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Nombre d'étudiants");
        int nbEtudiants = lectureClavier.nextInt();
        liste = new Etudiant[nbEtudiants];
        for (int i = 0; i < liste.length; i++) {
            liste[i] = new Etudiant();
        }
    }

    public void afficheLesEtudiants() {
        for (Etudiant e : liste) {
            e.afficheUnEtudiant();
        }
    }

    private int ouEstLePlusPetit(int debut) {
        int i = debut;
        for (int j = debut + 1; j < liste.length; j++)
            if (liste[j].quelleMoyenne() < liste[i].quelleMoyenne()) {
                i = j;
            }
        return i;
    }

    public void classerParMoyenne() {
        int indiceDuPlusPetit;
        Etudiant tmp;
        for (int i = 0; i < liste.length; i++) {
            indiceDuPlusPetit = ouEstLePlusPetit(i);
            tmp = liste[i];
            liste[i] = liste[indiceDuPlusPetit];
            liste[indiceDuPlusPetit] = tmp;
        }
    }
}


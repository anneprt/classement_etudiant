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
}


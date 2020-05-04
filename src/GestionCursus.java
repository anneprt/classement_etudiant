import java.util.Scanner;

public class GestionCursus {
    public static void main(String[] args) {
        byte choix;
        Scanner lectureClavier = new Scanner(System.in);
        Cursus C = new Cursus();
        FichierEtudiant F = new FichierEtudiant();
        if (F.ouvrir("Lecture")) {
            C = F.lire();
            F.fermer();
        }
        String prenom;
        String nom;
        do {
            System.out.println("1. Ajoute un étudiant");
            System.out.println("2. Supprime un étudiant");
            System.out.println("3. Affiche la liste des étudiants");
            System.out.println("4. Affiche un étudiant");
            System.out.println("5. Sortir");
            System.out.println();
            System.out.print("Votre choix : ");
            choix = lectureClavier.nextByte();
            switch (choix) {
                case 1:
                    C.ajouteUnEtudiant();
                    break;
                case 2:
                    System.out.print("Entrer le prénom de l'étudiant à supprimer : ");
                    prenom = lectureClavier.next();
                    System.out.print("Entrer le nom de l'étudiant à supprimer : ");
                    nom = lectureClavier.next();
                    C.supprimeUnEtudiant(prenom, nom);
                    break;
                case 3:
                    System.out.print("Nom de l'étudiant recherche : ");
                    nom = lectureClavier.next();
                    C.memePrenom(nom);
                    C.afficheLesEtudiants();
                    break;
                case 4:
                    System.out.print("Entrer le prénom de l'étudiant : ");
                    prenom = lectureClavier.next();
                    System.out.print("Entrer le nom de l'étudiant : ");
                    nom = lectureClavier.next();
                    C.rechercheUnEtudiant(prenom, nom);
                    C.rechercheLeMajor();
                    break;
                case 5:
                    System.out.println("Sauvegarde des données dans Cursus.dat");
                    F.ouvrir("Ecriture");
                    F.ecrire(C);
                    F.fermer();
                    System.exit(0);
                default:
                    System.out.println("Cette option n'existe pas");
            }
        }
        while (choix != 5);
    }
}

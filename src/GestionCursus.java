import java.util.Scanner;

public class GestionCursus {
    public static void main(String[] args) {
        byte choix;
        Scanner lectureClavier = new Scanner(System.in);
        Cursus C = new Cursus();
        do {
            System.out.println("1. Ajoute un etudiant");
            System.out.println("2. Affiche la liste des etudiants");
            System.out.println("3. Pour sortir");
            System.out.print("Votre choix : ");
            choix = lectureClavier.nextByte();
            switch (choix) {
                case 1:
                    C.ajouteUnEtudiant();
                    break;
                case 2:
                    C.afficheLesEtudiants();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Cette option n'existe pas");
            }
        }
        while (choix != 3);
    }
}

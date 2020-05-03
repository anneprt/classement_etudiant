import java.util.Scanner;

public class Etudiant {
    private String nom;
    private String prenom;
    private double[] notes;
    private double moyenne;

    public Etudiant() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrer le nom de l'étudiant : ");
        nom = lectureClavier.next();
        System.out.print("Entrer le prenom de l'étudiant : ");
        prenom = lectureClavier.next();
        System.out.print("Combien de notes pour l'étudiant  ");
        System.out.print(prenom + " " + nom + " :  ");
        int nombre = lectureClavier.nextInt();
        notes = new double[nombre];
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrer la note numéro " + (i + 1) + " :  ");
            notes[i] = lectureClavier.nextDouble();
        }
        moyenne = calculMoyenne();
    }

    private double calculMoyenne() {
        double somme = 0.0;
        for (double valeurNote : notes) {
            somme = somme + valeurNote;
        }
        return somme / notes.length;
    }

    public void afficheUnEtudiant() {
        System.out.print("Les notes  de " + prenom + " " + nom + " sont : ");
        for (double valeurNote : notes) {
            System.out.print(" " + valeurNote);
            System.out.println();
            System.out.println("Sa moyenne est " + moyenne);
        }
    }

    public double quelleMoyenne() {
        return moyenne;
    }

    public String quelNom() {
        return nom;
    }

    public String quelPrenom() {
        return prenom;
    }
}


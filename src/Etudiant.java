import java.util.ArrayList;
import java.util.Scanner;

public class Etudiant {
    private String nom;
    private String prenom;
    private ArrayList<Double> notes;
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
        notes = new ArrayList<Double>();
        for (int i = 0; i < nombre; i++) {
            System.out.print("Entrer la note numéro " + (i + 1) + " :  ");
            notes.add(new Double(lectureClavier.nextDouble()));
        }
        moyenne = calculMoyenne();
    }

    private double calculMoyenne() {
        double somme = 0.0;
        int nbNotes = notes.size();
        for (double valeurNote : notes) {
            somme = somme + valeurNote;
        }
        return somme / nbNotes;
    }

    public double quelleMoyenne() {
        return moyenne;
    }

    public void afficheUnEtudiant() {
        System.out.print("Les notes  de " + prenom + " " + nom + " sont : ");
        int nbNotes = notes.size();
        for (double valeurNote : notes) {
            System.out.print(" " + valeurNote);
            System.out.println();
            System.out.println("Sa moyenne est " + moyenne);
        }
    }


    public String quelNom() {
        return nom;
    }

    public String quelPrenom() {
        return prenom;
    }
}


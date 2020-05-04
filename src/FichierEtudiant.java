import java.io.*;

public class FichierEtudiant {
    private ObjectOutputStream ofW;
    private ObjectInputStream ofR;
    private String nomDuFichier = "Cursus.dat";
    private char mode;

    public boolean ouvrir(String s) {
        try {
            mode = (s.toUpperCase()).charAt(0);
            if (mode == 'R' || mode == 'L')
                ofR = new ObjectInputStream(new FileInputStream(nomDuFichier));
            else if (mode == 'W' || mode == 'E')
                ofW = new ObjectOutputStream(new FileOutputStream(nomDuFichier));
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void ecrire(Cursus tmp) throws IOException {

        if (tmp != null) {
            ofW.writeObject(tmp);
        }
    }

    public Cursus lire() {
        try {
            Cursus tmp = (Cursus) ofR.readObject();
            return tmp;
        } catch (IOException e) {
            System.out.println(nomDuFichier + ":Erreur de lecture");
        } catch (ClassNotFoundException e) {
            System.out.println(nomDuFichier + "n'est pas du bon format");
        }
        return null;
    }

    public void fermer() throws IOException {
        if (mode == 'R' || mode == 'L') {
            ofR.close();
        } else {
            if (mode == 'W' || mode == 'E') {
                ofW.close();
            }
        }
    }


}

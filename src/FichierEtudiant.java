import java.io.*;

public class FichierEtudiant {
    private ObjectOutputStream ofW;
    private ObjectInputStream ofR;
    private String nomDuFichier = "Cursus.dat";
    private char mode;

    public void ouvrir(String s) throws IOException {
        mode = (s.toUpperCase()).charAt(0);
        if (mode == 'R' || mode == 'L') {
            ofR = new ObjectInputStream(new FileInputStream(nomDuFichier));
        } else {
            if (mode == 'W' || mode == 'E') {
                ofW = new ObjectOutputStream(new FileOutputStream(nomDuFichier));
            }
        }
    }

    public void ecrire(Cursus tmp) throws IOException {

        if (tmp != null) {
            ofW.writeObject(tmp);
        }
    }

    public Cursus lire() throws IOException, ClassNotFoundException {
        Cursus tmp = (Cursus) ofR.readObject();
        return tmp;
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

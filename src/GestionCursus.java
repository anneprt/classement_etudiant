public class GestionCursus {
    public static void main(String[] args) {
        Cursus C = new Cursus();
        System.out.println("------------  Récapitulatif  --------------");
        C.afficheLesEtudiants();
        C.classerParMoyenne();
        System.out.println("--------------  Classement  ---------------");
        C.afficheLesEtudiants();
    }
}

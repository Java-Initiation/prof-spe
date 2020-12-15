public class Main {

    public static void main(String[] args) {

        Specialite maths = new Specialite("M", "maths");
        Specialite francais = new Specialite("F", "francais");
        Specialite histoire = new Specialite("H", "histoire");
        Specialite svt = new Specialite("S", "svt");

        Professeur prof1 = new Professeur("Dupond", "Jean", "04534", "frdf@gmail.com");
        Professeur prof2 = new Professeur("Legrand", "Stephanie", "5656", "rjfdl@gmail.com");

        prof1.ajouterSpecialite(maths);
        prof1.ajouterSpecialite(francais);
        prof1.ajouterSpecialite(histoire);


        prof2.ajouterSpecialite(svt);
        prof2.ajouterSpecialite(francais);
        prof2.ajouterSpecialite(histoire);

        // Le résultat est le même car on ne copie pas l'objet histoire,
        // on renvoi vers son adresse mémoire
        histoire.setLibelle("geographie");
        prof1.getSpecialites().get(2).setLibelle("geographie");
        prof2.getSpecialites().get(2).setLibelle("geographie");

        System.out.println("Prof 1");
        prof1.voirSpecialites();

        System.out.println("Prof 2");
        prof2.voirSpecialites();

    }

}

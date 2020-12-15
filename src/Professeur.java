import java.util.ArrayList;

public class Professeur {

    private static int ct;
    private int id;
    private String nom, prenom, telephone, email;
    private ArrayList<Specialite> specialites = new ArrayList<>();

    public Professeur(String nom, String prenom, String telephone, String email) {
        this.id = ct++;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }

    public void ajouterSpecialite(Specialite specialite){
        this.specialites.add(specialite);
    }

    public void voirSpecialites(){
        for (Specialite specialite: specialites) {
            System.out.println(specialite);
        }
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Specialite> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(ArrayList<Specialite> specialites) {
        this.specialites = specialites;
    }


}

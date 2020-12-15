public class Specialite {

    private static int ct;
    private int id;
    private String code, libelle;

    public Specialite(String code, String libelle) {
        this.id = ct++;
        this.code = code;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Specialite{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }

}

package Documents;

public abstract class Document {
    protected int id;
    protected String titre;
    protected String auteur;
    protected boolean emprunte;

    public Document(int id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = false;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean estEmprunte() {
        return emprunte;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String setTitre(String titre) {
        return this.titre = titre;
    }

    public String setAuteur(String auteur) {
        return this.auteur = auteur;
    }

    public void emprunter() {
        if(!emprunte) {
            emprunte = true;
        } else {
            System.out.println("Le document est déjà emprunté.");
        }
    }

    public void retourner() {
        if(emprunte) {
            emprunte = false;
        } else {
            System.out.println("Le document n'est pas emprunté.");
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Titre: %s, Auteur: %s, Emprunté: %b", id, titre, auteur, emprunte);
    }
}

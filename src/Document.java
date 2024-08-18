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

    public void emprunter() {
        if(!emprunte) {
            emprunte = true;
        } else {
            System.out.println("Le document est déjà emprunté.");
        }
    }

    public void returner() {
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

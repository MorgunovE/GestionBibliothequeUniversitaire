package Documents;

public abstract class Document {
    protected int id;
    protected String titre;
    protected String auteur;
    protected boolean emprunte;

    public Document(int id, String titre, String auteur) {
        if (id < 1) {
            throw new IllegalArgumentException("L'ID doit être supérieur à 0.");
        }
        if (titre == null || titre.trim().isEmpty()) {
            throw new IllegalArgumentException("Le titre ne peut pas être vide.");
        }
        if (auteur == null || auteur.trim().isEmpty()) {
            throw new IllegalArgumentException("L'auteur ne peut pas être vide.");
        }
        this.id = id;
        this.titre = titre.trim();
        this.auteur = auteur.trim();
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
        if (id < 1) {
            throw new IllegalArgumentException("L'ID doit être supérieur à 0.");
        }
        return this.id = id;
    }

    public String setTitre(String titre) {
        if (titre == null || titre.trim().isEmpty()) {
            throw new IllegalArgumentException("Le titre ne peut pas être vide.");
        }
        return this.titre = titre;
    }

    public String setAuteur(String auteur) {
        if (auteur == null || auteur.trim().isEmpty()) {
            throw new IllegalArgumentException("L'auteur ne peut pas être vide.");
        }
        return this.auteur = auteur;
    }

    public void emprunter() {
        if(!emprunte) {
            emprunte = true;
            System.out.println("Le document [" + titre + "] a été emprunté.");
        } else {
            System.out.println("Le document " + titre + " est déjà emprunté.");
        }
        System.out.println("Détails le document : " + this);
    }

    public void retourner() {
        if(emprunte) {
            emprunte = false;
            System.out.println("Le document [" + titre + "] a été retourné.");
        } else {
            System.out.println("Le document " + titre + " n'est pas emprunté.");
        }
        System.out.println("Détails le document : " + this);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Titre: %s, Auteur: %s, Emprunté: %b", id, titre, auteur, emprunte);
    }
}

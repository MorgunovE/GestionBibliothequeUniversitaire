package Documents;

/**
 * Classe abstraite représentant un document.
 */
public abstract class Document {
    protected int id;
    protected String titre;
    protected String auteur;
    protected boolean emprunte;

    /**
     * Constructeur de la classe Document.
     *
     * @param id     L'identifiant du document.
     * @param titre  Le titre du document.
     * @param auteur L'auteur du document.
     * @throws IllegalArgumentException si l'ID est inférieur à 1, ou si le titre ou l'auteur est vide.
     */
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

    /**
     * Retourne l'identifiant du document.
     *
     * @return L'identifiant du document.
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne le titre du document.
     *
     * @return Le titre du document.
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Retourne l'auteur du document.
     *
     * @return L'auteur du document.
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Indique si le document est emprunté.
     *
     * @return true si le document est emprunté, false sinon.
     */
    public boolean estEmprunte() {
        return emprunte;
    }

    /**
     * Définit l'identifiant du document.
     *
     * @param id L'identifiant du document.
     * @throws IllegalArgumentException si l'ID est inférieur à 1.
     */
    public int setId(int id) {
        if (id < 1) {
            throw new IllegalArgumentException("L'ID doit être supérieur à 0.");
        }
        return this.id = id;
    }

    /**
     * Définit le titre du document.
     *
     * @param titre Le titre du document.
     * @throws IllegalArgumentException si le titre est vide.
     */
    public String setTitre(String titre) {
        if (titre == null || titre.trim().isEmpty()) {
            throw new IllegalArgumentException("Le titre ne peut pas être vide.");
        }
        return this.titre = titre;
    }

    /**
     * Définit l'auteur du document.
     *
     * @param auteur L'auteur du document.
     * @throws IllegalArgumentException si l'auteur est vide.
     */
    public String setAuteur(String auteur) {
        if (auteur == null || auteur.trim().isEmpty()) {
            throw new IllegalArgumentException("L'auteur ne peut pas être vide.");
        }
        return this.auteur = auteur;
    }

    /**
     * Emprunte le document.
     * Affiche un message indiquant si le document a été emprunté ou s'il est déjà emprunté.
     */
    public void emprunter() {
        if(!emprunte) {
            emprunte = true;
            System.out.println("Le document [" + titre + "] a été emprunté.");
        } else {
            System.out.println("Le document " + titre + " est déjà emprunté.");
        }
        System.out.println("Détails le document : " + this);
    }

    /**
     * Retourne le document.
     * Affiche un message indiquant si le document a été retourné ou s'il n'était pas emprunté.
     */
    public void retourner() {
        if(emprunte) {
            emprunte = false;
            System.out.println("Le document [" + titre + "] a été retourné.");
        } else {
            System.out.println("Le document " + titre + " n'est pas emprunté.");
        }
        System.out.println("Détails le document : " + this);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du document.
     *
     * @return Une chaîne de caractères représentant le document.
     */
    @Override
    public String toString() {
        return String.format("ID: %d, Titre: %s, Auteur: %s, Emprunté: %b", id, titre, auteur, emprunte);
    }
}

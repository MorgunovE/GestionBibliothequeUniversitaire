package Documents;

/**
 * Classe représentant un livre.
 */
public class Livre extends Document {

    /**
     * Constructeur de la classe Livre.
     *
     * @param id     L'identifiant du livre.
     * @param titre  Le titre du livre.
     * @param auteur L'auteur du livre.
     * @throws IllegalArgumentException si l'ID est inférieur à 1, ou si le titre ou l'auteur est vide.
     */
    public Livre(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du livre.
     *
     * @return Une chaîne de caractères représentant le livre.
     */
    @Override
    public String toString() {
        return "[Livre]--> " + super.toString();
    }
}


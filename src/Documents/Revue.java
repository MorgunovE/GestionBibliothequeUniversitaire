package Documents;

/**
 * Classe représentant une revue.
 */
public class Revue extends Document {

    /**
     * Constructeur de la classe Revue.
     *
     * @param id     L'identifiant de la revue.
     * @param titre  Le titre de la revue.
     * @param auteur L'auteur de la revue.
     * @throws IllegalArgumentException si l'ID est inférieur à 1, ou si le titre ou l'auteur est vide.
     */
    public Revue(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la revue.
     *
     * @return Une chaîne de caractères représentant la revue.
     */
    @Override
    public String toString() {
        return "[Revue]--> " + super.toString();
    }
}

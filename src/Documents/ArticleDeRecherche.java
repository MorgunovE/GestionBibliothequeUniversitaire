package Documents;

/**
 * Classe représentant un article de recherche.
 */
public class ArticleDeRecherche extends Document {

    /**
     * Constructeur de la classe ArticleDeRecherche.
     *
     * @param id     L'identifiant de l'article de recherche.
     * @param titre  Le titre de l'article de recherche.
     * @param auteur L'auteur de l'article de recherche.
     * @throws IllegalArgumentException si l'ID est inférieur à 1, ou si le titre ou l'auteur est vide.
     */
    public ArticleDeRecherche(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'article de recherche.
     *
     * @return Une chaîne de caractères représentant l'article de recherche.
     */
    @Override
    public String toString() {
        return "[Article de recherche]--> " + super.toString();
    }
}

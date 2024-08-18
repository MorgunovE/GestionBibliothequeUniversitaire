package Documents;

public class ArticleDeRecherche extends Document {
    public ArticleDeRecherche(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

    @Override
    public String toString() {
        return "[Article de recherche]--> " + super.toString();
    }
}

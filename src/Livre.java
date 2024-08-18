public class Livre extends Document {
    public Livre(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

    @Override
    public String toString() {
        return "[Livre]--> " + super.toString();
    }
}


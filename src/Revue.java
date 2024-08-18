public class Revue extends Document {
    public Revue(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

    @Override
    public String toString() {
        return "[Revue]--> " + super.toString();
    }
}

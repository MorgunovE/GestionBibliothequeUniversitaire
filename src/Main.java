import Bibliotheque.Bibliotheque;

public class Main {
    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();

        bibliotheque.ajouterDocument(new Documents.Livre(3, "Introduction à la Programmation", "A. Dupont"));
        bibliotheque.ajouterDocument(new Documents.Revue(1, "Science et Technologie", "B. Martin"));
        bibliotheque.ajouterDocument(new Documents.ArticleDeRecherche(2, "Études Machine Learning", "C. Bernard"));

        System.out.println("***Documents dans la bibliothèque :***");
        bibliotheque.afficherDocuments();

        System.out.println("\n***Emprunt d'un document :***");
        bibliotheque.emprunterDocument(3);

        System.out.println("\n***Retour d'un document :***");
        bibliotheque.retournerDocument(3);

        System.out.println("\n***Tri des documents par identifiant :***");
        bibliotheque.sortDocumentsParId();
        bibliotheque.afficherDocuments();

        System.out.println("\n***Recherche d'un document par identifiant (ID: 1) ***");
        bibliotheque.rechercherDocumentParID(1);

        System.out.println("\n***Effacement d'un document par identifiant (ID: 2) ***");
        bibliotheque.effacerDocumentParId(2);

        System.out.println("\n***Test exceptional:***");
        bibliotheque.ajouterDocument(new Documents.Revue(1, "test try catch", "test"));
        bibliotheque.emprunterDocument(5);
        bibliotheque.retournerDocument(2);
        Bibliotheque bibliothequeTest = new Bibliotheque();
        bibliothequeTest.sortDocumentsParId();
        bibliotheque.rechercherDocumentParID(9);
        bibliotheque.effacerDocumentParId(99);

    }
}
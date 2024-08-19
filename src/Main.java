import Bibliotheque.Bibliotheque;
import Documents.ArticleDeRecherche;
import Documents.Livre;
import Documents.Revue;

import java.util.InputMismatchException;
import java.util.Scanner;

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


        System.out.println("\n***Test de l'ajout de documents par l'utilisateur :***");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez ajouter des documents à la bibliothèque y/n ? ");
        String start = scanner.nextLine();

        if (start.equalsIgnoreCase("y")) {
            while (true) {
                try {
                    System.out.println("Choisissez le type de document à ajouter (1: Livre, 2: Revue, 3: Article de Recherche, 0: Quitter): ");
                    int choix = Integer.parseInt(scanner.nextLine());

                    while (choix < 0 || choix > 3) {
                        System.out.println("Choix invalide. Veuillez réessayer ou entrez 0 pour quitter.");
                        choix = Integer.parseInt(scanner.nextLine());
                    }

                    if (choix == 0) {
                        System.out.println("Fin du programme.");
                        break;
                    }

                    System.out.println("Entrez le titre du document: ");
                    String titre = scanner.nextLine();

                    System.out.println("Entrez l'auteur du document: ");
                    String auteur = scanner.nextLine();

                    System.out.println("Entrez l'ID du document: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    switch (choix) {
                        case 1:
                            bibliotheque.ajouterDocument(new Livre(id, titre, auteur));
                            break;
                        case 2:
                            bibliotheque.ajouterDocument(new Revue(id, titre, auteur));
                            break;
                        case 3:
                            bibliotheque.ajouterDocument(new ArticleDeRecherche(id, titre, auteur));
                            break;
                        default:
                            System.out.println("Choix invalide. Veuillez réessayer.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erreur: Veuillez entrer un nombre valide pour l'ID.");
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Erreur: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Fin du programme.");
        }

        System.out.println("***Documents dans la bibliothèque :***");
        bibliotheque.afficherDocuments();
    }
}
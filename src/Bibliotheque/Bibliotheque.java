package Bibliotheque;
import Documents.Document;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Bibliotheque {
    private List<Document> documents;

    public Bibliotheque() {
        this.documents = new ArrayList<>();
    }

    public void ajouterDocument(Document document) {
        documents.add(document);
        System.out.println("Le document [" + document.getTitre() + "] a été ajouté.");
    }

    public void effacerDocumentParId(int id) {
        if (documents.isEmpty()) {
            System.out.println("La liste de documents est vide.");
            return;
        } else if (documents.size() == 1 && documents.getFirst().getId() == id) {

            if (documents.removeFirst() == null) {
                System.out.println("Le document [" + documents.getFirst().getTitre() + "] a été effacé.");
                System.out.println("Détails document effacé: " + documents.getFirst());
            } else {
                System.out.println("Le document [" + documents.getFirst().getTitre() + "] n'a pas été effacé.");
            }
            return;
        }
        for(Document document : documents) {
            if(document.getId() == id) {
                if (documents.remove(document)) {
                    System.out.println("Le document [" + document.getTitre() + "] a été effacé.");
                    System.out.println("Détails document effacé: " + document);
                } else {
                    System.out.println("Le document [" + document.getTitre() + "] n'a pas été effacé.");
                }
                return;
            }
        }
        System.out.println("Document non trouvé.");
    }

    public void emprunterDocument(int id) {
        if (documents.isEmpty()) {
            System.out.println("La liste de documents est vide.");
            return;
        } else if (documents.size() == 1 && documents.getFirst().getId() == id) {
            documents.getFirst().emprunter();
            System.out.println("Le document [" + documents.getFirst().getTitre() + "] a été emprunté.");
            System.out.println("Détails document emprunté: " + documents.getFirst());
            return;
        }
        for(Document document : documents) {
            if(document.getId() == id) {
                document.emprunter();
                System.out.println("Le document [" + document.getTitre() + "] a été emprunté.");
                System.out.println("Détails document emprunté: " + document);
                return;
            }
        }
        System.out.println("Document non trouvé.");
    }

    public void retournerDocument(int id) {
        if (documents.isEmpty()) {
            System.out.println("La liste de documents est vide.");
            return;
        } else if (documents.size() == 1 && documents.getFirst().getId() == id) {
            documents.getFirst().retourner();
            System.out.println("Le document [" + documents.getFirst().getTitre() + "] a été retourné.");
            System.out.println("Détails document retourné: " + documents.getFirst());
            return;
        }
        for(Document document : documents) {
            if(document.getId() == id) {
                document.retourner();
                System.out.println("Le document [" + document.getTitre() + "] a été retourné.");
                System.out.println("Détails document retourné: " + document);
                return;
            }
        }
        System.out.println("Document non trouvé.");
    }

    public void afficherDocuments() {
        if (documents.isEmpty()) {
            System.out.println("La liste de documents est vide.");
        } else {
            for(Document document : documents) {
                System.out.println(document);
            }
        }

    }

    public void sortDocumentsParId() {
        if (documents.isEmpty()) {
            System.out.println("La liste de documents est vide.");
        } else if(documents.size() == 1) {
            System.out.println("Il n'y a qu'un seul document.");
        }
        else {
            documents.sort(Comparator.comparingInt(Document::getId));
        }
    }

    public void rechercherDocumentParID(int id) {
        if (documents.isEmpty()) {
            System.out.println("La liste de documents est vide.");
            return;
        } else if(documents.size() == 1 && documents.getFirst().getId() == id) {
            System.out.println(documents.getFirst());
        }
        for(Document document : documents) {
            if(document.getId() == id) {
                System.out.println(document);
                return;
            }
        }
        System.out.println("Document non trouvé.");
    }
}

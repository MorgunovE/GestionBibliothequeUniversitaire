package Bibliotheque;
import Documents.Document;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Bibliotheque {
    private List<Document> documents;

    public Bibliotheque() {
        this.documents = new ArrayList<>();
    }

    public void ajouterDocument(Document document) {
        try {
            if (!documents.isEmpty()) {
                for(Document doc : documents) {
                    if(doc.getId() == document.getId()) {
                        throw new Exception("Un document avec cet ID existe déjà.");
                    }
                }
            }
            documents.add(document);
            System.out.println("Le document [" + document.getTitre() + "] a été ajouté.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void effacerDocumentParId(int id) {
        try {
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
            for (Document document : documents) {
                if (document.getId() == id) {
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
        } catch (Exception e) {
            System.out.println("Erreur lors de l'effacement du document: " + e.getMessage());
        }
    }

    public void emprunterDocument(int id) {
        try {
            if (documents.isEmpty()) {
                System.out.println("La liste de documents est vide.");
                return;
            } else if (documents.size() == 1 && documents.getFirst().getId() == id) {
                documents.getFirst().emprunter();
                System.out.println("Détails le document : " + documents.getFirst());
                return;
            }
            for(Document document : documents) {
                if(document.getId() == id) {
                    document.emprunter();
                    System.out.println("Détails le document : " + document);
                    return;
                }
            }
            System.out.println("Document non trouvé.");
        } catch (Exception e) {
            System.out.println("Erreur lors de l'emprunt du document: " + e.getMessage());
        }
    }

    public void retournerDocument(int id) {
        try {
            if (documents.isEmpty()) {
                System.out.println("La liste de documents est vide.");
                return;
            } else if (documents.size() == 1 && documents.getFirst().getId() == id) {
                documents.getFirst().retourner();
                System.out.println("Détails le document : " + documents.getFirst());
                return;
            }
            for(Document document : documents) {
                if(document.getId() == id) {
                    document.retourner();
                    System.out.println("Détails le document : " + document);
                    return;
                }
            }
            System.out.println("Document non trouvé.");
        } catch (Exception e) {
            System.out.println("Erreur lors du retour du document: " + e.getMessage());
        }
    }

    public void afficherDocuments() {
        try {
            if (documents.isEmpty()) {
                System.out.println("La liste de documents est vide.");
            } else {
                for (Document document : documents) {
                    System.out.println(document);
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'affichage des documents: " + e.getMessage());
        }
    }

    public void sortDocumentsParId() {
        try {
            if (documents.isEmpty()) {
                System.out.println("La liste de documents est vide.");
            } else if(documents.size() == 1) {
                System.out.println("Il n'y a qu'un seul document.");
            }
            else {
                documents.sort(Comparator.comparingInt(Document::getId));
            }
        } catch (Exception e) {
            System.out.println("Erreur lors du tri des documents: " + e.getMessage());
        }
    }

    public void rechercherDocumentParID(int id) {
        try {
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
        } catch (Exception e) {
            System.out.println("Erreur lors de la recherche du document: " + e.getMessage());
        }
    }

}

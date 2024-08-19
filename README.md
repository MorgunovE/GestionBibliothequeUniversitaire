# Gestion d'une Bibliothèque Universitaire

## Description
Ce projet est une application Java qui simule la gestion d'une bibliothèque universitaire. L'application permet d'ajouter des documents (Livres, Revues, Articles de Recherche) à la bibliothèque, d'effectuer des emprunts et des retours de documents, de rechercher des documents par identifiant, d'effacer des documents par identifiant, de trier les documents par identifiant et d'afficher tous les documents.

## Dépôt GitHub
Le code source de ce projet est disponible sur GitHub : [GestionBibliothequeUniversitaire](https://github.com/MorgunovE/GestionBibliothequeUniversitaire.git)

## Fonctionnalités
- Ajout de documents (Livres, Revues, Articles de Recherche) à la bibliothèque.
- Emprunt et retour de documents.
- Effacement de documents par identifiant.
- Recherche de documents par identifiant.
- Affichage de tous les documents.
- Tri des documents par identifiant.
- Interaction avec l'utilisateur pour ajouter des documents via la console.

## Structure du Projet
Le projet est structuré comme suit :
- `src/` : Contient les fichiers source Java.
  - `Bibliotheque/` : Contient la classe `Bibliotheque`.
  - `Documents/` : Contient les classes `Document`, `Livre`, `Revue`, `ArticleDeRecherche`.
  - `Main.java` : Classe principale pour exécuter l'application.

## Compiler le projet
Pour compiler le projet, utilisez la commande suivante :
```sh
javac -d out -sourcepath src -cp src src/Main.java
```

## Exécuter le projet
Pour exécuter le projet, utilisez la commande suivante :
```sh
java -cp out Main
```

## Simulation de scénarios
Le projet inclut une simulation de scénarios pour tester les fonctionnalités de la bibliothèque :  
- Ajout de documents prédéfinis.
- Emprunt et retour de documents.
- Tri et affichage des documents.
- Interaction avec l'utilisateur pour ajouter des documents via la console.

##  Vérification
Pour vérifier le bon fonctionnement du projet, exécutez les scénarios de simulation inclus dans la méthode main de la classe Main.

##  Utilisation
1. Clonez le dépôt GitHub. 
2. Compilez le projet. 
3. Exécutez le projet. 
4. Suivez les instructions affichées dans la console pour interagir avec la bibliothèque.

## Auteur
Ce projet a été réalisé par [Evgenii Morgunov](https://github.com/MorgunovE/)

## Licence
Ce projet est sous licence MIT.
# 📘 Students – Gestion des élèves et de leurs notes

Ce **projet Java** permet de gérer une **liste d'élèves avec leurs notes**, en assurant la **saisie sécurisée, l'affichage formaté, et le tri dynamique par prénom**. Il est conçu pour être simple, interactif et extensible.

### 📄 Fonctionnalités
- **Ajout d'élèves** avec prénom et nom (capitalisation automatique)
- **Saisie des notes avec validation** (entre 0 et 20)
- **Détection des doublons** : affiche les notes si l'élève existe déjà
- Calcul de la **moyenne, du minimum et du maximum** des notes
- **Tri des élèves par prénom** (ordre croissant ou décroissant)
- **Affichage formaté** des informations

### 🚀Pour lancer le programme:
1. Compiler le projet avec:

        javac fr/ex/array/Students.java
        javac fr/ex/array/Notes.java

2. Puis éxécuter avec:

        java fr.ex.array.Students

### ✍️ Exemple d'utilisation

        Enter the first name and last name of the student:
        jean dupont
        Enter the marks (space separated) for Jean Dupont:
        12 15 18
        Student "Jean Dupont" added successfully.
        
        Do you want to add another student? (y or n)?
        y
        ...

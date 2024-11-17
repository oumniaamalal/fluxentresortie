package LectureFichierBinaire;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {

    public static void main(String[] args) {
        // Création d'une liste d'objets Livre
        List<Livre> bibliotheque = new ArrayList<>();

        // Ajout de quelques livres dans la bibliothèque
        bibliotheque.add(new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954));
        bibliotheque.add(new Livre("1984", "George Orwell", 1949));
        bibliotheque.add(new Livre("Les Misérables", "Victor Hugo", 1862));

        // Sérialisation de la liste d'objets Livre dans un fichier binaire
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bibliotheque.ser"))) {
            oos.writeObject(bibliotheque);  // Sauvegarde de la liste d'objets Livre
            System.out.println("La bibliothèque a été sauvegardée dans le fichier bibliotheque.ser");
        } catch (IOException e) {
            e.printStackTrace();  // Affiche une erreur si un problème survient lors de la sérialisation
        }
    }
}


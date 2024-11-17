package LectureFichierBinaire;

import java.io.*;

public class EcritureTexte {
    public static void main(String[] args) {
        try {
            // Création d'un BufferedReader pour lire le fichier d'entrée
            BufferedReader reader = new BufferedReader(new FileReader("livres.txt"));
            // Création d'un BufferedWriter pour écrire dans le fichier de sortie
            BufferedWriter writer = new BufferedWriter(new FileWriter("sortiee.txt"));
            
            String ligne;
            // Lecture du fichier ligne par ligne
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);  // Affichage à la console
                
                // Écriture de chaque ligne lue dans le fichier de sortie
                writer.write(ligne);
                writer.newLine();  // Ajout d'un saut de ligne dans le fichier de sortie
            }

            // Fermeture des flux après utilisation
            reader.close();
            writer.close();
        } catch (IOException e) {
            // Gestion des exceptions en cas d'erreur
            e.printStackTrace();
        }
    }
}

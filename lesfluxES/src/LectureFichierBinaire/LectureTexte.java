package LectureFichierBinaire;

import java.io.*;

public class LectureTexte {
    public static void main(String[] args) {
        try {
            // Création d'un BufferedReader pour lire le fichier
            BufferedReader reader = new BufferedReader(new FileReader("livres.txt"));
            
            String ligne;
            // Lecture du fichier ligne par ligne
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
            }
            // Fermeture du flux de lecture
            reader.close();
        } catch (IOException e) {
            // Gestion des exceptions en cas d'erreur
            e.printStackTrace();
        }
    }
}

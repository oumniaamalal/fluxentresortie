package LectureFichierBinaire;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopieFichier {

    public static void main(String[] args) {
        // TODO Auto-generated method stu
        try (FileInputStream fis = new FileInputStream("C:\\Users\\pc\\OneDrive\\Bureau\\source\\p1.jpg");  // Chemin du fichier source
             FileOutputStream fos = new FileOutputStream("C:\\Users\\pc\\OneDrive\\Bureau\\destination\\p2.jpg")) {  // Chemin du fichier de destination

            int octet;
            
            // Lire chaque octet du fichier source et l'écrire dans le fichier destination
            while ((octet = fis.read()) != -1) {
                fos.write(octet);  // Écriture de chaque octet dans le fichier de destination
            }

            System.out.println("Le fichier a été copié avec succès.");
        } catch (IOException e) {
            e.printStackTrace();  // Affichage de l'erreur en cas de problème
        }
    }
}

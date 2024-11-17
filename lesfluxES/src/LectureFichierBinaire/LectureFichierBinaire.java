package LectureFichierBinaire;
import java.io.FileInputStream;
import java.io.IOException;
public class LectureFichierBinaire {

	    public static void main(String[] args) {
	        // Spécifiez le fichier à lire
	    	try (FileInputStream fis = new FileInputStream("f1.txt")) {
	            int octet;
	            
	            // Lire chaque octet et l'afficher sous forme hexadécimale
	            while ((octet = fis.read()) != -1) {
	                System.out.printf("%02X ", octet);  // Affichage sous forme hexadécimale
	            }
	            System.out.println(); // Pour ajouter une nouvelle ligne à la fin de l'affichage

	        } catch (IOException e) {
	            e.printStackTrace();  // Affichage de l'erreur en cas de problème de lecture
	        }
	    }
	}


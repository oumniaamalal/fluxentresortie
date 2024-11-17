package LectureFichierBinaire;

import java.io.Serializable;

public class Livre implements Serializable {
    // Déclaration des attributs
    private String titre;
    private String auteur;
    private int anneePublication;

    // Constructeur
    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    // Getters et Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }
     public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    // Méthode toString pour une représentation lisible de l'objet
    @Override
    public String toString() {
        return "Livre [titre=" + titre + ", auteur=" + auteur + ", anneePublication=" + anneePublication + "]";
    }
}


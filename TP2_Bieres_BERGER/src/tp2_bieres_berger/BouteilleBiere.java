/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_berger;

/**
 *
 * @author berge
 */
public class BouteilleBiere { //définition de la classe bière 
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte = false;

    public void lireEtiquette(){ //Définition de la méthode permettant de lire l'étiquette d'un objet de cette classe 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){ //défnition du construc
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    
    public boolean Décapsuler(){ //Méthode Décapsuler pour savoir si une bière est ouverte ou fermée. 
       if (ouverte == false){  
           ouverte = true;
           return true;
       }else{
           return false;           
       } 
       }
    
    @Override
    public String toString(){ //définition de l'écriture voulue
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? "; 
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }

}


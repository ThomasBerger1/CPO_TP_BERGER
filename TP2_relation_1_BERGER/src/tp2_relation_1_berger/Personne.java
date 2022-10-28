/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_berger;

import java.util.Arrays;

/**
 *
 * @author berge
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures;
    
public Personne(String unNom, String unPrenom){
    nom = unNom;
    prenom = unPrenom;
    liste_voitures = new Voiture [3];
    nbVoitures = 0;
}

@Override
public String toString(){
    return prenom +" "+ nom +" possède "+nbVoitures;
}
  
}

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
public class Personne { //De même que la classe Voiture 
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
    return prenom +" "+ nom +" possède "+nbVoitures+" voitures. \n"+liste_voitures[0]+" "+liste_voitures[1]+" "+liste_voitures[2];
}
  
public boolean ajouter_voiture(Voiture voiture_a_ajouter){ //Méthode ajouter_voiture 
    if(voiture_a_ajouter.proprietaire != null){ //Si la voiture a un proprio, alors on ne l'ajoute pas 
        System.out.println("VOITURE VOLLE!!!");
        return false;
    }
    if(nbVoitures == 3){ //Si le proprio a déjà 3 voitures, on n'ajoute pas la nouvelle 
        System.out.println("Le proprietaire a déjà 3 voitures.");
        return false;
    }
    else{ //Sinon, on ajoute la voiture à une nouvelle case du tableau. 
        liste_voitures[nbVoitures] = voiture_a_ajouter; // Il y a un -1 et +1 : -1 car le tab commence à 0, et +1 car on veut mettre la nouvelle voiture dans une nouvelle case. 
        nbVoitures += 1; //On augmente le nombre de voiture du proprietaire pour éviter qu'il en ait à l'infini ou qu'elle se replace dans les cases du tableau 
        voiture_a_ajouter.proprietaire = this; //on retourne à "this", l'objet Personne qui va utiliser la méthode dans le main
        System.out.println("La nouvelle voiture lui appartient!");
        return true;
    }


}
}

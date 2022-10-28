/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_berger;


/**
 *
 * @author berge
 */
public class Voiture { //Définition de la classe Voiture
    String modele; //Caractéristiques / Attributs 
    String marque;
    int PuiCV;
    Personne proprietaire;
    
public Voiture(String unModele, String uneMarque, int Puissance){ //Constructeur de Voiture, permet de créer plus facilement et rapidement un nouvel objet de cette classe 
    modele = unModele;
    marque = uneMarque;
    PuiCV = Puissance;
    proprietaire = null ;
}

@Override
public String toString(){ //On utilise toString pour écrire comme on le souhaite un objet Voiture quand on l'appelle dans le main
    return "Une "+ marque +" "+ modele + " avec "+ PuiCV +" chevaux.";
}
    
    
}

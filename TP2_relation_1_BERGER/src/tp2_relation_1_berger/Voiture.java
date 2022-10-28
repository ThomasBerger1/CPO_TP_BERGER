/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_berger;


/**
 *
 * @author berge
 */
public class Voiture {
    String modele;
    String marque;
    int PuiCV;
    Personne proprietaire;
    
public Voiture(String unModele, String uneMarque, int Puissance){
    modele = unModele;
    marque = uneMarque;
    PuiCV = Puissance;
    proprietaire = null ;
}

@Override
public String toString(){
    return "Une "+ marque +" "+ modele + " avec "+ PuiCV +" chevaux.";
}
    
    
}

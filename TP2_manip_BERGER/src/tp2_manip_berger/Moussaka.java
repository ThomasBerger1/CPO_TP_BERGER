/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_berger;

/**
 *
 * @author berge
 */
public class Moussaka { //définition de la classe
    int nbCalories;
    
    public Moussaka(int Cal){ //définition du construct 
        nbCalories = Cal;
    }
    
    
@Override //Définition de l'écriture voulu quand on appelle un objet Moussaka
public String toString () {
 return "La moussaka fait "+nbCalories+" calories";
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_berger;

/**
 *
 * @author berge
 */
public class Tartiflette { //Définition de la classe 
    int nbCalories;
    
    
    public Tartiflette(int Cal){ //définition du construct
        nbCalories = Cal;
    }
    
    @Override
public String toString () { //Définition de l'écriture 
 return "La tartiflette fait "+nbCalories+" calories";
}
   
    
    
    
    
    
    
    
}

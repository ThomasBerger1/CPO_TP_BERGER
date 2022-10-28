/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_berger;

import java.util.Arrays;

/**
 *
 * @author berge
 */
public class TP2_manip_BERGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        
        Tartiflette assiette3 = assiette2 ; //On n'a pas créé une nouvelle tartiflette car il n'y a pas de NEW! 

        assiette2 = assiette1 ; 
        assiette1 = assiette3 ;
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;

        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        // Ni l'une ni l'autre sont correctes, on ne peut pas référencer un type objet par un autre.
        
        Moussaka [] tab = new Moussaka[10];
        
        for (int i = 0 ; i < 10 ; i++){
            tab[i] = new Moussaka(i*100);
        }
        
        System.out.println(Arrays.toString(tab));
        
        // OUI, une variable d'une classe peut "détenir" un objet d'une classe.
    }
    
}

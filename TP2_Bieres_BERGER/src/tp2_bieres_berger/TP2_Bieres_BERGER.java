/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_berger;

/**
 *
 * @author berge
 */
public class TP2_Bieres_BERGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        uneBiere.lireEtiquette();
       
        BouteilleBiere sBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        sBiere.lireEtiquette();
        
        BouteilleBiere tBiere = new BouteilleBiere("Pelfort",6.5,"Pelfort");
        tBiere.lireEtiquette();
        
        BouteilleBiere qBiere = new BouteilleBiere("Heineken",5,"Heineken");
        qBiere.lireEtiquette();
        
        BouteilleBiere cBiere = new BouteilleBiere("Guinness",4.2,"St. James's Gate");
        cBiere.lireEtiquette();
        
    }
    
}

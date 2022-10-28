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
        
        boolean ouvert = uneBiere.Décapsuler();
        if (ouvert == false){
            System.out.println("Erreur : La bière est déjà ouverte.");
        }else{
            System.out.println("La bière "+ uneBiere.nom +" est maintenant décapsulée.");
        }
        
        boolean ouvert2 = tBiere.Décapsuler();
        if (ouvert2 == false){
            System.out.println("Erreur : La bière est déjà ouverte.");
        }else{
            System.out.println("La bière "+ tBiere.nom +" est maintenant décapsulée.");
        }
        
        boolean ouvert3 = qBiere.Décapsuler();
        if (ouvert3 == false){
            System.out.println("Erreur : La bière est déjà ouverte.");
        }else{
            System.out.println("La bière "+ qBiere.nom +" est maintenant décapsulée.");
        }
        
        System.out.println(uneBiere);
        System.out.println(sBiere);
        System.out.println(tBiere);
        System.out.println(qBiere);
        System.out.println(cBiere);
        
    }
    
}

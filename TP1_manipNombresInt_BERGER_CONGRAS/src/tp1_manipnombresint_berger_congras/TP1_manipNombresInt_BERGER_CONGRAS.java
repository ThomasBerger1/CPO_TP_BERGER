/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_berger_congras;

import java.util.Scanner;

/**
 *
 * @author berger, congras
 * création 25/10/22
 * TP1 Partie 1
 */
public class TP1_manipNombresInt_BERGER_CONGRAS {

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args){
        
        int nbr1 = asknumber();
        int nbr2 = asknumber();
        double res = 0;
        String msg = "";
        
        System.out.println("Entier 1 : " + nbr1 + "\nEntier 2 : " + nbr2);
        
        for (byte k = 0;k <= 3; k++){
                
            switch(k){
                
                case 0:
                    res = nbr1 + nbr2;
                    msg = "de la somme";
                    break;
                
                case 1:
                    res = nbr1 - nbr2;
                    msg = "de la Différence";
                    break;
                
                case 2:
                    res = nbr1 * nbr2;
                    msg = "du produit";
                    break;
                    
                case 3:
                    res = nbr1/nbr2;
                    msg = "entier de la division euclidienne";
                    break;
                    
            }
                    
                System.out.println("Le resultat " + msg + " est de : " + res);
                
                if (k == 3){
                    System.out.println("Le reste de la division euclidienne de "+nbr1+" par "+nbr2+" est de : " + nbr1%nbr2);
                }
                
            
        }
        
    }
    
    private static int asknumber(){
        
        Scanner sc;
        sc = new Scanner(System.in);
        int rep;
        
        System.out.println("Entrez un entier : ");
        rep = sc.nextInt();
        
        return rep;
    }
    
}

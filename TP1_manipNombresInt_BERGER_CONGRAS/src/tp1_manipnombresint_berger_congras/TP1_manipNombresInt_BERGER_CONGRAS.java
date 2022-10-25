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
        
        int nbr1 = asknumber(); // Nombre 1 fait appel à la fonction asknumber définit plus bas
        int nbr2 = asknumber(); // De même pour nombre 2
        double res = 0; // Création d'une variable résultat initialisée à 0
        String msg = ""; // Création d'une variable de texte msg vide
        
        System.out.println("Entier 1 : " + nbr1 + "\nEntier 2 : " + nbr2); //ON écrit les nombres choisis par l'utilisateur
        
        for (byte k = 0;k <= 3; k++){ //Boucle for de paramètre k, utilisation de byte au lieu de int pour utiliser moins de mémoire
                
            switch(k){ //Utilisation d'un switch au lieu d'un if pour traiter plus vite les différents cas 
                
                case 0: //Cas de la somme 
                    res = nbr1 + nbr2;
                    msg = "de la somme";
                    break;
                
                case 1: //Cas de la différence  
                    res = nbr1 - nbr2;
                    msg = "de la Différence";
                    break;
                
                case 2: //Cas du produit  
                    res = nbr1 * nbr2;
                    msg = "du produit";
                    break;
                    
                case 3://Cas de la division euclidienne avec calcul du reste après
                    res = nbr1/nbr2;
                    msg = "entier de la division euclidienne";
                    break;
                    
            }
                    
                System.out.println("Le resultat " + msg + " est de : " + res); //Affichage du résultat selon le cas
                
                if (k == 3){ //Lors du cas de la div.eucli, on rajoute une ligne pour le reste de la division
                    System.out.println("Le reste de la division euclidienne de "+nbr1+" par "+nbr2+" est de : " + nbr1%nbr2);
                }
                
            
        }
        
    }
    
    private static int asknumber(){ //Définition d'une fonction asknumber retournant un int (nombre entier)
        
        Scanner sc; //Création de l'objet scanner 
        sc = new Scanner(System.in);
        int rep;
        
        System.out.println("Entrez un entier : "); //Affichage de l'instruction à l'utilisateur 
        rep = sc.nextInt(); //rep prend le nombre entré 
        
        return rep; //on retourne rep de la fonction 
    }
    
}

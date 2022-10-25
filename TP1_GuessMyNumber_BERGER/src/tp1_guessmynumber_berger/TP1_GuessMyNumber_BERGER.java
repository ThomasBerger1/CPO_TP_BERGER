/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_berger;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author berger
 * Création 25/10/22
 * TP1 Partie 3
 */
public class TP1_GuessMyNumber_BERGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random generateurAlea = new Random();
        double rand = generateurAlea.nextInt(100);
        Scanner sc = new Scanner (System.in);
        double saisi = -1;
        int nbrT = 0;
        int nbrC = 9999;
        String msgPetit = "Trop Petit";
        String msgGrand = "Trop Grand";
        int mode = selectmode();
        
        switch(mode){
            
            case 1: //Facile
                msgPetit = "Vraiment " + msgPetit;
                msgGrand = "Vraiment " + msgGrand;
                break;
            case 2: //Moyen 
                nbrC = 10;
                break;
            case 3: //Difficile
                nbrC = 7;
                break;
            case 4: //Cauchemard
                nbrC = 5;
                break;
        }
        
        while(!(saisi == rand) && !(nbrT == nbrC)){
            
            System.out.println("Entrez un entier :");
            saisi = sc.nextInt();
            nbrT += 1; 
            if(saisi < rand){
                System.out.println(msgPetit+"\nNombre de tentatives : "+nbrT);
            }else if(saisi > rand){
                System.out.println(msgGrand+"\nNombre de tentatives : "+nbrT);
            }else if(saisi == rand){
                System.out.println("Bravo ! Gagné ! Le numéro était bien "+rand +"\nNombre de tentatives : "+nbrT);
                break;
            }
            
            if(nbrT == nbrC){
                System.out.println("Perdu! Nombre de tentative atteint. Le numéro était "+rand);
                break;
            }
            
        } 
        
    }
     private static int selectmode(){

        int mode = 0;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("""
                           Selectionnez la difficulté : 
                           1 -> Facile
                           2 -> Moyen
                           3 -> Difficile
                           4 -> Cauchemard""");

        while(mode<1 | mode>4){

            mode = sc.nextInt();

        }

        return mode;
        
    }
    
}

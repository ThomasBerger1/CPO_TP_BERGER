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
        
        Random generateurAlea = new Random(100);
        double rand = generateurAlea.nextInt(100);
        Scanner sc = new Scanner (System.in);
        double saisi = -1;
        
        while(!(saisi == rand)){
            
            saisi = sc.nextInt();
            
            if(saisi < rand){
                System.out.println("Trop petit!");
            }else if(saisi > rand){
                System.out.println("Trop grand!");
            }else{
                System.out.println("Bravo ! Gagné ! Le numéro était bien "+rand);
                break;
            }
            
        } 
        
    }
    
}

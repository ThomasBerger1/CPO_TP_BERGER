/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_berger;

import java.util.Scanner;

/**
 *
 * @author berge
 */
public class TP2_convertisseurObjet_BERGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur convert = new Convertisseur();
        
        Scanner sc = new Scanner(System.in); //Création d'un scanner 
        System.out.println("Saisissez une valeur : "); //Affichage de consigne
        double t = sc.nextDouble(); //t prend la valeur entré dans le scanner
        System.out.println("Vous avez choisi : " + t + "\n"); //Affichage de la valeur prise
        
        int mode = convert.selectmode(); //Appel à la fonction selectmode pour choisir le mode de conversion nécessaire, représenté par un entier
        String entry = "";
        String output = "";
        double res = 0;
        
        switch(mode){ //Chaque possibilité de convertion
            
            case 1: // Cas des Celcius vers des Kelvins
                entry = "Celsius"; //L'entrée est en Celcius 
                output = "Kelvin"; //La sortie est en Kelvin 
                res = convert.CelciusVersKelvin(t); //Le résultat fait appel à la fonction CelciusversKelvin avec t comme paramètre initial 
                break; //Si ce cas se réalise, on veut pas faire les autres, on break.
            case 2: //Même chose dans l'autre sens
                entry = "Kelvin";
                output = "Celsius";
                res = convert.KelvinVersCelcius(t);
                break;
            case 3: //Même chose avec des Farenheit vers des Celcius
                entry = "Farenheit";
                output = "Celsius";
                res = convert.FarenheitVersCelcius(t);
                break;
            case 4: //Même chose des Celcius vers des Farenheit 
                entry = "Celsius";
                output = "Farenheit";
                res = convert.CelciusVersFarenheit(t);
                break;
            case 5: //Même chose des Kelvin vers des Farenheit 
                entry = "Kelvin";
                output = "Farenheit";
                res = convert.KelvinVersFarenheit(t);
                break;
            case 6: //Même chose des Farenheit vers des Kelvin
                entry = "Farenheit";
                output = "Kelvin";
                res = convert.FarenheitVersKelvin(t);
                break;
            
        }
        
        System.out.println("La température de " + t + entry + " correspond à " + res + " " + output);
        
        
        
        
        
        
    }
    
}

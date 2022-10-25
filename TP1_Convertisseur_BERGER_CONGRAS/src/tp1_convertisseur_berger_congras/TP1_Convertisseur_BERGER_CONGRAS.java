/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_berger_congras;

import java.util.Scanner;

/**
 *
 * @author berger, congras 
 * Création 25/10/22
 * TP1 Partie 2
 */
public class TP1_Convertisseur_BERGER_CONGRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); //Création d'un scanner 
        System.out.println("Saisissez une valeur : "); //Affichage de consigne
        double t = sc.nextDouble(); //t prend la valeur entré dans le scanner
        System.out.println("Vous avez choisi : " + t + "\n"); //Affichage de la valeur prise
        
        byte mode = selectmode(); //Appel à la fonction selectmode pour choisir le mode de conversion nécessaire, représenté par un entier
        String entry = "";
        String output = "";
        double res = 0;
        
        switch(mode){ //Chaque possibilité de convertion
            
            case 1: // Cas des Celcius vers des Kelvins
                entry = "Celsius"; //L'entrée est en Celcius 
                output = "Kelvin"; //La sortie est en Kelvin 
                res = CelciusVersKelvin(t); //Le résultat fait appel à la fonction CelciusversKelvin avec t comme paramètre initial 
                break; //Si ce cas se réalise, on veut pas faire les autres, on break.
            case 2: //Même chose dans l'autre sens
                entry = "Kelvin";
                output = "Celsius";
                res = KelvinVersCelcius(t);
                break;
            case 3: //Même chose avec des Farenheit vers des Celcius
                entry = "Farenheit";
                output = "Celsius";
                res = FarenheitVersCelcius(t);
                break;
            case 4: //Même chose des Celcius vers des Farenheit 
                entry = "Celsius";
                output = "Farenheit";
                res = CelciusVersFarenheit(t);
                break;
            case 5: //Même chose des Kelvin vers des Farenheit 
                entry = "Kelvin";
                output = "Farenheit";
                res = KelvinVersFarenheit(t);
                break;
            case 6: //Même chose des Farenheit vers des Kelvin
                entry = "Farenheit";
                output = "Kelvin";
                res = FarenheitVersKelvin(t);
                break;
            
        }
        
        System.out.println("La température de " + t + entry + " correspond à " + res + " " + output); //On affiche à chaque itération la correspondance entre les températures 
        
    }
    
    
    private static byte selectmode(){ //Méthode pour sélectionner le mode de convertion
        
        byte mode = 0; 
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println(""" 
                           Selectionnez la conversion de temperature souhaitee : 
                           1 -> Celcius Vers Kelvin
                           2 -> Kelvin Vers Celcius
                           3 -> Farenheit Vers Celcius
                           4 -> Celcius Vers Farenheit
                           5 -> Kelvin Vers Farenheit
                           6 -> Farenheit Vers Kelvin
                           """); // Consigne donné -> Assigne un numéro à chaque convertion possible 
        
        while(mode<1 | mode>6){ //Tant que mode n'est pas entre 1 et 6, on redemmande car ne correspond à rien sinon
            
            mode = sc.nextByte(); //Mode prend la valeur entrée via le scanner
            
        }
        
        return mode; //On retourne de cette méthode un entier correspondant ensuite aux différents cas 
        
    }
    
    
    private static double CelciusVersKelvin(double celcius){ //Méthode de la convertion des Celcius vers des Kelvin, avec un paramètre en entrée 
        
        double Kelvin = celcius + 273.15;
        
        return Kelvin; //On retourne Kelvin, la température d'entrée convertie en Kelvin  
        
    }
    
    
    private static double KelvinVersCelcius(double kelvin){ //Même méthode qu'avant avec une convertion différente 

        double celcius = kelvin - 273.15;

        return celcius;
        
    }
    
    
    private static double FarenheitVersCelcius(double farenheit){ //Même méthode qu'avant avec une convertion différente

        double celcius = (farenheit - 32) / 1.8;

        return celcius;

    }


    private static double CelciusVersFarenheit(double celcius){ //Même méthode qu'avant avec une convertion différente

        double farenheit = (celcius * 1.8) + 32;

        return farenheit;
        
    }
    
    
    private static double KelvinVersFarenheit(double kelvin){ //Même méthode qu'avant avec une convertion différente

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));

        return farenheit;
        
    }
    
    
    private static double FarenheitVersKelvin(double farenheit){ //Même méthode qu'avant avec une convertion différente

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));

        return kelvin;
        
    }
    
}

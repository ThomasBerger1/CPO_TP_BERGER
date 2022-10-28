/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_berger;

import java.util.Scanner;

/**
 *
 * @author berge
 */
public class Convertisseur {
    int nbConversions; 
    
    
public Convertisseur () {
    nbConversions = 0 ;
}

@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

public double CelciusVersKelvin(double celcius){ //Méthode de la convertion des Celcius vers des Kelvin, avec un paramètre en entrée 
        
        double Kelvin = celcius + 273.15;
        
        return Kelvin; //On retourne Kelvin, la température d'entrée convertie en Kelvin  
        
    }
    
    
    public double KelvinVersCelcius(double kelvin){ //Même méthode qu'avant avec une convertion différente 

        double celcius = kelvin - 273.15;

        return celcius;
        
    }
    
    
    public double FarenheitVersCelcius(double farenheit){ //Même méthode qu'avant avec une convertion différente

        double celcius = (farenheit - 32) / 1.8;

        return celcius;

    }


    public double CelciusVersFarenheit(double celcius){ //Même méthode qu'avant avec une convertion différente

        double farenheit = (celcius * 1.8) + 32;

        return farenheit;
        
    }
    
    
    public double KelvinVersFarenheit(double kelvin){ //Même méthode qu'avant avec une convertion différente

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));

        return farenheit;
        
    }
    
    
    public double FarenheitVersKelvin(double farenheit){ //Même méthode qu'avant avec une convertion différente

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));

        return kelvin;
        
    }    

    public int selectmode(){ //Méthode pour sélectionner le mode de convertion

            int mode = 0; 
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

                mode = sc.nextInt(); //Mode prend la valeur entrée via le scanner

            }

            return mode; //On retourne de cette méthode un entier correspondant ensuite aux différents cas 

        }
}
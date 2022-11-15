/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author berge
 */
public class Personne {
    
    String nom;
    private int nivVie;
    int nbrArmes = 0;
    ArrayList<Arme> tabArmes = new ArrayList<>();
    Arme armeMain =  null;
    String aPredilection;

    public Personne(String unNom, int nivV){
        nom = unNom;
        nivVie = nivV;
    }

    public int getNivVie() {
        return nivVie;
    }

    public void setNivVie(int nivV) {
        this.nivVie = nivV;      
    }

    @Override
    public String toString(){
        return "Personne {nom = " + nom + " , niveau de vie = " + nivVie +"}";
    }
    
    public boolean ajoutArme(Arme aa){
        
        if (nbrArmes < 5){
            tabArmes.add(aa);
            nbrArmes += 1;
            System.out.println(aa.getNom()+" a ete ajoute(e) \nLe personnage a "+nbrArmes+" arme(s) sur 5. Il reste "+ (5-nbrArmes)+" places.");      
            return true;
        }else{
            System.out.println("Error system :/");
            return false;
        }
    }   

    public Arme getArmeMain() {
        return armeMain;
    }
    
    public boolean equipArme (String nomA){
        
        for (int i = 0; i < nbrArmes ; i++){
            if (nomA.equals(tabArmes.get(i).getNom())){
                armeMain = tabArmes.get(i);
                System.out.println("L'arme a ete trouvee et est equipee!");
                return true;
            }
        }
        System.out.println("Erreur, l'arme n'est pas dans l'inventaire du personnage.");
        return false;
        
    }
    
    public String predilection(){
        int pred = 0;
        for (int i = 0; i < nbrArmes ; i++){
            Arme aa = tabArmes.get(i);
            if (aPredilection.equals(aa.getClass().getSimpleName())){
                pred += 1;
            }
        }
        return "Le nombre d'armes de predilection du " + this.getClass().getSimpleName() + " est de " + pred + " " + aPredilection;
    }
    
}

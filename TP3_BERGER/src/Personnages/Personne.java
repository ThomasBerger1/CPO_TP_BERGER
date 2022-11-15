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
    ArrayList<Arme> tabArmes;

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
        
        if (nbrArmes <= 5){
            tabArmes.add(aa);
            return true;
        }else{
            return false;
        }
    }
    
    
}

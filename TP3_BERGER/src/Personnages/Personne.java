/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author berge
 */
public class Personne {
    
    String nom;
    private int nivVie;

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
    
}

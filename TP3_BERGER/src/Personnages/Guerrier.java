/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author berge
 */
public class Guerrier extends Personne {
    
    private boolean aCheval;

    public Guerrier(String unNom, int nivV, boolean dada) {
        super(unNom, nivV);
        aCheval = dada;
    }

    public boolean isaCheval() {
        return aCheval;
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }
    
    @Override
    public String toString(){
        return "Guerrier {nom : " + nom + " , niveau de vie = " + this.getNivVie() + " , a cheval : " + aCheval + "}";
    }
    
}

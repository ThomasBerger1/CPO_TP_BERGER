/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author berge
 */
public class Magicien extends Personne {
    
    boolean Confirm;

    public Magicien(String unNom, int nivV, boolean conf){
        super(unNom, nivV);
        Confirm = conf;
    }

    public boolean isConfirm() {
        return Confirm;
    }

    public void setConfirm(boolean Confirm) {
        this.Confirm = Confirm;
    }
    
    @Override
    public String toString(){
        return "Magicien {nom : " + nom + " , niveau de vie = " + this.getNivVie() + " , confirme : " + Confirm + "}";
    }
    
}

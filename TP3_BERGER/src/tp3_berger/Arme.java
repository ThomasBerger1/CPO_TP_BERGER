/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_berger;

/**
 *
 * @author berge
 */
public class Arme {
    String nom;
    private int nivAtt;

    public Arme(String unNom, int nivA){
        nom = unNom;
        if (nivA <= 100 && nivA >= 0){
            nivAtt = nivA;
        }else if(nivA < 0){
            nivAtt = 0;
        }else if(nivA > 100){
            nivAtt = 100;
        }
    }

    public int getNivAtt() {
        return nivAtt;
    }

    public void setNivAtt(int nivAtt) {
        if (nivAtt <= 100 && nivAtt >= 0){
            this.nivAtt = nivAtt;
        }
    }

    @Override
    public String toString(){
        return "L'arme " + nom + " possède +" + nivAtt + " d'attaque.";

    }

}

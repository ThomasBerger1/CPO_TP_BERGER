/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_berger;

/**
 *
 * @author berge
 */
public class Epee extends Arme{
    
    private int finesse;

    public Epee(String unNom, int nivA, int f) {
        super(unNom, nivA);
        if (f < 100 && f >= 0){
            finesse = f;
        }else{
            finesse = 0;
        }    
    }

    public void setFinesse(int f) {
        if (f < 100 && f >= 0){
            this.finesse = f;
        }
    }

    public int getFinesse() {
        return finesse;
    }
    
    @Override
    public String toString(){
        return "Epee {nom = " + nom + " , attaque = " + this.getNivAtt() + " , finesse = " + this.getFinesse() + "}";

    }
}

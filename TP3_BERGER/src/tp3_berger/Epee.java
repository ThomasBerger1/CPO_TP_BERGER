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
    
    int finesse;

    public Epee(String unNom, int nivA, int f) {
        super(unNom, nivA);
        if (f < 100 && f >= 0){
            finesse = f;
        }else{
            finesse = 0;
        }
    }
    
}

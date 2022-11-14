/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_berger;

/**
 *
 * @author berge
 */
public class Baton extends Arme{
    
    private int age;

    public Baton(String unNom, int nivA, int a){
        super(unNom, nivA);
        if (a < 100 && a >= 0){
            age = a;
        }else{
            age = 0;
        }
    }

    public void setAge(int a) {
        if (a < 100 && a >= 0){
            this.age = a;
        }
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString(){
        return "Baton {nom = " + nom + " , attaque = " + this.getNivAtt() + " , age = " + this.getAge() + "}";

    }
}

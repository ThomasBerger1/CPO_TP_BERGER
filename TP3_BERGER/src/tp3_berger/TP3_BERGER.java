/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_berger;

/**
 *
 * @author berge
 */
import java.util.ArrayList;

public class TP3_BERGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test de la classe arme :
            //Arme a = new Arme("arme1",50);
            //int Att = a.getNivAtt();
            //System.out.println("L'attaque de " + a.nom + " est de "+Att);
            //System.out.println(a);
            
        Epee e1 = new Epee ("Excalibur", 7, 5);
        //System.out.println(e1);
        Epee e2 = new Epee ("Durandal", 4, 7);
        //System.out.println(e2);
        
        Baton b1 = new Baton ("Chêne", 4, 5);
        //System.out.println(b1);
        Baton b2 = new Baton ("Charme", 5, 6);
        //System.out.println(b2);
        
        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(e1);
        armes.add(e2);
        armes.add(b1);
        armes.add(b2);
        System.out.println(armes);
        
        
        
    }
    
}

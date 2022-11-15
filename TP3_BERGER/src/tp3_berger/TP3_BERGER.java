/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_berger;

/**
 *
 * @author berge
 */
import Personnages.Personne;
import Personnages.Guerrier;
import Personnages.Magicien;
import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

public class TP3_BERGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        
        //Test de la classe arme :
            //Arme a = new Arme("arme1",50);
            //int Att = a.getNivAtt();
            //System.out.println("L'attaque de " + a.nom + " est de "+Att);
            //System.out.println(a);
        /** TEST GLOBAL AVANT 3.2   
        Epee e1 = new Epee ("Excalibur", 7, 5);
        Epee e2 = new Epee ("Durandal", 4, 7);       
        Baton b1 = new Baton ("Chêne", 4, 5);
        Baton b2 = new Baton ("Charme", 5, 6);
        
        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(e1);
        armes.add(e2);
        armes.add(b1);
        armes.add(b2);
        System.out.println(armes);
        
        
        Magicien m1 = new Magicien ("Gandalf", 65, true);
        Magicien m2 = new Magicien ("Garcimore", 44, false);       
        Guerrier g1 = new Guerrier ("Conan", 78, false);
        Guerrier g2 = new Guerrier ("Lannister", 45, true);
        
        ArrayList<Personne> personnage = new ArrayList<>();
        personnage.add(m1);
        personnage.add(m2);
        personnage.add(g1);
        personnage.add(g2);
        System.out.println(personnage);
        
        m2.ajoutArme(b1);
        m2.equipArme("Chêne");
        System.out.println(m2);
        System.out.println(m2.predilection());
        **/
        
        //Tests - Partie 3.2
        
        Guerrier g1 = new Guerrier ("Lannister", 45, true);
        Magicien m1 = new Magicien ("Gandalf", 65, true);
            ArrayList<Personne> personnage = new ArrayList<>();
            personnage.add(m1);
            personnage.add(g1);
        Epee e1 = new Epee ("Excalibur", 20, 5);
        Epee e2 = new Epee ("Durandal", 10, 7);  
        Epee e3 = new Epee ("Aiguille", 8, 10);  
        Baton b1 = new Baton ("Chêne", 3, 8);
        Baton b2 = new Baton ("Charme", 5, 6);
        Baton b3 = new Baton ("Bois", 8, 4);
        
        g1.ajoutArme(e1);
        g1.ajoutArme(b2);
        g1.ajoutArme(e2);
        g1.equipArme("Excalibur");
        
        m1.ajoutArme(e3);
        m1.ajoutArme(b1);
        m1.ajoutArme(b3);
        
        System.out.println(m1.predilection());
        
        System.out.println(personnage);
        
        // Test du 4.1
        Magicien m2 = new Magicien ("Garcimore", 44, false);
        
        System.out.println(Personne.getNbPersonnages());
        System.out.println(Guerrier.getNbGuerriers());
        System.out.println(Magicien.getNbMagiciens());
        
        m2 = null;        
        System.gc();
        System.runFinalization();
        
        
                
    }
    
}

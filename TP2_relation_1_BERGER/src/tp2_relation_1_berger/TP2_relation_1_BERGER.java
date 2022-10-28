/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_berger;

/**
 *
 * @author berge
 */
public class TP2_relation_1_BERGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; //On crée un nouvel objet : V0oiture.
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Voiture uneGolf = new Voiture("Golf","Volfswagen",115);
        Personne bob = new Personne("Bobby", "Sixkiller"); //on crée un nouvel objet : Personne.
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles :\n"+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

        bob.liste_voitures[0] = uneClio ; //On affecte à la personne bob une nouvelle voiture
        bob.nbVoitures = 1 ; //Il a donc maintenant 1 voiture
        uneClio.proprietaire = bob ; //La clio a pour proprietaire bob 
        
        System.out.println("La premiere voiture de Bob est "+ bob.liste_voitures[0]);
        
        bob.liste_voitures[1] = une2008 ;
        bob.nbVoitures = 2 ;
        une2008.proprietaire = bob ;
        
        reno.liste_voitures[0] = uneAutreClio ;
        reno.nbVoitures = 1 ;
        uneAutreClio.proprietaire = reno ;
        
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ;
        uneMicra.proprietaire = reno ;
        
        System.out.println(bob +"\n"+ reno);
        
        bob.ajouter_voiture(uneMicra); //On utlise la méthode ajouter_voiture
        reno.ajouter_voiture(uneGolf);
        
    }
    
}

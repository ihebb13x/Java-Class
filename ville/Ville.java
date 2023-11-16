
package ville;

public class Ville {
    public String nom_V;
    public int nbHabitant_V;
    public Capitale Cap; //on ajoute cette ligne car il ya une classe sous classe
    public Ville(){} //constructeur Ville
    
    public void Ville(String nom_V,int nbHabitant_V)
    {
        this.nom_V = nom_V; 
        this.nbHabitant_V = nbHabitant_V;
    }
    
    
    public String getNomVille() { //methode get
        return nom_V;
    }

    public void setNomVille(String nom_V) { //methode set 
        this.nom_V = nom_V;
    }

    public int getNbHabitantsVille() 
    {
        return nbHabitant_V;
    }

    public void setNbHabitantsVille(int nbHabitant_V) {
        this.nbHabitant_V = nbHabitant_V;
    }
    
    public void Afficher(){
        System.out.println("Le nom de Ville :"+this.nom_V); //on afficher le nom de ville
        System.out.println("Le nombre de Habitant de cette Ville :"+this.nbHabitant_V); //on affiche le nbhabitant de ville
    }
    
    
    
    public class Capitale  { //un Capitale definie par
    public String nomCap; //son nom
    public int nbHabitantCap; //son nombre d'ahbitant
    public String monument; //un ou plusieurs monument

    public Capitale() { //constructer de Classe Capitale
    }


    public String getMonument() { //methode get
        return monument; 
    }

    public void setMonuments(String monuments) { //methode set 
        this.monument = monuments;
    }

    public void afficheMonuments() {
        System.out.println("Monuments : " + monument); //on affiche le monument de cette Capitale
    }
    
    

    }   
    

    public static void main(String[] args) {
         Ville V1 = new Ville();
         V1.nom_V=" Munich"; //insertion le nom de ville
         V1.nbHabitant_V=1500000; //insertion le nbhabitant de cette ville
         V1.Cap=V1.new Capitale();   //classe sous classe
         V1.Cap.monument="Ruhmeshalle"; //insertion de monument
         
         V1.Afficher(); //on appele afficher pour faire l'affichage
         V1.Cap.afficheMonuments(); //on appele afficherMonuments pour faire l'affichage 
    }
    
}


package rectangle;

public class Rectangle {
    public Double Longeur;
    public Double Largeur;
    
    public void Rectangle(Double longeur,Double largeur){
        this.Longeur=longeur;
        this.Largeur=largeur;
    }
    
    public void setLongeur(Double longeur) {
    this.Longeur = longeur;
    }
    public void setLargeur(Double largeur){
    this.Largeur=largeur;
    }
    

    
    
    /*surface */
    public Double surface(){
        return Longeur*Largeur;
    }
    
    /*perimetre*/
    public Double perimetre(){
        return 2*(Longeur+Largeur);
    }
    
    
    public void afficher(){
    System.out.println("la surface de rectangle est : "+surface());
    System.out.println("la perimetre de rectangle est : "+perimetre());
    }
      
}

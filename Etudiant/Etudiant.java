package etudiant;

public class Etudiant {
    public int id;
    public String nom;
    public String prenom;
    public String adresse;
    public String mail;
    public ancienEtudiant ancet;
    public Etudiant(){
        //constructeur vide
    }
    public  class ancienEtudiant{
        public String grade;
        public String lieu_travail;
    
    }
    public void afficher(){

        System.out.println("id :"+id);
        System.out.println("nom :"+nom);
        System.out.println("prenom :"+prenom);
        System.out.println("adresse :"+adresse);
        System.out.println("mail :"+mail);
        if (ancet != null) {
            System.out.println("grade: " + ancet.grade);
            System.out.println("lieu_travail: " + ancet.lieu_travail);
        }
    }
    
    public static void main(String[] args) {
        Etudiant Et1=new Etudiant();
        Et1.id=100;
        Et1.nom="nom";
        Et1.prenom="prenom";
        Et1.adresse="adresse";
        Et1.mail="mail@tt.fr";  
        
        Et1.ancet=Et1.new ancienEtudiant();
        Et1.ancet.grade="grade";
        Et1.ancet.lieu_travail="lieu_travail";
        Et1.afficher();
        
        
    }
    
}
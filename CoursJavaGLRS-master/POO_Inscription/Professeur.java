import java.util.ArrayList;
import java.util.Date;
public class Professeur extends Personne{


    private String matieres;
   

    //Propriété navigationnelle
     private ArrayList<Classe> classeEns;
   
    //Constructeur
       //Par defaut
           public Professeur(){
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
         /* public Professeur(String nomComplet,LocalDate dateNaiss,String matieres){
            //Initialisation de la personne
              super(nomComplet,dateNaiss);
             this.matieres=matieres;
            
          }*/

   //Getters and Setters

	public String getMatieres(){
		return this.matieres;
	}

	public void setMatieres(String matieres){
		this.matieres=matieres;
	}

        public ArrayList<Classe> getClasseEns() {
        return classeEns;
    }

    public void setClasseEns(ArrayList<Classe> classeEns) {
        this.classeEns = classeEns;
    }

   //redefinition de la methode affiche()

   
    public String affiche(){
    //super signifie personne
    //this signifie etudiant
       return " Matieres : "+matieres; 
                     
    }

}
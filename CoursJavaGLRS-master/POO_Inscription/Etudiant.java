import java.time.LocalDate;
public class Etudiant extends Personne{


    private String tuteur;
    private int annee;

    //Propriété navigationnelle
     private Classe  classeEtu;
     
   
    //Constructeur
       //Par defaut
           public Etudiant(){
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Etudiant(String nomComplet,
               LocalDate dateNaiss,String tuteur,int annee ){
            //Initialisation de la personne
              super(nomComplet,dateNaiss);
             this.tuteur=tuteur;
             this.annee=annee;
          }

   //Getters and Setters

	public String getTuteur(){
		return this.tuteur;
	}

	public void setTuteur(String tuteur){
		this.tuteur=tuteur;
	}

	public int getAnnee(){
		return this.annee;
	}

	public void setAnnee(int annee){
		this.annee=annee;
	}

	public Classe getClasseEtu() {
        return classeEtu;
    }

    public void setClasseEtu(Classe classeEtu) {
        this.classeEtu = classeEtu;
    }

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
    //super signifie personne
    //this signifie etudiant
       return super.affiche() +" Tuteur : "+tuteur 
                     +" Annee "+annee+" age: "+age;
    }

}
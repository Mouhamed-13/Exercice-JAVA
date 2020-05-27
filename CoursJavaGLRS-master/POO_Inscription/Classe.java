import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public class Classe implements IInscription{

   //Auto généré
    private static AtomicInteger idClass= new AtomicInteger();
    private int id;
    private String nom;

    //Propriété navigationnelle
     private Etudiant etud;
     private ArrayList<Etudiant> etuClasse= new ArrayList<Etudiant>();;
     private ArrayList<Professeur> profClasse= new ArrayList<Professeur>();

	public Classe(){
		//Initialisé ID
	this.id = idClass.getAndIncrement();

	}
	public Classe (String nom){
      this.nom=nom;
     

    }   

   //Getters and Setters

	public int getId(){
		return this.id;
	}
	public String getNom(){
		return this.nom;
	}

	public void setNom(String nom){
		this.nom=nom;
	}

	  public ArrayList<Etudiant> getEtuClasse() {
        return etuClasse;
    }

    public void setEtuClasse(ArrayList<Etudiant> etuClasse) {
        this.etuClasse = etuClasse;
    }

	public ArrayList<Professeur> getProfClasse() {
        return profClasse;
    }

    public void setProfClasse(ArrayList<Professeur> profClasse) {
        this.profClasse = profClasse;
    }

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

    public void inscrire(Etudiant etud){
	this.etuClasse.add(etud);
	
	
	}
    

}
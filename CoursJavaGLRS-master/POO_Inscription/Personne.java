import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.format.DateTimeFormatter;
public abstract class Personne implements IInscription{

   //Auto généré
    protected int id;
    private static AtomicInteger idClass= new AtomicInteger();
    protected  String nomComplet;
    protected  LocalDate dateNaiss;
    protected  long  age;
    public String dateStr;

    public Personne (String nomComplet,LocalDate dateNaiss){
      this.nomComplet=nomComplet;
      this.dateNaiss=dateNaiss;
       this.age=calculAge(dateStr);

    }

      public Personne (){
        //Initialisé ID
	this.id = idClass.getAndIncrement();
    }

   //Getters and Setters
 	public String getNomComplet(){
		return this.nomComplet;
	}

	public void setNomComplet(String nomComplet){
		this.nomComplet=nomComplet;
	}
	public LocalDate getDateNaiss(){
		return this.dateNaiss;
	}

	public void setDateNaiss(LocalDate dateNaiss){
		this.dateNaiss=dateNaiss;
	}

	public long getAge(){
		return this.age;
	}
	public int getId(){
		return this.id;
	}

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }

   protected long calculAge(String dateStr){

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dateNaiss=LocalDate.parse(dateStr, formatter);
    LocalDate date=LocalDate.now();
    long age = ChronoUnit.YEARS.between(dateNaiss, LocalDate.now());
	
      return age;
   }

}
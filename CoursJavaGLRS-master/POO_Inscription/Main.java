import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public class Main {
        //Declaration de variables => portée de classe
       public static void main(String args[]){
        
	String fullname;
	String tuteur;
	String nom;
	String dateStr;
	int annee;
	int choix;
	int nbreClass;
	int nbreEtu;
	int i=0;
	ArrayList<Classe> bdClass = new ArrayList<>();
	ArrayList<Etudiant> bdEtu = new ArrayList<>();
	
	
	
	Scanner clavier=new Scanner(System.in);
	//System.out.println("Donner le nombre d'etudiants que vous voulez inserer :");

do{
	      System.out.println("1- Creer Classe");
              System.out.println("2- Inscrire Etudiant dans une classe");
              System.out.println("3- Lister Classe");
              System.out.println("4- Afficher Etudiants d'une classe");
              System.out.println("5- Affecter Professeurs à une classe");
              System.out.println("6- Afficher Professeurs à une classe");
	      System.out.println("7- Quitter");
              System.out.println("Faites votre choix");
              
              choix=clavier.nextInt();
	      
         
           switch(choix){
            case 1:
		
		System.out.println("Veuillez indiquer le nombre de la Classe à insérer :");
		nbreEtu=clavier.nextInt();
		for(i=0;i<nbreEtu;i++){
		Classe c=new Classe();
		System.out.println("Veuillez saisir le nom de la Classe "+i+" :");
        	nom=clavier.next();
		c.setNom(nom);
		bdClass.add(c);
		}
		
        	
             break;

            case 2:
		
		System.out.println("Veuillez indiquer le nombre d'etudiant à insérer :");
		nbreEtu=clavier.nextInt();
		for(i=0;i<nbreEtu;i++){
		Etudiant e=new Etudiant();
		System.out.println("Veuillez saisir le nom Complet de l'etudiant "+i+" :");
        	fullname=clavier.next();
		System.out.println("Veuillez saisir la date de naissance de l'etudiant "+i+" :");
        	dateStr=clavier.next();
		System.out.println("Veuillez saisir le tuteur de l'etudiant "+i+" :");
        	tuteur=clavier.next();
		System.out.println("Veuillez saisir l'annee d'inscription de l'etudiant "+i+" :");
        	annee=clavier.nextInt();

		e.setNomComplet(fullname);
		e.setAnnee(annee);
		e.setTuteur(tuteur);
		e.calculAge(dateStr);
		bdEtu.add(e);
		}

		 

		
             break;

	     case 3:
		    for (Classe infClass : bdClass) { 		      
           		System.out.println(infClass.affiche()); 		
      			}
                 
             break;
	
	     case 4:
			for (Etudiant infEtu : bdEtu) { 		      
           		System.out.println(infEtu.affiche()); 		
      			}
		 
                 
             break;

	     case 5:
                 
             break;

	     case 6:
                 
             break;

	     case 7:
                 
             break;
           }

     } while(choix!=7);

	System.out.println("Au revoir");
                  
       }

}



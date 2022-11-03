package atelier5;
/**
 * 
 * @author shailynnxie
 *définir la classe étudiant
 */
public class Etudiant {
	/**
	 * définir les attributs de la class étudiant
	 */
	private String nom_,prenom_;
    private String idNum_,major_;
    private int age_;
    private double moyenne_;
    

	public Etudiant(String nom, String prenom, String idNum,String major,int age,double moyenne) {
	//constructeur
		nom_=nom;
		prenom_=prenom; 
		idNum_=idNum;
		major_=major;
		age_=age;
		moyenne_=moyenne;
	}
    
	public void getEtudiant () {
		/**
		 * afficher les attributs définis de l'instance étudiant
		 */
	      System.out.print("Nom:" + nom_+"\n"
	    		  + "Prenom:"+prenom_+"\n"
	    		  +"Numéro d'étudiangt:"+idNum_+"\n"
	    		  +"Spécialité:"+major_+"\n"
	    		  + "Age:"+age_+"\n"
	    		  +"Moyenne:"+moyenne_);
	      
	}

	

    

}

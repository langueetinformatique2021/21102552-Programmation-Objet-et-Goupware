package devoir;
import java.io.*;
import java.util.*;
/**
 * lecture des mots d'un fichier-texte
 * @author shailynnxie
 *
 */
public class LireTexte {
	private String NomFicher;
	private BufferedReader entree;
	private String ligne;
	private StringTokenizer tok;
	/**
	 * Création d'une noouvelle instance de LireTexte
	 * @param ft nom du fichier texte
	 */

	public LireTexte(String ft){
        this.NomFicher = ft;

	}

	/**Ouverture d'un fichier texte,
	 * Lecture de la première ligne,
	 * Teste si le fichier est vide
	 * @throws IOException Erreur à l'ouverture
	 * @throws FicherVide Fichier vide
	 */
	
	protected void Ouvrir() throws IOException, FichierVide{
		 this.entree = new BufferedReader(new FileReader(this.NomFicher));
	     this.ligne = this.entree.readLine();
	        try{
	        	if (this.ligne == null) {
	        		FichierVide fv = new FichierVide("The file is empty");
	        		throw fv;
	        	}
	        } catch (FichierVide fv) {
	        	
	        	 System.out.println(fv.getMessage()); // Prints "The file is empty."
	        }
	        System.out.println("Document exist.");
	        
	    }
	    
	/** Fermeture du fichier
	 * @throws IOException Erreur à la Fermeture
	 */
	protected void Fermer() throws IOException{
		 this.entree = new BufferedReader(new FileReader(this.NomFicher));
		 try{
			 this.entree.close();
		     System.out.println("Document déjà fermé.");

		 }catch (IOException e) {
        	 System.out.println(e.getMessage()); 
		 }

	}
	
	

	
	
	/** Lecture mot à mot du fichier 
	 * @return prochain mot
	 * @throws IOException Erreur de lecture
	 */
	
	public String readWord ( ) throws IOException{
		this.entree = new BufferedReader(new FileReader(this.NomFicher));
	    this.ligne = this.entree.readLine();
	    this.tok = new StringTokenizer(this.ligne);
        if (!this.tok.hasMoreTokens()) {

		// Check if the end of the file has been reached
		if (this.ligne == null) {
		    // Return null to indicate that there are no more words
		    return null;
		}
   }
   
        	// print mot à mot du fichier 
		while (tok.hasMoreTokens()) {

		    System.out.println(tok.nextToken());
		}
 

		
		return null;
	}
	


}


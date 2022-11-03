package devoir;
/**
 * 
 * @author shailynnxie
 *
 */
public class Reptile extends Animal{
	// constructeur de la classe Reptile
	
	private static boolean domestique_; 
	// il peut être domestique ou sauvage
	
	public Reptile(String type) {
		//appemer le constructeur de Animal
		super(type, 4);
	}
	public void présente() { 
	// appel de la méthode de Animal
		super.présente();
		
		 String etat = (isDomestique_()) ? "domestique" : "sauvage"; 
		 System.out.println("je suis vraiment un animal " + etat) ; 
	 }
	public static boolean isDomestique_() {
		return domestique_;
	}
	//définir si c'est sauvage ou pas
	public static void setDomestique_(boolean domestique_) {
		Reptile.domestique_ = domestique_;
	}
	@Override
	//réécrire la méthode movement() dans Animal
	public void movement() {
		System.out.println("Je peux marcher sur la terre et je ne peux pas voler.");
		
	} 
	
	
	
}

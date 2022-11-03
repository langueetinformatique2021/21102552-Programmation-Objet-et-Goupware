package devoir;
/**
 * 
 * @author shailynnxie
 *
 */
public class Crocodile extends Reptile implements habitude {
	/**
	 * constructeur de la classe Crocodile
	 * 
	 */
	public Crocodile() {
		super("Crocodiles");
		/**
		 * @param type d'espace 
		 */
	}
	
	
	//réécrire les méthodes dans interface
	@Override
	public void manger() {
		System.out.println("Je ne suis pas végétarien.");
		
	}
	@Override
	public void vivre() {
		System.out.println("Je peux vivre sur la terre et sous l'eau");
	}
}

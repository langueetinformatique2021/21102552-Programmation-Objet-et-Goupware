package devoir;

@SuppressWarnings("serial")
/**
 * @author shailynnxie
 *
 */
public class E421 extends Exception {
/**
 * 
 * @param nom
 * @param tire
 * creer un exception utilisaeur E421 ayant comme message le nom du lanceur
 */
	public E421(String nom, TroisDes tire) {
	/* le cas 421 désordre*/
		super("421 désordre \nNom du lanceur : " + nom+tire.toString());
	}

	public E421(TroisDes tire, String nom) {
		/*le cas 421 dans l'ordre*/
		super("421 dans l'ordre \nNom du lanceur : " + nom +tire.toString());
	}
	


}

package atelier05;
/***
 * 
 * @author shailynnxie
 *
 */
public class Carafe {
	/***
	 * 
	 */
	private int contenu_, capacite_;
	

	public Carafe(int contenu, int capacite) {

		contenu_ = contenu;
		capacite_ = capacite;
	}
	public void vider() {
		contenu_ = 0;
	}

	public void remplir() {
		contenu_ = capacite_;
	}
	
	public int contenu() {
		return contenu_;
	}

	public int capacite() {
		return capacite_;
	}
	public static void Transvaser()
}

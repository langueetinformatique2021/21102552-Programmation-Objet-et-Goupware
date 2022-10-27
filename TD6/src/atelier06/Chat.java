package atelier06;
/***
 * 
 * @author shailynnxie
 *
 */
public class Chat extends Félin {
	/***
	 * 
	 * @param type
	 */
	public Chat(String type) {
		super(type);
	}
	public interface Domesticable {
		String nom = null;
		
		/** Domestiquer un animal et lui donner un nom
		* @param nom nom de l'animal */
		public default  void domestiquer(String nom) {
		domestique = true;
		nom=this.nom();
		}
		
		/** Rend le nom de l'animal
		* @return nom de l'animal */
		public default String nom() {
			return nom;

		}
	}
}

